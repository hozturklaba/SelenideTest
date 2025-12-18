Feature: Kullanici Kayit Islemi

  @tablo
  Scenario: Yeni Kullanici Kaydi Toplu Ekleme

    Given kullanici kayit sayfasindadir

    When kullanici asagidaki bilgilerle kayit olur

      | Ad      | Email            | Sifre     |
      | Melisa  | melisa@test.com  | 123456    |
      | Tarkan  | tarkan@test.com  | 987654    |

    Then sistemde iki yeni kullanici kaydi olusur

