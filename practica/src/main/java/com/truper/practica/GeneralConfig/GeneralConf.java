package com.truper.practica.GeneralConfig;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GeneralConf {


    @Bean
    public ModelMapper getModelMapper(){
        return new ModelMapper();

    }
}
