import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Matt on 6/28/2017.
 */
public class MyValidatorCopy extends OOValidatorCopy {

    /**
     *
     * @param prompt String output to the console
     * @return
     */
    public String getRequiredString(String prompt) {
        String rString = sc.nextLine();
        return rString;
    } // end method

    public String getRequiredString(String prompt, String sCase) {
        if (sCase.equalsIgnoreCase("upper")){
            String rString = sc.nextLine().toUpperCase();
            return rString;
        } else if ( sCase.equalsIgnoreCase("lower")){
            String rString = sc.nextLine().toLowerCase();
            return rString;
        } else {
            String rString = sc.nextLine();
            return rString;
        }
    } // end method

    /**
     *
     * @param prompt String output to the console
     * @param s1
     * @param s2
     * @return
     */
    public String getChoiceString(String prompt, String s1, String s2) {
        String rString = "empty";
        return rString;
    } // end method

    public boolean getContinue(String sInput){
        //String[] contArray = {"yes", "y"};
        char wCont = 'y';
        while ( wCont != 'n' ) {

            if (sInput.toLowerCase().equals("yes") || sInput.toLowerCase().equals("y")) {
                return true;
            } else if(sInput.toLowerCase().equals("no") || sInput.toLowerCase().equals("n")){
                break;
            }
            else {
                System.out.println("Please try again");
                sInput = sc.nextLine();
            }
        }
        return false;
    } // end method

} // end class