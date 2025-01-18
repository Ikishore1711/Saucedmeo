package org.selfPractice;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitStatement {

    public static void main(String[] args) {


        // Create a WebDriver instance
        WebDriver driver = new ChromeDriver();

        // Set implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Navigate to the webpage
        driver.get("https://www.qafeast.com/demo"); // Replace with the actual URL
        driver.findElement(By.xpath("//label[text()='Loading']")).click();
        driver.findElement(By.xpath("//button[@onclick='move()']")).click();


        // Find the element using explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='100%']")));
        WebElement elementToClick = driver.findElement(By.xpath("//button[@onclick='myloaderFunction()']"));


//         Perform JavascriptExecutor on the element
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", elementToClick);


//            // Find the element where you want to send keys
//            WebElement elementToSendKeys = driver.findElement(By.name("myElementName"));
//
//            // Send keys to the element using JavaScriptExecutor
//            executor.executeScript("arguments[0].value = 'some text';", elementToSendKeys);


        driver.findElement(By.xpath("//label[text()='Scrolling']")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 500);");

        // Scroll right by 300 pixels horizontally
        js.executeScript("window.scrollBy(300, 0);");



//        WebElement element1 = driver.findElement(By.id("scrollingwrap-box"));
//
//        // Scroll to the element
//        js.executeScript("arguments[0].scrollIntoView(true);", element1);

//            Close the browser
//            driver.quit();

    }
}

