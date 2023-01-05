package exercise2.exercise2_2;

import java.util.Arrays;

public class TestBook {
    public static void main(String[] args) {
        // Declare and allocate an array of Authors
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');

        // Declare and allocate a Book instance
        Book javaDummy = new Book("Java for Dummy", authors, 19.99, 99);
        System.out.println(javaDummy);  // toString()

        System.out.println("authors: " + Arrays.toString(javaDummy.getAuthors()));
        javaDummy.setPrice(20);
        System.out.println("the new price is: " + javaDummy.getPrice());
        javaDummy.setQty(100);
        System.out.println("the qty: " + javaDummy.getQty());
        System.out.println("authors name: " + javaDummy.getAuthorNames());
        System.out.println(javaDummy);
    }
}
