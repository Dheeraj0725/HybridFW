package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC9 extends AbstractTC{


    By sofabtn = By.xpath("//*[@id=\"content\"]/div[3]/div/div[2]/a[1]");
    By wooden = By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div[3]/div/a[1]/img");
    By checkbox = By.xpath("//*[@id=\"filters_availability_In_Stock_Only\"]");
    By price = By.className("gname");
    By selprice = By.xpath("//*[@id=\"price_limit_29593-49806\"]");
    By recommend = By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div/div/div/div[2]");
    //By lowToHigh = By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div/div/div/div[2]/div[2]/div/div/ul/li[2]");
    By lowToHigh = By.cssSelector("li[data-key='price_asc']");

    public TC9(WebDriver driver){
    	super(driver);
    }

    public WebElement SofaBtn(){
        return driver.findElement(sofabtn);
    }

    public WebElement Wooden(){
        return driver.findElement(wooden);
    }

    public WebElement Check(){
        return driver.findElement(checkbox);
    }

    public WebElement Price(){
        return driver.findElement(price);
    }

    public WebElement SelPrice(){
        return driver.findElement(selprice);
    }
    
    public WebElement RecButton(){
        return driver.findElement(recommend);
    }
    
    public WebElement PriceSelect(){
        return driver.findElement(lowToHigh);
    }
}
