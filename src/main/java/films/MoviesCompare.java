package films;

import java.util.Comparator;

public class MoviesCompare {

    public static class MovieTitleComparator implements Comparator<Movie> {

        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.getTitle().compareTo(o2.getTitle());
        }
    }

    public static class MovieDirectorComparator implements Comparator<Movie>{

        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.getDirector().compareTo(o2.getDirector());
        }
    }

    public static class MovieYearComparator implements Comparator<Movie>{

        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.getYear() - (o2.getYear());
        }
    }

    public static class MovieRatingComparator implements Comparator<Movie>{

        @Override
        public int compare(Movie o1, Movie o2) {
            if(o1.getRating() < o2.getRating()){
                return -1;
            } else if(o1.getRating() > o2.getRating()){
                return 1;
            } else {
                return 0;
            }
        }
    }
}
