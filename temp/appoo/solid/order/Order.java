package appoo.solid.order;

import appoo.solid.user.PersonalInformation.Address;
import appoo.solid.user.PersonalInformation.FullName;


import java.util.UUID;


public class Order {

    private UUID orderId;
    private Address billingAddress;
    private Address shippingAddress;
    private UUID customerUsername;
    private FullName customerFullName;
    private OrderState status;
    private PaymentMethod paymentType;

}
