package com.epam.star.microelectronic.entity;

public class Resister extends Device {
    int current;
    int voltage;
    int resistance;
    int power;

    public Resister(ScMaterial semiconductorMaterial, int current, int voltage, int resistance, int power, int price) {
        super(semiconductorMaterial, price);
        this.current = current;
        this.voltage = voltage;
        this.resistance = resistance;
        this.power = power;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return " |Resister{" +
                "current=" + current +
                ", voltage=" + voltage +
                ", resistance=" + resistance +
                ", power=" + power +
                ", price=" + price +
                '}';
    }

    public String createTheVoltageDrop() {
        if (current * voltage > power) {
            return "resistor has failed";
        } else
            return "resistor created " + (current * resistance) + "V voltage drop";
    }
}
