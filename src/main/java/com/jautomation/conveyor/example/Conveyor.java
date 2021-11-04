package com.jautomation.conveyor.example;
import de.re.easymodbus.exceptions.ModbusException;
import de.re.easymodbus.modbusclient.*;

import java.io.IOException;
import java.net.UnknownHostException;

public class Conveyor{

    private ModbusClient mbClient;
    private Enums.ConveyorStatus status = Enums.ConveyorStatus.OP_NO_STATUS;

    public Conveyor(ModbusClient mbClient){
        this.mbClient = mbClient;
        try{
            this.mbClient.Connect();

        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //modbusClient.WriteSingleRegister(0, 1234);
        //modbusClient.WriteMultipleRegisters(11, ModbusClient.ConvertFloatToTwoRegisters((float) 123.56));
        //System.out.println(modbusClient.ReadHoldingRegisters(0, 1)[0]);
        //System.out.println(ModbusClient.ConvertRegistersToFloat(modbusClient.ReadHoldingRegisters(11, 2)));
    }

    public Enums.ConveyorStatus start(){
        try {
            this.mbClient.WriteSingleCoil(0, true);
            status = (mbClient.ReadCoils(0, 1)[0] ? Enums.ConveyorStatus.OP_SUCCESS : Enums.ConveyorStatus.OP_FAIL);

        } catch (ModbusException e) {
            e.printStackTrace();
            status = Enums.ConveyorStatus.OP_ERROR;
        } catch (IOException e) {
            e.printStackTrace();
            status = Enums.ConveyorStatus.OP_ERROR;
        }
        finally {
            return status;
        }
    }

    public Enums.ConveyorStatus stop(){
        try {
            this.mbClient.WriteSingleCoil(0, false);
            status = (mbClient.ReadCoils(0, 1)[0] ? Enums.ConveyorStatus.OP_FAIL : Enums.ConveyorStatus.OP_SUCCESS);

        } catch (ModbusException e) {
            e.printStackTrace();
            status = Enums.ConveyorStatus.OP_ERROR;
        } catch (IOException e) {
            e.printStackTrace();
            status = Enums.ConveyorStatus.OP_ERROR;
        }
        finally {
            return status;
        }
    }
}
