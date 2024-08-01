package base;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

/**
 * Class include all the elements of the class
 * @author Jyoti Pareek
 *
 */
public class Elements {

	public Elements(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = "user-name")
	static WebElement UserName;

	@FindBy(how = How.ID, using = "password")
	static WebElement Password;

	@FindBy(how = How.ID, using = "login-button")
	static WebElement LoginButton;

	@FindBy(how = How.ID, using = "react-burger-menu-btn")
	static WebElement ThreeLink;

	@FindBy(how = How.ID, using = "logout_sidebar_link")
	static WebElement LogOut;

	@FindBy(how = How.XPATH, using = "//div[@class='error-message-container error']")
	static WebElement InlineError;

	@FindBy(how = How.XPATH, using = "//div[.='Sauce Labs Bike Light']")
	static WebElement SauceLabBikeLightProduct;

	@FindBy(how = How.XPATH, using = "//div[.='Sauce Labs Backpack']")
	static WebElement SauceLabBagPack;

	@FindBy(how = How.XPATH, using = "//div[.='Sauce Labs Bolt T-Shirt']")
	static WebElement SauceLabBoltTShirtProduct;

	@FindBy(how = How.XPATH, using = "//button[@id='add-to-cart']")
	static WebElement AddToCart;

	@FindBy(how = How.XPATH, using = "//div[@id='shopping_cart_container']")
	static WebElement ShoppingCart;

	@FindBy(how = How.XPATH, using = "//button[@id='checkout']")
	static WebElement Checkout;

	@FindBy(how = How.XPATH, using = "//input[@id='first-name']")
	static WebElement FirstName;

	@FindBy(how = How.XPATH, using = "//input[@id='last-name']")
	static WebElement LastName;

	@FindBy(how = How.XPATH, using = "//input[@id='postal-code']")
	static WebElement ZipCode;

	@FindBy(how = How.XPATH, using = "//input[@id='continue']")
	static WebElement Continue;

	@FindBy(how = How.XPATH, using = "//button[@id='finish']")
	static WebElement Finish;

	@FindBy(how = How.XPATH, using = "//span[.='Checkout: Overview']")
	static WebElement CheckOutPage;

	@FindBy(how = How.ID, using = "reset_sidebar_link")
	static WebElement ResetLink;

	@FindBy(how = How.ID, using = "remove")
	static WebElement Remove;

	@FindBy(how = How.XPATH, using = "//span[@class='shopping_cart_badge']")
	static WebElement CartSize;

	@FindBy(how = How.XPATH, using = "//a[@id='inventory_sidebar_link']")
	static WebElement AllItem;

	@FindBy(how = How.ID, using = "remove-sauce-labs-backpack")
	static WebElement RemoveSauceLabBagPack;

	@FindBy(how = How.XPATH, using = "//a[@data-test='social-twitter']")
	static WebElement Twitter;

	@FindBy(how = How.XPATH, using = "//a[@data-test='social-facebook']")
	static WebElement Facebook;

	@FindBy(how = How.XPATH, using = "//a[@data-test='social-linkedin']")
	static WebElement LinkedIn;

	@FindBy(how = How.XPATH, using = "//select[@class='product_sort_container']")
	static WebElement ProductSort;

	@FindAll({@FindBy( how = How.XPATH, using = "//div[@class='inventory_item_price']")})
	static List<WebElement> ProductsPrice;


}
