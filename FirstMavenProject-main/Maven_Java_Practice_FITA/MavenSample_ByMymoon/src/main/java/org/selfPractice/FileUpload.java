package org.selfPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {



            public static void main(String[] args) {


                // Create a WebDriver instance
                WebDriver driver = new ChromeDriver();

                // Navigate to the file upload page
                driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_fileupload");

                // Switch to the iframe
                driver.switchTo().frame("iframeResult");

                // Locate the file upload input element
                WebElement uploadElement = driver.findElement(By.id("myFile"));

                // Specify the path to the file you want to upload
                String filePath = "C:\\Users\\My-Moon\\Downloads\\test_link_template.txt";

                // Send the file path to the upload element
                uploadElement.sendKeys(filePath);

                // Close the browser
                driver.quit();
            }
        }


