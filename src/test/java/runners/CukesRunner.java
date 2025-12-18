package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/test/resources/features", // Gherkin dosyalarının yolu
    glue = "step_definitions", // Step Definition metotlarının olduğu paket
    tags = "@tablo", // Şu an sadece bu tag'i çalıştıracağız
    plugin = {"pretty", "html:target/cucumber-reports.html"} // Raporlama ayarı
)
public class CukesRunner extends AbstractTestNGCucumberTests {
}

