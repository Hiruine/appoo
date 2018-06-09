package com.endava.internship.jpa;

import javax.persistence.Embeddable;
import java.math.BigDecimal;
import java.util.Objects;

@Embeddable
public final class Money {

    private BigDecimal amount;

    private String currencyCode = "USD";

    private Money() { // for JPA
    }

    private Money(BigDecimal amount, String currencyCode) {
        // guards // assertions
        this.amount = amount;
        this.currencyCode = currencyCode;
    }

    public static  Money dollars(BigDecimal amount) {
        return new Money(amount, "USD");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Money money = (Money) o;
        return Objects.equals(amount, money.amount) &&
                Objects.equals(currencyCode, money.currencyCode);
    }

    @Override
    public int hashCode() {

        return Objects.hash(amount, currencyCode);
    }

    @Override
    public String toString() {
        return "Money{" +
                "amount=" + amount +
                ", currencyCode='" + currencyCode + '\'' +
                '}';
    }

    public BigDecimal toBigDecimal() {
        return amount;
    }
}
