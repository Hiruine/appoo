package appoo.customer;

import java.util.UUID;

public class Customer {
    private String customerId;
    private FullName fullName;
    private String email;
    private CreditCard creditCard;
    private Address address;

    public Customer(FullName fullName, String email,
             CreditCard creditCard, Address address) {
        this.customerId = UUID.randomUUID().toString();
        this.fullName = fullName;
        this.email = email;
        this.creditCard = creditCard;
        this.address = address;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getFullName() {
        return fullName.toString();
    }
}
