package task3.controller;

import java.util.Scanner;
import task3.view.View;


/**
 * Created by Alex on 16.02.2019
 */
public class UtilityController {
    private Scanner scanner;
    private View view;


    public UtilityController(Scanner scanner, View view) {
        this.scanner = scanner;
        this.view = view;
    }

    /**
     *
     * @param message
     * @param regEx
     * @return
     */
    String inputStringValueWithScanner(String message, String regEx) {
        String result;
        view.printStringInput(message);
        while( !(scanner.hasNext() && (result = scanner.next()).matches(regEx))) {
            view.printWrongStringInput(message);
        }
        return result;
    }
}
