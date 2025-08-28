package util;

import io.appium.java_client.AppiumDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.testng.*;

import java.util.Properties;


public class Hooks {
    AppiumDriver driver;
    Properties properties;

    @Before
    public void before(){
        String browser = "Android";
        properties = ConfigReader.initializeProperties();
        driver = DriverFactory.initializeDriver(browser);
    }

    @After
    public void after(){
        driver.quit();
    }
}
