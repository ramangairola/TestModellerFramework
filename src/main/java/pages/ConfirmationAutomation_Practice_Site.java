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

// http://mytestworkspace.cloud.testinsights.io/app/#!/module-collection/guid/8b48a10a-d456-4051-b28d-bc73a1e5194c
@TestModellerModule(guid = "8b48a10a-d456-4051-b28d-bc73a1e5194c")
public class ConfirmationAutomation_Practice_Site extends BasePage
{
	public ConfirmationAutomation_Practice_Site (WebDriver driver)
	{
		super(driver);
	}


	
	private By Thank_you_Your_order_has_been_receivedElem = By.xpath("//P[@class='woocommerce-thankyou-order-received']");

	private By Selenium_RubyElem = By.xpath("//A[@href='http://practice.automationtesting.in/product/selenium-ruby/']");


	
     
	/**
 	 * Assert Thank you. Your order has been received.
     * @name Assert Thank you. Your order has been received.
     */
	public void Assert_Thank_you_Your_order_has_been_received()
	{
	    
		WebElement elem = getWebElement(Thank_you_Your_order_has_been_receivedElem);

		if (elem == null) {
			ExtentReportManager.failStepWithScreenshot(m_Driver, "Assert_Thank_you_Your_order_has_been_received", "Assert_Thank_you_Your_order_has_been_received failed. Unable to locate object: " + Thank_you_Your_order_has_been_receivedElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Assert_Thank_you_Your_order_has_been_received", "Assert_Thank_you_Your_order_has_been_received failed. Unable to locate object: " + Thank_you_Your_order_has_been_receivedElem.toString());

 			Assert.fail("Unable to locate object: " + Thank_you_Your_order_has_been_receivedElem.toString());
        }
        
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
        
	}}