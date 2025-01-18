package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FirstPage extends BasePage {
    public FirstPage(WebDriver driver) {
        super(driver);
    }

    public void isVisible(By locator) {
        super.isVisible(locator);
    }

    public void username() {
        enterText(By.id("user-name"), "standard_user");
    }

    public void password() {
        enterText(By.id("password"), "secret_sauce");
    }

    public void loginButton() {
        click(By.id("login-button"));
    }

    public void addToCart() {
click(By.name("add-to-cart-sauce-labs-backpack"));

    }
    public void yourCart(){
        click(By.xpath("//span[@class='shopping_cart_badge']"));
    }

public void checkOut(){
        click(By.name("checkout"));
}
public void firstName(){
        enterText(By.id("first-name"),"Kishore");
        enterText(By.id("last-name"),"Kumar");
       enterText(By.id("postal-code"),"123");

}
public void continueTo(){

        click(By.id("continue"));
    }
public void finish(){

    click(By.id("finish"));

}
public void thankYou(){
  text(By.xpath("//h2[@class='complete-header']"));
}

}
