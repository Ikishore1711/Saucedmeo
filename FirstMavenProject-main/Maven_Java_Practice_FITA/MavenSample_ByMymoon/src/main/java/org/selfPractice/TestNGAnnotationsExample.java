package org.selfPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TestNGAnnotationsExample {

    private WebDriver driver;

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("BeforeSuite: This method executes once before all tests in the suite.");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("BeforeTest: This method executes before each test method in the current test class.");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("BeforeClass: This method executes once before all test methods in the current class.");
    }

    @BeforeMethod
    public void beforeMethod() {
        driver = new ChromeDriver();
        System.out.println("BeforeMethod: This method executes before each test method.");
    }

    @Test
    public void test1() {
        System.out.println("Test 1 is executing.");
        driver.get("https://www.google.com");
    }

    @Test
    public void test2() {
        System.out.println("Test 2 is executing.");
        driver.get("https://www.amazon.com");
    }
    @Test
    public void test3() {
        System.out.println("Test 2 is executing.");
        driver.get("https://www.qafeast.com/demo");
    }

    @AfterMethod
    public void afterMethod() {
        driver.quit();
        System.out.println("AfterMethod: This method executes after each test method.");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("AfterClass: This method executes once after all test methods in the current class.");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("AfterTest: This method executes after each test method in the current test class.");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("AfterSuite: This method executes once after all tests in the suite.");
    }
}