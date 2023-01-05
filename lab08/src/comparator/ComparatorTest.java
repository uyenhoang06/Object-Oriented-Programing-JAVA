package comparator;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorTest {
    public static void main(String[] args) {
        ArrayList<Movie> list = new ArrayList<>();
        list.add(new Movie("Force Awakens", 8.3, 2015));
        list.add(new Movie("Star War", 8.7, 1977));
        list.add(new Movie("Empire Strikes Back", 8.8, 1980));
        list.add(new Movie("Return of the Jedi", 9.4, 1983));
        System.out.println("Sorted by rating : ");
        RatingCompare ratingCompare = new RatingCompare();
        Collections.sort(list, ratingCompare);
        for (Movie movie : list) {
            System.out.println(movie.getRating() + " " + movie.getName() + " " + movie.getYear());

        }

        System.out.println("------------------------------------------------");

        System.out.println("Sorted by name : ");
        NameCompare nameCompare = new NameCompare();
        Collections.sort(list, nameCompare);
        for (Movie movie : list) {
            System.out.println(movie.getRating() + " " + movie.getName() + " " + movie.getYear());

        }

        System.out.println("------------------------------------------------");

        System.out.println("Sorted by year : ");
        Collections.sort(list);
        for (Movie movie : list) {
            System.out.println(movie.getRating() + " " + movie.getName() + " " + movie.getYear());
        }
    }
}