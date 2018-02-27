package com.appoo.cart;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

public class ShoppingCart {
    private String shoppingCartId;
    private ArrayList<CartItem> cartItems;
    private Date dateCreated;
    private Date dateModified;


    ShoppingCart() {
        shoppingCartId =  UUID.randomUUID().toString();
        cartItems = new ArrayList<>();
        dateCreated = new Date();
    }


    public void addCartItem(CartItem cartItem) {
        cartItems.add(cartItem);
        updateDate();
    }

    public void deleteCartItem(CartItem cartItem) {
        cartItems.remove(cartItem);
        updateDate();
    }

    public void updateQuantity(CartItem cartItem, int quantity) {
        cartItem.updateQuantity(quantity);
        updateDate();
    }

    public double checkout() {
        return 0;
    }

    public double calcTotalPrice() {
        double totalPrice = 0.0;
        for (CartItem cartItem:
                cartItems) {
            totalPrice += cartItem.getSubtotal();
        }
        return totalPrice;
    }

    private void updateDate() {
        dateModified = new Date();
    }


}
