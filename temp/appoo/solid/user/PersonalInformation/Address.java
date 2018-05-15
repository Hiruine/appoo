package appoo.solid.user.PersonalInformation;

public final class Address
{
    private final String streetAddress;
    private final String city;
    private final String state;



    public Address(final String StreetAddress, final String City, final String State)
    {
        this.streetAddress = StreetAddress;
        this.city = City;
        this.state = State;
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