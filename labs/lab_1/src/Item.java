class Item {
    private String name;
    private double price;
    private String itemID;


    Item(String name, double price, String itemID){
        this.name = name;
        this.price = price;
        this.itemID = itemID;
    }

    public String getName(){
        return name;
    }

    public String getItemID(){
        return itemID;
    }

    public double getItemPrice(){
        return price;
    }
}
