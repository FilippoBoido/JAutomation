package com.jautomation.conveyor.example;

import de.re.easymodbus.exceptions.ModbusException;
import de.re.easymodbus.modbusclient.ModbusClient;
import org.javatuples.Pair;
import org.javatuples.Triplet;

import java.io.IOException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;

import static com.jautomation.conveyor.example.Enums.GeneralStatus.OP_FAIL;
import static com.jautomation.conveyor.example.Enums.GeneralStatus.OP_SUCCESS;

public class Cycle {
    ModbusClient modbusClient;

    ArrayList<Triplet> Inputs;
    ArrayList<Triplet> Outputs;

    public Cycle(ArrayList<Triplet> Inputs,ArrayList<Triplet> Outputs){
        this.Inputs = Inputs;
        this.Outputs = Outputs;

        modbusClient = ModbusConnector.getModbusClient();
        //modbusClient.WriteSingleRegister(0, 1234);
        //modbusClient.WriteMultipleRegisters(11, ModbusClient.ConvertFloatToTwoRegisters((float) 123.56));
        //System.out.println(modbusClient.ReadHoldingRegisters(0, 1)[0]);
        //System.out.println(ModbusClient.ConvertRegistersToFloat(modbusClient.ReadHoldingRegisters(11, 2)));
        try{
            modbusClient.Connect();

        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public Enums.GeneralStatus writeOutputs()  {
        Enums.GeneralStatus retVal;
        try {
            for (Triplet output : Outputs) {
                System.out.println("Output: "
                        + output.getValue0() + " Value: "
                        + output.getValue1()
                        + " Starting address: "
                        + output.getValue2());

                modbusClient.WriteSingleCoil((Integer) output.getValue2(), (Boolean) output.getValue1());
            }
            retVal = OP_SUCCESS;
        }
        catch (Exception e) {
            e.printStackTrace();
            retVal = OP_FAIL;
        }

        return retVal;
    }

    public Enums.GeneralStatus readInputs(){

        Enums.GeneralStatus retVal;
        try {
            int counter = 0;

            boolean[] booleanInputs = modbusClient.ReadDiscreteInputs(0,32);
            for (boolean in : booleanInputs) {
                //System.out.println("booleanInput " + counter + ": " + in);
                counter++;
            }
            counter = 0;

            for (Triplet input : Inputs) {

                if (counter == (int) input.getValue2())
                {
                    input = input.setAt1((boolean) booleanInputs[counter]);

                    Inputs.set(counter,input);

                }

                counter++;
            }
            retVal = OP_SUCCESS;

        }
        catch (Exception e) {
            e.printStackTrace();
            retVal = OP_FAIL;
        }

        return retVal;


    }
}
