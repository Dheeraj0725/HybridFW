package pageObjects;

        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;

public class TC2 extends AbstractTC{

    By source = By.xpath("//*[@id=\"testicontainer\"]/div[2]/div[3]/a");
    By storyEle = By.xpath("//*[@id=\"home\"]/div[1]/div[4]/div[4]/div[3]/a");
    By btn = By.linkText("View all Customer Stories");

    public TC2(WebDriver driver) {
        super(driver);
    }

    public WebElement StoryEle() {
        return driver.findElement(storyEle);
    }

    public WebElement Btn() {
        return driver.findElement(btn);
    }

    public WebElement sorce() {
        return driver.findElement(source);
    }
}
