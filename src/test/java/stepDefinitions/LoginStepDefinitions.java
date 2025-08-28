package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import org.testng.asserts.Assertion;
import pages.BaseMethods;
import util.DriverFactory;

public class LoginStepDefinitions {
    BaseMethods baseMethods = new BaseMethods(DriverFactory.getDriver());

    @When("Hesabim sayfasina tikla")
    public void hesabimSayfasinaTikla() {
        baseMethods.clickAccountTab();
    }

    @When("Giris yap Uye ol butonuna tikla")
    public void girisYapUyeOlButonunaTikla() {
        baseMethods.clickSigninOrSignup();
    }

    @And("Kullanici eposta gir")
    public void kullaniciEpostaGir() {
        baseMethods.typeEmail();
    }

    @And("Kullanici sifre gir")
    public void kullaniciSifreGir() {
        baseMethods.typePassword();
    }

    @And("Giris yap butonuna tıkla")
    public void girisYapButonunaTıkla() {
        baseMethods.clickLogin();
    }

    @Then("Hesaba giris yapildigini kontrol et")
    public void hesabaGirisYapildiginiKontrolEt() throws InterruptedException {
        Assert.assertTrue(baseMethods.isLogin());
    }

}
