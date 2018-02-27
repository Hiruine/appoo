package com.appoo.cart;


import com.appoo.item.Item;

public class CartItem {
    //private static String cartId;
    private double unitCost;
    private int quantity;


    CartItem(Item item, int quantity){

        unitCost = item.getItemPrice();
        this.quantity = quantity;
    }

    public void updateQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getUnitCost() {
        return unitCost;
    }

    public double getSubtotal() {
        return unitCost * quantity;
    }


}
