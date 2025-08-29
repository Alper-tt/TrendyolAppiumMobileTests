@AddFavorite
Feature: Urun favoriye eklenir
  Background:
    When Cinsiyet olarak kadin sec
    When Bildirim izin popup'indan allow sec
    When Hesabim sayfasina tikla
    When Giris yap Uye ol butonuna tikla
    And Kullanici eposta gir
    And Kullanici sifre gir
    And Giris yap butonuna tıkla
    Then Hesaba giris yapildigini kontrol et

  Scenario: Urun aramasi yapilir, urune gidilir, urun favoriye eklenir ve favorilenen urunler kontrol edilir
    When Anasayfa'ya git
    When Arama kismina "cicekli elbise" yaz
    When Onerilen arama sonuclarindandan ilkine tikla
    When Arama sonucundaki urunlerden ilk urune tikla
    When Urunu favoriye ekle
    When Favoriler sayfasina git
    Then Urun favoriye eklenmismi kontrol et