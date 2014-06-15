package com.epam.star.microelectronic.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Board {
    String name;
    int length;
    int width;
    List<Device> devices = new ArrayList<Device>();

    public Board(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public void estaplishElement (Device device) {
        devices.add(device);
    }

    public BigDecimal totalSummElements(){
        BigDecimal totalSumm = new BigDecimal(0);
        for (Device s : devices) {
            totalSumm = totalSumm.add(s.getPrice());
        }
        return totalSumm;
    }

    @Override
    public String toString() {
        String elements = "";
        for (Device s : devices) {
            elements = elements + s.toString() +"\n";
        }
        return "Board{" +
                "length=" + length +
                ", width=" + width +
                    ", devices:"+ "\n" + elements +
                '}';
    }
}
