package com.jautomation.line.example;

public class Main {


    static IO io = new IO();

    static Conveyor conveyor_BC_0 = new Conveyor("BC_0", io.getOutputs());
    static Conveyor conveyor_SSC_MP_0 = new Conveyor("SSC_MP_0", io.getOutputs());
    static Conveyor conveyor_BC_1 = new Conveyor("BC_1", io.getOutputs());
    static Conveyor conveyor_BC_2 = new Conveyor("BC_2", io.getOutputs());
    static Conveyor conveyor_CS_MP_0 = new Conveyor("CS_MP_0", io.getOutputs());
    static Conveyor conveyor_BC_3 = new Conveyor("BC_3", io.getOutputs());
    static Conveyor conveyor_BC_4 = new Conveyor("BC_4", io.getOutputs());
    static Conveyor conveyor_BC_5 = new Conveyor("BC_5", io.getOutputs());
    static Conveyor conveyor_BC_6 = new Conveyor("BC_6", io.getOutputs());
    static Conveyor conveyor_BCG_0 = new Conveyor("BCG_0", io.getOutputs());
    static Conveyor conveyor_BC_7 = new Conveyor("BC_7", io.getOutputs());
    static Conveyor conveyor_BC_8 = new Conveyor("BC_8", io.getOutputs());
    static Conveyor conveyor_BC_9 = new Conveyor("BC_9", io.getOutputs());

    static Sensor sensor_DS_0 = new Sensor("DS_0", io.getInputs());
    static Sensor sensor_DS_1 = new Sensor("DS_1", io.getInputs());

    static PivotArmSorter pivot_PAS_T_0_MP_0 = new PivotArmSorter("PAS_MP_0", "PAS_T_0", io.getOutputs());

    public static void main(String[] args) throws InterruptedException {


        Cycle cycle = new Cycle(io.getInputs(), io.getOutputs());
        MainRunLogic runLogic = new MainRunLogic();

        while(true)
        {
            runLogic.execute();
            cycle.writeOutputs();
            cycle.readInputs();
            Thread.sleep(50);
        }


    }


}
