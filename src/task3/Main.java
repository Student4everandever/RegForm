package task3;

import task3.controller.Controller;
import task3.model.Model;
import task3.model.UserInfo;
import task3.view.View;

import java.util.Locale;

/**
 * Created by Alex on 16.02.2019
 */
public class Main {
    public static void main(String [] args) {

        //Locale.setDefault(new Locale("ua", "UA"));

        Model model = new Model();
        UserInfo userInfo = new UserInfo();
        Controller controller = new Controller(model, userInfo, new View());
        controller.processUser();
        userInfo.printUserInfo();
        model.getCatalogOfUsers();
    }
}
