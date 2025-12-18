package pages;

// LoginPage.java
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class LoginPage extends BabaPage {
    // 1. Elementleri SelenideElement olarak tanımla
    private SelenideElement usernameInput = $("#username");
    private SelenideElement passwordInput = $("#password");
    private SelenideElement loginButton = $("button[type='submit']");


    // 2. O sayfada yapılabilen eylemleri metot olarak yaz
    public void login(String username, String password) {
        usernameInput.setValue(username);
        passwordInput.setValue(password);
        loginButton.click();
    }

    public void verifySuccessMessage(String message) {
        flashMessage.shouldHave(text(message));
    }

    public void verifyErrorMessage(String message) {
        flashMessage.shouldHave(text(message));
        flashMessage.shouldHave(cssClass("error"));
    }
}
