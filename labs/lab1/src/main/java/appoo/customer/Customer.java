package appoo.customer;

import com.solid.user.PersonalInformation.Address;
import com.solid.user.PersonalInformation.FullName;

import java.util.UUID;

public class Customer {

    private String customerId;
    private FullName fullName;
    private CreditCard creditCard;
    private Address address;



    public Customer(FullName fullName, CreditCard creditCard,
                    Address address) {

        this.customerId = UUID.randomUUID().toString();
        this.fullName = fullName;
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
