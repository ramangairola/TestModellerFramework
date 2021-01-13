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
 	 * Click Selenium Ruby
     * @name Click Selenium Ruby
     */
	public void Click_Selenium_Ruby()
	{
        
		WebElement elem = getWebElement(Selenium_RubyElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Selenium_Ruby", "Click_Selenium_Ruby failed. Unable to locate object: " + Selenium_RubyElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Selenium_Ruby", "Click_Selenium_Ruby failed. Unable to locate object: " + Selenium_RubyElem.toString());

			Assert.fail("Unable to locate object: " + Selenium_RubyElem.toString());
        }

		elem.click();
        

		ExtentReportManager.passStep(m_Driver, "Click_Selenium_Ruby");

		TestModellerLogger.PassStep(m_Driver, "Click_Selenium_Ruby");
	}}