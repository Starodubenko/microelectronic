package com.epam.star.microelectronic.entity;

import java.util.Comparator;

public class Transistor extends Device {

    private int baseCurrent;
    private int col_emitCurrent;
    private boolean key;
    private int gainCoefficient;
    private static final Comparator<Transistor> COL_EMIT_CURRENT_COMPARATOR = new Comparator<Transistor>() {
        @Override
        public int compare(Transistor o1, Transistor o2) {
            return o1.col_emitCurrent - o2.col_emitCurrent;
        }
    };
    private static final Comparator<Transistor> GAIN_COEFFICIENT_COMPARATOR = new Comparator<Transistor>() {
        @Override
        public int compare(Transistor o1, Transistor o2) {
            return o1.gainCoefficient - o2.gainCoefficient;
        }
    };
    private static final Comparator<Transistor> BASE_COMPARATOR = new Comparator<Transistor>() {
        @Override
        public int compare(Transistor o1, Transistor o2) {
            return o1.baseCurrent - o2.baseCurrent;
        }
    };

    public Transistor(ScMaterial semiconductorMaterial, int baseCurrent, int gainCoefficient, boolean key, int price) {
        super(semiconductorMaterial, price);
        this.baseCurrent = baseCurrent;
        this.gainCoefficient = gainCoefficient;
        this.key = key;
        col_emitCurrent = baseCurrent * gainCoefficient;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Transistor that = (Transistor) o;

        if (baseCurrent != that.baseCurrent) return false;
        if (col_emitCurrent != that.col_emitCurrent) return false;
        if (gainCoefficient != that.gainCoefficient) return false;
        if (key != that.key) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = baseCurrent;
        result = 31 * result + col_emitCurrent;
        result = 31 * result + gainCoefficient;
        result = 31 * result + (key ? 1 : 0);
        return result;
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
                "semiconductorMaterial=" + semiconductorMaterial +
                ", baseCurrent=" + baseCurrent +
                ", col_emitCurrent=" + col_emitCurrent +
                ", gainCoefficient=" + gainCoefficient +
                ", key=" + key +
                ", price=" + price +
                '}';
    }
}
