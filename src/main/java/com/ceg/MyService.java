package com.ceg;

import java.util.logging.Logger;

/**
 * Created by Sean on 11/8/2017.
 * The main header for the java class.
 */
public class MyService {

    private Parameter1 param1;
    AnotherService another = new AnotherService();
    private final static Logger LOGGER = Logger.getLogger(MyService.class.getName());


    public void MyFunction (final Parameter1 foo) {
        this.param1 = foo;
        LOGGER.fine("MyService.MyFunction");
        another.MyFunction(foo);
    }
}
