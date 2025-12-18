package tests;

import org.testng.annotations.Test;
import utilities.MyLogger;

public class LoggerTests {

    @Test
    public void testLoginWithLogging() {
        MyLogger.startTestCase("Login Basari Testi");

        MyLogger.info("Kullanici adi giriliyor."); // INFO seviyesinde log gönder

        // ... Selenide kodu

        MyLogger.error("Giris basarisiz oldu!"); // Hata durumunda ERROR gönder

        MyLogger.info("Test sonlandi.");
    }
}

