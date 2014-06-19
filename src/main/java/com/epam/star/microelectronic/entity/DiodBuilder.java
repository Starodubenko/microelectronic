package com.epam.star.microelectronic.entity;

public class DiodBuilder {

    protected int price;
    int directMaxCurrent;
    int backMaxVoltage;
    boolean position;
    Diod.Construction construction;
    private Device.ScMaterial semiconductorMaterial;

    public DiodBuilder() {
    }

    public DiodBuilder SemiconductorMaterial(Device.ScMaterial semiconductorMaterial) {
        this.semiconductorMaterial = semiconductorMaterial;
        return this;
    }

    public DiodBuilder Price(int price) {
        this.price = price;
        return this;
    }

    public DiodBuilder DirectMaxCurrent(int directMaxCurrent) {
        this.directMaxCurrent = directMaxCurrent;
        return this;
    }

    public DiodBuilder BackMaxVoltage(int backMaxVoltage) {
        this.backMaxVoltage = backMaxVoltage;
        return this;
    }

    public DiodBuilder Position(boolean position) {
        this.position = position;
        return this;
    }

    public DiodBuilder Construction(Diod.Construction construction) {
        this.construction = construction;
        return this;
    }

    public Diod buildDiod() {
        return new Diod(semiconductorMaterial, directMaxCurrent, backMaxVoltage, construction, position, price);
    }
}
