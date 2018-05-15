package appoo.cart;


import appoo.item.Item;

public class CartItem {
    private int quantity;
    private Item item;


    public CartItem(Item item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    public void updateQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getUnitCost() {
        return item.getPrice();
    }

    public double getSubtotal() {
        return item.getPrice() * quantity;
    }


}
