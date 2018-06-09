package com.endava.internship.jpa;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class PhoneNumberAttributeConverter implements AttributeConverter<PhoneNumber, String> {

    @Override
    public String convertToDatabaseColumn(PhoneNumber attribute) {
        return attribute == null ? null : attribute.toString();
    }

    @Override
    public PhoneNumber convertToEntityAttribute(String dbData) {
        return dbData == null ? null : PhoneNumber.of(dbData);
    }
}
