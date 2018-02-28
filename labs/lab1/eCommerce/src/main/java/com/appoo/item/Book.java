package com.appoo.item;

import com.appoo.item.Item;

public class Book implements Item {

    private String itemId;
    private String itemName;
    private double price;


    Book(String itemId, String itemName, float price) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.price = price;
    }

    @Override
    public String getItemId() {
        return itemId;
    }

    @Override
    public String getItemName() {
        return itemName;
    }

    @Override
    public double getItemPrice() {
        return price;
    }

}