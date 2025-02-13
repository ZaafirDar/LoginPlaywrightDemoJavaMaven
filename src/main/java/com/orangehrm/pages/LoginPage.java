package com.orangehrm.pages;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.Locator;
import com.orangehrm.locators.LoginPageLocators;
import com.orangehrm.data.TestData;

public class LoginPage extends BasePage {
    private final String usernameField    = LoginPageLocators.USERNAME_FIELD;
    private final String passwordField    = LoginPageLocators.PASSWORD_FIELD;;
    private final String loginButton      = LoginPageLocators.LOGIN_BUTTON;
    private final String dashboardHeader  = LoginPageLocators.DASHBOARD_HEADER;

     
    public LoginPage(Page page) {
        super(page);
    }


    public void navigateToLoginPage() {
        navigateTo(TestData.BASE_URL);
    }

    public void enterUsername(String username) {
        fill(usernameField,username);
    }

    public void enterPassword(String password) {
        fill(passwordField,password);
    }

    public void clickLogin() {
        click(loginButton);
    }

    public boolean isLoginSuccessful() {
        waitForSelector(dashboardHeader);
        return isVisible(dashboardHeader);
    }
}
