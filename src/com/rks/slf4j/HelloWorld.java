package com.rks.slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloWorld {

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(HelloWorld.class);
        logger.info("Hello World");

        String a = "10";
        String b = "20";

        logger.info("Value of a is {} and b is {}.", a, b);
    }
}
