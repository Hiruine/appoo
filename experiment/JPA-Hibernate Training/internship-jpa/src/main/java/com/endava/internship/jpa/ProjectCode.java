package com.endava.internship.jpa;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public final class ProjectCode implements Serializable {

    private static final long serialVersionUID = -7141138404788372147L;

    private String value;

    private ProjectCode() { // for JPA
    }

    private ProjectCode(String value) {
        Objects.requireNonNull(value, "The project code must not be null.");
        if (value.length() > 8) {
            throw new IllegalArgumentException("The code's length must be less then 8 chars");
        }
        this.value = value;
    }

    public static ProjectCode of(String value) {
        return new ProjectCode(value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProjectCode that = (ProjectCode) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {

        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return value;
    }
}
