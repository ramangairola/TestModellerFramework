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

// http://mytestworkspace.cloud.testinsights.io/app/#!/module-collection/guid/eec01002-1508-43c0-a6da-68ee44daa664
@TestModellerModule(guid = "eec01002-1508-43c0-a6da-68ee44daa664")
public class Products_Automation_Practice_Site extends BasePage
{
	public Products_Automation_Practice_Site (WebDriver driver)
	{
		super(driver);
	}


	
	private By Add_to_basketElem = By.xpath("//A[@data-product_id='181']");

	private By ClickCartLinkElem = By.xpath("//a[@title='View your shopping cart']");

	private By Selenium_RubyElem = By.xpath("//LI[@class='post-160 product type-product status-publish product_cat-selenium product_tag-ruby product_tag-selenium has-post-title no-post-date has-post-category has-post-tag has-post-comment has-post-author  instock downloadable taxable shipping-taxable purchasable product-type-simple']/A[@class='woocommerce-LoopProduct-link']/H3");


	
	public void GoToUrl()
	{
		m_Driver.get("http://practice.automationtesting.in/shop/");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://practice.automationtesting.in/shop/");

		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://practice.automationtesting.in/shop/");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://practice.automationtesting.in/shop/";

        if (!currentUrl.equals("http://practice.automationtesting.in/shop/")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click Add to basket
     * @name Click Add to basket
     */
	public void Click_Add_to_basket()
	{
        
		WebElement elem = getWebElement(Add_to_basketElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Add_to_basket", "Click_Add_to_basket failed. Unable to locate object: " + Add_to_basketElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Add_to_basket", "Click_Add_to_basket failed. Unable to locate object: " + Add_to_basketElem.toString());

			Assert.fail("Unable to locate object: " + Add_to_basketElem.toString());
        }

		elem.click();
        

		ExtentReportManager.passStep(m_Driver, "Click_Add_to_basket");

		TestModellerLogger.PassStep(m_Driver, "Click_Add_to_basket");
	}
     
	/**
 	 * Click ClickCartLink
     * @name Click ClickCartLink
     */
	public void Click_ClickCartLink()
	{
        
		WebElement elem = getWebElement(ClickCartLinkElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ClickCartLink", "Click_ClickCartLink failed. Unable to locate object: " + ClickCartLinkElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ClickCartLink", "Click_ClickCartLink failed. Unable to locate object: " + ClickCartLinkElem.toString());

			Assert.fail("Unable to locate object: " + ClickCartLinkElem.toString());
        }

		elem.click();
        

		ExtentReportManager.passStep(m_Driver, "Click_ClickCartLink");

		TestModellerLogger.PassStep(m_Driver, "Click_ClickCartLink");
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