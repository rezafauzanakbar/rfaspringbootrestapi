package com.juaracoding.rfaspringbootrestapi.repo;
/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author user a.k.a. Reza Fauzan Akbar
Java Developer
Created on 04/09/2023 9:22
@Last Modified 04/09/2023 9:22
Version 1.0
*/

import com.juaracoding.rfaspringbootrestapi.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepo extends JpaRepository<Person,Integer> {

}
