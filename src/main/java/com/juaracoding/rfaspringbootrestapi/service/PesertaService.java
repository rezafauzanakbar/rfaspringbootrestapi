package com.juaracoding.rfaspringbootrestapi.service;
/*
IntelliJ IDEA 2023.2 (Ultimate Edition)
Build #IU-232.8660.185, built on July 26, 2023
@Author user a.k.a. Reza Fauzan Akbar
Java Developer
Created on 31/08/2023 9:52
@Last Modified 31/08/2023 9:52
Version 1.0
*/

import com.juaracoding.rfaspringbootrestapi.configuration.OtherConfiguration;
import com.juaracoding.rfaspringbootrestapi.model.Peserta;
import com.juaracoding.rfaspringbootrestapi.repo.PesertaRepo;
import com.juaracoding.rfaspringbootrestapi.util.LoggingFile;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class PesertaService {
    private PesertaRepo pesertaRepo;
    private String [] strExceptionArr = new String[2];

    public PesertaService(PesertaRepo pesertaRepo){
        strExceptionArr[0] = "PesertaService";
        this.pesertaRepo = pesertaRepo;
    }

    public void save(Peserta peserta){
        try{
            pesertaRepo.save(peserta);
            int intX =1/0;
        }catch (Exception e)
        {
            strExceptionArr[1] = "save(Peserta peserta) --- LINE 30";
            LoggingFile.exceptionStringz(strExceptionArr, e, OtherConfiguration.getFlagLoging());
        }
        /*
            INSERT INTO PESERTA (id,nama,alamat,batch) VALUES (peserta.getID,peserta.getNama,peserta.getAlamat,peserta.getBatch);
         */
    }

    public void findAll(){
        pesertaRepo.findAll();
        /*
            INSERT INTO PESERTA (id,nama,alamat,batch) VALUES (peserta.getID,peserta.getNama,peserta.getAlamat,peserta.getBatch);
         */
    }
}

