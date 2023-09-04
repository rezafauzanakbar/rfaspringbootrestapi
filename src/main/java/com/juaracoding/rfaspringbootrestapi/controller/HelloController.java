package com.juaracoding.rfaspringbootrestapi.controller;
/*
IntelliJ IDEA 2023.2 (Ultimate Edition)
Build #IU-232.8660.185, built on July 26, 2023
@Author user a.k.a. Reza Fauzan Akbar
Java Developer
Created on 30/08/2023 10:25
@Last Modified 30/08/2023 10:25
Version 1.0
*/

import com.juaracoding.rfaspringbootrestapi.model.calonPeserta;
import com.juaracoding.rfaspringbootrestapi.util.FileUtility;
import com.juaracoding.rfaspringbootrestapi.model.Tunggal;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import com.juaracoding.rfaspringbootrestapi.configuration.OtherConfiguration;

import javax.validation.Valid;
import java.io.IOException;
import java.util.*;

@RestController
@RequestMapping("api/hello")
public class HelloController {
    //localhost:8000/hello/permisi
//    @PostMapping("/permisi")
//    @DeleteMapping("/permisi")
//    @PutMapping("/permisi")
//    @PatchMapping("/permisi")
    @GetMapping("/permisi")
    public String firstPage() {
        //return "welcome";
        System.out.println("Value Flag Loging : "+OtherConfiguration.getFlagLoging());
        return OtherConfiguration.getFlagLoging();
    }

    @PostMapping("/permisi2")
    public String secondPage() {
        return "welcome";
    }

    @PostMapping("/seleksi")
    public Map<String, Object> seleksiCalonPeserta(@Valid @RequestBody calonPeserta calon) {
        System.out.println("Parkir Disini !!");
        calon.setNilai(100);
        calon.setUmur(79);

        Map<String, Object> mapz = new HashMap<>();
        mapz.put("message","OKK BOS!");
        mapz.put("waktu", new Date());
        mapz.put("data", calon);
        mapz.put("status", "single");
        if (calon.getNilai() > 80 && calon.getUmur() >= 18 && calon.getUmur() <= 60) {
            //return calon.getNama() + " lolos seleksi";
        } else {
            //return calon.getNama() + " tidak lolos seleksi";
        }
        return mapz;
    }

    @PostMapping("/seleksi2")
    public String seleksiCalonPeserta2
            (@RequestParam(value = "nama") String strNama,
             @RequestParam(value = "umur") Integer intUmur,
             @RequestParam(value = "nilai") Integer intNilai) {

        calonPeserta cp = new calonPeserta();
        cp.setUmur(intUmur);
        cp.setNilai(intNilai);
        cp.setNama(strNama);

        if (intNilai > 80 && intUmur >= 18 && intUmur <= 60) {
            return strNama + " lolos seleksi";
        } else {
            return strNama + " tidak lolos seleksi";
        }
    }

    @PostMapping("/seleksi3")
    public Tunggal seleksiCalonPesertaDua(
            @RequestBody Tunggal tunggal
    ) {

        System.out.println(tunggal.getId());
        System.out.println(tunggal.getIntZ());
        System.out.println(tunggal.getCalonPeserta().getNilai());
        System.out.println(tunggal.getCalonPeserta().getNama());
        System.out.println(tunggal.getCalonPeserta().getUmur());

        return tunggal;
    }

    @PostMapping("/seleksi3/{nama}/{umur}/{nilai}")
    public String seleksiCalonPeserta3(
            @PathVariable(value = "nama") String strNama,
            @PathVariable(value = "nilai") Double douNilai,
            @PathVariable(value = "umur") Integer intUmur
    ) {
        if (douNilai > 80 && intUmur >= 18 && intUmur <= 60) {
            return strNama + " lolos seleksi";
        } else {
            return strNama + " tidak lolos seleksi";
        }
    }

    @PostMapping("/kirim-file")
    public String submitFile(@RequestParam(value = "kiriman") MultipartFile file) throws IOException {
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());
        String uploadDir = "user-files/";
        try{
            FileUtility.saveFile(uploadDir, fileName, file);
        } catch (IOException e){
            throw new RuntimeException("Error "+ e.getMessage());
        }
        return "Berhasil mengunggah file " + fileName;
    }


}


