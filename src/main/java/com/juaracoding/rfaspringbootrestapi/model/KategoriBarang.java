package com.juaracoding.rfaspringbootrestapi.model;
/*
IntelliJ IDEA 2023.2.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2023
@Author user a.k.a. Reza Fauzan Akbar
Java Developer
Created on 04/09/2023 10:04
@Last Modified 04/09/2023 10:04
Version 1.0
*/

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "MstKategoriBarang")
public class KategoriBarang implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDKategoriBarang")
    private Long idKategoriBarang;
    @Column(name = "NamaKategoriBarang")
    private String namaKategoriBarang;
    @OneToMany(mappedBy = "kategoriBarang")
    private List<Barang> listBarang;

    public Long getIdKategoriBarang() {
        return idKategoriBarang;
    }

    public void setIdKategoriBarang(Long idKategoriBarang) {
        this.idKategoriBarang = idKategoriBarang;
    }

    public String getNamaKategoriBarang() {
        return namaKategoriBarang;
    }

    public void setNamaKategoriBarang(String namaKategoriBarang) {
        this.namaKategoriBarang = namaKategoriBarang;
    }

    public List<Barang> getListBarang() {
        return listBarang;
    }

    public void setListBarang(List<Barang> listBarang) {
        this.listBarang = listBarang;
    }
}
