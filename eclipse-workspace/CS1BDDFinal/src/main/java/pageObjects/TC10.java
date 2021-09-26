package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC10 extends AbstractTC{


	By searchbar = By.xpath("//*[@id=\"search\"]");
	By assertCheck = By.xpath("//*[@id=\"search-results\"]/div[1]/h2/span");
	By ele1 = By.xpath("//*[@id=\"search-results\"]/div[3]/ul/li[1]/div/a[1]");
	By ele2 = By.xpath("//*[@id=\"search-results\"]/div[3]/ul/li[2]");
	By comp1 = By.xpath("//*[@id=\"search-results\"]/div[3]/ul/li[1]/div/div[5]/a[1]");
	By comp2 = By.xpath("//*[@id=\"search-results\"]/div[3]/ul/li[2]/div/div[5]/a[1]");
	By compareBtn = By.xpath("//*[@id=\"compare-cta\"]");
	By AddCart = By.xpath("//*[@id=\"comparator-modal\"]/div/div[2]/div[1]/div[2]/div[3]/a[2]");
	By add = By.xpath("//*[@id=\"add-to-cart-button\"]");

	public TC10(WebDriver driver) {
		super(driver);
	}

	public WebElement Add() {
		return driver.findElement(add);
	}
	
	public WebElement compareBtn() {
		return driver.findElement(compareBtn);
	}
	
	public WebElement searchBar() {
		return driver.findElement(searchbar);
	}

	public WebElement assertChecki() {
		return driver.findElement(assertCheck);
	}
	
	public WebElement Ele1() {
		return driver.findElement(ele1);
	}
	
	public WebElement Ele2() {
		return driver.findElement(ele2);
	}

	public WebElement Comp1() {
		return driver.findElement(comp1);
	}

	public WebElement Comp2() {
		return driver.findElement(comp2);
	}
	
	public WebElement AddToCart() {
		return driver.findElement(AddCart);
	}
}
