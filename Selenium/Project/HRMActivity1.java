package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class HRMActivity1 {

    WebDriver driver;

    @BeforeMethod
    public void preRequisite() throws InterruptedException {

        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"NULL");
        driver.get("http://alchemy.hguy.co/orangehrm");
        Thread.sleep(5000);

    }

    @Test
    public void fetchPageTitle(){

        String expected = "OrangeHRM";
        String actual = driver.getTitle();
        Assert.assertEquals(expected,actual);

    }

    @AfterMethod
    public void afterMath(){
        driver.quit();
    }


}
