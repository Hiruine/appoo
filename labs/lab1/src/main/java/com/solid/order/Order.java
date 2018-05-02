package com.solid.order;

import appoo.customer.Customer;
import appoo.order.ShippingInfo;
import com.solid.user.PersonalInformation.Address;
import com.solid.shoppingCart.ShoppingCart;
import com.solid.user.PersonalInformation.FullName;


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
