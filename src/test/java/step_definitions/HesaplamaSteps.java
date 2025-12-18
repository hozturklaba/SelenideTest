package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import static org.assertj.core.api.Assertions.assertThat;

// (Gerekli değişkenleri class seviyesinde tanımlayın: int sayi1, sayi2, sonuc;)
public class HesaplamaSteps {
    int sayi1, sayi2, sonuc;

    @Given("kullanici hesap makinesindedir")
    public void kullaniciHesapMakinesindedir() {
        System.out.println("ADIM: Hesap makinesi başlatıldı.");
    }

    // Parametreleri yakalayan RegEx/String yapısı
    @When("kullanici {string} ve {string} sayilarini girer")
    public void kullaniciSayilariGirer(String s1, String s2) {
        // RegEx: ("([^\"]*)" )'ın yakaladığı değerler s1 ve s2 değişkenlerine gelir.
        sayi1 = Integer.parseInt(s1);
        sayi2 = Integer.parseInt(s2);
        sonuc = sayi1 + sayi2;
        System.out.println("ADIM: Sayılar toplandı. Sonuç: " + sonuc);
    }

    @Then("sonucun {string} oldugunu dogrular")
    public void sonucuDogrular(String beklenen) {
        int beklenenSonuc = Integer.parseInt(beklenen);
        // AssertJ veya TestNG Assert'i burada kullanılmalı
        assertThat(sonuc).isEqualTo(beklenenSonuc);
        System.out.println("ADIM: Doğrulama başarılı! Beklenen: " + beklenenSonuc + ", Gerçekleşen: " + sonuc);
    }
}

