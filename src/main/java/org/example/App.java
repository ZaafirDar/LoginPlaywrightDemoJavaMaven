package org.example;
import com.microsoft.playwright.*;
import java.nio.file.Paths;

public class App {
  public static void main(String[] args) {
    try (Playwright playwright = Playwright.create()) {
            
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));

            BrowserContext context = browser.newContext();
            Page page = context.newPage();

            page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

            page.waitForSelector("input[name='username']");


            page.fill("input[name='username']", "Admin");
            page.fill("input[name='password']", "admin123");

            page.click("button:has-text('Login')");

            page.waitForSelector("h6:has-text('Dashboard')");

            if (page.isVisible("h6:has-text('Dashboard')")) {
                System.out.println("Login Test Passed: Successfully logged in!");
            } else {
                System.out.println("Login Test Failed: Dashboard not found!");
            }

            // Close browser
            browser.close();
        }
  }
}