Feature: Kullanici urunleri sepete atar ve cikis yapar

  Background:
    Given Kullanici "https://www.telerik.com" ana sayfaya gider

  @TelerikPrice

  Scenario: Kullaici birkac urunu sepete ekler ve urun sayilari sepette artar

    When Kullanici cookies i kabul eder
    And Kullanici pricing e tiklar
    And Kullanici satin al linkine tiklar
    And ana sayfaya tekrar doner
    And Kullanici tekrar pricing e tiklar
    And tekrar urun ekler
    And Kullanci tekrar ana sayfaya doner
    Then sepette urun sayisinin arttigini gorur

  @TelerikPrice

  Scenario: Kulanici sepete urun ekler ve cikarir, sonrasinda urunun eksildigini gorur

    When Kullanici cookies i kabul eder
    And Kullanici pricing e tiklar
    And Kullanici satin al linkine tiklar
    And ana sayfaya tekrar doner
    And Kullanici tekrar pricing e tiklar
    And tekrar urun ekler
    And Kullanci tekrar ana sayfaya doner
    And kullanici sepete uzerindeki mevcut sayiyi alir
    And kullanici sepete tekrar gider
    And kullanici sepetteki urunlerden bir tanesini Delete linki ile siler
    And kullanici ana sayfaya geri doner
    Then kullanici sepet simgesi uzerindeki sayinin bir eksildigini kontrol eder





