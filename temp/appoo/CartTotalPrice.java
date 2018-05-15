package appoo;

import appoo.cart.CartItem;
import appoo.solid.shoppingCart.ShoppingCart;

public class CartTotalPrice {

    public double calcTotalPrice(ShoppingCart shoppingCart) {
        double totalPrice = 0.0;
        for (CartItem cartItem:
                shoppingCart.getCartItems()) {
            totalPrice += cartItem.getSubtotal();
        }
        return totalPrice;
    }
}
