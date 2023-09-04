package com.juaracoding.rfaspringbootrestapi.model;
/*
IntelliJ IDEA 2023.2.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2023
@Author user a.k.a. Reza Fauzan Akbar
Java Developer
Created on 04/09/2023 10:03
@Last Modified 04/09/2023 10:03
Version 1.0
*/

//import com.juaracoding.rfaspringbootrestapi.util.ConstantMessage;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.*;

/*
    70002
 */
@Entity
@Table(name = "MstBarang")
public class Barang implements Serializable {
    private static final Long serializeVersion = 70002L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDBarang")
    private Long idBarang;
    @Column(name = "NamaBarang")
    private String namaBarang;
    @Column(name = "Deskripsi",columnDefinition = "CHAR(50) default 'DEFAULT AJA BELUM DI SET' ",nullable = false)
    private String deskripsi;
    @ManyToOne
    @JoinColumn(name = "IDKategoriBarang", foreignKey = @ForeignKey(name = "fkBarangToKategori"))
    private KategoriBarang kategoriBarang;

    @ManyToMany(mappedBy = "listBarang")
    private List<Supplier> listSupplier;

    @Column(name = "CreatedDate",columnDefinition = "DATETIME NOT NULL default GETDATE()")
    private Date createdDate;

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public List<Supplier> getListSupplier() {
        return listSupplier;
    }

    public void setListSupplier(List<Supplier> listSupplier) {
        this.listSupplier = listSupplier;
    }

    public Long getIdBarang() {
        return idBarang;
    }

    public void setIdBarang(Long idBarang) {
        this.idBarang = idBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public KategoriBarang getKategoriBarang() {
        return kategoriBarang;
    }

    public void setKategoriBarang(KategoriBarang kategoriBarang) {
        this.kategoriBarang = kategoriBarang;
    }
}

