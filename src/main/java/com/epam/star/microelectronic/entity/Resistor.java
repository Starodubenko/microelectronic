package com.epam.star.microelectronic.entity;

import java.math.BigDecimal;

public class Resistor extends Device {

    int current;
    int voltage;
    int resistance;
    int power;

    public Resistor(ScMaterial semiconductorMaterial, int current, int voltage, int resistance, int power, int price) {
        super(semiconductorMaterial, price);
        this.current = current;
        this.voltage = voltage;
        this.resistance = resistance;
        this.power = power;
    }

    public java.math.BigDecimal getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return " |Resistor{" +
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
