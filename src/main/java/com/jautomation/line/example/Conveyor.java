package com.jautomation.line.example;
import org.javatuples.Triplet;

import java.util.ArrayList;

public class Conveyor extends Actuator{

    public Conveyor(String name, ArrayList<Triplet> outputs) {
        super(name, outputs);
    }
}
