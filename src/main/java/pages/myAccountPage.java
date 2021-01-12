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

// http://mytestworkspace.cloud.testinsights.io/app/#!/module-collection/guid/d381661e-5299-4edd-83cc-81546470620b
@TestModellerModule(guid = "d381661e-5299-4edd-83cc-81546470620b")
public class myAccountPage extends BasePage
{
	public myAccountPage (WebDriver driver)
	{
		super(driver);
	}


	
	private By shopLinkElem = By.xpath("//a[text()='Shop']");

	private By MyAccountElem = By.xpath("//a[text()='My Account']");

	private By ShopElem = By.xpath("//LI[@id='menu-item-40']/A");

	private By My_AccountElem = By.xpath("//LI[@id='menu-item-50']/A");

	private By Test_CasesElem = By.xpath("//A[@href='http://practice.automationtesting.in/test-cases/']");

	private By AT_SiteElem = By.xpath("//A[@href='http://automationtesting.in/']");

	private By Demo_SiteElem = By.xpath("//A[@href='http://demo.automationtesting.in/Register.html']");


	
     
	/**
 	 * Click shopLink
     * @name Click shopLink
     */
	public void Click_shopLink()
	{
        
		WebElement elem = getWebElement(shopLinkElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_shopLink", "Click_shopLink failed. Unable to locate object: " + shopLinkElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_shopLink", "Click_shopLink failed. Unable to locate object: " + shopLinkElem.toString());

			Assert.fail("Unable to locate object: " + shopLinkElem.toString());
        }

		elem.click();
        

		ExtentReportManager.passStep(m_Driver, "Click_shopLink");

		TestModellerLogger.PassStep(m_Driver, "Click_shopLink");
	}
     
	/**
 	 * Click MyAccount
     * @name Click MyAccount
     */
	public void Click_MyAccount()
	{
        
		WebElement elem = getWebElement(MyAccountElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_MyAccount", "Click_MyAccount failed. Unable to locate object: " + MyAccountElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_MyAccount", "Click_MyAccount failed. Unable to locate object: " + MyAccountElem.toString());

			Assert.fail("Unable to locate object: " + MyAccountElem.toString());
        }

		elem.click();
        

		ExtentReportManager.passStep(m_Driver, "Click_MyAccount");

		TestModellerLogger.PassStep(m_Driver, "Click_MyAccount");
	}
     
	/**
 	 * Assert Shop
     * @name Assert Shop
     */
	public void Assert_Shop()
	{
	    
		WebElement elem = getWebElement(ShopElem);

		if (elem == null) {
			ExtentReportManager.failStepWithScreenshot(m_Driver, "Assert_Shop", "Assert_Shop failed. Unable to locate object: " + ShopElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Assert_Shop", "Assert_Shop failed. Unable to locate object: " + ShopElem.toString());

 			Assert.fail("Unable to locate object: " + ShopElem.toString());
        }
        
	}
     
	/**
 	 * Click My Account
     * @name Click My Account
     */
	public void Click_My_Account()
	{
        
		WebElement elem = getWebElement(My_AccountElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_My_Account", "Click_My_Account failed. Unable to locate object: " + My_AccountElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_My_Account", "Click_My_Account failed. Unable to locate object: " + My_AccountElem.toString());

			Assert.fail("Unable to locate object: " + My_AccountElem.toString());
        }

		elem.click();
        

		ExtentReportManager.passStep(m_Driver, "Click_My_Account");

		TestModellerLogger.PassStep(m_Driver, "Click_My_Account");
	}
     
	/**
 	 * Click Test Cases
     * @name Click Test Cases
     */
	public void Click_Test_Cases()
	{
        
		WebElement elem = getWebElement(Test_CasesElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Test_Cases", "Click_Test_Cases failed. Unable to locate object: " + Test_CasesElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Test_Cases", "Click_Test_Cases failed. Unable to locate object: " + Test_CasesElem.toString());

			Assert.fail("Unable to locate object: " + Test_CasesElem.toString());
        }

		elem.click();
        

		ExtentReportManager.passStep(m_Driver, "Click_Test_Cases");

		TestModellerLogger.PassStep(m_Driver, "Click_Test_Cases");
	}
     
	/**
 	 * Click AT Site
     * @name Click AT Site
     */
	public void Click_AT_Site()
	{
        
		WebElement elem = getWebElement(AT_SiteElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_AT_Site", "Click_AT_Site failed. Unable to locate object: " + AT_SiteElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_AT_Site", "Click_AT_Site failed. Unable to locate object: " + AT_SiteElem.toString());

			Assert.fail("Unable to locate object: " + AT_SiteElem.toString());
        }

		elem.click();
        

		ExtentReportManager.passStep(m_Driver, "Click_AT_Site");

		TestModellerLogger.PassStep(m_Driver, "Click_AT_Site");
	}
     
	/**
 	 * Click Demo Site
     * @name Click Demo Site
     */
	public void Click_Demo_Site()
	{
        
		WebElement elem = getWebElement(Demo_SiteElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Demo_Site", "Click_Demo_Site failed. Unable to locate object: " + Demo_SiteElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Demo_Site", "Click_Demo_Site failed. Unable to locate object: " + Demo_SiteElem.toString());

			Assert.fail("Unable to locate object: " + Demo_SiteElem.toString());
        }

		elem.click();
        

		ExtentReportManager.passStep(m_Driver, "Click_Demo_Site");

		TestModellerLogger.PassStep(m_Driver, "Click_Demo_Site");
	}}