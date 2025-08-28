package util;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class ElementHelper {
    AppiumDriver driver;
    WebDriverWait wait;
    Actions action;

    public ElementHelper(AppiumDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.action = new Actions(driver);
    }

    public WebElement presenceElement(By key){
        return wait.until(ExpectedConditions.presenceOfElementLocated(key));
    }

    public WebElement findElement(By key){
        return presenceElement(key);
    }

    public void clickElement(By key){
        findElement(key).click();
    }

    public void sendKey(By key, String text){
        findElement(key).sendKeys(text);
    }

    public boolean isDisplayed(By key){
        return findElement(key).isDisplayed();
    }
}
