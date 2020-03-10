package films;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Movie> movies = createMoviesList();
        print(movies);
        System.out.println("Sorted - Title");
        Collections.sort(movies, new MoviesCompare.MovieTitleComparator());
        print(movies);
        System.out.println("Sorted - Director");
        Collections.sort(movies, new MoviesCompare.MovieDirectorComparator());
        print(movies);
        System.out.println("Sorted - Year");
        Collections.sort(movies, new MoviesCompare.MovieYearComparator());
        print(movies);
        System.out.println("Sorted - Rating");
        Collections.sort(movies, new MoviesCompare.MovieRatingComparator());
        print(movies);

    }

    private static List<Movie> createMoviesList(){
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Jumanji", "Johnston Joe", 1995, 6.8));
        movies.add(new Movie("The Shawshank Redemption", "Johnston Joe", 1994, 8.75));
        movies.add(new Movie("The Green Mile", "Darabont Frank", 1999, 8.61));
        movies.add(new Movie("Spider Man", "Raimi Sam", 2002, 6.7));
        movies.add(new Movie("Transformers", "Bay Michael", 2007, 7.3));
        movies.add(new Movie("Alien", "Scott Ridley", 1979, 7.8));
        movies.add(new Movie("Home Alone", "Columbus Chris", 1979, 7.1));
        return movies;
    }

    private static void print(List<Movie> movies){
        System.out.println("Films: ");
        movies.forEach(System.out::println);
    }
}
