package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC6 extends AbstractTC{


    By searchbar = By.xpath("//*[@id=\"search\"]");
    
    public TC6(WebDriver driver){
    	super(driver);
    }

    public WebElement Searchbar(){
        return driver.findElement(searchbar);
    }
}
