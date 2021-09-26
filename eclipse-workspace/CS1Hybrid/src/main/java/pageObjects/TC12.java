package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC12 extends AbstractTC{


    By order = By.xpath("//*[@id=\"header\"]/section/div/ul[1]/li[2]/a");

    By login = By.xpath("//*[@id=\"app-container\"]/div/main/section/form[2]/button");
    //By email = By.xpath("//*[@id=\"spree_user_email\"]");
    //By pswd = By.xpath("//*[@id=\"spree_user_password\"]");

    By email = By.id("spree_user_email");
    By pswd = By.id("spree_user_password");
    public TC12(WebDriver driver) {
    	super(driver);
    }

    public WebElement Order() {
        return driver.findElement(order);
    }

    public WebElement Login() {
        return driver.findElement(login);
    }

    public WebElement Email() {
        return driver.findElement(email);
    }

    public WebElement Pswd() {
        return driver.findElement(pswd);
    }






}
