package com.jautomation.conveyor.example;
import de.re.easymodbus.exceptions.ModbusException;
import de.re.easymodbus.modbusclient.*;
import org.javatuples.Triplet;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayList;

public class Conveyor{

    private Enums.GeneralStatus status = Enums.GeneralStatus.OP_NO_STATUS;

    ArrayList<Triplet> outputs;
    String name;
    int outputPos;

    public Conveyor(String name, ArrayList<Triplet> outputs){
        this.name = name;
        this.outputs = outputs;

        for(Triplet output : outputs)
        {
            if(output.getValue0().equals(name))
                break;

            outputPos++;
        }
    }

    public void start(){
        Triplet output =  outputs.get(outputPos).setAt1(true);
        outputs.set(outputPos,output);
    }

    public void stop(){
        Triplet output =  outputs.get(outputPos).setAt1(false);
        outputs.set(outputPos,output);
    }
}
