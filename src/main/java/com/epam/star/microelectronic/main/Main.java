package com.epam.star.microelectronic.main;

import com.epam.star.microelectronic.entity.*;
//This project emulate process of creating microelements, and put them on the board
public class Main {
    public static void main(String[] args) {
        Board board = new Board(100, 100);

        Transistor transistor1 = new Transistor(Device.ScMaterial.SILICON,2,3,20);
        Transistor transistor2 = new Transistor(Device.ScMaterial.SILICON,2,3,20);

        Chip chip = new Chip(Device.ScMaterial.SILICON,10,100,3, Chip.Type.ANALOG,5,10);

        Diod diod = new Diod(Device.ScMaterial.SILICON,2,3, Diod.Construction.LIGHT_ELEMENT,true,30);

        System.out.println("=========================TRANSISTOR==================================");
        board.estaplishElement(transistor1);
        System.out.println(transistor1.strengthing());
        System.out.println(transistor1.keySwitch(true));

        System.out.println("=========================TRANSISTOR===================================");
        board.estaplishElement(transistor2);
        System.out.println(transistor1.strengthing());
        System.out.println(transistor1.keySwitch(false));

        board.estaplishElement(chip);
        System.out.println("=========================CHIP========================================");
        System.out.println(chip.dataConvert());
        System.out.println(chip.dataProcessing());
        System.out.println(chip.strangthingSignal());

        board.estaplishElement(diod);
        System.out.println("===========================DIOD=========================================");
        System.out.println(diod.chengePosition());

        System.out.println("==================ALL ELEMENTS ON THE PLATA=============================");
        System.out.println(board.toString());

        System.out.println("=======================TOTAL SUMM=======================================");
        System.out.println(board.totalSummElements());

    }
}
