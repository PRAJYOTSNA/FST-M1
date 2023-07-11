package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HRMActivity3 {
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
    public void Login() throws InterruptedException {

        driver.findElement(By.id("txtUsername")).sendKeys("orange");
        driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");

        driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
        Thread.sleep(3000);


        String str= driver.findElement(By.xpath("//a[@id='welcome']")).getText();
        Assert.assertTrue(str.contains("Welcome"),"Couldn't Navigate to HomeScreen");


    }

    @AfterMethod
    public void afterMath(){
        driver.quit();
    }



}
