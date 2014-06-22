package com.epam.star.microelectronic.entity;

import java.util.Comparator;

public class Chip extends Device {

    private int degreeIndegration;
    private int gainCoefficient;
    private Type type;
    private int maxVoltage;
    private int pinCount;
    public static final Comparator<Chip> TYPE_COMPARATOR = new Comparator<Chip>() {
        @Override
        public int compare(Chip o1, Chip o2) {
            String s = o1.type.name();
            return s.compareTo(o2.type.name());
        }
    };
    public static final Comparator<Chip> PIN_COUNT_COMPARATOR = new Comparator<Chip>() {
        @Override
        public int compare(Chip o1, Chip o2) {
            return o1.pinCount - o2.pinCount;
        }
    };
    public static final Comparator<Chip> VOLTAGE_COMPARATOR = new Comparator<Chip>() {
        @Override
        public int compare(Chip o1, Chip o2) {
            return o1.maxVoltage - o2.maxVoltage;
        }
    };

    public Chip(ScMaterial semiconductorMaterial, int pinCount, int degreeIndegration, int gainCoefficient, Type type, int maxVoltage, int price) {
        super(semiconductorMaterial, price);
        this.pinCount = pinCount;
        this.degreeIndegration = degreeIndegration;
        this.gainCoefficient = gainCoefficient;
        this.type = type;
        this.maxVoltage = maxVoltage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Chip chip = (Chip) o;

        if (degreeIndegration != chip.degreeIndegration) return false;
        if (gainCoefficient != chip.gainCoefficient) return false;
        if (maxVoltage != chip.maxVoltage) return false;
        if (pinCount != chip.pinCount) return false;
        if (type != chip.type) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pinCount;
        result = 31 * result + degreeIndegration;
        result = 31 * result + gainCoefficient;
        result = 31 * result + type.hashCode();
        result = 31 * result + maxVoltage;
        return result;
    }

    @Override
    public String toString() {

        return " |Chip{" +
                "semiconductorMaterial=" + semiconductorMaterial +
                ", pinCount=" + pinCount +
                ", degreeIndegration=" + degreeIndegration +
                ", gainCoefficient=" + gainCoefficient +
                ", type=" + type +
                ", maxVoltage=" + maxVoltage +
                ", price=" + price +
                '}';
    }

    public String strangthingSignal() {
        return "Signal " + maxVoltage + "V was strengthened in " + gainCoefficient + " times";
    }

    public String dataProcessing() {
        return type + " signal was processed";
    }

    public String dataConvert() {

        switch (type) {
            case ANALOG:
                return "digital signal was converted into " + type;
            case DIGITAL:
                return "analog signal was converted into " + type;
            default:
                return "Invalid type of the signal";

        }
    }

    public enum Type {
        ANALOG, DIGITAL;

        @Override
        public String toString() {
            return name().toLowerCase();
        }
    }
}
