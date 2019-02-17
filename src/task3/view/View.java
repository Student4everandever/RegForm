package task3.view;

import java.util.Locale;
import java.util.ResourceBundle;

import static task3.view.TextConstants.INPUT_STRING_DATA;
import static task3.view.TextConstants.WRONG_INPUT_DATA;

/**
 * Created by Alex on 16.02.2019
 */
public class View {

    static String MESSAGE_BUNDLE_NAME = "messages";
    public static final ResourceBundle bundle =
            ResourceBundle.getBundle(MESSAGE_BUNDLE_NAME,
                    new Locale("ua", "UA")); //Ukrainian
                   //new Locale("en"));                       //English

    //Utility methods

    /**
     *
     * @param message
     */
    public void printMessage(String message) {
        System.out.println(message);
    }

    public String concatenateString(String ... message) {
        StringBuilder concatString = new StringBuilder();
        for(String s : message) {
         concatString = concatString.append(s);
        }
        return new String(concatString);
    }

    public void printStringInput(String message) {
        printMessage(concatenateString(
                bundle.getString(INPUT_STRING_DATA),
                bundle.getString(message)));
    }

    public void printWrongStringInput(String message) {
        printMessage(concatenateString(
                bundle.getString(WRONG_INPUT_DATA),
                bundle.getString(INPUT_STRING_DATA),
                bundle.getString(message)));
    }
}
