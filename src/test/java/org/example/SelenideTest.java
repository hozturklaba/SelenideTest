package org.example;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

import static org.assertj.core.api.Assertions.*;

public class SelenideTest {
    
    @BeforeClass
    public void setup() {
        Configuration.browser = "chrome";
        Configuration.headless = false;
        Configuration.timeout = 10000;
    }

    @Test
    public void testDynamicLoadingWithSelenide() {
        // 1. Sayfayı aç (driver setup, başlatma vb. her şey otomatik)
        open("https://the-internet.herokuapp.com/dynamic_loading/1");

        // 2. Elementi bul (CSS) ve tıkla
        $("#start button").click();


        // 3. Elementi bul ve bekle VE doğrula (HEPSİ BİR ARADA!)
        $("#finish").shouldHave(text("Hello World!"));

        // Tarayıcı otomatik kapanır (Configuration.holdBrowserOpen = true; ile açık tutabiliriz)
    }

    @Test
    public void loginTest(){
        // Login testi örneği
        open("https://the-internet.herokuapp.com/login");
        $("#username").setValue("tomsmith");
        $("#password").setValue("SuperSecretPassword!");
        $("button[type='submit']").click();

// Selenide'in 'should' doğrulamaları (Bekleme dahil!)
    //    $("#flash").should(Condition.visible, Duration.ofSeconds(20));  // bekleme zamani degistirme
        $("#flash").shouldBe(visible); // Görünür olmalı mı?
        $("#flash").shouldHave(text("You logged into a secure area!")); // Metni içermeli mi?
        $("#flash").shouldNotHave(cssClass("error")); // 'error' class'ına sahip OLMAMALI mı?
    }

    @Test
    public void assertJExample(){
        // AssertJ Örneği


        String myText = "Hello World";
        int sayi = 10;

// TestNG: Assert.assertEquals(myText, "Hello World");
// AssertJ:
        assertThat(myText).isEqualTo("Hello World"); //

// TestNG: Assert.assertTrue(myText.startsWith("Hello"));
// AssertJ:
        assertThat(myText).startsWith("Hello").endsWith("World").contains("llo"); //

        assertThat(sayi).isGreaterThan(5).isLessThan(20).isEqualTo(10);
    }
}

