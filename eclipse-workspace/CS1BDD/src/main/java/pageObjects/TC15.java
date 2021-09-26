package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC15 extends AbstractTC{
    By storesBtn = By.xpath("//*[@id=\"header\"]/section/div/ul[2]/li[1]/a");
    By puneStore = By.xpath("//*[@id=\"app-container\"]/div/main/section[2]/div/a[1]/div[2]/button");
    By mapsBtn = By.xpath("//*[@id=\"store-details\"]/div[4]/div[1]/div[5]/a");

    public TC15(WebDriver driver) {
        super(driver);
    }

    public WebElement StoresButton() {
        return driver.findElement(storesBtn);
    }

    public WebElement PuneStore(){
        return driver.findElement(puneStore);
    }

    public WebElement Maps(){
        return driver.findElement(mapsBtn);
    }
}

