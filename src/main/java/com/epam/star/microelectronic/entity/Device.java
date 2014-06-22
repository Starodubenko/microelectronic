package com.epam.star.microelectronic.entity;

import java.math.BigDecimal;
import java.util.Comparator;

public abstract class Device implements Cloneable {

    protected BigDecimal price;
    protected ScMaterial semiconductorMaterial;
    protected Type type;

    public static final Comparator<Device> SEMICONDUCTORMATERIAL_COMPARATOR = new Comparator<Device>() {
        @Override
        public int compare(Device o1, Device o2) {
            String s = o1.semiconductorMaterial.name();
            return s.compareTo(o2.semiconductorMaterial.name());
        }
    };
    public static final Comparator<Device> PRICE_COMPARATOR = new Comparator<Device>() {
        @Override
        public int compare(Device o1, Device o2) {
            BigDecimal result = o1.price.subtract(o2.price);
            return result.intValue();
        }
    };
    protected Device(ScMaterial semiconductorMaterial, int price) {
        this.semiconductorMaterial = semiconductorMaterial;
        this.price = new BigDecimal(price);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = new BigDecimal(price);
    }

    public ScMaterial getSemiconductorMaterial() {
        return semiconductorMaterial;
    }

    public Type getType() {
        return type;
    }

    public enum ScMaterial {
        SILICON, GERMANIUM, PALLADIUM, MANGANIN
    }

    public enum Type {
        RESISTOR, TRANSISTOR, DIOD, CHIP
    }


}
