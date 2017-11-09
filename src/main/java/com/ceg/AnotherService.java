package com.ceg;

import java.util.logging.Logger;

/**
 * Created by Sean on 11/9/2017.
 * The main header for the java class.
 */
public class AnotherService {


    private final static Logger LOGGER = Logger.getLogger(AnotherService.class.getName());

    public void MyFunction (final Parameter1 foo) {
        LOGGER.fine("AnotherService.MyFunction");

    }
}
