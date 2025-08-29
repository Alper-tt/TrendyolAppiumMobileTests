@AddCart
Feature: Urun sepete eklenir
  Scenario: Urun aramasi yapilir, urune gidilir, urun sepete eklenir ve sepet kontrol edilir
    When Cinsiyet olarak kadin sec
    When Bildirim izin popup'indan allow sec
    When Arama kismina "cicekli elbise" yaz
    When Onerilen arama sonuclarindandan ilkine tikla
    When Arama sonucundaki urunlerden ilk urune tikla
    When Sepete ekle butonuna tikla
    Then Sepetim sayfasina yonlendirildigini kontrol et
    And Urun gozukuyormu kontrol et
