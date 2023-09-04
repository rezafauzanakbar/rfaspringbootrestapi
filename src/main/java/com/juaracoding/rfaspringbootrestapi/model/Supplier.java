package com.juaracoding.rfaspringbootrestapi.model;
/*
IntelliJ IDEA 2023.2.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2023
@Author user a.k.a. Reza Fauzan Akbar
Java Developer
Created on 04/09/2023 10:05
@Last Modified 04/09/2023 10:05
Version 1.0
*/

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "Supplier")
public class Supplier implements Serializable {

    private static final Long serializeVersion = 70003L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDSupplier")
    private Long idSupplier;

    @Column(name = "NamaSupplier")
    private String namaSupplier;

    @Column(name = "AlamatSupplier")
    private String alamatSupplier;

    @ManyToMany
    @JoinTable(name = "MapBarangSupplier",
            joinColumns = {@JoinColumn(name = "IDSupplier",referencedColumnName = "IDSupplier",foreignKey =@ForeignKey(name = "fkMapToSupplier"))},
            inverseJoinColumns = {@JoinColumn(name = "IDBarang",referencedColumnName = "IDBarang",foreignKey = @ForeignKey(name = "fkMapToBarang"))},
            uniqueConstraints = @UniqueConstraint(columnNames = {"IDSupplier","IDBarang"})
    )
    private List<Barang> listBarang;


    public Long getIdSupplier() {
        return idSupplier;
    }

    public void setIdSupplier(Long idSupplier) {
        this.idSupplier = idSupplier;
    }

    public String getNamaSupplier() {
        return namaSupplier;
    }

    public void setNamaSupplier(String namaSupplier) {
        this.namaSupplier = namaSupplier;
    }

    public String getAlamatSupplier() {
        return alamatSupplier;
    }

    public void setAlamatSupplier(String alamatSupplier) {
        this.alamatSupplier = alamatSupplier;
    }

    public List<Barang> getListBarang() {
        return listBarang;
    }

    public void setListBarang(List<Barang> listBarang) {
        this.listBarang = listBarang;
    }
}
