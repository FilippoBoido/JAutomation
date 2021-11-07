package com.jautomation.line.example;

import static com.jautomation.line.example.Main.*;

public class MainRunLogic {

    int step;
    int cycleCounter;

    public void execute() {

        switch (step){

            case 0:

                conveyor_BC_9.start();
                conveyor_BC_0.start();
                step=10;
                break;

            case 10:

                if (sensor_DS_0.isHigh())
                {
                    System.out.println("Sensor " + sensor_DS_0.getName() + " is high");
                    conveyor_BC_9.stop();

                    pivot_PAS_T_0_MP_0.pivot();
                    pivot_PAS_T_0_MP_0.start();
                    conveyor_SSC_MP_0.start();
                    conveyor_BC_1.start();
                    conveyor_BC_2.start();
                    conveyor_CS_MP_0.start();
                    step=20;
                }
                break;

            case 20:

                if (sensor_DS_1.isHigh())
                {
                    System.out.println("Sensor " + sensor_DS_1.getName() + " is high");
                    pivot_PAS_T_0_MP_0.reset();
                    pivot_PAS_T_0_MP_0.stop();
                    conveyor_SSC_MP_0.stop();
                    conveyor_BC_1.stop();
                    conveyor_BC_2.stop();

                    conveyor_BC_3.start();
                    conveyor_BC_4.start();
                    conveyor_BC_5.start();
                    conveyor_BC_6.start();
                    conveyor_BCG_0.start();
                    conveyor_BC_7.start();
                    conveyor_BC_8.start();
                    conveyor_BC_0.start();
                    step=30;
                }
                break;

            case 30:

                if (sensor_DS_0.isHigh())
                {
                    System.out.println("Sensor " + sensor_DS_0.getName() + " is high");
                    conveyor_BC_3.stop();
                    conveyor_BC_4.stop();
                    conveyor_BC_5.stop();
                    conveyor_BC_6.stop();
                    conveyor_BCG_0.stop();
                    conveyor_BC_7.stop();
                    conveyor_BC_8.stop();
                    step=40;
                }
                break;

            case 40:

                cycleCounter++;
                if (cycleCounter == 100)
                {
                    conveyor_BC_0.stop();
                    cycleCounter=0;
                    step=50;
                }
                break;

            case 50:
                break;
        }
    }
}
