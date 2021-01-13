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

// http://mytestworkspace.cloud.testinsights.io/app/#!/module-collection/guid/a2e437e7-d915-4eb5-a860-3d2109ee8160
@TestModellerModule(guid = "a2e437e7-d915-4eb5-a860-3d2109ee8160")
public class CheckoutAutomation_Practice_Site extends BasePage
{
	public CheckoutAutomation_Practice_Site (WebDriver driver)
	{
		super(driver);
	}


	
	private By _Direct_Bank_Transfer_Elem = By.xpath("//INPUT[@id='payment_method_bacs']");

	private By Place_orderElem = By.xpath("//INPUT[@name='woocommerce_checkout_place_order']");


	
     
	/**
 	 * Click  Direct Bank Transfer 
     * @name Click  Direct Bank Transfer 
     */
	public void Click__Direct_Bank_Transfer_()
	{
        
		WebElement elem = getWebElement(_Direct_Bank_Transfer_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Direct_Bank_Transfer_", "Click__Direct_Bank_Transfer_ failed. Unable to locate object: " + _Direct_Bank_Transfer_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Direct_Bank_Transfer_", "Click__Direct_Bank_Transfer_ failed. Unable to locate object: " + _Direct_Bank_Transfer_Elem.toString());

			Assert.fail("Unable to locate object: " + _Direct_Bank_Transfer_Elem.toString());
        }

		elem.click();
        

		ExtentReportManager.passStep(m_Driver, "Click__Direct_Bank_Transfer_");

		TestModellerLogger.PassStep(m_Driver, "Click__Direct_Bank_Transfer_");
	}
     
	/**
 	 * Click Place order
     * @name Click Place order
     */
	public void Click_Place_order()
	{
        
		WebElement elem = getWebElement(Place_orderElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Place_order", "Click_Place_order failed. Unable to locate object: " + Place_orderElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Place_order", "Click_Place_order failed. Unable to locate object: " + Place_orderElem.toString());

			Assert.fail("Unable to locate object: " + Place_orderElem.toString());
        }

		elem.click();
        

		ExtentReportManager.passStep(m_Driver, "Click_Place_order");

		TestModellerLogger.PassStep(m_Driver, "Click_Place_order");
	}}