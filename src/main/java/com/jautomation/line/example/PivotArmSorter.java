package com.jautomation.line.example;

import org.javatuples.Triplet;

import java.util.ArrayList;

public class PivotArmSorter extends Actuator {

    int pivotPos;

    public PivotArmSorter(String sorterName,String pivotName, ArrayList<Triplet> outputs) {
        super(sorterName, outputs);
        for(Triplet output : outputs)
        {
            if(output.getValue0().equals(pivotName))
                break;

            pivotPos++;
        }
    }

    public void pivot(){
        Triplet output =  outputs.get(pivotPos).setAt1(true);
        outputs.set(pivotPos,output);
    }

    public void reset(){
        Triplet output =  outputs.get(pivotPos).setAt1(false);
        outputs.set(pivotPos,output);
    }
}
