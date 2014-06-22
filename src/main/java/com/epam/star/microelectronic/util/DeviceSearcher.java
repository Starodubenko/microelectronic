package com.epam.star.microelectronic.util;

import com.epam.star.microelectronic.entity.Device;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DeviceSearcher {

    private List<Device> originArray = new ArrayList<>();

    public DeviceSearcher(List<Device> finishedArray) {
        this.originArray = finishedArray;
    }

    public DeviceSearcher() {
    }

    public List<Device> deviceSearch(Device.Type type){

        List<Device> finishedArray = new ArrayList<>();
        for (Device device : originArray) {
            String firstType = device.getClass().getSimpleName().toUpperCase();
            if (firstType.equals(type.toString())) {
                finishedArray.add(device);
            }
        }
        return finishedArray;
    }

    public List<Device> deviceSearch(Device.ScMaterial scMaterial){

        List<Device> finishedArray = new ArrayList<>();
        for (Device device : originArray) {
            Device.ScMaterial firstScMaterial = device.getSemiconductorMaterial();
            if (firstScMaterial == scMaterial) {
                finishedArray.add(device);
            }
        }
        return finishedArray;
    }

    public List<Device> deviceSearch(int startPrice, int finishPrice){

        List<Device> finishedArray = new ArrayList<>();
        for (Device device : originArray) {
            String firstType = device.getClass().getSimpleName().toUpperCase();
            Device.ScMaterial firstScMaterial = device.getSemiconductorMaterial();
            if (device.getPrice().compareTo(BigDecimal.valueOf(startPrice)) >0 &&
                    device.getPrice().compareTo(BigDecimal.valueOf(finishPrice)) <0) {
                finishedArray.add(device);
            }
        }
        return finishedArray;
    }

    public List<Device> deviceSearch(Device.Type type,Device.ScMaterial scMaterial){

        List<Device> finishedArray = new ArrayList<>();
        for (Device device : originArray) {
            String firstType = device.getClass().getSimpleName().toUpperCase();
            Device.ScMaterial firstScMaterial = device.getSemiconductorMaterial();
            if (firstType.equals(type.toString()) && firstScMaterial == scMaterial){
                finishedArray.add(device);
            }
        }
        return finishedArray;
    }

    public List<Device> deviceSearch(Device.Type type, int startPrice, int finishPrice){

        List<Device> finishedArray = new ArrayList<>();
        for (Device device : originArray) {
            String firstType = device.getClass().getSimpleName().toUpperCase();
            if (firstType.equals(type.toString()) &&
                    device.getPrice().compareTo(BigDecimal.valueOf(startPrice)) >0 &&
                    device.getPrice().compareTo(BigDecimal.valueOf(finishPrice)) <0) {
                finishedArray.add(device);
            }
        }
        return finishedArray;
    }

    public List<Device> deviceSearch(Device.ScMaterial scMaterial, int startPrice, int finishPrice){

        List<Device> finishedArray = new ArrayList<>();
        for (Device device : originArray) {
            Device.ScMaterial firstScMaterial = device.getSemiconductorMaterial();
            if (firstScMaterial == scMaterial &&
                    device.getPrice().compareTo(BigDecimal.valueOf(startPrice)) >0 &&
                    device.getPrice().compareTo(BigDecimal.valueOf(finishPrice)) <0) {
                finishedArray.add(device);
            }
        }
        return finishedArray;
    }

    public List<Device> deviceSearch(Device.Type type,Device.ScMaterial scMaterial, int startPrice, int finishPrice){

        List<Device> finishedArray = new ArrayList<>();
        for (Device device : originArray) {
            String firstType = device.getClass().getSimpleName().toUpperCase();
            Device.ScMaterial firstScMaterial = device.getSemiconductorMaterial();
            if (firstType.equals(type.toString()) &&
                    firstScMaterial == scMaterial &&
                    device.getPrice().compareTo(BigDecimal.valueOf(startPrice)) >0 &&
                    device.getPrice().compareTo(BigDecimal.valueOf(finishPrice)) <0) {
                finishedArray.add(device);
            }
        }
        return finishedArray;
    }
}
