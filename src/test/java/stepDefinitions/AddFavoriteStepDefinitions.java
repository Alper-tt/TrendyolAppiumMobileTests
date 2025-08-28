package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.BaseMethods;
import util.DriverFactory;

public class AddFavoriteStepDefinitions {
    BaseMethods baseMethods = new BaseMethods(DriverFactory.getDriver());

    @When("Anasayfa'ya git")
    public void anasayfayaGit(){
        baseMethods.clickHomeTab();
    }

    @When("Urunu favoriye ekle")
    public void urunuFavoriyeEkle(){
        baseMethods.clickFavoriteButton();
    }

    @When("Favoriler sayfasina git")
    public void favorilerSayfasinaGit() {
        baseMethods.clickFavoriteTab();
    }

    @Then("Urun favoriye eklenmismi kontrol et")
    public void urunFavoriyeEklenmismiKontrolEt() {
        Assert.assertTrue(baseMethods.checkProductAtFavorites());
    }
}
