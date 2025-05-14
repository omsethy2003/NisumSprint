import java.util.*;

class MovieManager {
    private ArrayList<Movie> movies = new ArrayList<>();

    class Movie {
        String title;
        String director;
        String genre;
        int year;
        double rating;

        Movie(String title, String director, String genre, int year, double rating) {
            this.title = title;
            this.director = director;
            this.genre = genre;
            this.year = year;
            this.rating = rating;
        }
    }

    public void addMovie(String title, String director, String genre, int year, double rating) {
        movies.add(new Movie(title, director, genre, year, rating));
    }

    public List<Movie> filterByGenre(String genre) {
        List<Movie> result = new ArrayList<>();
        for (Movie m : movies) {
            if (m.genre.equalsIgnoreCase(genre)) {
                result.add(m);
            }
        }
        return result;
    }

    public void displayMovies(List<Movie> moviesToDisplay) {
        for (Movie m : moviesToDisplay) {
            System.out.printf("%s (%d) - %s, %s, %.1f/10\n",
                    m.title, m.year, m.director, m.genre, m.rating);
        }
    }

    public static void main(String[] args) {
        MovieManager mm = new MovieManager();
        mm.addMovie("Inception", "Christopher Nolan", "Sci-Fi", 2010, 8.8);
        mm.addMovie("The Avengers Endgame", "Russso Brothers", "Superhero", 1994, 9.3);
        mm.addMovie("The Dark Knight", "Christopher Nolan", "Action", 2008, 9.0);

        System.out.println("All Movies:");
        mm.displayMovies(mm.movies);

        System.out.println("\nSci-Fi Movies:");
        mm.displayMovies(mm.filterByGenre("Sci-Fi"));
    }
}