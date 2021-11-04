package com.jautomation.conveyor.example;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Conveyor conveyor = new Conveyor(ModbusConnector.getModbusClient());
        conveyor.start();

        Thread.sleep(5000);

        conveyor.stop();
    }
}
