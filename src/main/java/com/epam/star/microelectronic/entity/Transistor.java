package com.epam.star.microelectronic.entity;

public class Transistor extends Device {
    private int baseI;
    private int col_emitI;
    private int gainCoefficient;
    private boolean key = false;

    public Transistor(ScMaterial semiconductorMaterial, int baseI, int gainCoefficient, int price) {
        super(semiconductorMaterial, price);
        this.baseI = baseI;
        this.gainCoefficient = gainCoefficient;
        col_emitI = baseI * gainCoefficient;
    }

    public String strengthing() {
        return "Otput currient {col_emitI} = " + baseI + "*" + gainCoefficient;
    }

    public String keySwitch(boolean key) {
        this.key = key;
        return "Key = " + key;
    }

    @Override
    public String toString() {
        return " |Transistor{" +
                "baseI=" + baseI +
                ", col_emitI=" + col_emitI +
                ", gainCoefficient=" + gainCoefficient +
                ", key=" + key +
                ", price=" + price +
                '}';
    }
}
