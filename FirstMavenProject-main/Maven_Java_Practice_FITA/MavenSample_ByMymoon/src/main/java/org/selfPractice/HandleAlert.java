package org.selfPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleAlert {

    public static void main(String[] args) {
        // Create a WebDriver instance
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to the webpage that triggers the alert (replace with your actual URL)
            driver.get("https://www.qafeast.com/demo");
            driver.manage().window().maximize();
            //Redirect to the Context menu page
            driver.findElement(By.xpath("//li[@data-number='9']")).click();


            // Trigger the alert (e.g., by clicking a button)
            WebElement checkedBox = driver.findElement(By.id("hot-spot"));


            //Action class to handle Right click
            Actions action = new Actions(driver);
            action.contextClick(checkedBox).build().perform();

            // Switch to the alert
            Alert alert = driver.switchTo().alert();

            // Handle the alert based on its type
            String alertText = alert.getText();
            System.out.println("Alert Text: " + alertText);

            // Accept the alert (click "OK")
            alert.accept();

            // Dismiss the alert (click "Cancel")
            // alert.dismiss();

            // For prompt alerts, send input
            // alert.sendKeys("Your Input");
            // alert.accept();

            // Close the browser
            // driver.quit();

        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        } finally {
            // Close the browser if it was opened
            if (driver != null) {
//                driver.quit();
            }
        }

    }
}

