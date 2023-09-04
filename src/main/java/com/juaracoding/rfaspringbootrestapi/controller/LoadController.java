package com.juaracoding.rfaspringbootrestapi.controller;
/*
IntelliJ IDEA 2023.2 (Ultimate Edition)
Build #IU-232.8660.185, built on July 26, 2023
@Author user a.k.a. Reza Fauzan Akbar
Java Developer
Created on 01/09/2023 13:49
@Last Modified 01/09/2023 13:49
Version 1.0
*/

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/loadtest")
public class LoadController {
    private int countJmeter = 0;

    @GetMapping("/hit")
    public void justHit(){
        System.out.println("Counter Jmeter ini yang ke "+(countJmeter++));
    }
}


