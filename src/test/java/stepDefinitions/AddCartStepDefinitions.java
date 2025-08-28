package stepDefinitions;

import io.appium.java_client.MobileBy;
import pages.TrendyolPage;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import util.DriverFactory;

public class AddCartStepDefinitions {
    TrendyolPage trendyolPage = new TrendyolPage(DriverFactory.getDriver());

    @When("Cinsiyet olarak kadin sec")
    public void cinsiyetOlarakKadinSec() {
        trendyolPage.selectGender("kadin");
    }

    @When("Bildirim izin popup'indan allow sec")
    public void bildirimIzinPopupIndanAllowSec() {
        trendyolPage.allowNotification();
    }

    @When("Arama kismina cicekli elbise yaz")
    public void aramaKisminaCicekliElbiseYaz() {
        trendyolPage.typeSearchTerm("çiçekli elbise");
    }

    @When("Onerilen arama sonuclarindandan ilkine tikla")
    public void onerilenAramaSonuclarindandanIlkineTikla() {
        trendyolPage.clickSuggestedSearchTerm(3);
    }

    @When("Arama sonucundaki urunlerden ilk urune tikla")
    public void aramaSonucundakiUrunlerdenIlkUruneTikla() {
        trendyolPage.clickProduct();
    }

    @When("Sepete ekle butonuna tikla")
    public void sepeteEkleButonunaTikla() {
        trendyolPage.clickAddCart();
    }

    @Then("Sepetim sayfasina yonlendirildigini kontrol et")
    public void sepetimSayfasinaYonlendirildiginiKontrolEt() {
        trendyolPage.isCartPage();
    }

    @And("Urun gozukuyormu kontrol et")
    public void urunGozukuyormuKontrolEt() {
        trendyolPage.checkProductAtCart();
    }
}
