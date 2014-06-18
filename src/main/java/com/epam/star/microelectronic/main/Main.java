package com.epam.star.microelectronic.main;

import com.epam.star.microelectronic.entity.*;
import com.epam.star.microelectronic.factory.MicroelectronicFactory;

//This project emulate process of creating microelements, and put them on the board
public class Main {
    public static void main(String[] args) {

        Board board = new Board(100, 100);
        board.setName("FirstBoard");

        MicroelectronicFactory factory = new MicroelectronicFactory();
        board.estaplishElements(factory.createDevices(10, Device.DevicesType.RESISTOR, Device.DevicesType.TRANSISTOR, Device.DevicesType.DIOD, Device.DevicesType.CHIP));

        Board board2 = board.createCopy();
        board2.setName("SecondBoard");
        board2.deleteElement(0);

        System.out.println(board.toString());
        System.out.println(board2.toString());

        System.out.println("=======================TOTAL SUMM=======================================================");
        System.out.println(board.totalSummElements());

    }
}
