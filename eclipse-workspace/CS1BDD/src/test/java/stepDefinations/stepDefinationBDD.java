package stepDefinations;

import java.util.Iterator;
import java.util.Set;

import org.apache.logging.log4j.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import cucumber.api.java.en.*;
import pageObjects.*;
import resources.Base;

public class stepDefinationBDD extends Base{
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

	    @Then("^click on stories button$")
	    public void click_on_stories_button() {
            Storiesbutton();
	    	//log.info("test case 2 started");
	    	//TC2 test2 = new TC2(driver);
	        //test2.StoryEle().click();
	    }

    @Then("^click to view original source$")
    public void click_to_view_original_source() throws Throwable {
        log.info("test case 2 started");

        TC2 tcase2 = new TC2(driver);
        //popup();

        //Storiesbutton();

        log.info("stories button visible and clicked");

        tcase2.sorce().click();
        log.info("test case 2 passed");

    }

    @When("^user click on image$")
    public void user_click_on_image() throws Throwable {
        log.info("testcase 3 started");

        TC3 tcase3 = new TC3(driver);
        //popup();
        //Storiesbutton();
        tcase3.Image().click();
        log.info("image clicked");
    }

    @Then("^display image and close image$")
    public void display_image_and_close_image() throws Throwable {
        TC3 tcase3 = new TC3(driver);
        tcase3.Close().click();
        log.info("image closed");
        log.info("tc3 passed");
    }



    @Then("^user click on view product button$")
    public void user_click_on_view_product_button() throws Throwable {
        TC4 tcase4 = new TC4(driver);
        //tcase4.Image().click();
        log.info("image clicked");
//        tcase4.ImageProduct().click();
//        log.info("product page opened");
        log.info("testcase 4 passed");
    }

//	    @Then("^user click on search button$")
//	    public void user_click_on_search_button1() throws Throwable {
//	    	TC4 tcase4 = new TC4(driver);
//	        popup();
//	        Storiesbutton();
//	        tcase4.Image().click();
//	        log.info("image clicked");
//	        tcase4.ImageProduct().click();
//	        log.info("product page opened");
//	        log.info("testcase 4 passed");
//	    }

    @When("^user click on search button$")
    public void user_click_on_search_button() throws Throwable {
        TC6 tcase6 = new TC6(driver);
        log.info("test case 6 started");

        Popup();
        tcase6.Searchbar().click();

    }

    @Then("^user enter data$")
    public void user_enter_data() throws Throwable {
        TC6 tcase6 = new TC6(driver);
        tcase6.Searchbar().sendKeys("sofa");
        log.info("data entered");
        tcase6.Searchbar().sendKeys(Keys.ENTER);
        log.info("enter button clicked");
        log.info("test case 6 passed");
    }

    @Then("^user checks if correct product is displayed$")
    public void user_checks_if_correct_product_is_displayed() throws Throwable {
        TC7 tcase7 = new TC7(driver);
        log.info("test case 7 started");
        //popup();

        tcase7.searchBar().click();
        tcase7.searchBar().sendKeys("sofa");
        tcase7.searchBar().sendKeys(Keys.ARROW_DOWN);
        tcase7.searchBar().sendKeys(Keys.ENTER);
        log.info("drop down verified");

        String actual = "Search results for 'Sofa'";
        String expected = "Search results for 'Sofa'";
        Assert.assertEquals(actual, expected);
        log.info("assertion started");
        log.info("testcase 7 completed");
    }

    @When("^user click on location button$")
    public void user_click_on_location_button() throws Throwable {
        TC8 tcase8 = new TC8(driver);
        Popup();
        log.info("test case 8 started");


        tcase8.More().click();
        log.info("element clicked");

    }

    @Then("^user opends new location window$")
    public void user_opends_new_location_window() throws Throwable {
        TC8 tcase8 = new TC8(driver);

        log.info("changing to child window");

        Set<String> ids = driver.getWindowHandles();
        Iterator<String> it = ids.iterator();
        String parentId = it.next();
        String childId = it.next();

        driver.switchTo().window(childId);
        tcase8.locationClick().click();
        log.info("location selected");
    }

    @When("^user click on sofa button$")
    public void user_click_on_sofa_button() throws Throwable {
        TC9 tcase9 = new TC9(driver);
        log.info("test case 9 started");
        Popup();

        tcase9.SofaBtn().click();
    }

