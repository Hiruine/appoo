package appoo.customer;

<<<<<<< HEAD
=======
import appoo.solid.user.PersonalInformation.Address;
import appoo.solid.user.PersonalInformation.FullName;
>>>>>>> 7fff08ff07f6386ae88c5544807f8f2eaa5e6b08

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
