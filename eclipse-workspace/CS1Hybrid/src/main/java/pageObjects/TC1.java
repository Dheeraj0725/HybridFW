package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC1 extends AbstractTC{
	
	
	
	By closePop = By.xpath("//*[@id=\"authentication_popup\"]/div[1]/div/div[2]/a[1]");
	By storyEle = By.xpath("//*[@id=\"home\"]/div[1]/div[4]/div[4]/div[3]/a");
	
	
	public TC1(WebDriver driver) {
		super(driver);
	}
	
	public WebElement Popup() {
		return driver.findElement(closePop);
	}
	
	public WebElement StroryElement() {
		return driver.findElement(storyEle);
	}
	

}
