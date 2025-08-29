@FollowStore
Feature: Magaza takip edilir
  Background:
    When Cinsiyet olarak kadin sec
    When Bildirim izin popup'indan allow sec
    When Hesabim sayfasina tikla
    When Giris yap Uye ol butonuna tikla
    And Kullanici eposta gir
    And Kullanici sifre gir
    And Giris yap butonuna tıkla
    Then Hesaba giris yapildigini kontrol et


  Scenario: Magaza aramasi yapilir, magazaya gidilir, takip edilir, takip durumu kontrol edilir
    When Anasayfa'ya git
    When Arama kismina "candybia" yaz
    When Arama kismindaki sonuclardan magaza olana tikla
    When Takip et butonuna tıkla
    Then Magaza takip edilme durmunu kontrol et