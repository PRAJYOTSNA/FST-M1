package activities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Activity4 {

    //https://play.google.com/store/apps/details?id=com.google.android.apps.tasks

    AndroidDriver driver;
    WebDriverWait wait;
    @BeforeClass
    public void setUp() throws MalformedURLException {

        UiAutomator2Options caps = new UiAutomator2Options();
        caps.setPlatformName("android");
        caps.setAutomationName("UiAutomator2");
        caps.setAppPackage("com.google.android.keep");
        caps.setAppActivity(".activities.BrowseActivity");
        caps.noReset();

        URL serverURL = new URL("http://localhost:4723/wd/hub");

        driver = new AndroidDriver(serverURL,caps);
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));

       // driver.get("https://play.google.com/store/apps/details?id=com.google.android.apps.tasks");


    }

    @Test
    public void googleTest(){

        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("New text note")));
        driver.findElement(AppiumBy.accessibilityId("New text note")).click();

        driver.findElement(AppiumBy.id("editable_title")).sendKeys("Anime");

        driver.findElement(AppiumBy.id("edit_note_text")).sendKeys("Naruto\n The Death Note\n One Piece");

        driver.findElement(AppiumBy.accessibilityId("Navigate up")).click();

        String title=driver.findElement(AppiumBy.id("index_note_title")).getText();

        Assert.assertEquals("Anime",title);



    }


}
