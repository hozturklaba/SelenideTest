package step_definitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class kullaniciSteps {

    @Given("kullanici kayit sayfasindadir")
    public void kullaniciKayitSayfasindadir() {
        // Burada kayıt sayfasına navigasyon işlemi yapılacak
        // Örnek: open("https://example.com/kayit");
    }

    @When("kullanici asagidaki bilgilerle kayit olur")
    public void kullaniciKayitOlur(DataTable dataTable) {
        // Tabloyu List<Map<String, String>> formatına dönüştürüyoruz.
        // Başlıklar (Ad, Email, Sifre) Map'in anahtarı, satırlar ise değerler olur.
        List<Map<String, String>> kullaniciListesi = dataTable.asMaps(String.class, String.class);
        System.out.println("ADIM: Asagidaki kullanicilar kaydediliyor:");

        for (Map<String, String> kullanici : kullaniciListesi) {
            String ad = kullanici.get("Ad");
            String email = kullanici.get("Email");
            String sifre = kullanici.get("Sifre");

            // Burada Selenide ile form doldurma işlemleri gelmeli...
            System.out.println(" -> Kaydedilen: " + ad + " / " + email);
        }
    }

    @Then("sistemde iki yeni kullanici kaydi olusur")
    public void sistemdeIkiYeniKullaniciKaydiOlusur() {
        // Burada kayıt işleminin başarılı olduğunu doğrulama işlemleri yapılacak
        // Örnek: Veritabanı kontrolü veya başarı mesajı kontrolü
    }
}

