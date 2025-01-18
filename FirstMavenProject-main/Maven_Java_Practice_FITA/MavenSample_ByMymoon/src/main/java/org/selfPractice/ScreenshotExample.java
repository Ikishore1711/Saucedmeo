package org.selfPractice;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class ScreenshotExample {

    public static void main(String[] args) throws IOException {


        // Create a WebDriver instance
        WebDriver driver = new ChromeDriver();

        // Navigate to a webpage
        driver.get("https://www.qafeast.com");

        // Take a screenshot
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        // Save the screenshot to a file
        File destFile = new File("C:\\Users\\My-Moon\\Desktop\\Screenshots\\screenshot1.png");
        FileUtils.copyFile(screenshotFile, destFile);

        // Close the browser
//        driver.quit();

        System.out.println("Screenshot saved successfully!");
    }

}

//Explanation:
//1. File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//
//((TakesScreenshot) driver): This part casts the driver object (which is of type WebDriver) to the TakesScreenshot interface.
//
//The TakesScreenshot interface provides the method getScreenshotAs() which is used to capture the screenshot.
//.getScreenshotAs(OutputType.FILE);: This method call captures the screenshot of the currently displayed webpage.
//
//OutputType.FILE specifies that the screenshot should be captured in the form of a File object.
//File screenshotFile = ...;: This line assigns the captured screenshot data (in the form of a File object) to the variable screenshotFile.
//
//        2. File destFile = new File("C:\\Users\\My-Moon\\Desktop\\Screenshots\\screenshot.png");
//
//new File("C:\\Users\\My-Moon\\Desktop\\Screenshots\\screenshot.png");: This line creates a new File object named destFile.
//The path within the quotes specifies the desired destination for the screenshot.
//In this case, it's a path within the user's "My Documents" folder under "Screenshots".
//        3. FileUtils.copyFile(screenshotFile, destFile);
//
//This line uses the FileUtils class (from the Apache Commons IO library) to
// copy the contents of the screenshotFile (the captured screenshot) to the destFile (the specified destination).