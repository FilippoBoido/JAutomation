package com.jautomation.line.example;

import org.javatuples.Triplet;

import java.util.ArrayList;

public class Sensor {

    ArrayList<Triplet> inputs;

    public String getName() {
        return name;
    }

    String name;
    int inputPos;

    public Sensor(String name, ArrayList<Triplet> inputs){

        this.name = name;
        this.inputs = inputs;

        for(Triplet input : inputs)
        {
            if(input.getValue0().equals(name))
                break;

            inputPos++;
        }

    }

    public boolean isHigh()
    {
        return (boolean) inputs.get(inputPos).getValue1();
    }

}