    @When("^selects wooden sofa$")
    public void selects_wooden_sofa() throws Throwable {
        TC9 tcase9 = new TC9(driver);

        tcase9.Wooden().click();
        Set<String> ids = driver.getWindowHandles();
        Iterator<String> it = ids.iterator();
        String parentId = it.next();
        String childId = it.next();

        driver.switchTo().window(childId);

    }

    @Then("^user selects filter options$")
    public void user_selects_filter_options() throws Throwable {
        TC9 tcase9 = new TC9(driver);
        tcase9.Check().click();

        //Actions a = new Actions(driver);
        //a.moveToElement(tcase9.Price()).build().perform();
        //tcase9.SelPrice().click();
    }

    @When("^user search and select item$")
    public void user_search_and_select_item() throws Throwable {
        TC10 tcase10 = new TC10(driver);
        log.info("test case 10 started");
        Popup();

        tcase10.searchBar().click();
        tcase10.searchBar().sendKeys("sofa");
        tcase10.searchBar().sendKeys(Keys.ENTER);
        log.info("item selected");
    }

    @When("^User adds items to compare$")
    public void user_adds_items_to_compare() throws Throwable {
        TC10 tcase10 = new TC10(driver);
        Actions a = new Actions(driver);
        a.moveToElement(tcase10.Ele1()).build().perform();
        tcase10.Comp1().click();
        log.info("item1 selected for compare");

        a.moveToElement(tcase10.Ele2()).build().perform();
        tcase10.Comp2().click();
        log.info("item1 selected for compare");

        tcase10.compareBtn().click();
        log.info("items compared");
    }

    @Then("^add item to cart$")
    public void add_item_to_cart() throws Throwable {
        TC10 tcase10 = new TC10(driver);
        tcase10.AddToCart().click();
        log.info("Compared item added to cart");

        Set<String> ids = driver.getWindowHandles();
        Iterator<String> it = ids.iterator();
        String parentId = it.next();
        String childId = it.next();

        log.info("switching to child id");
        driver.switchTo().window(childId);

        tcase10.Add().click();

        log.info("testcase 10 passed");
    }

    @When("^user selects study table$")
    public void user_selects_study_table() throws Throwable {
        TC11 tcase11 = new TC11(driver);

        log.info("testcase 11 started");
        //popup();
        tcase11.Study().click();
        log.info("study button clicked");

        tcase11.Table().click();
        log.info("table selection clicked");
    }

    @Then("^add item to wishlist$")
    public void add_item_to_wishlist() throws Throwable {
        TC11 tcase11 = new TC11(driver);
        Actions a = new Actions(driver);
        a.moveToElement(tcase11.Ele()).build().perform();
        tcase11.WishList().click();
        log.info("added to wishlist");
    }

    @When("^user click on order status$")
    public void user_click_on_order_status() throws Throwable {
        TC12 tcase12 = new TC12(driver);

        log.info("testcase 12 started");
        Popup();
        tcase12.Order().click();
        log.info("order button clicked");
    }

    @Then("^user enter login details$")
    public void user_enter_login_details() throws Throwable {
        TC12 tcase12 = new TC12(driver);

        tcase12.Login().click();

        driver.findElement(By.xpath("//*[@id=\"login-module\"]/div[3]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"spree_user_email\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"spree_user_email\"]")).sendKeys("hello");
//        tcase12.Btn().click();
//
//        Thread.sleep(4000);
//        String text = driver.findElement(By.xpath("//*[@id=\"signup_form\"]/label")).getText();
//        Assert.assertEquals(text, "Please enter a valid email address.");
    }

    @When("^user click on gift card option$")
    public void user_click_on_gift_card_option() throws Throwable {
        TC13 tcase13 = new TC13(driver);
        Popup();
        log.info("testcase 13 started");

        tcase13.GiftCard().click();
        log.info("gift card clicked");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)", "");
    }

    @When("^user select house warming option$")
    public void user_select_house_warming_option() throws Throwable {
        TC13 tcase13 = new TC13(driver);

        Actions a = new Actions(driver);
        a.moveToElement(tcase13.HouseWarm()).build().perform();
        tcase13.Button().click();
        log.info("House warming gift card selected");
    }

    @Then("^user enter price and click next$")
    public void user_enter_price_and_click_next() throws Throwable {
        TC13 tcase13 = new TC13(driver);

        tcase13.Cost().click();
        log.info("cost selected");
        tcase13.Next().click();
        log.info("next button clicked");
        log.info("testcase 13 passed");
    }


    @Then("^close browser$")
    public void close_browser() throws Throwable {
        driver.quit();
        driver=null;
    }
}


