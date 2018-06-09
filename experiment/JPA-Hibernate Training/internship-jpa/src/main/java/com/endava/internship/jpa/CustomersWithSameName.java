package com.endava.internship.jpa;

public class CustomersWithSameName {

    public String customerName;

    public Long count;


    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public CustomersWithSameName(String customerName, Long count) {
        this.customerName = customerName;
        this.count = count;
    }

    @Override
    public String toString() {
        return "CustomersWithSameName{" +
                "customerName='" + customerName + '\'' +
                ", count=" + count +
                '}';
    }
}
