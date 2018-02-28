package com.appoo.customer;

public final class Address
{
    private final String streetAddress;
    private final String city;
    private final String state;

    public Address(final String newStreetAddress, final String newCity, final String newState)
    {
        this.streetAddress = newStreetAddress;
        this.city = newCity;
        this.state = newState;
    }

    public String getStreetAddress()
    {
        return this.streetAddress;
    }

    public String getCity()
    {
        return this.city;
    }

    public String getState()
    {
        return this.state;
    }

    @Override
    public String toString()
    {
        return this.streetAddress + ", " + this.city + ", " + this.state;
    }
}