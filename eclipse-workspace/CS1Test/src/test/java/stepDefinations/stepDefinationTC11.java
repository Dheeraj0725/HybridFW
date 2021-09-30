package stepDefinations;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import pageObjects.TC1;
import pageObjects.TC2;
import resources.Base;

@RunWith(Cucumber.class)
public class stepDefinationTC11 extends Base {
	public static Logger log = LogManager.getLogger(Base.class.getName());

    public WebElement Popup() {
        By closePop = By.xpath("//*[@id=\"authentication_popup\"]/div[1]/div/div[2]/a[1]");
        return driver.findElement(closePop);
    }
    public void Storiesbutton() {
        TC2 test2 = new TC2(driver);
        test2.StoryEle().click();
    }

    @Given("^initialize browser$")
    public void initialize_browser() throws Throwable {
        driver = initializeDriver();// initializing driver
        driver.get(prop.getProperty("url"));// getting required url
        log.info("Home page started");
    }

    @Given("^navigate to url$")
    public void navigate_to_url() throws Throwable {
        driver.get(prop.getProperty("url"));// getting required url
        log.info("url initialized");
    }

    @Given("^handle popup$")
    public void handle_popup() throws Throwable {
    	
        log.info("Starting test case 1");
        Popup();
    }

    @Then("^scroll untill stories is visible$")
    public void scroll_untill_stories_is_visible() throws Throwable {
        TC1 tcase1 = new TC1(driver);
        Popup();
        log.info("pop up closed");

        //scrolling
        WebElement element = tcase1.StroryElement();
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(3000);
        log.info("page scrolled");
        log.info("tc1 passed");
    }

    @Then("^close browser$")
    public void close_browser() throws Throwable {
        driver.quit();
        driver=null;
}
}
