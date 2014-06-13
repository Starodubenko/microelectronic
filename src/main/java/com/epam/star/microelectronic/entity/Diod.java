package com.epam.star.microelectronic.entity;

public class Diod extends Device {

    public enum Construction{
        ZENER_DIOD, VARICAP,LIGHT_ELEMENT,PHOTODIODE;

        @Override
        public String toString() {
            return name().toLowerCase();
        }
    }

    int directMaxI;
    int backMaxU;
    boolean position;
    Construction construction;

    public Diod(ScMaterial semiconductorMaterial, int directMaxI, int backMaxU, Construction construction, boolean position, int price) {
        super(semiconductorMaterial,price);
        this.directMaxI = directMaxI;
        this.backMaxU = backMaxU;
        this.construction = construction;
        this.position = position;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return " |Diod{" +
                "directMaxI=" + directMaxI +
                ", backMaxU=" + backMaxU +
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
