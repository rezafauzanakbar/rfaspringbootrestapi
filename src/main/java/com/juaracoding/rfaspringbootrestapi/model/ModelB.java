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
@Table(name = "ModelB")
public class ModelB {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDModelB", nullable = false)
    private Long idModelB;

    @Column(name = "CreatedBy", columnDefinition = "BIGINT default 1", nullable = false)
    private Long createdBy;

    @Column(name = "CreatedDate",columnDefinition = "DATETIME default GETDATE()", nullable = false)
    private Date createdDate;

    @Column(name = "IsActive", columnDefinition = "SMALLINT")
    private Integer isActive;

    @Column(name = "ModelB", columnDefinition = "CHAR(30) default 'Default model B'", nullable = false)
    private String modelB;

    @Column(name = "ModifiedBy", columnDefinition = "DATETIME")
    private Long modifiedBy;

    @Column(name = "ModifiedDate")
    private Date modifiedDate;

    @ManyToOne
    @JoinColumn(name = "IDModelA", foreignKey = @ForeignKey(name = "fkModelBToModelA", foreignKeyDefinition = "FOREIGN KEY ([IDModelA]) REFERENCES [ModelA] ([IDModelA]) ON DELETE SET NULL ON UPDATE SET NULL"))
    private ModelA ModelA;

    @ManyToMany(mappedBy = "listModelB")
    private List<ModelC> listModelC;

    public Long getIdModelB() {
        return idModelB;
    }

    public void setIdModelB(Long idModelB) {
        this.idModelB = idModelB;
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

    public String getModelB() {
        return modelB;
    }

    public void setModelB(String modelB) {
        this.modelB = modelB;
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

    public com.juaracoding.rfaspringbootrestapi.model.ModelA getModelA() {
        return ModelA;
    }

    public void setModelA(com.juaracoding.rfaspringbootrestapi.model.ModelA modelA) {
        ModelA = modelA;
    }

    public List<ModelC> getListModelC() {
        return listModelC;
    }

    public void setListModelC(List<ModelC> listModelC) {
        this.listModelC = listModelC;
    }
}
