package task3.model;

import task3.view.View;

import java.util.ArrayList;

/**
 * Created by Alex on 16.02.2019
 */


public class Model {
    public ArrayList<UserInfo> catalogOfUsers;
    View view = new View();
    public Model() {
        catalogOfUsers = new ArrayList<>();
    }

    /**
     * Prints all the users names
     */
    public void getCatalogOfUsers() {
        view.printMessage("All the users are: ");
        String userName = "";
        for(UserInfo name : catalogOfUsers) {
            userName = name.getFirstName();
            view.printMessage(userName);
        }
    }

    /**
     *
     * @return String with user info
     */
    public String toString() {
        String str = " ";
        for(UserInfo userInfo : catalogOfUsers) {
            str += userInfo.getLastName() + " " + userInfo.getFirstName() + " " + userInfo.getFathersName() + " " + userInfo.getLogin();
        }
        return str;
    }
}
