package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.cucumber.java.PendingException;
import org.apache.commons.logging.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

import java.util.List;
import java.util.logging.LogManager;

public class TrendyolPage {
    WebDriverWait driverWait;
    AppiumDriver driver;
    ElementHelper elementHelper;

    By manGenderButton = MobileBy.id("trendyol.com:id/buttonSelectGenderMan");
    By womanGenderButton = MobileBy.id("trendyol.com:id/buttonSelectGenderWoman");
    By notifAllowButton = MobileBy.id("com.android.permissioncontroller:id/permission_allow_button");
    By searchBox = MobileBy.id("trendyol.com:id/editTextSearchView");
    By suggestedSearchTerm = MobileBy.AndroidUIAutomator("resourceId(\"trendyol.com:id/constraintLayoutItemSearchAutoComplete\")");
    By productCard = MobileBy.AndroidUIAutomator("resourceId(\"imageViewProduct\")");
    By addCartButton = MobileBy.id("trendyol.com:id/primaryButtonText");
    By cartPageTitle = MobileBy.id("trendyol.com:id/textViewCartTitle");
    By productLayout = MobileBy.id("trendyol.com:id/layoutCartProduct");
    By guidePopup = MobileBy.id("trendyol.com:id/tooltipView");
    By guideVerifiedSeller = MobileBy.AndroidUIAutomator("resourceId(\"trendyol.com:id/verified_seller_badge_onboarding_view\")");

    public TrendyolPage(AppiumDriver driver) {
        this.driver = driver;
        this.driverWait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }

    public void selectGender(String gender) {
        switch (gender) {
            case "erkek":
                elementHelper.clickElement(manGenderButton);
                break;
            case "kadin":
                elementHelper.clickElement(womanGenderButton);
                break;
            default:
                throw new PendingException();
        }
    }

    public void allowNotification(){
        elementHelper.clickElement(notifAllowButton);
    }

    public void typeSearchTerm(String text){
        elementHelper.clickElement(searchBox);
        elementHelper.sendKey(searchBox, text);
    }

    public void clickSuggestedSearchTerm(int index){
        List<WebElement> suggestedSearchTerms = driver.findElements(suggestedSearchTerm);
        suggestedSearchTerms.get(index).click();
    }

    public void clickProduct(){
        List<WebElement> productCars = driver.findElements(productCard);
        productCars.get(0).click();
    }

    public void clickAddCart(){
        elementHelper.clickElement(addCartButton);
        elementHelper.clickElement(addCartButton);
    }

    public void isCartPage(){
        if(elementHelper.presenceElement(guidePopup).isDisplayed()){
            elementHelper.clickElement(guidePopup);
        }
        elementHelper.presenceElement(cartPageTitle);
    }
    public void checkProductAtCart(){
        elementHelper.isDisplayed(productLayout);
    }
}
