@toplama
Feature: Basit Toplama Islemi

  Kullanici verilen iki sayiyi dogru toplamalidir.

  Scenario: Pozitif iki sayinin toplanmasi

    Given kullanici hesap makinesindedir

    When kullanici "5" ve "10" sayilarini girer

    Then sonucun "15" oldugunu dogrular

  Scenario: Negatif iki sayinin toplanmasi

    Given kullanici hesap makinesindedir

    When kullanici "-5" ve "-10" sayilarini girer

    Then sonucun "-15" oldugunu dogrular

