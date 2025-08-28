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

    @When("Arama kismina yazlik tisort yaz")
    public void aramaKisminaCicekliElbiseYaz() {
        baseMethods.typeSearchTerm("yazlik tisort");
    }

    @When("Onerilen arama sonuclarindandan ilkine tikla")
    public void onerilenAramaSonuclarindandanIlkineTikla() {
        baseMethods.clickSuggestedSearchTerm(3);
    }

    @When("Arama sonucundaki urunlerden ilk urune tikla")
    public void aramaSonucundakiUrunlerdenIlkUruneTikla() {
        baseMethods.clickProduct();
    }
}
