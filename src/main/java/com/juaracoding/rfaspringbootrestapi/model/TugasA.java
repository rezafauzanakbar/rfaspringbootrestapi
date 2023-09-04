package com.juaracoding.rfaspringbootrestapi.model;
/*
IntelliJ IDEA 2023.2.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2023
@Author user a.k.a. Reza Fauzan Akbar
Java Developer
Created on 04/09/2023 13:19
@Last Modified 04/09/2023 13:19
Version 1.0
*/

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ModelX")
public class TugasA {
    @Id
    @Column(name = "IDModelX", columnDefinition = "VARCHAR(30)", nullable = false)
    private String idModelx;

    @Column(name = "Alamat",columnDefinition = "NVARCHAR(255) default 'BELUM DIISI'", nullable = false)
    private String alamat;

    @Column(name = "CreatedBy",columnDefinition = "BIGINT default 0", nullable = false)
    private Long createdBy;

    @Column(name = "CreatedDate",columnDefinition = "DATETIME default GETDATE()", nullable = false)
    private Date CreatedDate;

    @Column(name = "IsActive", columnDefinition = "SMALLINT")
    private Integer isActive;

    @Column(name = "JenisKelamin",columnDefinition = "CHAR(1) default 'P'")
    private String jenisKelamin;

    @Column(name = "MasihHidup", columnDefinition = "BIT")
    private Byte masihHidup;

    @Column(name = "ModifiedBy")
    private Long modifiedBy;

    @Column(name = "ModifiedDate", columnDefinition = "DATETIME")
    private Date modifiedDate;

    @Column(name = "Nama",columnDefinition = "CHAR(40) default 'SEDANG DIMINTA'", nullable = false)
    private String nama;

    @Column(name = "TanggalLahir", columnDefinition = "DATE")
    private Date tanggalLahir;

    public String getIdModelx() {
        return idModelx;
    }

    public void setIdModelx(String idModelx) {
        this.idModelx = idModelx;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedDate() {
        return CreatedDate;
    }

    public void setCreatedDate(Date createdDate) {
        CreatedDate = createdDate;
    }

    public Integer getIsActive() {
        return isActive;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public Byte getMasihHidup() {
        return masihHidup;
    }

    public void setMasihHidup(Byte masihHidup) {
        this.masihHidup = masihHidup;
    }

    public Long getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(Long modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Date getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(Date tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }
}
