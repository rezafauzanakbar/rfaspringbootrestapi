package com.juaracoding.rfaspringbootrestapi.repo;
/*
IntelliJ IDEA 2023.2 (Ultimate Edition)
Build #IU-232.8660.185, built on July 26, 2023
@Author user a.k.a. Reza Fauzan Akbar
Java Developer
Created on 31/08/2023 8:41
@Last Modified 31/08/2023 8:41
Version 1.0
*/

import com.juaracoding.rfaspringbootrestapi.model.Peserta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PesertaRepo extends JpaRepository<Peserta, Integer> {
    public List<Peserta> findByNama(String n); // jika namanya sama dengan
    public List<Peserta> findByNamaContains(String n); // jika nama pengen seperti like
    public List<Peserta> findByNamaContainsAndBatch(String n, String b); // jika nama dan batch

    public List<Peserta> findByNamaStartsWith(String n); // diawali dengan huruf pertama '?%'

    public List<Peserta> findByNamaEndsWith(String n); // diawali dengan huruf pertama '%?'

    public List<Peserta> findByNamaContainsOrBatch(String n, String b); // jika nama atau batch

}
