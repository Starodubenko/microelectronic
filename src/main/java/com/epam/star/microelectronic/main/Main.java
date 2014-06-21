package com.epam.star.microelectronic.main;

import com.epam.star.microelectronic.entity.*;
import com.epam.star.microelectronic.factory.MicroelectronicFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Collections;

//This project emulate process of creating microelements, and put them on the board
public class Main {

    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) throws IOException {

        Board board = MicroelectronicFactory.createCompleteBoard(5, Device.Type.RESISTOR, Device.Type.TRANSISTOR, Device.Type.DIOD, Device.Type.CHIP);
        board.setName("FirstBoard");
        LOGGER.info("board was created: {}", board);

        Board boardCopy = board.createCopy();
        boardCopy.setName("SecondBoard");
        boardCopy.getDevices().get(1).setPrice(555);
        boardCopy.deleteElement(0);
        LOGGER.info("board was copied: {}", boardCopy);

        Collections.sort(board.getDevices(), Device.PRICE_COMPARATOR);
        LOGGER.info("sort of the board was performed: {}", board);

        LOGGER.info("tottal sum of the board was calculaded: {}",board.totalSummElements());
    }
}
