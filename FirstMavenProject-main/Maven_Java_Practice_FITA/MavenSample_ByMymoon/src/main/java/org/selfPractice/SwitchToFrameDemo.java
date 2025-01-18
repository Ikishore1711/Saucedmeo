package org.selfPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToFrameDemo {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        // Navigate to the QA Feast demo page
        driver.get("https://www.qafeast.com/demo");
        driver.findElement(By.xpath("//li[@data-number='11']")).click();

        // Identify the frame element using its name or ID
        WebElement inputField = driver.findElement(By.id("tiny-frame"));
        inputField.sendKeys("Mymoon");

         WebElement firstFrameElement = driver.findElement(By.name("frame-top"));
        // Switch the focus to the frame
        driver.switchTo().frame(firstFrameElement);




        // Switch back to the main window (optional)
        driver.switchTo().defaultContent();

        // Close the browser
        driver.quit();
    }
}