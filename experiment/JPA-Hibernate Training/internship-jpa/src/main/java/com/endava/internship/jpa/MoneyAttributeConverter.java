package com.endava.internship.jpa;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.math.BigDecimal;

@Converter(autoApply = true)
public class MoneyAttributeConverter implements AttributeConverter<Money, BigDecimal> {

    @Override
    public BigDecimal convertToDatabaseColumn(Money attribute) {
        return attribute == null ? null : attribute.toBigDecimal();
    }

    @Override
    public Money convertToEntityAttribute(BigDecimal dbData) {
        return dbData == null ? null : Money.dollars(dbData);
    }
}
