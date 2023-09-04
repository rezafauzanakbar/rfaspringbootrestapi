package com.juaracoding.rfaspringbootrestapi.controller;
/*
IntelliJ IDEA 2023.2 (Ultimate Edition)
Build #IU-232.8660.185, built on July 26, 2023
@Author user a.k.a. Reza Fauzan Akbar
Java Developer
Created on 31/08/2023 9:37
@Last Modified 31/08/2023 9:37
Version 1.0
*/

import com.juaracoding.rfaspringbootrestapi.service.AdaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/service")
public class ContohController {
    @Autowired //fungsinya agar
    public ContohController(AdaService adaService) {
        this.adaService = adaService;
    }
    private AdaService adaService;

    @GetMapping("/service")
    public String takeService() {
        adaService.setStrString("OK");
        System.out.println(adaService.getStrString());
        return adaService.getStrString();
    }
}

