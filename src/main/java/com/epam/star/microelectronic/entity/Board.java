package com.epam.star.microelectronic.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Board implements Cloneable {

    public List<Device> devices = new ArrayList<Device>();
    private String name;
    private int length;
    private int width;

    public Board(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Board createCopy() {
        Board copy = null;
        try {
            copy = (Board) super.clone();
            copy.devices = totalCloneDevicesList(devices);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return copy;
    }

    private List<Device> totalCloneDevicesList(List<Device> devices) throws CloneNotSupportedException {

        List<Device> newList = new ArrayList<>();

        for (Device device : devices) {
            newList.add((Device) device.clone());
        }
        return newList;
    }

    public void deleteElement(int index) {
        devices.remove(index);
    }

    public void establishElement(Device... device) {
        for (Device device1 : device) {
            devices.add(device1);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Board board = (Board) o;

        if (length != board.length) return false;
        if (width != board.width) return false;
        if (!devices.equals(board.devices)) return false;
        if (!name.equals(board.name)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + length;
        result = 31 * result + width;
        result = 31 * result + devices.hashCode();
        return result;
    }

    public void estaplishElements(List<Device> device) {
        this.devices = device;

    }

    public BigDecimal totalSummElements() {
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
            elements = elements + s.toString() + "\n";
        }
        return name + " {" +
                "length=" + length +
                ", width=" + width +
                ", devices:" + "\n" + elements +
                '}';
    }
}
