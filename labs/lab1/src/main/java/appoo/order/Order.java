package appoo.order;

import appoo.cart.ShoppingCart;
import appoo.customer.Customer;

import java.util.Date;
import java.util.UUID;


public class Order {

    private String orderId;
    private Date dateCreated;

    private ShoppingCart shoppingCart;
    private Customer customer;
    private ShippingInfo shippingInfo;

    public Order(Customer customer, ShoppingCart shoppingCart, ShippingInfo shippingInfo) {
        this.orderId = UUID.randomUUID().toString();
        this.shoppingCart = shoppingCart;
        this.customer = customer;
        this.shippingInfo = shippingInfo;
        this.dateCreated = new Date();
    }

    public String getOrderId() {
        return orderId;
    }

    public double getTotalPrice() {
        return shoppingCart.calcTotalPrice();
    }

    @Override
    public String toString() {
        return orderId + " "
                + customer.getFullName() + " " + getTotalPrice();
    }
}
