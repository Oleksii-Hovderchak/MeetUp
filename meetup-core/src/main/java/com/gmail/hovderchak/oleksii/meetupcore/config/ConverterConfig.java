package com.gmail.hovderchak.oleksii.meetupcore.config;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;

import com.gmail.hovderchak.oleksii.meetupcore.converter.ExtendedConversionService;
import com.gmail.hovderchak.oleksii.meetupcore.converter.ExtendedConversionServiceImpl;

@Configuration
public class ConverterConfig {

    @Bean
    ExtendedConversionService extendedConversionService(List<Converter> converters) {
        ExtendedConversionServiceImpl bean = new ExtendedConversionServiceImpl();
        converters.forEach(bean::addConverter);
        return bean;
    }

}
