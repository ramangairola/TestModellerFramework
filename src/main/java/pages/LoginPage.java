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

// http://mytestworkspace.cloud.testinsights.io/app/#!/module-collection/guid/341152dc-90da-45ad-b194-baab59fc1bf0
@TestModellerModule(guid = "341152dc-90da-45ad-b194-baab59fc1bf0")
public class LoginPage extends BasePage
{
	public LoginPage (WebDriver driver)
	{
		super(driver);
	}


	
	private By Password_Elem = By.xpath("//*[@id=\"password\"]");

	private By LoginElem = By.xpath("//INPUT[@name='login']");

	private By Username_or_email_address_Elem = By.xpath("//*[@id=\"username\"]");

	private By Error_Username_is_requiredElem = By.xpath("//UL[@class='woocommerce-error']/LI");

	private By ErrorElem = By.xpath("//STRONG");


	
     
	/**
 	 * Assert Error:
     * @name Assert Error:
     */
	public void Assert_Error()
	{
	    
		WebElement elem = getWebElement(ErrorElem);

		if (elem == null) {
			ExtentReportManager.failStepWithScreenshot(m_Driver, "Assert_Error", "Assert_Error failed. Unable to locate object: " + ErrorElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Assert_Error", "Assert_Error failed. Unable to locate object: " + ErrorElem.toString());

 			Assert.fail("Unable to locate object: " + ErrorElem.toString());
        }
        
	}
     
	/**
 	 * Assert Error: Username is required.
     * @name Assert Error: Username is required.
     */
	public void Assert_Error_Username_is_required()
	{
	    
		WebElement elem = getWebElement(Error_Username_is_requiredElem);

		if (elem == null) {
			ExtentReportManager.failStepWithScreenshot(m_Driver, "Assert_Error_Username_is_required", "Assert_Error_Username_is_required failed. Unable to locate object: " + Error_Username_is_requiredElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Assert_Error_Username_is_required", "Assert_Error_Username_is_required failed. Unable to locate object: " + Error_Username_is_requiredElem.toString());

 			Assert.fail("Unable to locate object: " + Error_Username_is_requiredElem.toString());
        }
        
	}
     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://practice.automationtesting.in/my-account/";

        if (!currentUrl.equals("http://practice.automationtesting.in/my-account/")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click Login
     * @name Click Login
     */
	public void Click_Login()
	{
        
		WebElement elem = getWebElement(LoginElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Login", "Click_Login failed. Unable to locate object: " + LoginElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Login", "Click_Login failed. Unable to locate object: " + LoginElem.toString());

			Assert.fail("Unable to locate object: " + LoginElem.toString());
        }

		elem.click();
        

		ExtentReportManager.passStep(m_Driver, "Click_Login");

		TestModellerLogger.PassStep(m_Driver, "Click_Login");
	}
      
	/**
 	 * Enter Password *
     * @name Enter Password *
     */
 	public void Enter_Password_(String Password_)
 	{
 	    
 		WebElement elem = getWebElement(Password_Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Password_", "Enter_Password_ failed. Unable to locate object: " + Password_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Password_", "Enter_Password_ failed. Unable to locate object: " + Password_Elem.toString());

 			Assert.fail("Unable to locate object: " + Password_Elem.toString());
         }

 		elem.sendKeys(Password_);
 		

  		ExtentReportManager.passStep(m_Driver, "Enter_Password_ " + Password_);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Password_ " + Password_);
 	}
      
	/**
 	 * Enter Username or email address *
     * @name Enter Username or email address *
     */
 	public void Enter_Username_or_email_address_(String Username_or_email_address_)
 	{
 	    
 		WebElement elem = getWebElement(Username_or_email_address_Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Username_or_email_address_", "Enter_Username_or_email_address_ failed. Unable to locate object: " + Username_or_email_address_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Username_or_email_address_", "Enter_Username_or_email_address_ failed. Unable to locate object: " + Username_or_email_address_Elem.toString());

 			Assert.fail("Unable to locate object: " + Username_or_email_address_Elem.toString());
         }

 		elem.sendKeys(Username_or_email_address_);
 		

  		ExtentReportManager.passStep(m_Driver, "Enter_Username_or_email_address_ " + Username_or_email_address_);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Username_or_email_address_ " + Username_or_email_address_);
 	}
	public void GoToUrl()
	{
		m_Driver.get("http://practice.automationtesting.in/my-account/");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://practice.automationtesting.in/my-account/");

		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://practice.automationtesting.in/my-account/");
	}
}