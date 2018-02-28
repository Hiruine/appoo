package com.appoo.order;

import java.util.Date;
import java.util.UUID;

public class Order {
    String orderId;
    Date dateCreated;
    Date dateShipped;
    String customerName;
    String customerId;
    String status;
    String shippingId;

    public Order() {
        this.orderId = UUID.randomUUID().toString();
        this.dateCreated = new Date();
        this.status = "processing";
    }

    public void updateShippingDate(Date date) {
        dateShipped = date;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setShippingId(String shippingId) {
        this.shippingId = shippingId;
    }
}
