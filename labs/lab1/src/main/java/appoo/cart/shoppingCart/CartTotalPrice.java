package appoo.cart.shoppingCart;

import appoo.cart.CartItem;

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
