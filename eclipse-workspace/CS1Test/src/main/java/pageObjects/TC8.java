package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC8 extends AbstractTC{


    By delLocation = By.xpath("//*[@id=\"footer\"]/div[3]/div[5]/div/div[2]/a");
    By location = By.xpath("//*[@id=\"content\"]/div[1]/div/div/div[19]/div[2]/a[5]");
    By assrt = By.xpath("//*[@id=\"content\"]/div[1]/div[1]/div/h1");

    public TC8(WebDriver driver){
    	super(driver);
    }

    public WebElement More(){
        return driver.findElement(delLocation);
    }

    public WebElement locationClick(){
        return driver.findElement(location);
    }

    public WebElement AssertChecking(){
        return driver.findElement(assrt);
    }

}
