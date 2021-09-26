package CS.CS1Hybrid;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;
import pageObjects.*;
import resources.Base;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HomePage extends Base {

    public static Logger log = LogManager.getLogger(Base.class.getName());

    public HomePage() throws IOException {
    }

    @BeforeMethod
    public void before() throws IOException
    {
        driver = initializeDriver();// initializing driver
        driver.get(prop.getProperty("url"));// getting required url
        log.info("Home page started");
    }


    public void Storiesbutton() {
        TC2 test2 = new TC2(driver);
        test2.StoryEle().click();
    }

    public List<Object> getData() throws IOException {
        dataDriven d = new dataDriven();
        return d.getData("Item");
    }

    @Test
    public void TCase1() throws InterruptedException {
    	Thread.sleep(4000);
        log.info("Starting test case 1");

        TC1 tcase1 = new TC1(driver);
        tcase1.Popup().click();
        log.info("pop up closed");

        //scrolling
        WebElement element = tcase1.StroryElement();
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(3000);
        log.info("page scrolled");
        log.info("tc1 passed");
        

    }

    @Test
    public void TCase2() throws Exception
    {
    	Thread.sleep(4000);
        log.info("test case 2 started");

        TC2 tcase2 = new TC2(driver);
        tcase2.Popup();

        Storiesbutton();

        log.info("stories button visible and clicked");

        tcase2.sorce().click();
        log.info("test case 2 passed");
    }

    @Test
    public void TCase3() throws InterruptedException {
    	Thread.sleep(4000);
        log.info("testcase 3 started");

        TC3 tcase3 = new TC3(driver);
        //popup();
        tcase3.Popup();
        Storiesbutton();
        tcase3.Image().click();
        log.info("image clicked");

        tcase3.Close().click();
        log.info("image closed");

        log.info("tc3 passed");
    }

    @Test
    public void TCase4() throws InterruptedException {
    	Thread.sleep(4000);
        log.info("test case 4 started");

        TC4 tcase4 = new TC4(driver);
        //popup();
        tcase4.Popup();
        Storiesbutton();
        tcase4.Image().click();
        log.info("image clicked");
        tcase4.ImageProduct().click();
        log.info("product page opened");
        log.info("testcase 4 passed");

    }

    @Test
    public void TCase5() throws InterruptedException{
    	Thread.sleep(4000);
        log.info("test case 5 started");
        TC5 tcase5 = new TC5(driver);
        tcase5.Popup();

        log.info("search clicked");
        tcase5.SearchBar().click();
        log.info("test case 5 passed");
    }

    @Test
    public void TCase6() throws Exception {
    	Thread.sleep(4000);
        TC6 tcase6 = new TC6(driver);
        log.info("test case 6 started");

        tcase6.Popup();
        tcase6.Searchbar().click();
        List<Object> data = getData();
        tcase6.Searchbar().sendKeys((CharSequence) data.get(0));
        //tcase6.Searchbar().sendKeys("sofa");
        log.info("data entered");
        tcase6.Searchbar().sendKeys(Keys.ENTER);
        log.info("enter button clicked");
        log.info("test case 6 passed");

    }

    @Test
    public void TCase7() throws Exception {
    	Thread.sleep(4000);
        TC7 tcase7 = new TC7(driver);
        log.info("test case 7 started");
        //popup();

        tcase7.Popup();
        tcase7.searchBar().click();
        List<Object> data = getData();

        tcase7.searchBar().sendKeys((CharSequence) data.get(0));
        //tcase7.searchBar().sendKeys("sofa");
        tcase7.searchBar().sendKeys(Keys.ARROW_DOWN);
        tcase7.searchBar().sendKeys(Keys.ENTER);
        log.info("drop down verified");

        String actual = "Search results for 'Sofa'";
        String expected = "Search results for 'Sofa'";
        Assert.assertEquals(actual, expected);
        log.info("assertion started");
        log.info("assertion passed");
        log.info("testcase 7 completed");
    }

    @Test
    public void TCase8() throws Exception {
    	Thread.sleep(4000);
        TC8 tcase8 = new TC8(driver);
        tcase8.Popup();
        log.info("test case 8 started");

        tcase8.More().click();
        log.info("element clicked");
        log.info("changing to child window");

        Set<String> ids = driver.getWindowHandles();
        Iterator<String> it = ids.iterator();
        String parentId = it.next();
        String childId = it.next();

        driver.switchTo().window(childId);
        tcase8.locationClick().click();
        Set<String> handles = driver.getWindowHandles();
        Object[] handlesArr = handles.toArray();
        driver.switchTo().window((String) handlesArr[2]);
        log.info("switched to location window");

        String actual = tcase8.AssertChecking().getText();
        String expected = "Furniture In Hyderabad";

        Assert.assertEquals(actual, expected);
        log.info("assert passed");

        log.info("location selected");
        log.info("testcase 8 passed");
    }

    @Test
    public void TCase9() throws InterruptedException{
    	Thread.sleep(4000);
        TC9 tcase9 = new TC9(driver);
        log.info("test case 9 started");
        //popup();
        tcase9.Popup();

        tcase9.SofaBtn().click();
        tcase9.Wooden().click();
        Set<String> ids = driver.getWindowHandles();
        Iterator<String> it = ids.iterator();
        String parentId = it.next();
        String childId = it.next();

        driver.switchTo().window(childId);
        tcase9.Check().click();
        log.info("testcase 9 passed");

        //Actions a = new Actions(driver);
        //a.moveToElement(tcase9.Price()).build().perform();
        //tcase9.SelPrice().click();
    }

    @Test
    public void TCase10() throws IOException, InterruptedException {
    	Thread.sleep(4000);
        TC10 tcase10 = new TC10(driver);
        List<Object> data = getData();
        log.info("test case 10 started");

        tcase10.Popup();
        tcase10.searchBar().click();
        tcase10.searchBar().sendKeys((CharSequence) data.get(0));
        tcase10.searchBar().sendKeys(Keys.ENTER);
        log.info("item selected");

        Actions a = new Actions(driver);
        a.moveToElement(tcase10.Ele1()).build().perform();
        tcase10.Comp1().click();
        log.info("item1 selected for compare");

        a.moveToElement(tcase10.Ele2()).build().perform();
        tcase10.Comp2().click();
        log.info("item1 selected for compare");

        tcase10.compareBtn().click();
        log.info("items compared");

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

    @Test
    public void TCase11() throws Exception {
    	Thread.sleep(4000);
        TC11 tcase11 = new TC11(driver);

        log.info("testcase 11 started");
        //popup();
        tcase11.Popup();
        tcase11.Study().click();
        log.info("study button clicked");

        tcase11.Table().click();
        log.info("table selection clicked");

        Actions a = new Actions(driver);
        a.moveToElement(tcase11.Ele()).build().perform();
        tcase11.WishList().click();
        log.info("added to wishlist");
    }

    @Test
    public void TCase12() throws Exception {
    	Thread.sleep(4000);
        TC12 tcase12 = new TC12(driver);
        List<Object> data = getData();

        log.info("testcase 12 started");
        tcase12.Popup();
        tcase12.Order().click();
        log.info("order button clicked");
        tcase12.Login().click();

        driver.findElement(By.xpath("//*[@id=\"login-module\"]/div[3]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"spree_user_email\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"spree_user_email\"]")).sendKeys((CharSequence) data.get(1));
        //driver.findElement(By.xpath("//*[@id=\"spree_user_password\"]")).sendKeys((CharSequence) data.get(1));
        //driver.findElement(By.xpath("//*[@id=\"spree_user_email\"]")).sendKeys("hello");
        //driver.findElement(By.xpath("//*[@id=\"spree_user_password\"]")).sendKeys("hello");

    }

    /*@Test
    public void TCase12() throws InterruptedException {
        TC12 tcase12 = new TC12(driver);

        log.info("testcase 12 started");
        popup();
        tcase12.Order().click();
        log.info("order button clicked");

        //driver.findElement(By.xpath("//*[@id=\"login-module\"]/div[3]/a")).click();
        //driver.findElement(By.xpath("//*[@id=\"login-module\"]/div[3]/a")).click();
        //driver.findElement(By.xpath("//*[@id=\"spree_user_email\"]")).click();
        //driver.findElement(By.xpath("//*[@id=\"spree_user_email\"]")).sendKeys((CharSequence) data.get(1));
        //driver.findElement(By.xpath("//*[@id=\"spree_user_email\"]")).sendKeys((CharSequence) data.get(1));
        //tcase12.Email().sendKeys((CharSequence) data.get(1));
        Thread.sleep(4000);
        tcase12.Login().click();
        Thread.sleep(4000);
        //tcase12.Email().click();

        tcase12.Email().sendKeys((CharSequence) data.get(1));

        //String text = driver.findElement(By.xpath("//*[@id=\"signup_form\"]/label")).getText();
        //Assert.assertEquals(text, "Please enter a valid email address.");



//        tcase12.Login().click();
//        log.info("login button clicked");
//        tcase12.Email().click();
//        tcase12.Email().sendKeys("hello");
//        log.info("uname entered");
//        tcase12.Pswd().click();
//        tcase12.Pswd().sendKeys("hello");
//        log.info("password clicked");
//        log.info("testcase 12 passed");


    }
    */

    @Test
    public void TCase13() throws InterruptedException{
    	Thread.sleep(4000);
        TC13 tcase13 = new TC13(driver);
        //popup();
        tcase13.Popup();
        log.info("testcase 13 started");

        tcase13.GiftCard().click();
        log.info("gift card clicked");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)", "");

        Actions a = new Actions(driver);
        a.moveToElement(tcase13.HouseWarm()).build().perform();
        tcase13.Button().click();
        log.info("House warming gift card selected");
        tcase13.Cost().click();
        log.info("cost selected");
        tcase13.Next().click();
        log.info("next button clicked");
        log.info("testcase 13 passed");
    }

    @Test
    public void TCase14() throws InterruptedException{
    	Thread.sleep(4000);
        TC14 tcase14 = new TC14(driver);

        log.info("testcase 14 started");
        tcase14.Popup();
        tcase14.Study().click();
        log.info("study button clicked");

        tcase14.Table().click();
        log.info("table selection clicked");

        Actions a = new Actions(driver);
        a.moveToElement(tcase14.Ele()).build().perform();
        tcase14.Ele().click();
        log.info("table selection done");

        Set<String> ids = driver.getWindowHandles();
        Iterator<String> it = ids.iterator();
        String parentId = it.next();
        String childId = it.next();

        log.info("switching to child id");
        driver.switchTo().window(childId);

        tcase14.AddToCart().click();
        log.info("element clicked, item added to cart");
        log.info("testcase 14 passed");
    }

    @Test
    public void TCase15() throws InterruptedException {
    	Thread.sleep(4000);
        TC15 tcase15 = new TC15(driver);
        log.info("testcase 15 started");
        tcase15.Popup();
        tcase15.StoresButton().click();
        log.info("Stores button clicked");

        tcase15.PuneStore().click();
        log.info("store selected to view");

        tcase15.Maps().click();
        log.info("Maps button clicked");

        log.info("testcase 15 passed");

    }

    @AfterMethod
    public void teardown()
    {
        driver.quit();
        driver=null;
    }

}
