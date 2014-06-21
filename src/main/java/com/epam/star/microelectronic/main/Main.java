package com.epam.star.microelectronic.main;

import com.epam.star.microelectronic.entity.*;
import com.epam.star.microelectronic.factory.MicroelectronicFactory;
import com.epam.star.microelectronic.util.PropertiesManager;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;

//This project emulate process of creating microelements, and put them on the board
public class Main {

    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) throws IOException {

        Board board = MicroelectronicFactory.createDevices(5, Device.DevicesType.RESISTOR, Device.DevicesType.TRANSISTOR, Device.DevicesType.DIOD, Device.DevicesType.CHIP);
        board.setName("FirstBoard");
        LOGGER.info(board.toString(), board);

        Board boardCopy = board.createCopy();
        boardCopy.setName("SecondBoard");
        boardCopy.devices.get(1).setPrice(555);
        boardCopy.deleteElement(0);
        LOGGER.info(boardCopy.toString(), boardCopy);

        Collections.sort(board.devices, Device.PRICE_COMPARATOR);
        LOGGER.info(board.toString(), board);

        LOGGER.info("=======================TOTAL SUMM=======================================================");
        LOGGER.info(board.totalSummElements().toString());
    }
}
