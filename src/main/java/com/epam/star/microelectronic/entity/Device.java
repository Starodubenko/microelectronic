package com.epam.star.microelectronic.entity;

import java.math.BigDecimal;

public abstract class Device {

    public enum ScMaterial{
        SILICON,GERMANIUM,PALLADIUM,MANGANIN
    }

    private ScMaterial semiconductorMaterial;
    protected BigDecimal price;

    protected Device(ScMaterial semiconductorMaterial, int price) {
        this.semiconductorMaterial = semiconductorMaterial;
        this.price = new BigDecimal(price);
    }

    public BigDecimal getPrice() {
        return price;
    }
}
