package com.endava.internship.jpa;

import java.math.BigDecimal;
import java.time.LocalDate;

public class MonthlyCosts {

    public final LocalDate month;

    public final BigDecimal amount;

    public MonthlyCosts(LocalDate month, BigDecimal amount) {
        this.month = month;
        this.amount = amount;
    }
}
