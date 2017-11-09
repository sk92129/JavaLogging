package com.ceg;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

/**
 * Created by Sean on 11/8/2017.
 * The main header for the java class.
 */
public class Main {

    private final static Logger LOGGER = Logger.getLogger(Main.class.getName());

    private void test() {
        try {
            InputStream is = getClass().getResourceAsStream( "/mylogging.properties" );

            LogManager.getLogManager().readConfiguration(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
        LOGGER.setLevel(Level.ALL);
        MyService service = new MyService();
        Parameter1 parm1 = new Parameter1(1, "Hello");
        service.MyFunction(parm1);

    }
    public static void main (String[] args){
        Main main = new Main();
        main.test();
    }
}
