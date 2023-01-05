package exercise2.exercise2_2;

import java.util.Arrays;

public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getAuthorNames() {
        String names = authors[0].getName();
        for (int i = 1; i < authors.length; i++) {
            names += "," + authors[i].getName();
        }
        return names;
    }

    @Override
    public String toString() {
        return "Book[" + "name = " + name + ", authors = " + Arrays.toString(authors) + ", price = " + price + ", qty = " + qty + ']';
    }
}
