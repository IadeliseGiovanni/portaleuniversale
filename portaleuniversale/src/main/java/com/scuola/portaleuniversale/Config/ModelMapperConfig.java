package com.scuola.portaleuniversale.Config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // <--- DEVE ESSERCI QUESTO
public class ModelMapperConfig {

    @Bean // <--- E QUESTO
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}