package com.epam.star.microelectronic.factory;

import com.epam.star.microelectronic.entity.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public  class MicroelectronicFactory {

    private final static Random rnd = new Random();

    public MicroelectronicFactory() {

    }

    public List<Device> createDevices(int count, Device.DevicesType... deviceType){

        List<Device> deviceList = new ArrayList<>();
        Device device;

        for (int i = 0; i<count; i++){
           String nameDevise = deviceType[rnd.nextInt(deviceType.length)].name();

            switch (nameDevise) {
                case "DIOD": {device = diodFactory();deviceList.add(device);}
                    break;
                case "TRANSISTOR": {device = transistorFactory();deviceList.add(device);}
                    break;
                case "CHIP": {device =  chipFactory();deviceList.add(device);}
                    break;
                case "RESISTOR": {device = resistorFactory();deviceList.add(device);}
                    break;
            }
        }
        return deviceList;
    }

    private Diod diodFactory() {

        Device.ScMaterial material = Device.ScMaterial.values()[rnd.nextInt(Device.ScMaterial.values().length)];
        Diod.Construction construction = Diod.Construction.values()[rnd.nextInt(Diod.Construction.values().length)];
        int directMaxCurrent  = rnd.nextInt(15);
        int backMaxVoltage = rnd.nextInt(15);
        boolean position = true;
        int price = rnd.nextInt(100);

        Diod diod = new Diod(material,directMaxCurrent,backMaxVoltage,construction,position,price);

        return diod;
    }


    private Chip chipFactory() {

        Device.ScMaterial material = Device.ScMaterial.values()[rnd.nextInt(Device.ScMaterial.values().length)];
        Chip.Type type = Chip.Type.values()[rnd.nextInt(Chip.Type.values().length)];
        int pinCount = rnd.nextInt(10)+4;
        int degreeIntegration = rnd.nextInt(100);
        int gainCoefficient = rnd.nextInt(10);
        int maxVoltage = rnd.nextInt(10)+1;
        int price = rnd.nextInt(170)+30;

        Chip chip = new Chip(material,pinCount,degreeIntegration,gainCoefficient,type,maxVoltage,price);

        return chip;
    }


    private Resistor resistorFactory() {

        Device.ScMaterial material = Device.ScMaterial.values()[rnd.nextInt(Device.ScMaterial.values().length)];
        int price = rnd.nextInt(10)+1;
        int current = rnd.nextInt(5)+1;
        int vaoltage = rnd.nextInt(15)+1;
        int resistence = rnd.nextInt(100)+1;
        int power = rnd.nextInt(5)+1;

        Resistor resistor = new Resistor(material,current,vaoltage,resistence,power,price);

        return resistor;
    }

    private Transistor transistorFactory(){

        Device.ScMaterial material = Device.ScMaterial.values()[rnd.nextInt(Device.ScMaterial.values().length)];
        int baseCurrent = rnd.nextInt(5)+1;
        int gainCoefficient = rnd.nextInt(5)+1;
        int price = rnd.nextInt(50)+1;
        boolean key = false;

        Transistor transistor = new Transistor(material,baseCurrent,gainCoefficient,key,price);

        return transistor;
    }
}
