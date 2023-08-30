package com.juaracoding.rfaspringbootrestapi.model;
/*
IntelliJ IDEA 2023.2 (Ultimate Edition)
Build #IU-232.8660.185, built on July 26, 2023
@Author user a.k.a. Reza Fauzan Akbar
Java Developer
Created on 30/08/2023 11:00
@Last Modified 30/08/2023 11:00
Version 1.0
*/

import javax.persistence.*;

@Entity
@Table(name = "MstAddress")
public class Address {
    public Long getIdAdress() {
        return idAdress;
    }

    public void setIdAdress(Long idAdress) {
        this.idAdress = idAdress;
    }

    public String getNamaJalan() {
        return namaJalan;
    }

    public void setNamaJalan(String namaJalan) {
        this.namaJalan = namaJalan;
    }

    public String getProvinsi() {
        return provinsi;
    }

    public void setProvinsi(String provinsi) {
        this.provinsi = provinsi;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDAddress")
    private Long idAdress;

    @Column(name = "NamaJalan", length = 500, nullable = false)
    private String namaJalan;

    @Column(name = "Provindi", length = 40, nullable = false)
    private String provinsi;
}

