package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC11 extends AbstractTC{

	
	By study = By.xpath("//*[@id=\"topnav_wrapper\"]/ul/li[6]/span");
	By wishlist = By.xpath("//*[@id=\"content\"]/div[4]/div/ul/li[1]/div/div[6]/span[2]");
	By studyTable = By.xpath("//*[@id=\"topnav_wrapper\"]/ul/li[6]/div/div/ul/li[1]/ul/li[1]");
	By element = By.xpath("//*[@id=\"content\"]/div[4]/div/ul/li[1]");
	
	public TC11(WebDriver driver) {
		super(driver);
	}
	
	public WebElement Study() {
		return driver.findElement(study);
	}
	
	public WebElement Table() {
		return driver.findElement(studyTable);
	}
	
	public WebElement WishList() {
		return driver.findElement(wishlist);
	}
	
	public WebElement Ele() {
		return driver.findElement(element);
	}
	
	
}
