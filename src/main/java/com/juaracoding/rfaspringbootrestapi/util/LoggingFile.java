package com.juaracoding.rfaspringbootrestapi.util;
/*
IntelliJ IDEA 2023.2 (Ultimate Edition)
Build #IU-232.8660.185, built on July 26, 2023
@Author user a.k.a. Reza Fauzan Akbar
Java Developer
Created on 31/08/2023 15:12
@Last Modified 31/08/2023 15:12
Version 1.0
*/

import org.apache.log4j.Logger;

public class LoggingFile {

    private static StringBuilder sbuilds = new StringBuilder();
    private static Logger logger = Logger.getLogger(LoggingFile.class);
    public static void exceptionStringz(String[] datax,Exception e, String flag) {
        if(flag.equals("y"))
        {
            sbuilds.setLength(0);
            logger.info(sbuilds.append(System.getProperty("line.separator")).
                    append("ERROR IN CLASS =>").append(datax[0]).append(System.getProperty("line.separator")).
                    append("METHOD   =>").append(datax[1]).append(System.getProperty("line.separator")).
                    append("ERROR IS       =>").append(e.getMessage()).
                    append(System.getProperty("line.separator")).toString());
            sbuilds.setLength(0);
        }
    }
    public static void exceptionStringz(String[] datax,Exception e, String flag,String addNotes) {
        if(flag.equals("y"))
        {
            sbuilds.setLength(0);
            logger.info(sbuilds.append(System.getProperty("line.separator")).
                    append("ERROR IN CLASS =>").append(datax[0]).append(System.getProperty("line.separator")).
                    append("METHOD   =>").append(datax[1]).append(System.getProperty("line.separator")).
                    append("ERROR IS       =>").append(e.getMessage()).
                    append("Notes Tambahan       =>").append(addNotes).
                    append(System.getProperty("line.separator")).toString());
            sbuilds.setLength(0);
        }
    }
}

