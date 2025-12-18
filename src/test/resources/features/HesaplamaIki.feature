@veri
Feature: Toplama Islemi Test Senaryolari Data Tablosu ile

  Scenario Outline: Toplama Islemi Test Senaryolari

    Given kullanici hesap makinesindedir

    When kullanici "<Sayi1>" ve "<Sayi2>" sayilarini girer

    Then sonucun "<BeklenenSonuc>" oldugunu dogrular

    Examples:
      | Sayi1 | Sayi2 | BeklenenSonuc |
      | 5     | 10    | 15            |
      | -5    | 3     | -2            |
      | 0     | 7     | 7             |
      | 100   | -50   | 50            |
      | -50   | -50   | -100          |



