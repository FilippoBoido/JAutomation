package com.jautomation.conveyor.example;

import org.javatuples.Triplet;

import java.util.ArrayList;

public abstract class Actuator {

    ArrayList<Triplet> outputs;

    public String getName() {
        return name;
    }

    String name;
    int outputPos;

    public Actuator(String name, ArrayList<Triplet> outputs){
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
