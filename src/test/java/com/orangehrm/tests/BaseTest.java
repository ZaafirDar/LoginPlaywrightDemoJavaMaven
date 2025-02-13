package com.orangehrm.tests;

import com.microsoft.playwright.*;
import org.junit.jupiter.api.*;

public class BaseTest {
    protected static Playwright playwright;
    protected static Browser browser;
    protected Page page;

    @BeforeAll
    static void setupOnce() {
        playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
    }

    @BeforeEach
    void setup() {
        page = browser.newPage();
    }

    @AfterEach
    void teardown() {
        page.close();
    }

    @AfterAll
    static void teardownOnce() {
        browser.close();
        playwright.close();
    }
}
