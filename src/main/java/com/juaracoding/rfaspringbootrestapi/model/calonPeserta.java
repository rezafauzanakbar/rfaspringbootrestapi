package com.juaracoding.rfaspringbootrestapi.model;
/*
IntelliJ IDEA 2023.2 (Ultimate Edition)
Build #IU-232.8660.185, built on July 26, 2023
@Author user a.k.a. Reza Fauzan Akbar
Java Developer
Created on 30/08/2023 11:40
@Last Modified 30/08/2023 11:40
Version 1.0
*/

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import com.juaracoding.rfaspringbootrestapi.util.constantCalonPeserta;

public class calonPeserta {
    @NotNull(message = constantCalonPeserta.NAMA_NOT_NULL)
    @NotEmpty(message = constantCalonPeserta.NAMA_NOT_EMPTY)
    @Length(min = 5, max = 15,message = constantCalonPeserta.NAMA_MIN_MAX)
    //@Email(message = "Format email tidak valid")
    @NotBlank(message = constantCalonPeserta.NAMA_NOT_BLANK)
    private String nama;
    @NotNull(message = constantCalonPeserta.UMUR_IS_MANDATORY)
    private Integer umur;
    @NotNull(message = constantCalonPeserta.NILAI_IS_MANDATORY)
    private Integer nilai;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Integer getUmur() {
        return umur;
    }

    public void setUmur(Integer umur) {
        this.umur = umur;
    }

    public Integer getNilai() {
        return nilai;
    }

    public void setNilai(Integer nilai) {
        this.nilai = nilai;
    }
}