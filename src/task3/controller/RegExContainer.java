package task3.controller;

/**
 * Created by Alex on 16.02.2019
 */
public interface RegExContainer {
    //Ukr name
    String REG_EX_NAME_UKR = "^[А-ЯЇІ&&[^Ь]][а-я\'їі]{1,20}$";
    //English Name
    String REG_EX_NAME_EN = "^[A-Z][a-z]{1,20}$";
    //Login
    String REG_EX_LOGIN = "^[A-Za-z0-9_-]{8,20}$";
}
