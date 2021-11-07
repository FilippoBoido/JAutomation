package com.jautomation.line.example;

import org.javatuples.Triplet;

import java.util.ArrayList;

public class IO {

    ArrayList<Triplet> inputs = new ArrayList<>();
    ArrayList<Triplet> outputs = new ArrayList<>();
    private Object Exception;

    public ArrayList<Triplet> getInputs() {
        return inputs;
    }

    public ArrayList<Triplet> getOutputs() {
        return outputs;
    }

    public Triplet getOutput(String name) throws Throwable
    {
        for(Triplet output: outputs)
            if (output.getValue0().equals(name))
                return output;
        throw (Throwable) Exception;

    }

    public Triplet getInput(String name) throws Throwable
    {
        ;for(Triplet input: inputs)
        if (input.getValue0().equals(name))
            return input;
        throw (Throwable) Exception;
    }

    public void setOutput(String name, Boolean value)
    {
        ;
    }

    public IO(){
        // The triplet consists of Name of Input/Output, Boolean Value and Address
        outputs.add(new Triplet<>("BC_0",Boolean.FALSE,0));
        outputs.add(new Triplet<>("BC_1",Boolean.FALSE,1));
        outputs.add(new Triplet<>("BC_2",Boolean.FALSE,2));
        outputs.add(new Triplet<>("BC_3",Boolean.FALSE,3));
        outputs.add(new Triplet<>("BC_4",Boolean.FALSE,4));
        outputs.add(new Triplet<>("BC_5",Boolean.FALSE,5));
        outputs.add(new Triplet<>("BC_6",Boolean.FALSE,6));
        outputs.add(new Triplet<>("BC_7",Boolean.FALSE,7));
        outputs.add(new Triplet<>("BC_8",Boolean.FALSE,8));
        outputs.add(new Triplet<>("BC_9",Boolean.FALSE,9));
        outputs.add(new Triplet<>("BCG_0",Boolean.FALSE,10));
        outputs.add(new Triplet<>("RFID_EXE_0",Boolean.FALSE,11));
        outputs.add(new Triplet<>("RFID_EXE_1",Boolean.FALSE,12));
        outputs.add(new Triplet<>("PAS_MP_0",Boolean.FALSE,13));
        outputs.add(new Triplet<>("PSH_0",Boolean.FALSE,14));
        outputs.add(new Triplet<>("CS_MP_0",Boolean.FALSE,15));
        outputs.add(new Triplet<>("CS_MN_0",Boolean.FALSE,16));
        outputs.add(new Triplet<>("SSC_MP_0",Boolean.FALSE,17));
        outputs.add(new Triplet<>("SSC_MN_0",Boolean.FALSE,18));
        outputs.add(new Triplet<>("PAS_T_0",Boolean.FALSE,19));

        inputs.add(new Triplet<>("BCG_S_0",Boolean.FALSE,0));
        inputs.add(new Triplet<>("DS_0",Boolean.FALSE,1));
        inputs.add(new Triplet<>("DS_1",Boolean.FALSE,2));
        inputs.add(new Triplet<>("PSH_BL_0",Boolean.FALSE,3));
        inputs.add(new Triplet<>("PSH_FL_0",Boolean.FALSE,4));
    }
}
