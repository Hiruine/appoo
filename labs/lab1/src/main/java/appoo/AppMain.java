package appoo;

import appoo.cart.CartItem;
import com.solid.shoppingCart.ShoppingCart;
import com.solid.user.PersonalInformation.Address;
import appoo.customer.CreditCard;
import appoo.customer.Customer;
import com.solid.user.PersonalInformation.FullName;
import appoo.item.Book.Book;
import appoo.item.Item;
import com.solid.order.Order;
import appoo.order.ShippingInfo;



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
