package test;
import org.testng.annotations.Test;
import pages.FirstPage;
import utils.Hooks;

public class FirstTest extends Hooks {
    @Test
    public  void loginTest(){
        FirstPage firstPage = new FirstPage(driver);
        firstPage.username();
        firstPage.password();
        firstPage.loginButton();
        firstPage.addToCart();
        firstPage.yourCart();
        firstPage.checkOut();
        firstPage.firstName();
        firstPage.continueTo();
        firstPage.finish();
        firstPage.thankYou();


    }

}
