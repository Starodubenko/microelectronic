package com.epam.star.microelectronic.entity;

import java.util.Comparator;

public class Diod extends Device {

    public static final Comparator<Diod> CONTRUCTION_COMPARATOR = new Comparator<Diod>() {
        @Override
        public int compare(Diod o1, Diod o2) {
            String s = o1.construction.name();
            return s.compareTo(o2.construction.name());
        }
    };
    private int directMaxCurrent;
    public static final Comparator<Diod> DIRECT_CURRENT_COMPARATOR = new Comparator<Diod>() {
        @Override
        public int compare(Diod o1, Diod o2) {
            return o1.directMaxCurrent - o2.directMaxCurrent;
        }
    };
    private int backMaxVoltage;
    public static final Comparator<Diod> BACK_VOLTAGE_COMPARATOR = new Comparator<Diod>() {
        @Override
        public int compare(Diod o1, Diod o2) {
            return o1.backMaxVoltage - o2.backMaxVoltage;
        }
    };
    private boolean position;
    private Construction construction;


    public Diod(ScMaterial semiconductorMaterial, int directMaxCurrent, int backMaxVoltage, Construction construction, boolean position, int price) {
        super(semiconductorMaterial, price);
        this.directMaxCurrent = directMaxCurrent;
        this.backMaxVoltage = backMaxVoltage;
        this.construction = construction;
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Diod diod = (Diod) o;

        if (backMaxVoltage != diod.backMaxVoltage) return false;
        if (directMaxCurrent != diod.directMaxCurrent) return false;
        if (position != diod.position) return false;
        if (construction != diod.construction) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = directMaxCurrent;
        result = 31 * result + backMaxVoltage;
        result = 31 * result + (position ? 1 : 0);
        result = 31 * result + construction.hashCode();
        return result;
    }

    public java.math.BigDecimal getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return " |Diod{" +
                "semiconductorMaterial=" + semiconductorMaterial +
                ", directMaxCurrent=" + directMaxCurrent +
                ", backMaxVoltage=" + backMaxVoltage +
                ", position=" + position +
                ", construction='" + construction + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    public String chengePosition() {
        if (position) {
            return "Diod is condacting current";
        } else return "Diod isn't condacting current";
    }

    public enum Construction {
        ZENER_DIOD, VARICAP, LIGHT_ELEMENT, PHOTODIODE, construction;

        @Override
        public String toString() {
            return name().toLowerCase();
        }
    }
}
