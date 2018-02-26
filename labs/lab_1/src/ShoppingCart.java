import java.util.ArrayList;
import java.util.List;

class ShoppingCart {
    private ArrayList<ItemOrder> items;

    ShoppingCart(){
        this.items = new ArrayList<>();
    }

    public void addItemOrder(ItemOrder item_order){
        items.add(item_order);
    }

    public void removeItemOrder(ItemOrder item_order){
        items.remove(item_order);
    }

    public double getTotal(){
        double total = 0.0;

        for(ItemOrder item_order : items){
            total += (item_order.getPrice() *
                     item_order.getQuantity());
        }

        return total;
    }
}
