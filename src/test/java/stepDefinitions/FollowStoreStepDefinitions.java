package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.BaseMethods;
import util.DriverFactory;

public class FollowStoreStepDefinitions {
    BaseMethods baseMethods = new BaseMethods(DriverFactory.getDriver());

    @When("Arama kismindaki sonuclardan magaza olana tikla")
    public void aramaKismindakiSonuclardanMagazaOlanaTikla() {
        baseMethods.clickStoreAtSearchResults();
    }

    @When("Takip et butonuna tıkla")
    public void takipEtButonunaTıkla() {
        baseMethods.clickFollowButton();
    }

    @Then("Magaza takip edilme durmunu kontrol et")
    public void magazaTakipEdilmeDurmunuKontrolEt() {
        Assert.assertTrue(baseMethods.checkFollowStatus());
    }

}
