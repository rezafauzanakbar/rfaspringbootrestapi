package com.juaracoding.rfaspringbootrestapi.configuration;
/*
IntelliJ IDEA 2023.2 (Ultimate Edition)
Build #IU-232.8660.185, built on July 26, 2023
@Author user a.k.a. Reza Fauzan Akbar
Java Developer
Created on 31/08/2023 13:29
@Last Modified 31/08/2023 13:29
Version 1.0
*/
import com.juaracoding.rfaspringbootrestapi.core.Crypto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;

@Configuration
public class MainConfiguration {
    @Autowired
    private Environment environment;


    @Primary
    @Bean
    public DataSource getDataSource() {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName(environment.getProperty("spring.datasource.driverClassName"));
        dataSourceBuilder.url(environment.getProperty("spring.datasource.url"));
        dataSourceBuilder.username(environment.getProperty("spring.datasource.username"));//environment.getProperty("spring.datasource.user")
        dataSourceBuilder.password(Crypto.performDecrypt(environment.getProperty("spring.datasource.password")));//environment.getProperty("spring.datasource.password")
        return dataSourceBuilder.build();
    }

}