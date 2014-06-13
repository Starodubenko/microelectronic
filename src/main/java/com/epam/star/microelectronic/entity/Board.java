package com.epam.star.microelectronic.entity;

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

    public int totalSummElements(){
        int totalSumm = 0;
        for (Device s : devices) {
            totalSumm += s.getPrice();
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
