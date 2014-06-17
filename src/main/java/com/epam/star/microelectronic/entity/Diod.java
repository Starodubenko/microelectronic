package com.epam.star.microelectronic.entity;

public class Diod extends Device {

    public enum Construction{
        ZENER_DIOD, VARICAP,LIGHT_ELEMENT,PHOTODIODE, construction;

        @Override
        public String toString() {
            return name().toLowerCase();
        }
    }

    int directMaxCurrent;
    int backMaxVoltage;
    boolean position;
    Construction construction;

    public Diod(ScMaterial semiconductorMaterial, int directMaxCurrent, int backMaxVoltage, Construction construction, boolean position, int price) {
        super(semiconductorMaterial,price);
        this.directMaxCurrent = directMaxCurrent;
        this.backMaxVoltage = backMaxVoltage;
        this.construction = construction;
        this.position = position;
    }

    public java.math.BigDecimal getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return " |Diod{" +
                "directMaxCurrent=" + directMaxCurrent +
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
}
