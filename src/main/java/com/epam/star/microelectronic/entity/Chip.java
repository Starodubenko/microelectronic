package com.epam.star.microelectronic.entity;

public class Chip extends Device {

    public enum Type {
        ANALOG, DIGITAL;

        @Override
        public String toString() {
            return name().toLowerCase();
        }
    }

    private int pinCount;
    private int degreeIndegration;
    private int gainCoefficient;
    private Type type;
    private int maxU;

    public Chip(ScMaterial semiconductorMaterial, int pinCount, int degreeIndegration, int gainCoefficient, Type type, int maxU, int price) {
        super(semiconductorMaterial, price);
        this.pinCount = pinCount;
        this.degreeIndegration = degreeIndegration;
        this.gainCoefficient = gainCoefficient;
        this.type = type;
        this.maxU = maxU;
    }

    @Override
    public String toString() {
        return " |Chip{" +
                "pinCount=" + pinCount +
                ", degreeIndegration=" + degreeIndegration +
                ", gainCoefficient=" + gainCoefficient +
                ", type=" + type +
                ", maxU=" + maxU +
                ", price=" + price +
                '}';
    }

    public String strangthingSignal() {
        return "Signal " + maxU + "V was strengthened in " + gainCoefficient + " times";
    }

    public String dataProcessing() {
        return type + " signal was processed";
    }

    public String dataConvert() {

        switch (type) {
            case ANALOG: return  "digital signal was converted into " + type;
            case DIGITAL: return "analog signal was converted into " + type;
                 default: return "Invalid type of the signal";

        }
    }
}