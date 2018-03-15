package appoo.cart;


import appoo.item.Item;

public class CartItem {
    private double unitCost;
    private int quantity;


    public CartItem(Item item, int quantity){

        unitCost = item.getPrice();
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
