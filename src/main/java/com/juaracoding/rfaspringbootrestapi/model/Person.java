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

//import javax.persistence.ManyToOne;
//import java.util.ArrayList;

//public class Person {
//    private Integer id;
//    private String nama;
//    private String jenisKelamin;
//    private String umur;
//
//    public ArrayList<Address> getListAddress() {
//        return listAddress;
//    }
//
//    private Peserta peserta;
//
//    public Peserta getPeserta() {
//        return peserta;
//    }
//
//    public void setPeserta(Peserta peserta) {
//        this.peserta = peserta;
//    }
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getNama() {
//        return nama;
//    }
//
//    public void setNama(String nama) {
//        this.nama = nama;
//    }
//
//    public String getJenisKelamin() {
//        return jenisKelamin;
//    }
//
//    public void setJenisKelamin(String jenisKelamin) {
//        this.jenisKelamin = jenisKelamin;
//    }
//
//    public String getUmur() {
//        return umur;
//    }
//
//    public void setUmur(String umur) {
//        this.umur = umur;
//    }
//
//    public void setListAddress(ArrayList<Address> listAddress) {
//        this.listAddress = listAddress;
//    }
//
//    private ArrayList<Address> listAddress; // satu alamat punya banyak address
//
//    /*
//    * sehingga nanti JSON nya berbentuk :
//    * {
//    *   "id" : ,
//    *   "nama" : ,
//    *   "jenisKelamin" : ,
//    *   "umur" : ,
//    *   "listAddress" : [
//    *   {
//    *       "idAddress" : "",
//    *       "namaJalan" : "",
//    *       "provinsi" : "".
//    *   },
//    *   {
//    *   }
//    * ]
//    * }
//    * */
//}

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;

@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDPerson")
    private Integer id;
    @Column(name = "Nama")
    private String nama;

    @Column(name = "JenisKelamin")
    private String jenisKelamin;

    @Column(name = "TanggalLahir")
    private LocalDate tanggalLahir;

    @Transient
    private Integer umur;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public LocalDate getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(LocalDate tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public Integer getUmur() {
        return Period.between(tanggalLahir,LocalDate.now()).getYears();
    }

    public void setUmur(Integer umur) {
        this.umur = umur;
    }
}

