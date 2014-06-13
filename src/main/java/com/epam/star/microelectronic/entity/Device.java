package com.epam.star.microelectronic.entity;

public abstract class Device {

    public enum ScMaterial{
        SILICON,GERMANIUM,PALLADIUM,MANGANIN
    }

    private ScMaterial semiconductorMaterial;
    protected int price;

    protected Device(ScMaterial semiconductorMaterial, int price) {
        this.semiconductorMaterial = semiconductorMaterial;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
