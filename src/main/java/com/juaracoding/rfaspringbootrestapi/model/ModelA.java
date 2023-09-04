package com.juaracoding.rfaspringbootrestapi.model;
/*
IntelliJ IDEA 2023.2.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2023
@Author user a.k.a. Reza Fauzan Akbar
Java Developer
Created on 04/09/2023 13:44
@Last Modified 04/09/2023 13:44
Version 1.0
*/

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "ModelA")
public class ModelA {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDModelA", nullable = false)
    private Long idModelA;

    @Column(name = "CreatedBy", columnDefinition = "BIGINT default 1", nullable = false)
    private Long createdBy;

    @Column(name = "CreatedDate",columnDefinition = "DATETIME default GETDATE()", nullable = false)
    private Date createdDate;

    @Column(name = "IsActive", columnDefinition = "SMALLINT")
    private Integer isActive;

    @Column(name = "ModelA", columnDefinition = "CHAR(20) default 'Default model A'", nullable = false)
    private String modelA;

    @Column(name = "ModifiedBy")
    private Long modifiedBy;

    @Column(name = "ModifiedDate", columnDefinition = "DATETIME")
    private Date modifiedDate;

    @OneToMany(mappedBy = "ModelA")
    private List<ModelB> listModelB;

    public Long getIdModelA() {
        return idModelA;
    }

    public void setIdModelA(Long idModelA) {
        this.idModelA = idModelA;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Integer getIsActive() {
        return isActive;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }

    public String getModelA() {
        return modelA;
    }

    public void setModelA(String modelA) {
        this.modelA = modelA;
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

    public List<ModelB> getListModelB() {
        return listModelB;
    }

    public void setListModelB(List<ModelB> listModelB) {
        this.listModelB = listModelB;
    }
}
