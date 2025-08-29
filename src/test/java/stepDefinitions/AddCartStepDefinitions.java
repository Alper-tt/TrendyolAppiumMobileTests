package stepDefinitions;

import org.testng.Assert;
import pages.BaseMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import util.DriverFactory;

public class AddCartStepDefinitions {
    BaseMethods baseMethods = new BaseMethods(DriverFactory.getDriver());

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
        Assert.assertTrue(baseMethods.checkProductAtCart());
    }
}
