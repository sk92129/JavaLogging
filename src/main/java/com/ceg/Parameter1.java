package com.ceg;

import java.util.logging.Logger;

/**
 * Created by Sean on 11/8/2017.
 * The main header for the java class.
 */
public class Parameter1 {

    private int value;
    private String name;

    //private final static Logger LOGGER = new
    private final static Logger LOGGER = Logger.getLogger(Parameter1.class.getName());

    public Parameter1(){
        LOGGER.fine("constructed by default");
    }

    public Parameter1(int val, String na) {
        this.value = val;
        this.name = na;
        LOGGER.fine("constructed by custom constructor");

    }
}
