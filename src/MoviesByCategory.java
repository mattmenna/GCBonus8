import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Matt on 7/7/2017.
 */
public class MoviesByCategory {
    public static void main(String[] args) {
        OOValidatorCopy validator = new OOValidatorCopy();

        Scanner scnr = new Scanner(System.in);
        String category = "default";
        int catNumber;
        String resultTitle;

        int numMovies = 0;
        ArrayList<String> movieResult = new ArrayList<String>();
        ArrayList<Movie> movieArray = new ArrayList<Movie>();
        //Movie mvn = new Movie();

        System.out.println("Welcome to the Movie List Application");

        for (int i = 1; i < 101; i++) {
            movieArray.add(Movie.getMovie(i));
        }

        System.out.println("There are "+ numMovies + " movies in this list.");
        System.out.println("What category are you interested in?:");
        //System.out.println("Enter a line number :\n 1: animated\n 2: drama\n 3: horror\n 4: scifi");
        catNumber = validator.getInt("Enter a line number :\n 1: animated\n 2: drama\n 3: horror\n 4: scifi");

        category = switchForCategory(category, catNumber);

        for (int i = 1; i < 100; i++) {
            if(movieArray.get(i).getCategory().equalsIgnoreCase(category))
            movieResult.add(movieArray.get(i).getTitle());
        }

        System.out.println(movieResult.toString());

    }

    private static String switchForCategory(String category, int catNumber) {
        switch(catNumber){
            case 1:
                System.out.println("Animated");
                category = "animated";
                break;
            case 2:
                System.out.println("Drama");
                category = "drama";
                break;
            case 3:
                System.out.println("Horror");
                category = "horror";
                break;
            case 4:
                System.out.println("SciFi");
                category = "scifi";
                break;
            default:
                break;
        }
    }
}
