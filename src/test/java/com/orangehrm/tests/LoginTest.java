package com.orangehrm.tests;

import com.microsoft.playwright.*;
import com.orangehrm.pages.LoginPage;
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
        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickLogin();
        
        assertTrue(loginPage.isLoginSuccessful(), "Login failed!");
    }

    @AfterEach
    public void tearDown() {
        page.close();
        browser.close();
        playwright.close();
    }
}
