package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class HRMActivity9 {

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
    public void retrieveEmergencyContacts() throws InterruptedException {

        driver.findElement(By.id("txtUsername")).sendKeys("orange");
        driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");

        driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
        Thread.sleep(3000);

        driver.findElement(By.linkText("My Info")).click();
         Thread.sleep(3000);

        driver.findElement(By.partialLinkText("Emergency")).click();
        Thread.sleep(2000);

        WebElement tab = driver.findElement(By.id("emgcontact_list"));
        List<WebElement> headings = driver.findElements(By.xpath("//*[@id='emgcontact_list']/thead/tr/th"));

        List<WebElement> cells= driver.findElements(By.xpath("//*[@id='emgcontact_list']/tbody/tr/td"));

            for(WebElement head: headings){
                System.out.println(head.getText());
            }
            for(WebElement cell: cells){
                System.out.println(cell.getText());
            }

    }

    @AfterMethod
    public void afterMath(){
        driver.quit();
    }



}
