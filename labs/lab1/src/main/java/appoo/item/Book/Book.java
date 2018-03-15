package appoo.item.Book;

import appoo.item.Item;

public class Book implements Item{

    private long isbn;
    private String name;
    private String author;
    private double price;

    public Book(long isbn, String name, String author, double price) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public long getIsbn() {
        return isbn;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }
}
