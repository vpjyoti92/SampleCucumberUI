package base;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;

/**
 * This class provide all the method performing operations
 *
 * @author Jyoti Pareek
 */
public class BasePage {

    public static WebDriver driver = null;
    public static WebDriverWait waitVar = null;
    public static String baseURL = "https://www.amazon.in/";
    public static Actions action;
    public static JavascriptExecutor jse;

    /**
     * @param browserType is taking user's browser name
     * @param appUrl      is taking the url of the website to be worked upon
     * @throws MalformedURLException is thrown when URL is not correct
     * @throws InterruptedException  is shown when there is any issue with the connection
     */
    public void createDriver(String browserType, String appUrl) throws MalformedURLException, InterruptedException {

        switch (browserType) {
            // check our browser
            case "Firefox": {
                driver = new FirefoxDriver();
                break;
            }
            case "Chrome": {
                System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
                driver = new ChromeDriver();
                break;
            }
            case "InternetExplorer": {
                System.setProperty("webdriver.ie.driver", "J:/TestAmazon/Cucumber-Test/drivers/IEDriverServer.exe");
                driver = new InternetExplorerDriver();
                break;
            }
            case "Safari": {
                driver = new SafariDriver();
                break;
            }
            // if our browser is not listed, throw an error
            default: {
                try {
                    throw new Exception();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        // open a new driver instance to our application URL
        driver.get(appUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        action = new Actions(driver);
        jse = (JavascriptExecutor) driver;
//        driver.get(baseURL);
        waitVar = new WebDriverWait(driver, 15);
    }

    /**
     * Closes the browser instance
     */
    @After
    public void teardown() {
        driver.quit();
    }

    /**
     * Validates if the text is displayed on the page
     */
    public void inLineErrorIsDisplayed() {
        WebElement element = new Elements(driver).InlineError;
        waitVar.until(ExpectedConditions.visibilityOf(element));
        (element).isDisplayed();
    }

    public void checkOutPage() {
        WebElement element = new Elements(driver).CheckOutPage;
        waitVar.until(ExpectedConditions.visibilityOf(element));
        (element).isDisplayed();
    }
//
//    /**
//     * Performs hovering operation
//     */
//    public void hoverCategoryLink() {
//        WebElement element = new Elements(driver).Category;
//        waitVar.until(ExpectedConditions.visibilityOf(element));
//        jse.executeScript("window.scrollTo(0," + element.getLocation().y + ")");
//        action.moveToElement(element).clickAndHold().perform();
//    }

    /**
     * Makes driver to sleep for some time
     *
     * @param i is taking the amount of wait
     */
    public void WaitForTime(int i) {
        try {
            Thread.sleep(i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * Moves control to new tab
     */
    public void validateNewTab() {
        String current_title = driver.getTitle();
        System.out.println(current_title);
        assertTrue("All Deals are displayed in new page",
                current_title.contains("Amazon.in Today's Deals: Great Savings. Every Day."));
    }

    /**
     * Switch the control to the new drivre window
     */
    public void switch_window() {
        Set<String> handles = driver.getWindowHandles();
        String current_window = driver.getWindowHandle();
        handles.remove(current_window);
        String second_handle = handles.iterator().next();
        String winHandle = handles.iterator().next();
        if (winHandle != current_window) {
            second_handle = winHandle;
            driver.switchTo().window(second_handle);
        }
    }

    /**
     * Switch the control to the new drivre window
     */
    public void switch_window_to_default() {
        driver.switchTo().defaultContent();
    }

    public  void SwitchFacebookTabandClose()
    {
        Set <String> windows = driver.getWindowHandles();
        String mainwindow = driver.getWindowHandle();

        for (String handle: windows)
        {
            driver.switchTo().window(handle);
            System.out.println("switched to "+driver.getTitle()+"  Window");
            String pagetitle = driver.getTitle();
            if(pagetitle.contains("Facebook"))
            {
                driver.close();
                System.out.println("Closed the  '"+pagetitle+"' Tab now ...");
            }
        }

        driver.switchTo().window(mainwindow);
    }

    public  void SwitchTwitterTabandClose()
    {
        Set <String> windows = driver.getWindowHandles();
        String mainwindow = driver.getWindowHandle();

        for (String handle: windows)
        {
            driver.switchTo().window(handle);
            System.out.println("switched to "+driver.getTitle()+"  Window");
            String pagetitle = driver.getTitle();
            if(pagetitle.contains("X"))
            {
                driver.close();
                System.out.println("Closed the  '"+pagetitle+"' Tab now ...");
            }
        }

        driver.switchTo().window(mainwindow);
    }

    public  void SwitchLinkedInTabandClose()
    {
        Set <String> windows = driver.getWindowHandles();
        String mainwindow = driver.getWindowHandle();

        for (String handle: windows)
        {
            driver.switchTo().window(handle);
            System.out.println("switched to "+driver.getTitle()+"  Window");
            String pagetitle = driver.getTitle();
            if(pagetitle.contains("LinkedIn"))
            {
                driver.close();
                System.out.println("Closed the  '"+pagetitle+"' Tab now ...");
            }
        }

        driver.switchTo().window(mainwindow);
    }


    /**
     * Take screenshot
     */
    public void take_screenshots() {
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File currDir = new File("");
        String path = currDir.getAbsolutePath();
        File DestFile = new File(path + "/src/test/java/screenshot/Screenshot.png");
        try {
            FileUtils.copyFile(src, DestFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * To click on Link and button
     *
     * @param linkName is the varible taking the input , which link to click
     */
    public void clickonLink(String linkName) {
        switch (linkName) {
            case "LoginButton":
                WebElement loginbutton = new Elements(driver).LoginButton;
                waitVar.until(ExpectedConditions.visibilityOf(loginbutton));
                loginbutton.click();
                break;
            case "ThreeLink":
                WebElement threeLink = new Elements(driver).ThreeLink;
                waitVar.until(ExpectedConditions.visibilityOf(threeLink));
                threeLink.click();
                break;
            case "Logout":
                WebElement logoutLink = new Elements(driver).LogOut;
                waitVar.until(ExpectedConditions.visibilityOf(logoutLink));
                logoutLink.click();
                break;
            case "SauceLabBikeLight":
                WebElement productLink = new Elements(driver).SauceLabBikeLightProduct;
                waitVar.until(ExpectedConditions.visibilityOf(productLink));
                productLink.click();
                break;
            case "AddToCart":
                WebElement addToCart = new Elements(driver).AddToCart;
                waitVar.until(ExpectedConditions.visibilityOf(addToCart));
                addToCart.click();
                break;
            case "ShoppingCartContainer":
                WebElement container = new Elements(driver).ShoppingCart;
                waitVar.until(ExpectedConditions.visibilityOf(container));
                container.click();
                break;
            case "Checkout":
                WebElement checkout = new Elements(driver).Checkout;
                waitVar.until(ExpectedConditions.visibilityOf(checkout));
                checkout.click();
                break;
            case "Continue":
                WebElement con = new Elements(driver).Continue;
                waitVar.until(ExpectedConditions.visibilityOf(con));
                con.click();
                break;
            case "Finish":
                WebElement finish = new Elements(driver).Finish;
                waitVar.until(ExpectedConditions.visibilityOf(finish));
                finish.click();
                break;
            case "SauceLabBoltTShirt":
                WebElement productLinkTShirt = new Elements(driver).SauceLabBikeLightProduct;
                waitVar.until(ExpectedConditions.visibilityOf(productLinkTShirt));
                productLinkTShirt.click();
                break;
            case "SauceLabBagPack":
                WebElement bagPack = new Elements(driver).SauceLabBagPack;
                waitVar.until(ExpectedConditions.visibilityOf(bagPack));
                bagPack.click();
                break;
            case "Reset":
                WebElement reset = new Elements(driver).ResetLink;
                waitVar.until(ExpectedConditions.visibilityOf(reset));
                reset.click();
                break;
            case "AllItem":
                WebElement allItem = new Elements(driver).AllItem;
                waitVar.until(ExpectedConditions.visibilityOf(allItem));
                allItem.click();
                break;
            case "RemoveSauceLabBagPack":
                WebElement removeBagPack = new Elements(driver).RemoveSauceLabBagPack;
                waitVar.until(ExpectedConditions.visibilityOf(removeBagPack));
                removeBagPack.click();
                break;
            case "Twitter":
                WebElement twitter = new Elements(driver).Twitter;
                waitVar.until(ExpectedConditions.visibilityOf(twitter));
                twitter.click();
                break;
            case "Facebook":
                WebElement facebook = new Elements(driver).Facebook;
                waitVar.until(ExpectedConditions.visibilityOf(facebook));
                facebook.click();
                break;
            case "LinkedIn":
                WebElement linkedIn = new Elements(driver).LinkedIn;
                waitVar.until(ExpectedConditions.visibilityOf(linkedIn));
                linkedIn.click();
                break;
            default:
                System.out.println("Not a valid link name" + linkName);
        }
    }

    /**
     * Method is to send keys into text field
     *
     * @param inputFieldName is to take the inputfieldname from user
     * @param text           is the text value to be input
     */
    public void inputText(String inputFieldName, String text) {
        switch (inputFieldName) {
            case "Username":
                WebElement username = new Elements(driver).UserName;
                waitVar.until(ExpectedConditions.visibilityOf(username));
                username.sendKeys(text);
                break;
            case "Password":
                WebElement password = new Elements(driver).Password;
                waitVar.until(ExpectedConditions.visibilityOf(password));
                password.sendKeys(text);
                break;
            case "FirstName":
                WebElement firstName = new Elements(driver).FirstName;
                waitVar.until(ExpectedConditions.visibilityOf(firstName));
                firstName.sendKeys(text);
                break;
            case "LastName":
                WebElement lastName = new Elements(driver).LastName;
                waitVar.until(ExpectedConditions.visibilityOf(lastName));
                lastName.sendKeys(text);
                break;
            case "ZipCode":
                WebElement zipCode = new Elements(driver).ZipCode;
                waitVar.until(ExpectedConditions.visibilityOf(zipCode));
                zipCode.sendKeys(text);
                break;
            default:
                System.out.println("Not a valid inputfield name");
        }
    }

    /**
     * Method is to validate id element is displayed
     *
     * @return
     * @param remove
     */
    public boolean isDisplayed(String remove) {
        try {
            WebElement remove1 = new Elements(driver).Remove;
            return remove1.isDisplayed();
        }
        catch (Exception e)
        {
            System.out.println("Remove button is not getting displayed");
            return false;
        }
    }

    /**
     * Method is to validate id element is enabled
     *
     * @return
     * @param addToCart
     */
    public boolean isEnabled(String addToCart) {
        WebElement addToCart1 = new Elements(driver).AddToCart;
        return addToCart1.isEnabled();
    }

    /**
     * Method is to validate id element is enabled
     *
     * @return
     * @param addToCart
     */
    public String validateCartSize() {
        WebElement addToCart1 = new Elements(driver).ShoppingCart;
        return addToCart1.getText();
    }

    /**
     * GetDriver Details
     */
    public WebDriver getDriver() {
        return driver;
    }
}

