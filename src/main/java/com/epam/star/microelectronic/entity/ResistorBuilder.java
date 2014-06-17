package com.epam.star.microelectronic.entity;

public class ResistorBuilder {

    private Device.ScMaterial semiconductorMaterial;
    protected int price;
    int maxCurrent;
    int maxVoltage;
    int resistance;
    int maxPower;

    public ResistorBuilder() {
    }

    public ResistorBuilder setSemiconductorMaterial(Device.ScMaterial semiconductorMaterial) {
        this.semiconductorMaterial = semiconductorMaterial;
        return this;
    }

    public ResistorBuilder Price(int price) {
        this.price = price;
        return this;
    }

    public ResistorBuilder MaxCurrent(int current) {
        this.maxCurrent = current;
        return this;
    }

    public ResistorBuilder MAxVoltage(int voltage) {
        this.maxVoltage = voltage;
        return this;
    }

    public ResistorBuilder Resistance(int resistance) {
        this.resistance = resistance;
        return this;
    }

    public ResistorBuilder MaxPower(int power) {
        this.maxPower = power;
        return this;
    }

    public Resistor buidResisror(){
        return new Resistor(semiconductorMaterial,maxCurrent,maxVoltage,resistance,maxPower,price);
    }
}
