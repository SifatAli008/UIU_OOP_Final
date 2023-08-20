package A;

public class Movie {

    private String name;
    private double imdbRating;

    public Movie(double imdbRating, String name) {
        this.imdbRating = imdbRating;
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    public double getImdbRating() {
        return imdbRating;
    }
}
