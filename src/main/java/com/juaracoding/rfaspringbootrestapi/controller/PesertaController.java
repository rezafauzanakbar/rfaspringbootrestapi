package com.juaracoding.rfaspringbootrestapi.controller;
/*
IntelliJ IDEA 2023.2 (Ultimate Edition)
Build #IU-232.8660.185, built on July 26, 2023
@Author user a.k.a. Reza Fauzan Akbar
Java Developer
Created on 31/08/2023 8:43
@Last Modified 31/08/2023 8:43
Version 1.0
*/

import com.juaracoding.rfaspringbootrestapi.model.Peserta;
import com.juaracoding.rfaspringbootrestapi.repo.PesertaRepo;
import com.juaracoding.rfaspringbootrestapi.service.PesertaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.*;

@RestController
@RequestMapping("/api/peserta/")
public class PesertaController {

    @Autowired
    PesertaRepo pesertaRepo;

    @Autowired
    PesertaService pesertaService;

    @GetMapping("/")
//    public List<Peserta> getAllData() {
    public ResponseEntity<Object> getAllData() {
        Map<String,Object> m = new HashMap<String,Object>();
        List<Peserta> daftarPeserta = pesertaRepo.findAll();
        m.put("data",daftarPeserta);
        m.put("waktu",new Date());
        m.put("message","Data ada !!");
        return new ResponseEntity<Object>(m,HttpStatus.ACCEPTED);
    }

    @PostMapping("/")
    public String postData(@RequestBody Peserta peserta) {
        //pesertaRepo.save(peserta);
        pesertaService.save(peserta);
        return peserta.getNama() + " berhasil ditambahkan";

    }

    @GetMapping("/search-peserta-by-id")
    public Map<String, Object> searchPesertaById(@RequestParam(value = "id") Integer id) {
        Optional<Peserta> hasil = pesertaRepo.findById(id); // optional jika datanya cuman ada satu
        Map<String, Object> m = new HashMap<>();
        if(hasil.isEmpty()){
            m.put("message", "data tidak ditemukan");
            return m;
        }
        m.put("data",hasil.get());
        m.put("message", "data ditemukan");
        return m;
    }

    @GetMapping("/search-peserta-by-nama")
    public Map<String, Object> searchPesertaByName(@RequestParam(value = "nama") String nama) {
        //List<Peserta> hasil = pesertaRepo.findByNama(nama);
        List<Peserta> hasil = pesertaRepo.findByNamaContains(nama); // list jika namanya lebih dari satu
        Map<String, Object> m = new HashMap<>();
        if(hasil.isEmpty()){
            m.put("message", "data tidak ditemukan");
            return m;
        }
        m.put("data",hasil);
        m.put("message", "data ditemukan");
        return m;
    }

    @GetMapping("/search-peserta-by-nama-and-batch")
    public Map<String, Object> searchPesertaByNameAndBatch(@RequestParam(value = "nama") String nama,
                                                           @RequestParam(value = "batch") String batch) {
        //List<Peserta> hasil = pesertaRepo.findByNama(nama);
        List<Peserta> hasil = pesertaRepo.findByNamaContainsAndBatch(nama,batch);
        Map<String, Object> m = new HashMap<>();
        if(hasil.isEmpty()){
            m.put("message", "data tidak ditemukan");
            return m;
        }
        m.put("data",hasil);
        m.put("message", "data ditemukan");
        return m;
    }

    @GetMapping("/search-peserta-by-nama-starts-with")
    public Map<String, Object> searchPesertaByNameStartWith(@RequestParam(value = "nama") String nama) {
        List<Peserta> hasil = pesertaRepo.findByNamaStartsWith(nama);
        Map<String, Object> m = new HashMap<>();
        if(hasil.isEmpty()){
            m.put("message", "data tidak ditemukan");
            return m;
        }
        m.put("data",hasil);
        m.put("message", "data ditemukan");
        return m;
    }

    @GetMapping("/search-peserta-by-nama-ends-with")
    public Map<String, Object> searchPesertaByNameEndsWith(@RequestParam(value = "nama") String nama) {
        List<Peserta> hasil = pesertaRepo.findByNamaEndsWith(nama);
        Map<String, Object> m = new HashMap<>();
        if(hasil.isEmpty()){
            m.put("message", "data tidak ditemukan");
            return m;
        }
        m.put("data",hasil);
        m.put("message", "data ditemukan");
        return m;
    }

    @GetMapping("/search-peserta-by-nama-or-batch")
    public Map<String, Object> searchPesertaByNameOrBatch(@RequestParam(value = "nama") String nama,
                                                          @RequestParam(value = "batch") String batch) {
        List<Peserta> hasil = pesertaRepo.findByNamaContainsOrBatch(nama,batch);
        Map<String, Object> m = new HashMap<>();
        if(hasil.isEmpty()){
            m.put("message", "data tidak ditemukan");
            return m;
        }
        m.put("data",hasil);
        m.put("message", "data ditemukan");
        return m;
    }
}

