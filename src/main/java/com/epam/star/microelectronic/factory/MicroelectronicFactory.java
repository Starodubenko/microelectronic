package com.epam.star.microelectronic.factory;

import com.epam.star.microelectronic.entity.*;
import com.epam.star.microelectronic.util.PropertiesManager;

import java.io.IOException;
import java.util.Random;

public class MicroelectronicFactory {

    private final static Random rnd = new Random();

    private static PropertiesManager diodManager;
    private static PropertiesManager chipManager;
    private static PropertiesManager transistorManager;
    private static PropertiesManager resistorManager;

    static {
        try {
            diodManager = new PropertiesManager("diod_config.properties");
            chipManager = new PropertiesManager("chip_config.properties");
            transistorManager = new PropertiesManager("transistor_config.properties");
            resistorManager = new PropertiesManager("resistor_config.properties");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Board createCompleteBoard(int count, Device.Type... deviceType) throws IOException {


        Board newBoard = createBoard();
        Device device;

        for (int i = 0; i < count; i++) {
            String nameDevise = deviceType[rnd.nextInt(deviceType.length)].name();

            switch (nameDevise) {
                case "DIOD": {
                    device = createDiod();
                    newBoard.establishElement(device);
                }
                break;
                case "TRANSISTOR": {
                    device = createTransistor();
                    newBoard.establishElement(device);
                }
                break;
                case "CHIP": {
                    device = createChip();
                    newBoard.establishElement(device);
                }
                break;
                case "RESISTOR": {
                    device = createResistor();
                    newBoard.establishElement(device);
                }
                break;
            }
        }
        return newBoard;
    }

    private static Board createBoard() {
        int length = rnd.nextInt(300) + 10;
        int width = rnd.nextInt(300) + 10;
        ;
        Board board = new Board(length, width);

        return board;
    }

    private static Diod createDiod() {

        Device.ScMaterial material = Device.ScMaterial.values()[rnd.nextInt(Device.ScMaterial.values().length)];
        Diod.Construction construction = Diod.Construction.values()[rnd.nextInt(Diod.Construction.values().length)];
        int directMaxCurrent = rnd.nextInt(diodManager.getIntProperty("DIRECT_MAX_CURRENT") + diodManager.getIntProperty("DIRECT_MIN_CURRENT"));
        int backMaxVoltage = rnd.nextInt(diodManager.getIntProperty("BACK_MAX_VOLTAGE") + diodManager.getIntProperty("BACK_MIN_VOLTAGE"));
        boolean position = true;
        int price = rnd.nextInt(100);

        Diod diod = new Diod(material, directMaxCurrent, backMaxVoltage, construction, position, price);

        return diod;
    }


    private static Chip createChip() {

        Device.ScMaterial material = Device.ScMaterial.values()[rnd.nextInt(Device.ScMaterial.values().length)];
        Chip.Type type = Chip.Type.values()[rnd.nextInt(Chip.Type.values().length)];
        int pinCount = rnd.nextInt(chipManager.getIntProperty("MAX_PIN_COUNT")) + 4;
        int degreeIntegration = rnd.nextInt(chipManager.getIntProperty("MAX_DEGREE_INTEGRATION") + chipManager.getIntProperty("MIN_DEGREE_INTEGRATION"));
        int gainCoefficient = rnd.nextInt(chipManager.getIntProperty("MAX_GAINCOEFFICIENT"));
        int maxVoltage = rnd.nextInt(chipManager.getIntProperty("MAX_VOLTAGE")) + 1;
        int price = rnd.nextInt(170) + 30;

        Chip chip = new Chip(material, pinCount, degreeIntegration, gainCoefficient, type, maxVoltage, price);

        return chip;
    }


    private static Resistor createResistor() {

        Device.ScMaterial material = Device.ScMaterial.values()[rnd.nextInt(Device.ScMaterial.values().length)];
        int price = rnd.nextInt(50) + 1;
        int current = rnd.nextInt(resistorManager.getIntProperty("MAX_CURRENT")) + 1;
        int vaoltage = rnd.nextInt(resistorManager.getIntProperty("MAX_VOLTAGE")) + 1;
        int resistence = rnd.nextInt(resistorManager.getIntProperty("MAX_RESISTANCE")) + 1;
        int power = rnd.nextInt(resistorManager.getIntProperty("MAX_POWER")) + 1;

        Resistor resistor = new Resistor(material, current, vaoltage, resistence, power, price);

        return resistor;
    }

    private static Transistor createTransistor() {

        Device.ScMaterial material = Device.ScMaterial.values()[rnd.nextInt(Device.ScMaterial.values().length)];
        int baseCurrent = rnd.nextInt(transistorManager.getIntProperty("MAX_BASE_CURRENT")) + 1;
        int gainCoefficient = rnd.nextInt(transistorManager.getIntProperty("MAX_COL_EMIT_CURRENT")) + 1;
        int price = rnd.nextInt(50) + 1;
        boolean key = false;

        Transistor transistor = new Transistor(material, baseCurrent, gainCoefficient, key, price);

        return transistor;
    }
}
