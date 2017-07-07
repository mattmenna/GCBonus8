import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Matt on 7/7/2017.
 */
public class MoviesByCategory {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String category;

        int numMovies = 0;
        ArrayList<Movie> movieArray = new ArrayList<Movie>();
        //Movie mvn = new Movie();

        System.out.println("Welcome to the Movie List Application");

        for (int i = 1; i < 101; i++) {
            movieArray.add(Movie.getMovie(i));
        }

        System.out.println("There are "+ numMovies + " moviess in this list.");
        System.out.println("What category are you interested in?:");
        System.out.println("Options are animated, drama, horror, scifi");

        System.out.println();

        category = scnr.nextLine();



        //System.out.println(movieArray.toString());

    }
}
