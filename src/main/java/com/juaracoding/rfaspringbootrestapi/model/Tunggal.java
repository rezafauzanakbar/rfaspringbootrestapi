package com.juaracoding.rfaspringbootrestapi.model;
/*
IntelliJ IDEA 2023.2 (Ultimate Edition)
Build #IU-232.8660.185, built on July 26, 2023
@Author user a.k.a. Reza Fauzan Akbar
Java Developer
Created on 30/08/2023 13:59
@Last Modified 30/08/2023 13:59
Version 1.0
*/

public class Tunggal {

    private calonPeserta calonPeserta;

    private Long id;
    private Integer intZ;

    public calonPeserta getCalonPeserta() {
        return calonPeserta;
    }

    public void setCalonPeserta(calonPeserta calonPeserta) {
        this.calonPeserta = calonPeserta;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getIntZ() {
        return intZ;
    }

    public void setIntZ(Integer intZ) {
        this.intZ = intZ;
    }
}

