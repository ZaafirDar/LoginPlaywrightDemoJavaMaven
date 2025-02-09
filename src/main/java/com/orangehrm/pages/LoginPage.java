package com.orangehrm.pages;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.Locator;
import com.orangehrm.locators.LoginPageLocators;

public class LoginPage {
    private final Page page;
    private final Locator usernameField;
    private final Locator passwordField;
    private final Locator loginButton;

    public LoginPage(Page page) {
        this.page = page;
        this.usernameField = page.locator(LoginPageLocators.USERNAME_FIELD);
        this.passwordField = page.locator(LoginPageLocators.PASSWORD_FIELD);
        this.loginButton = page.locator(LoginPageLocators.LOGIN_BUTTON);
    }

    public void navigateToLoginPage() {
        page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    public void enterUsername(String username) {
        usernameField.fill(username);
    }

    public void enterPassword(String password) {
        passwordField.fill(password);
    }

    public void clickLogin() {
        loginButton.click();
    }

    public boolean isLoginSuccessful() {
        page.waitForSelector(LoginPageLocators.DASHBOARD_HEADER);
        return page.isVisible(LoginPageLocators.DASHBOARD_HEADER);
    }
}
