package step_definitions;

import java.net.MalformedURLException;

import base.BasePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;


/**
 * Class is with all the step definition
 * @author Jyoti Pareek
 *
 */
public class ValidationSteps {

	BasePage base = new BasePage();


	@Then("^Click on (.*) link$")
	public void clickLink(String link) {
		base.clickonLink(link);
	}

	@Then("^Validate deals displayed in new page$")
	public void validate_deals() {
		base.switch_window();
		base.validateNewTab();
	}

	@Then("^Closed the driver$")
	public void close() {
		base.teardown();
	}

	@Then("^Took the snapshot$")
	public void takescreenshot() {
		base.take_screenshots();
	}


	@Then("^Input (.*) on (.*) inputbox$")
	public void inputValues(String inputText, String textAreaName) {
		base.inputText(textAreaName, inputText);
	}
	
	@Then("^Wait for (.*) seconds$")
	public void waitFor(int waitTime)
	{
		base.WaitForTime(waitTime);
	}

	@Given("^Launch Google using (.*) browser and (.*) url$")
	public void launch_Google(String browsertype, String url)
			throws MalformedURLException, InterruptedException {
		base.createDriver(browsertype, url);
	}

	@Then("^I validate error message is displayed$")
	public void errorDisplayed() {
		base.inLineErrorIsDisplayed();
	}

	@Then("^I validate checkout page is still displayed$")
	public void checkOutPageIsDispalyed() {
		base.checkOutPage();
	}

	@Then("^I refresh browser$")
	public void refreshBrowser() {
		base.getDriver().navigate().refresh();
	}

	@Then("^I validate Remove button is not displayed$")
	public void iValidateRemoveButtonIsNotDisplayed() {
		Assert.assertFalse(base.isDisplayed("Remove"));
	}

	@Then("^I validate AddToCart button is enabled$")
	public void iValidateAddToCartButtonIsEnabled() {
		Assert.assertTrue(base.isEnabled("AddToCart"));
	}

	@Then("^I validate the Cart size is (\\d+)$")
	public void iValidateTheCartSizeIs(int arg0) {
		Assert.assertTrue(base.validateCartSize().equals(""));
	}

	@Then("^I switch back to main window$")
	public void iSwitchBackToMainWindow() {
		base.switch_window_to_default();
	}

	@Then("^I switch to Facebook tab and close it$")
	public void iSwitchToFacebookTabAndCloseIt() {
		base.SwitchFacebookTabandClose();
	}

	@Then("^I switch to Twitter tab and close it$")
	public void iSwitchToTwitterTabAndCloseIt() {
		base.SwitchTwitterTabandClose();
	}

	@Then("^I switch to LinkedIn tab and close it$")
	public void iSwitchToLinkedInTabAndCloseIt() {
		base.SwitchLinkedInTabandClose();
	}

	@Then("^I filter by (.*)$")
	public void iFilterByLowToHigh(String abc) {
		base.selectElementByText(abc);
	}

	@Then("^I validate (.*) is selected$")
	public void iValidateLowToHighfilterIsSelected(String str) {
		base.selectElementByText(str);
	}

	@Then("^I validate products displayed are sorted in (.*)$")
	public void iValidateProductsDisplayedAreSortedInLowToHigh(String order) {
		base.validateProductsDisplayedInOrder(order);
	}
}
