# Playwright Demo with Java Maven

This is a **simple Playwright Demo project** that automates the **Login Feature Test** for the **OrangeHRM Open Source Test Site**.

**Test Site URL:**  
🔗 [OrangeHRM Demo Login](https://opensource-demo.orangehrmlive.com/web/index.php/auth/login)

## **📌 Project Overview**
This project demonstrates **how to automate UI testing** for a web application using **Playwright with Java and Maven**.

**Test Scenario:**  
1. **Open the web browser** and navigate to the login page.  
2. **Enter a valid username and password.**  
3. **Click the "Login" button.**  
4. **Verify that the user is successfully logged in.**  

---

## **📂 Project Structure**
```
playwrgiht-java-maven-demo
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── com
│   │   │   │   ├── orangehrm
│   │   │   │   │   ├── data
│   │   │   │   │   │   ├── TestData.java
│   │   │   │   │   ├── locators
│   │   │   │   │   │   ├── LoginPageLocators.java
│   │   │   │   │   ├── pages
│   │   │   │   │   │   ├── LoginPage.java
│   ├── test
│   │   ├── java
│   │   │   ├── com
│   │   │   │   ├── orangehrm
│   │   │   │   │   ├── tests
│   │   │   │   │   │   ├── LoginTest.java
├── pom.xml
├── .github
│   ├── workflows
│   │   ├── playwright-ci.yml
├── README.md
```
## Requirements

- Java 11 or higher
- Maven 3.6 or higher

## Building the Project

To build the project, navigate to the project directory and run:

## Running Tests locally

To run the tests, use the following command:

```
mvn clean test
```

To run only specific file, use the following command, replace login with the file required:

```
mvn -Dtest=com.orangehrm.tests.LoginTest test
```
Generate Test Report

```
mvn surefire-report:report
```
Test Report can be accessed in local browser, 
copy complete path of this file and paste it in the browser

```
target/site/surefire-report.html
```

## Test Execution on GithubActions CI/CD pipline
🔗 [Github Actions](https://github.com/ZaafirDar/LoginPlaywrightDemoJavaMaven/actions)