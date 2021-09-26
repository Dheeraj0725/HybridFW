package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC13 extends AbstractTC{
    
    //By chat = By.xpath("//*[@id=\"ember3\"]/div[2]/div[1]");
    //By giftcard = By.xpath("//*[@id=\"ember531\"]/div/div[2]/div[1]/ul/li[6]/div");
    By giftcard = By.xpath("//*[@id=\"header\"]/section/div/ul[2]/li[3]/a");
    By house = By.xpath("//*[@id=\"app-container\"]/div/main/section/section[1]/ul/li[2]");
    By btn = By.xpath("//*[@id=\"app-container\"]/div/main/section/section[1]/ul/li[2]/div/div/button");
    By cost = By.xpath("//*[@id=\"app-container\"]/div/main/section/section[2]/div/section[2]/div[1]/button[2]");
    By next = By.xpath("//*[@id=\"app-container\"]/div/main/section/section[2]/div/section[2]/button");


    public TC13(WebDriver driver) {
    	super(driver);
    }

    public WebElement GiftCard(){
        return driver.findElement(giftcard);
    }

    public WebElement HouseWarm(){
        return driver.findElement(house);
    }

    public WebElement Button(){
        return driver.findElement(btn);
    }

    public WebElement Cost(){
        return driver.findElement(cost);
    }

    public WebElement Next(){
        return driver.findElement(next);
    }

}
