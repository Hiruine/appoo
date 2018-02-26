class ItemOrder {
    private Item item;
    private int quantity = 0;

    ItemOrder(Item item, int quantity){
        this.item = item;
        this.quantity += quantity;
    }

    public double getPrice() {
        return item.getItemPrice() * quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void changeQuantity(int quantity){
        this.quantity = quantity;
    }
}
