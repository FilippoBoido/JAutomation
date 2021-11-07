package com.jautomation.conveyor.example;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        //conveyor.start();

        IO io = new IO();
        Cycle cycle = new Cycle(io.getInputs(), io.getOutputs());

        Conveyor conveyor = new Conveyor("BC_0", io.getOutputs());
        conveyor.start();
        cycle.writeOutputs();
        //cycle.readInputs();
        /*
        System.out.println("Input: "
                + io.getInputs().get(3).getValue0() + " Value: "
                + io.getInputs().get(3).getValue1()
                + " Starting address: "
                + io.getInputs().get(3).getValue2());

        */

        Thread.sleep(5000);

        conveyor.stop();
        cycle.writeOutputs();

    }
}
