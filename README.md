# Playwright Demo with Java Maven

This is a **simple Playwright Demo project** that automates the **Login Feature Test** for the **OrangeHRM Open Source Test Site**.

📌 **Test Site URL:**  
🔗 [OrangeHRM Demo Login](https://opensource-demo.orangehrmlive.com/web/index.php/auth/login)

## **📌 Project Overview**
This project demonstrates **how to automate UI testing** for a web application using **Playwright with Java and Maven**.

✅ **Test Scenario:**  
1. **Open the web browser** and navigate to the login page.  
2. **Enter a valid username and password.**  
3. **Click the "Login" button.**  
4. **Verify that the user is successfully logged in.**  

---

## **📂 Project Structure**
my-java-project ├── src │ ├── main │ │ ├── java │ │ │ ├── com │ │ │ │ ├── orangehrm │ │ │ │ │ ├── PlaywrightTestBase.java <-- ✅ Playwright setup file │ │ │ │ │ ├── LoginPage.java <-- ✅ Page Object Model (POM) for Login Page │ ├── test │ │ ├── java │ │ │ ├── com │ │ │ │ ├── orangehrm │ │ │ │ │ ├── LoginTest.java <-- ✅ JUnit Test for Login Automation ├── pom.xml <-- ✅ Maven configuration └── README.md

## Running Tests locally

To run the tests, use the following command:

mvn compile exec:java -D exec.mainClass="org.example.App"
