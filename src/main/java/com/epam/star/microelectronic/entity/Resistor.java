package com.epam.star.microelectronic.entity;

import java.math.BigDecimal;

public class Resistor extends Device {

    private int current;
    private int voltage;
    private int resistance;
    private int power;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Resistor resistor = (Resistor) o;

        if (current != resistor.current) return false;
        if (power != resistor.power) return false;
        if (resistance != resistor.resistance) return false;
        if (voltage != resistor.voltage) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = current;
        result = 31 * result + voltage;
        result = 31 * result + resistance;
        result = 31 * result + power;
        return result;
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
