package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC7 extends AbstractTC{


    By searchbar = By.xpath("//*[@id=\"search\"]");

    public TC7(WebDriver driver){
    	super(driver);
    }

    public WebElement searchBar(){
        return driver.findElement(searchbar);
    }
}
