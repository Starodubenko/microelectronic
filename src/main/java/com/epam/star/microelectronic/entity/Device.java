package com.epam.star.microelectronic.entity;

import java.math.BigDecimal;

public abstract class Device {

    protected BigDecimal price;
    private ScMaterial semiconductorMaterial;

    protected Device(ScMaterial semiconductorMaterial, int price) {
        this.semiconductorMaterial = semiconductorMaterial;
        this.price = new BigDecimal(price);
    }

    public BigDecimal getPrice() {
        return price;
    }

    public enum ScMaterial {
        SILICON, GERMANIUM, PALLADIUM, MANGANIN
    }

    public enum DevicesType {
        RESISTOR, TRANSISTOR, DIOD, CHIP
    }
}
