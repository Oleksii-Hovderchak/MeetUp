package com.gmail.hovderchak.oleksii.meetupcore.converter;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.springframework.core.convert.support.DefaultConversionService;

public class ExtendedConversionServiceImpl extends DefaultConversionService implements ExtendedConversionService {

    @Override
    public <F, T> List<T> convertAll(Collection<F> source, Class<T> targetClass) {
        return source == null ? Collections.emptyList()
                : source.stream()
                .filter(Objects::nonNull)
                .map(item -> convert(item, targetClass))
                .collect(Collectors.toList());
    }

}
