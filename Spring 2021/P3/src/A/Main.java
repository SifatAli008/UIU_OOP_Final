package A;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        ArrayList<Movie> list = new ArrayList<Movie>();

        list.add(new Movie(8.6, "Inception"));
        list.add(new Movie(9.1, "The Shawshank Redemption"));
        
        Collections.sort(list, new Comparator<Movie>() {
            @Override
            public int compare(Movie m1, Movie m2) {
                return Double.compare(m2.getImdbRating(), m1.getImdbRating());
            }
        });
        
         for (Movie movie : list) {
            System.out.println(movie.getImdbRating() + " " + movie.getName());
        }
        
    }
    
}
