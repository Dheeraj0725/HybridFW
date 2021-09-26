package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC3 extends AbstractTC{

	
	By image = By.xpath("//*[@id=\"testicontainer\"]/div[1]/div[1]");
	By close = By.xpath("//*[@id=\"qkview\"]/div");
	
	public TC3(WebDriver driver) {
		super(driver);
	}
	
	public WebElement Image() {
		return driver.findElement(image);
	}

	public WebElement Close() {
		return driver.findElement(close);
	}
}
