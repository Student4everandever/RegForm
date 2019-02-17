package task3.model;

import java.util.ArrayList;

/**
 * Created by Alex on 17.02.2019
 */
public class UserInfo {
    private String firstName;
    private String lastName;
    private String fathersName;
    private String login;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }

    public String getFathersName() {
        return fathersName;
    }

    public  void setLogin(String login) { this.login = login; }

    public String getLogin() { return login; }
    
    public void printUserInfo() {
        String str = "";
        str += getLastName() + " " + getFirstName() + " " + getFathersName() + " " + getLogin();
        System.out.println(str);
    }
}
