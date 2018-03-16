package appoo.cart.shoppingCart;


import appoo.cart.CartItem;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class ShoppingCart {
    private String shoppingCartId;
    private List<CartItem> cartItems;
    private Date dateCreated;
    private Date dateModified;


    public ShoppingCart() {
        shoppingCartId =  UUID.randomUUID().toString();
        cartItems = new ArrayList<CartItem>();
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

    public List<CartItem> getCartItems() {
        return cartItems;
    }


    private void updateDate() {
        dateModified = new Date();
    }

}

