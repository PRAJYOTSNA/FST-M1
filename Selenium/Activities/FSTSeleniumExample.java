package examples;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FSTSeleniumExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        //all the logs are added to a new NULL file
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"NULL");
        driver.get("https://www.training-support.net");
        Thread.sleep(5000);

        driver.quit();


    }
}
