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

// http://mytestworkspace.cloud.testinsights.io/app/#!/module-collection/guid/ca33b5ea-771f-4f32-9c24-cf6bbb2940f0
@TestModellerModule(guid = "ca33b5ea-771f-4f32-9c24-cf6bbb2940f0")
public class HomePage extends BasePage
{
	public HomePage (WebDriver driver)
	{
		super(driver);
	}


	
	private By My_AccountElem = By.xpath("//LI[@id='menu-item-50']/A");


	
	public void GoToUrl()
	{
		m_Driver.get("http://practice.automationtesting.in/");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://practice.automationtesting.in/");

		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://practice.automationtesting.in/");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://practice.automationtesting.in/";

        if (!currentUrl.equals("http://practice.automationtesting.in/")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
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
	}}