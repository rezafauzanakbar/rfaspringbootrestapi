package com.juaracoding.rfaspringbootrestapi.service;
/*
IntelliJ IDEA 2023.2 (Ultimate Edition)
Build #IU-232.8660.185, built on July 26, 2023
@Author user a.k.a. Reza Fauzan Akbar
Java Developer
Created on 31/08/2023 9:34
@Last Modified 31/08/2023 9:34
Version 1.0
*/

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class AdaService {
    public String getStrString() {
        return strString;
    }

    public void setStrString(String strString) {
        this.strString = strString;
    }

    private String strString;
}

