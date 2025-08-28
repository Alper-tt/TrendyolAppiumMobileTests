package stepDefinitions;

import io.cucumber.java.en.When;
import pages.BaseMethods;
import util.DriverFactory;

public class BaseStepDefinitions {
    BaseMethods baseMethods = new BaseMethods(DriverFactory.getDriver());

    @When("Cinsiyet olarak kadin sec")
    public void cinsiyetOlarakKadinSec() {
        baseMethods.selectGender("kadin");
    }

    @When("Bildirim izin popup'indan allow sec")
    public void bildirimIzinPopupIndanAllowSec() {
        baseMethods.allowNotification();
    }
}
