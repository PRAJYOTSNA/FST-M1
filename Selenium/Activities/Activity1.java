package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"NULL");
        driver.get("https://www.training-support.net");
        Thread.sleep(5000);

        String s = driver.getTitle();
        System.out.println("Page Title:" +s);

        driver.findElement(By.id("about-link")).click();
        Thread.sleep(1000);

        String s1 = driver.getTitle();
        System.out.println("Title of next page:" +s1);


        driver.quit();
    }
}
