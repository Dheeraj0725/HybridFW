package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC4 extends AbstractTC{

	
	By prodImg = By.xpath("//*[@id=\"testiqkview\"]/div/div/li[2]/div/div[2]/div/div[1]/a");
	
	public TC4(WebDriver driver) {
		super(driver);
	}
	
	public WebElement ImageProduct() {
		return driver.findElement(prodImg);
	}
	By image = By.xpath("//*[@id=\"testicontainer\"]/div[1]/div[1]");
	By close = By.xpath("//*[@id=\"qkview\"]/div");
	
	public WebElement Image() {
		return driver.findElement(image);
	}

	public WebElement Close() {
		return driver.findElement(close);
	}

}
