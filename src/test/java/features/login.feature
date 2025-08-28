@Login
Feature: Trendyol hesabina giris yap
  Scenario: Kullanici trendyol hesabina giris yapsin
    When Cinsiyet olarak kadin sec
    When Bildirim izin popup'indan allow sec
    When Hesabim sayfasina tikla
    When Giris yap Uye ol butonuna tikla
    And Kullanici eposta gir
    And Kullanici sifre gir
    And Giris yap butonuna tıkla
    Then Hesaba giris yapildigini kontrol et