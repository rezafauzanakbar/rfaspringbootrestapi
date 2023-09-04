package com.juaracoding.rfaspringbootrestapi.configuration;
/*
IntelliJ IDEA 2023.2 (Ultimate Edition)
Build #IU-232.8660.185, built on July 26, 2023
@Author user a.k.a. Reza Fauzan Akbar
Java Developer
Created on 31/08/2023 14:49
@Last Modified 31/08/2023 14:49
Version 1.0
*/

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:other.properties")
public class OtherConfiguration {
    public static String getFlagLoging() {
        return flagLoging;
    }

    @Value("${flag.loging}")
    private void setFlagLoging(String flagLoging) {
        OtherConfiguration.flagLoging = flagLoging;
    }

    private static String flagLoging;

}

