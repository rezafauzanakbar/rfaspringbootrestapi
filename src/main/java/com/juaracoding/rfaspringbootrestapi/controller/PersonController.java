package com.juaracoding.rfaspringbootrestapi.controller;
/*
IntelliJ IDEA 2023.2.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2023
@Author user a.k.a. Reza Fauzan Akbar
Java Developer
Created on 04/09/2023 9:21
@Last Modified 04/09/2023 9:21
Version 1.0
*/

import com.juaracoding.rfaspringbootrestapi.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/person")
public class PersonController {

    private PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }


    @GetMapping("/v1/getall")
    public ResponseEntity<Object> getAll()
    {
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("data",personService.findAll());
        map.put("message","OK");
        return new ResponseEntity<Object>(map, HttpStatus.OK);
    }
}
