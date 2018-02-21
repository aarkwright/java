package com.monolithic.logging;


import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    static Logger pkgLogger = Logger.getLogger("com.monolithic.logging");
    static Logger logger = Logger.getLogger("com.monolithic.logging.Main");

    public static void main(String[] args) {
        logger.entering("com.monolithic.logging", "Main");
        logger.log(Level.INFO, "We're logging");
        logger.exiting("com.monolithic.logging", "Main");
    }
}


