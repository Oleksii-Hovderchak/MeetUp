package com.gmail.hovderchak.oleksii.meetupcore.converter;

import java.util.Collection;
import java.util.List;

import org.springframework.core.convert.ConversionService;

public interface ExtendedConversionService extends ConversionService {

    /**
     * Converts all in collection
     *
     * @param source      source collection
     * @param targetClass targetClass
     * @param <F>         the type of the class From what should be converted.
     * @param <T>         the type of the class To what should be converted.
     * @return List of converted items
     */
    <F, T> List<T> convertAll(Collection<F> source, Class<T> targetClass);

}
