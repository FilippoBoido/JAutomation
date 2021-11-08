package com.jautomation.line.example;

import de.re.easymodbus.modbusclient.ModbusClient;

public class ModbusConnector {

    public static ModbusClient modbusClient = new ModbusClient("192.168.2.118",502);

    private ModbusConnector(){

    }

    public static ModbusClient getModbusClient() {
        return modbusClient;
    }
}
