package Lab3;

import java.util.ArrayList;
import java.util.List;

class Movie extends Media {
    private int duration;

    public Movie(String title, String auteur, String ISBN, double price, int duration) {
        super(title, auteur, ISBN, price);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void watch(User user) {
        user.addToCart(this);
    }

    public List<Movie> recommendSimilarMovies(List<Movie> movieCatalog) {
        List<Movie> similarMovies = new ArrayList<>();
        for (Movie movie : movieCatalog) {
            if (!movie.getTitle().equals(getTitle()) && movie.getAuteur().equals(getAuteur())) {
                similarMovies.add(movie);
            }
        }
        return similarMovies;
    }

    @Override
    public String getMediaType() {
        if (duration >= 120) {
            return "Long Movie";
        } else {
            return "Movie";
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Duration: " + duration;
    }
}

