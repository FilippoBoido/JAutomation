package com.jautomation.conveyor.example;
import de.re.easymodbus.exceptions.ModbusException;
import de.re.easymodbus.modbusclient.*;
import org.javatuples.Triplet;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayList;

public class Conveyor extends Actuator{

    public Conveyor(String name, ArrayList<Triplet> outputs) {
        super(name, outputs);
    }
}
