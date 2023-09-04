package com.juaracoding.rfaspringbootrestapi.service;
/*
IntelliJ IDEA 2023.2.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2023
@Author user a.k.a. Reza Fauzan Akbar
Java Developer
Created on 04/09/2023 9:21
@Last Modified 04/09/2023 9:21
Version 1.0
*/

import com.juaracoding.rfaspringbootrestapi.model.Person;
import com.juaracoding. rfaspringbootrestapi.repo.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PersonService {

    private PersonRepo personRepo;


    @Autowired
    public PersonService(PersonRepo personRepo) {
        this.personRepo = personRepo;
    }

    public List<Person> findAll(){

        return personRepo.findAll();
    }
}

