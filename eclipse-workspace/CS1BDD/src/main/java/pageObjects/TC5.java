package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC5 extends AbstractTC{


    By searchbar = By.xpath("//*[@id=\"search\"]");
    
    public TC5(WebDriver driver){
    	super(driver);
    }

    public WebElement SearchBar(){
        return driver.findElement(searchbar);
    }


}
