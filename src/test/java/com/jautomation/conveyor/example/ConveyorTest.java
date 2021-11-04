package com.jautomation.conveyor.example;

import de.re.easymodbus.exceptions.ModbusException;
import de.re.easymodbus.modbusclient.ModbusClient;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ConveyorTest {

        static ModbusClient modbusClient;
        static Conveyor conveyor;


        @BeforeAll
        static void setup() throws IOException, ModbusException
        {

                modbusClient = mock(ModbusClient.class);
                mockStatic(ModbusConnector.class);
                when(ModbusConnector.getModbusClient()).thenReturn(modbusClient);
                doNothing().when(modbusClient).WriteSingleCoil(0,true);
                conveyor = new Conveyor(ModbusConnector.getModbusClient());
        }

        @Test
        void testStartConveyorIsTrue() throws IOException, ModbusException {
                when(modbusClient.ReadCoils(0,1)).thenReturn(new boolean[]{true});
                assertEquals(Enums.ConveyorStatus.OP_SUCCESS, conveyor.start());
        }

        @Test
        void testStartConveyorIsFalse() throws IOException, ModbusException {
                when(modbusClient.ReadCoils(0,1)).thenReturn(new boolean[]{false});
                assertEquals(Enums.ConveyorStatus.OP_FAIL, conveyor.start());
        }

        @Test
        void testStopConveyorIsTrue() throws IOException, ModbusException {
                when(modbusClient.ReadCoils(0,1)).thenReturn(new boolean[]{false});
                assertEquals(Enums.ConveyorStatus.OP_SUCCESS,conveyor.stop());
        }

        @Test
        void testStopConveyorIsFalse() throws IOException, ModbusException {
                when(modbusClient.ReadCoils(0,1)).thenReturn(new boolean[]{true});
                assertEquals(Enums.ConveyorStatus.OP_FAIL,conveyor.stop());
        }
}