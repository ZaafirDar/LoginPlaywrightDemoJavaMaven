package com.orangehrm.tests;

import com.microsoft.playwright.*;
import com.orangehrm.pages.LoginPage;
import com.orangehrm.data.TestData;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class LoginTest {
    private Playwright playwright;
    private Browser browser;
    private Page page;
    private LoginPage loginPage;

    @BeforeEach
    public void setUp() {
        playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        page = browser.newPage();
        loginPage = new LoginPage(page);
    }

    @Test
    public void testValidLogin() {
        loginPage.navigateToLoginPage();
        loginPage.enterUsername(TestData.VALID_USERNAME); 
        loginPage.enterPassword(TestData.VALID_PASSWORD);
        loginPage.clickLogin();
        
        assertTrue(loginPage.isLoginSuccessful(), "Login Successful!");
    }

    @Test
    public void testInvalidLogin() {
        loginPage.navigateToLoginPage();
        loginPage.enterUsername(TestData.INVALID_USERNAME);
        loginPage.enterPassword(TestData.INVALID_PASSWORD);
        loginPage.clickLogin();
        
        assertTrue(page.textContent(".oxd-alert-content").contains(TestData.LOGIN_ERROR_MESSAGE),"Invalid login credentials!");
    }

    @AfterEach
    public void tearDown() {
        page.close();
        browser.close();
        playwright.close();
    }
}
