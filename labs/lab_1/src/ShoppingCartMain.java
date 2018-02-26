public class ShoppingCartMain {
    public static void main(String args[]){
        Item book = new Item("book", 155.6, "0451524934");
        ItemOrder item_order = new ItemOrder(book, 5);
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addItemOrder(item_order);

        Item harambe = new Item("monkey", 1335.6, "0451524935");
        item_order(harambe, 15);


        System.out.println(shoppingCart.getTotal());
    }
}
