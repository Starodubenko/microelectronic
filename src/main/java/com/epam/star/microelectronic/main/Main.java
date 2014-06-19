package com.epam.star.microelectronic.main;

import com.epam.star.microelectronic.entity.*;
import com.epam.star.microelectronic.factory.MicroelectronicFactory;

//This project emulate process of creating microelements, and put them on the board
public class Main {
    public static void main(String[] args) {

        Board board = MicroelectronicFactory.createDevices(10, Device.DevicesType.RESISTOR, Device.DevicesType.TRANSISTOR, Device.DevicesType.DIOD, Device.DevicesType.CHIP);
        board.setName("FirstBoard");

        Board boardCopy = board.createCopy();
        boardCopy.setName("SecondBoard");
        boardCopy.devices.get(1).setPrice(555);
        boardCopy.deleteElement(0);

        System.out.println(board.toString());
        System.out.println(boardCopy.toString());

        System.out.println("=======================TOTAL SUMM=======================================================");
        System.out.println(board.totalSummElements());

    }
}
