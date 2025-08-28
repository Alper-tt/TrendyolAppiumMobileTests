package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.cucumber.java.PendingException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

import java.util.List;

public class BaseMethods {
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
    By accountTab = MobileBy.id("trendyol.com:id/tab_account");
    By homeTab = MobileBy.id("trendyol.com:id/tab_home");
    By favroiteTab = MobileBy.id("trendyol.com:id/tab_favorites");
    By loginOrSignUpButton = MobileBy.AndroidUIAutomator("text(\"Giriş Yap / Üye Ol\")");
    By emailTextField = MobileBy.id("trendyol.com:id/editTextEmail");
    By passwordTextField = MobileBy.id("trendyol.com:id/editTextPassword");
    By continueButton = MobileBy.id("trendyol.com:id/buttonContinue");
    By loginButton = MobileBy.id("trendyol.com:id/buttonLogin");
    By loginPopupCloseButton = MobileBy.AndroidUIAutomator("resourceId(\"trendyol.com:id/imageViewTopArrow\")");
    By emailTextView = MobileBy.id("trendyol.com:id/textViewEmail");
    By genderSelectionDismissButton = MobileBy.AndroidUIAutomator("resourceId(\"GenderSelectionDismissButton\")");
    String email = "apesbleb@inctart.com";
    String password = "A123456789a";
    By changeLanguageDismiss = MobileBy.id("trendyol.com:id/touch_outside");
    By favoriteButton = MobileBy.id("trendyol.com:id/favorite_product_detail");
    By favoritedProduct = MobileBy.id("trendyol.com:id/favoriteCardView");

    public BaseMethods(AppiumDriver driver) {
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

    public void allowNotification() {
        elementHelper.clickElement(notifAllowButton);
    }

    public void typeSearchTerm(String text) {
        elementHelper.clickElement(searchBox);
        elementHelper.sendKey(searchBox, text);
    }

    public void clickSuggestedSearchTerm(int index) {
        List<WebElement> suggestedSearchTerms = driver.findElements(suggestedSearchTerm);
        suggestedSearchTerms.get(index).click();
    }

    public void clickProduct() {
        List<WebElement> productCars = driver.findElements(productCard);
        productCars.get(0).click();
    }

    public void clickAddCart() {
        elementHelper.clickElement(addCartButton);
        elementHelper.clickElement(addCartButton);
    }

    public void isCartPage() {
        if (elementHelper.presenceElement(guidePopup).isDisplayed()) {
            elementHelper.clickElement(guidePopup);
        }
        elementHelper.presenceElement(cartPageTitle);
    }

    public Boolean checkProductAtCart() {
        return elementHelper.isDisplayed(productLayout);
    }

    public void clickAccountTab() {
        elementHelper.clickElement(accountTab);
    }

    public void clickSigninOrSignup() {
        elementHelper.clickElement(loginOrSignUpButton);
    }

    public void typeEmail() {
        elementHelper.sendKey(emailTextField, email);
        elementHelper.clickElement(continueButton);

    }

    public void typePassword() {
        elementHelper.sendKey(passwordTextField, password);
    }

    public void clickLogin() {
        elementHelper.clickElement(loginButton);
    }

    public Boolean isLogin() throws InterruptedException {
        elementHelper.clickElement(loginPopupCloseButton);
        elementHelper.clickElement(genderSelectionDismissButton);
        return elementHelper.presenceElement(emailTextView).getText().equals(email);
    }

    public void clickHomeTab(){
        elementHelper.clickElement(homeTab);
        if(elementHelper.isDisplayed(loginPopupCloseButton)){
            elementHelper.clickElement(loginPopupCloseButton);
        }
        elementHelper.clickElement(changeLanguageDismiss);
    }

    public void clickFavoriteButton(){
        elementHelper.clickElement(favoriteButton);
        driver.navigate().back();
    }

    public void clickFavoriteTab(){
        elementHelper.clickElement(favroiteTab);
    }

    public boolean checkProductAtFavorites(){
        return elementHelper.findElement(favoritedProduct).isDisplayed();
    }
}

