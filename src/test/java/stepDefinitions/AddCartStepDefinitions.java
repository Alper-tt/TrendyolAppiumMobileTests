package stepDefinitions;

import pages.BaseMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import util.DriverFactory;

public class AddCartStepDefinitions {
    BaseMethods baseMethods = new BaseMethods(DriverFactory.getDriver());

    @When("Arama kismina cicekli elbise yaz")
    public void aramaKisminaCicekliElbiseYaz() {
        baseMethods.typeSearchTerm("çiçekli elbise");
    }

    @When("Onerilen arama sonuclarindandan ilkine tikla")
    public void onerilenAramaSonuclarindandanIlkineTikla() {
        baseMethods.clickSuggestedSearchTerm(3);
    }

    @When("Arama sonucundaki urunlerden ilk urune tikla")
    public void aramaSonucundakiUrunlerdenIlkUruneTikla() {
        baseMethods.clickProduct();
    }

    @When("Sepete ekle butonuna tikla")
    public void sepeteEkleButonunaTikla() {
        baseMethods.clickAddCart();
    }

    @Then("Sepetim sayfasina yonlendirildigini kontrol et")
    public void sepetimSayfasinaYonlendirildiginiKontrolEt() {
        baseMethods.isCartPage();
    }

    @And("Urun gozukuyormu kontrol et")
    public void urunGozukuyormuKontrolEt() {
        baseMethods.checkProductAtCart();
    }
}
