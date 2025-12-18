package tests;

// LoginTests.java
import org.testng.annotations.Test;
import pages.LoginPage;

import static com.codeborne.selenide.Selenide.open;

public class LoginTests {

    LoginPage loginPage = new LoginPage(); // Page nesnesini oluştur

    @Test
    public void successfulLoginTest() {
        open("https://the-internet.herokuapp.com/login");
        loginPage.login("tomsmith", "SuperSecretPassword!");
        loginPage.verifySuccessMessage("You logged into a secure area!");
    }

    @Test
    public void failedLoginTest() {
        open("https://the-internet.herokuapp.com/login");
        loginPage.login("tomsmith", "wrongpassword");
        loginPage.verifyErrorMessage("Your password is invalid!");
    }
}
