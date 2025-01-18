package org.selfPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenAndCloseBrowser {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.qafeast.com/demo");
        driver.manage().window().maximize();
        Thread.sleep(4000);

        WebElement TextboxSection = driver.findElement(By.xpath("//label[text()='Textbox']"));
        TextboxSection.click();
        WebElement firstInput =  driver.findElement(By.id("editabletext"));
        firstInput.sendKeys("Mymoon");
//        driver.quit();
}
}
