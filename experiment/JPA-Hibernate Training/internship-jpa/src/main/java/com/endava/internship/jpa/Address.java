package com.endava.internship.jpa;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.util.Objects;

@Embeddable
public final class Address {

    @Column(name = "COUNTRY")
    private String country;

    @Column(name = "CITY")
    private String city;

    @Column(name = "STREET")
    private String street;

    private PhoneNumber phoneNumber;

    private Address() { // for JPA
    }

    public Address(String country, String city, String street, PhoneNumber phoneNumber) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(country, address.country) &&
                Objects.equals(city, address.city) &&
                Objects.equals(street, address.street) &&
                Objects.equals(phoneNumber, address.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, city, street, phoneNumber);
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
