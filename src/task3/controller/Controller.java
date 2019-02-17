package task3.controller;

import task3.model.Model;
import task3.model.UserInfo;
import task3.view.View;
import java.util.Scanner;

/**
 * Created by Alex on 16.02.2019
 */
public class Controller {
    private Model model;
    private UserInfo userInfo;
    private View view;

    public Controller(Model model, UserInfo userInfo, View view) {
        this.model = model;
        this.userInfo = userInfo;
        this.view = view;
    }

    public void processUser() {
        Scanner sc = new Scanner(System.in);
        InputNote inputNote = new InputNote(view,  userInfo, sc);
        model.catalogOfUsers.add(inputNote.input());
    }
}
