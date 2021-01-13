package pages;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;

import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// http://mytestworkspace.cloud.testinsights.io/app/#!/module-collection/guid/83fd56f1-2289-4bd9-b984-5cc5585253b3
@TestModellerModule(guid = "83fd56f1-2289-4bd9-b984-5cc5585253b3")
public class BasketAutomation_Practice_Site extends BasePage
{
	public BasketAutomation_Practice_Site (WebDriver driver)
	{
		super(driver);
	}


	
	private By _Proceed_to_CheckoutElem = By.xpath("//A[@href='http://practice.automationtesting.in/checkout/']");

	private By Selenium_RubyElem = By.xpath("//TD[@class='product-name']/A");

	private By UnknownElem = By.xpath("//A[@title='Remove this item']");

	private By _Your_basket_is_currently_emptyElem = By.xpath("//P[@class='cart-empty']");


	
     
	/**
 	 * Click  Proceed to Checkout
     * @name Click  Proceed to Checkout
     */
	public void Click__Proceed_to_Checkout()
	{
        
		WebElement elem = getWebElement(_Proceed_to_CheckoutElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Proceed_to_Checkout", "Click__Proceed_to_Checkout failed. Unable to locate object: " + _Proceed_to_CheckoutElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Proceed_to_Checkout", "Click__Proceed_to_Checkout failed. Unable to locate object: " + _Proceed_to_CheckoutElem.toString());

			Assert.fail("Unable to locate object: " + _Proceed_to_CheckoutElem.toString());
        }

		elem.click();
        

		ExtentReportManager.passStep(m_Driver, "Click__Proceed_to_Checkout");

		TestModellerLogger.PassStep(m_Driver, "Click__Proceed_to_Checkout");
	}
     
	/**
 	 * Assert Selenium Ruby
     * @name Assert Selenium Ruby
     */
	public void Assert_Selenium_Ruby()
	{
	    
		WebElement elem = getWebElement(Selenium_RubyElem);

		if (elem == null) {
			ExtentReportManager.failStepWithScreenshot(m_Driver, "Assert_Selenium_Ruby", "Assert_Selenium_Ruby failed. Unable to locate object: " + Selenium_RubyElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Assert_Selenium_Ruby", "Assert_Selenium_Ruby failed. Unable to locate object: " + Selenium_RubyElem.toString());

 			Assert.fail("Unable to locate object: " + Selenium_RubyElem.toString());
        }
        
	}
     
	/**
 	 * Click ×
     * @name Click ×
     */
	public void Click_Unknown()
	{
        
		WebElement elem = getWebElement(UnknownElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Unknown", "Click_Unknown failed. Unable to locate object: " + UnknownElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Unknown", "Click_Unknown failed. Unable to locate object: " + UnknownElem.toString());

			Assert.fail("Unable to locate object: " + UnknownElem.toString());
        }

		elem.click();
        

		ExtentReportManager.passStep(m_Driver, "Click_Unknown");

		TestModellerLogger.PassStep(m_Driver, "Click_Unknown");
	}
     
	/**
 	 * Click  Your basket is currently empty.
     * @name Click  Your basket is currently empty.
     */
	public void Click__Your_basket_is_currently_empty()
	{
        
		WebElement elem = getWebElement(_Your_basket_is_currently_emptyElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Your_basket_is_currently_empty", "Click__Your_basket_is_currently_empty failed. Unable to locate object: " + _Your_basket_is_currently_emptyElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Your_basket_is_currently_empty", "Click__Your_basket_is_currently_empty failed. Unable to locate object: " + _Your_basket_is_currently_emptyElem.toString());

			Assert.fail("Unable to locate object: " + _Your_basket_is_currently_emptyElem.toString());
        }

		elem.click();
        

		ExtentReportManager.passStep(m_Driver, "Click__Your_basket_is_currently_empty");

		TestModellerLogger.PassStep(m_Driver, "Click__Your_basket_is_currently_empty");
	}}