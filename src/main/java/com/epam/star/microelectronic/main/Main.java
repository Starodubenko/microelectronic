package com.epam.star.microelectronic.main;

import com.epam.star.microelectronic.entity.*;
import com.epam.star.microelectronic.factory.MicroelectronicFactory;

//This project emulate process of creating microelements, and put them on the board
public class Main {
    public static void main(String[] args) {
        Board board = new Board(100, 100);

//        Transistor transistor1 = new TransistorBuilder()
//                .SemiconductorMaterial(Device.ScMaterial.SILICON)
//                .BaseCurrent(2)
//                .GainCoefficient(3)
//                .Key(false)
//                .Price(20)
//                .bildTransistor();
//
//        Transistor transistor2 = new TransistorBuilder()
//                .SemiconductorMaterial(Device.ScMaterial.SILICON)
//                .BaseCurrent(2)
//                .GainCoefficient(3)
//                .Key(false)
//                .Price(20)
//                .bildTransistor();
//
//        Chip chip = new ChipBuilder()
//                .DegreeIndegration(100)
//                .GainCoefficient(3)
//                .MaxVoltage(5)
//                .SemiconductorMaterial(Device.ScMaterial.SILICON)
//                .PinCount(10)
//                .Type(Chip.Type.ANALOG)
//                .Price(90)
//                .buildChip();
//
//        Diod diod = new DiodBuilder()
//                .SemiconductorMaterial(Device.ScMaterial.SILICON)
//                .DirectMaxCurrent(2)
//                .BackMaxVoltage(3)
//                .Construction(Diod.Construction.LIGHT_ELEMENT)
//                .Position(true)
//                .Price(30)
//                .buildDiod();
//
//        Resistor resistor = new ResistorBuilder()
//                .MaxCurrent(2)
//                .MAxVoltage(15)
//                .MaxPower(5)
//                .Resistance(15)
//                .Price(5)
//                .setSemiconductorMaterial(Device.ScMaterial.MANGANIN)
//                .buidResisror();


//        System.out.println("=========================TRANSISTOR==================================");
//        board.estaplishElement(transistor1);
//        System.out.println(transistor1.strengthing());
//        System.out.println(transistor1.keySwitch(true));
//
//        System.out.println("=========================TRANSISTOR===================================");
//        board.estaplishElement(transistor2);
//        System.out.println(transistor1.strengthing());
//        System.out.println(transistor1.keySwitch(false));
//
//        board.estaplishElement(chip);
//        System.out.println("=========================CHIP========================================");
//        System.out.println(chip.dataConvert());
//        System.out.println(chip.dataProcessing());
//        System.out.println(chip.strangthingSignal());
//
//        board.estaplishElement(diod);
//        System.out.println("===========================DIOD=========================================");
//        System.out.println(diod.chengePosition());
//
//        System.out.println("==================ALL ELEMENTS ON THE PLATA=============================");
//        System.out.println(board.toString());
//
//        System.out.println("=======================TOTAL SUMM=======================================");
//        System.out.println(board.totalSummElements());

        MicroelectronicFactory factory = new MicroelectronicFactory();
        board.estaplishElements(factory.createDevices(10, Device.DevicesType.RESISTOR, Device.DevicesType.TRANSISTOR, Device.DevicesType.DIOD, Device.DevicesType.CHIP));
        System.out.println(board.toString());


    }
}
