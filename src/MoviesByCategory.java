import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by Matt on 7/7/2017.
 */
public class MoviesByCategory {


    public static void main(String[] args) {
        OOValidatorCopy validator = new OOValidatorCopy();
        MyValidatorCopy scannerContinue = new MyValidatorCopy();

        boolean cont = true;

        Scanner scnr = new Scanner(System.in);
        String category = "default";
        int catNumber;
        String resultTitle;

        ArrayList<String> movieResult = new ArrayList<String>();
        ArrayList<Movie> movieArray = new ArrayList<Movie>();
        //Movie mvn = new Movie();

        while (cont == true) {
            System.out.println("Welcome to the Movie List Application");

            for (int i = 1; i < 101; i++) {
                movieArray.add(Movie.getMovie(i));
            }

            System.out.println("There are " + movieArray.size() + " movies in this list.");
            System.out.println("What category are you interested in?:");
            catNumber = validator.getInt("Enter a line number :\n 1: animated\n 2: drama\n 3: horror\n 4: scifi");

            category = switchForCategory(category, catNumber);

            for (int i = 1; i < 100; i++) {
                if (movieArray.get(i).getCategory().equalsIgnoreCase(category))
                    movieResult.add(movieArray.get(i).getTitle());
            }

            Collections.sort(movieResult);

            System.out.println(movieResult.toString());
            movieArray.clear();
            movieResult.clear();

            System.out.println("Do you want to continue?");
            cont = scannerContinue.getContinue(scnr.nextLine());

        } // end while

    } // end main

    private static String switchForCategory(String category, int catNumber) {
        switch (catNumber) {
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
                category = "";
                break;
        } // end switch
        return category;
    } // end method
}
