package appoo.cart;

import appoo.item.Item;

import java.util.Dictionary;
import java.util.List;
import java.util.Map;

public class Cart {
    private Map<Item, Integer> items;

    public void addItem(Item newItem) {
        items.put(newItem, items.getOrDefault(newItem, 0) + 1);
    }

    public void

    public void updateQuantity(int quantity) {
        this.quantity = quantity;
    }


    public double getSubtotal() {
        return items.get()
    }

}
