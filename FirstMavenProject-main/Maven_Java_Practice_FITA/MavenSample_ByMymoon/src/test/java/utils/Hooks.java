package utils;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Hooks extends Driver {
    @Test
    @BeforeClass
    public void setUp(){
        driver = this.setDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
    }

    @AfterClass
    public void close(){
 // driver.quit();

}}
