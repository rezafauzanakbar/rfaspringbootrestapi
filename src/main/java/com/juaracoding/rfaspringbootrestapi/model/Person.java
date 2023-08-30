package com.juaracoding.rfaspringbootrestapi.model;
/*
IntelliJ IDEA 2023.2 (Ultimate Edition)
Build #IU-232.8660.185, built on July 26, 2023
@Author user a.k.a. Reza Fauzan Akbar
Java Developer
Created on 30/08/2023 10:59
@Last Modified 30/08/2023 10:59
Version 1.0
*/

import java.util.ArrayList;

public class Person {
    private Integer id;
    private String nama;
    private String jenisKelamin;
    private String umur;

    private ArrayList<Address> listAddress; // satu alamat punya banyak address

    /*
    * sehingga nanti JSON nya berbentuk :
    * {
    *   "id" : ,
    *   "nama" : ,
    *   "jenisKelamin" : ,
    *   "umur" : ,
    *   "listAddress" : [
    *   {
    *       "idAddress" : "",
    *       "namaJalan" : "",
    *       "provinsi" : "".
    *   },
    *   {
    *   }
    * ]
    * }
    * */
}

