package appoo.customer;

public class FullName
{
    private String lastName;
    private  String firstName;


    public FullName(String lastName,
            String firstName)
    {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return this.lastName;
    }

    public String getFirstName()
    {
        return this.firstName;
    }

    public String toString() {
        return firstName + " " + lastName;
    }

}