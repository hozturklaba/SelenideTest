package tests;

import com.codeborne.selenide.commands.TakeScreenshot;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import org.testng.annotations.Test;
import pages.LoginPage;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.webdriver;

public class AllureAnotasyonTest {

    private LoginPage loginPage = new LoginPage();

    @Test
    @Severity(SeverityLevel.CRITICAL) // Testin önemini belirt 
    @Description("Kullanıcının geçerli kimlik bilgileriyle başarılı giriş yapmasını test eder.") 
    public void testSuccessfulLogin() {
        navigateToLoginPage();
        performLogin("tomsmithJr", "SuperSecretPassword!");
        assertSuccessMessageVisible();
    }

    @Step("1. Adım: Giriş sayfasına gidilir.")
    public void navigateToLoginPage() {
        open("https://the-internet.herokuapp.com/login");
    }

    @Step("2. Adım: Kullanıcı adı '{0}' ve şifre '{1}' ile giriş yapılır.")
    public void performLogin(String username, String password) {
        loginPage.login(username, password);
    }

    @Step("3. Adım: Başarı mesajının görünür olduğu doğrulanır.")
    public void assertSuccessMessageVisible() {
        loginPage.verifySuccessMessage("You logged into a secure area!");
    }

}

