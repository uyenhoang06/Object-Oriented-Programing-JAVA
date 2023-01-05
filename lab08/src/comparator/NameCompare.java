package comparator;

import java.util.Comparator;

public class NameCompare implements Comparator<Movie> {
    public int compare(Movie left, Movie right) {
        return Integer.compare(left.getName().length(), right.getName().length());
    }
}

