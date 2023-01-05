package exercise2.exercise2_2;

public class TestAuthor {
    public static void main(String[] args) {
        // Declare and allocate an array of Authors
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');

        authors[0].setEmail("ahteck@somewhere.com"); // test setter
        System.out.println(authors[0].getEmail());  // test getter
        System.out.println(authors[1].getName());   // test getter
        System.out.println(authors[1].getGender()); // test getter
        System.out.println(authors[1]); // to String()
    }
}
