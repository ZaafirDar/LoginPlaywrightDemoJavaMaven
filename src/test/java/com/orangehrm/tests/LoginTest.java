package com.orangehrm.tests;

import com.microsoft.playwright.*;
import com.orangehrm.pages.LoginPage;
import com.orangehrm.data.TestData;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class LoginTest extends BaseTest {
     
    private LoginPage loginPage;

    @BeforeEach
    void setUpPage() {
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
}
