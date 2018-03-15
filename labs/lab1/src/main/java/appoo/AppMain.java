package appoo;

import appoo.cart.CartItem;
import appoo.cart.ShoppingCart;
import appoo.customer.Address;
import appoo.customer.CreditCard;
import appoo.customer.Customer;
import appoo.customer.FullName;
import appoo.item.Book.Book;
import appoo.item.Item;
import appoo.order.Order;
import appoo.order.ShippingInfo;

import java.time.Clock;
import java.time.LocalTime;
import java.util.Date;

public class AppMain {
    public static void main(String str[]) {
        Item item = new Book(123141251, "1984", "George Orwell", 67.23);

        CartItem cartItem = new CartItem(item, 13);
        System.out.println(cartItem.getSubtotal());

        Customer customer = new Customer(
                new FullName("covariance", "invariance"),
                "example@mail.com",
                new CreditCard(),
                new Address("angle",
                            "flatland",
                            "2 dimension")
        );

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addCartItem(cartItem);

        Order order = new Order(customer, shoppingCart, new ShippingInfo());
        System.out.println(order.toString());

    }
}
