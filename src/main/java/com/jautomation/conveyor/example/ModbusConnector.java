package com.jautomation.conveyor.example;

import de.re.easymodbus.modbusclient.ModbusClient;

public class ModbusConnector {

    public static ModbusClient modbusClient = new ModbusClient("127.0.0.1",502);

    private ModbusConnector(){

    }

    public static ModbusClient getModbusClient() {
        return modbusClient;
    }
}
