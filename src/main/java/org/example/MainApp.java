package org.example;

import javax.swing.*;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainApp {
static Logger logger=Logger.getLogger("MainApp");
    public static void main(String... args){

        logger.info("message sent"+ new Date());
    }

}

