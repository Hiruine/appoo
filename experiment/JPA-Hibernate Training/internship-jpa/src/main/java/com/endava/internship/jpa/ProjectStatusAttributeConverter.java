package com.endava.internship.jpa;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class ProjectStatusAttributeConverter implements AttributeConverter<Status, Integer> {

    @Override
    public Integer convertToDatabaseColumn(Status attribute) {
        return attribute == null ? null : attribute.toDbIndex();
    }

    @Override
    public Status convertToEntityAttribute(Integer dbData) {
        return dbData == null ? null : Status.valueOf(dbData).orElse(null);
    }
}
