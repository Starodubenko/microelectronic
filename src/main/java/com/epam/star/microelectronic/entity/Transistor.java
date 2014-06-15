package com.epam.star.microelectronic.entity;

public class Transistor extends Device {

    private int baseCurrent;
    private int col_emitCurrent;
    private int gainCoefficient;
    private boolean key;

    public Transistor(ScMaterial semiconductorMaterial, int baseCurrent, int gainCoefficient, boolean key, int price) {
        super(semiconductorMaterial, price);
        this.baseCurrent = baseCurrent;
        this.gainCoefficient = gainCoefficient;
        this.key = key;
        col_emitCurrent = baseCurrent * gainCoefficient;
    }

    public String strengthing() {
        return "Otput currient {col_emitCurrent} = " + baseCurrent + "*" + gainCoefficient;
    }

    public String keySwitch(boolean key) {
        this.key = key;
        return "Key = " + key;
    }

    @Override
    public String toString() {
        return " |Transistor{" +
                "baseCurrent=" + baseCurrent +
                ", col_emitCurrent=" + col_emitCurrent +
                ", gainCoefficient=" + gainCoefficient +
                ", key=" + key +
                ", price=" + price +
                '}';
    }
}
