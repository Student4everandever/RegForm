package task3.controller;

import java.util.Scanner;

import task3.model.UserInfo;
import task3.view.View;
import task3.model.Model;
import static task3.controller.RegExContainer.*;
import static task3.view.TextConstants.*;

/**
 * Created by Alex on 16.02.2019
 */
public class InputNote {
    private View view;
    private UserInfo userInfo;
    private Scanner sc;

    private String firstName;
    private String lastName;
    private String fathersName;
    private String login;

    /**
     * Constructor
     * @param view
     * @param userInfo
     * @param sc
     */
    public InputNote(View view, UserInfo userInfo, Scanner sc) {
        this.view = view;
        this.userInfo = userInfo;
        this.sc = sc;
    }

    /**
     * Checks the locale and sets the values after validation
     * @return userInfo Class
     */
    public UserInfo input() {
        UtilityController utilityController = new UtilityController(sc, view);
        String str = (String.valueOf(View.bundle.getLocale()).equals("ua")) ? REG_EX_NAME_UKR : REG_EX_NAME_EN;
        this.lastName = utilityController.inputStringValueWithScanner(LAST_NAME, str);
        userInfo.setLastName(lastName);
        this.firstName = utilityController.inputStringValueWithScanner(FIRST_NAME, str);
        userInfo.setFirstName(firstName);
        if(String.valueOf(View.bundle.getLocale()).equals("ua")) {
            this.fathersName = utilityController.inputStringValueWithScanner(FATHERS_NAME, str);
            userInfo.setFathersName(fathersName);
        }
        this.login = utilityController.inputStringValueWithScanner(LOGIN_DATA, REG_EX_LOGIN);
        userInfo.setLogin(login);
        return this.userInfo;
    }
}