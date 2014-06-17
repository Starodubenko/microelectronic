package com.epam.star.microelectronic.entity;

public class ChipBuilder {

    private Device.ScMaterial semiconductorMaterial;
    protected int price;
    private int pinCount;
    private int degreeIndegration;
    private int gainCoefficient;
    private Chip.Type type;
    private int maxVoltage;

    public ChipBuilder() {
    }

    public ChipBuilder SemiconductorMaterial(Device.ScMaterial semiconductorMaterial) {
        this.semiconductorMaterial = semiconductorMaterial;
        return this;
    }

    public ChipBuilder Price(int price) {
        this.price = price;
        return this;
    }

    public ChipBuilder PinCount(int pinCount) {
        this.pinCount = pinCount;
        return this;
    }

    public ChipBuilder DegreeIndegration(int degreeIndegration) {
        this.degreeIndegration = degreeIndegration;
        return this;
    }

    public ChipBuilder GainCoefficient(int gainCoefficient) {
        this.gainCoefficient = gainCoefficient;
        return this;
    }

    public ChipBuilder Type(Chip.Type type) {
        this.type = type;
        return this;
    }

    public ChipBuilder MaxVoltage(int maxVoltage) {
        this.maxVoltage = maxVoltage;
        return this;
    }

    public Chip buildChip(){
        return new Chip(semiconductorMaterial,pinCount,degreeIndegration,gainCoefficient,type,maxVoltage,price);
    }
}
