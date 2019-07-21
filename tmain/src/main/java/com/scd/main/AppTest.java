package com.scd.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author chengdu
 * @date 2019/7/20.
 */
public class AppTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(AppTest.class);

    public static void main(String[] args){
        System.out.println("hello world");
        LOGGER.info("Test logger");
    }
}
