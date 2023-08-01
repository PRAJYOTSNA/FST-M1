package activities;


import io.appium.java_client.AppiumBy;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import static examples.ActionsBase.doSwipe;

public class Activity3 {

    AndroidDriver driver;
    WebDriverWait wait;
    @BeforeClass
    public void setUp() throws MalformedURLException {

        UiAutomator2Options caps = new UiAutomator2Options();
        caps.setPlatformName("android");
        caps.setAutomationName("UiAutomator2");
        caps.setAppPackage("com.android.chrome");
        caps.setAppActivity("com.google.android.apps.chrome.Main");
        caps.noReset();

        URL serverURL = new URL("http://localhost:4723/wd/hub");

        driver = new AndroidDriver(serverURL,caps);
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        driver.get("https://www.training-support.net/selenium");



    }

    @Test
    public void appTest(){

        Dimension dim = driver.manage().window().getSize();

        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.xpath("//android.widget.Button[@text='Get Started!']")));

        Point start = new Point((int)(dim.getWidth()*0.5), (int)(dim.getHeight()*0.9));
        Point end = new Point((int)(dim.getWidth()*0.5), (int)(dim.getHeight()*0.4));
        doSwipe(driver,start,end,200);
        doSwipe(driver,start,end,200);

        wait.until(ExpectedConditions.elementToBeClickable(
                AppiumBy.xpath("//android.view.View[contains(@text,'To-Do List')]"))).click();

        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.xpath("//android.widget.EditText[@resource-id='taskInput']")));

        driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id='taskInput']")).sendKeys("Read");
        driver.findElement(AppiumBy.xpath("//android.widget.Button[@text()='Add Task']")).click();
        driver.findElement(AppiumBy.id("taskInput")).sendKeys("Write");
        driver.findElement(AppiumBy.xpath("//android.widget.Button[@text()='Add Task']")).click();
        driver.findElement(AppiumBy.id("taskInput")).sendKeys("Revise");
        driver.findElement(AppiumBy.xpath("//android.widget.Button[@text()='Add Task']")).click();


        List<WebElement> l = driver.findElements(AppiumBy.xpath("//android.view.View"));
        System.out.println(l.size());

        Assert.assertEquals(l.size(),4);

        driver.findElement(AppiumBy.xpath("//android.view.TextView[@text='Clear List']")).click();


    }







}
