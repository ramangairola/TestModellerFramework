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

// http://mytestworkspace.cloud.testinsights.io/app/#!/module-collection/guid/e4c4e259-102b-4a90-b5ae-4c482803cf56
@TestModellerModule(guid = "e4c4e259-102b-4a90-b5ae-4c482803cf56")
public class Registration extends BasePage
{
	public Registration (WebDriver driver)
	{
		super(driver);
	}


	
	private By Email_address_Elem = By.xpath("//*[@id=\"reg_email\"]");

	private By Password_Elem = By.xpath("//*[@id=\"reg_password\"]");

	private By RegisterElem = By.xpath("//INPUT[@name='register']");

	private By Error_Please_provide_a_valid_email_addressElem = By.xpath("//UL[@class='woocommerce-error']/LI");


	
     
	/**
 	 * Click Error: Please provide a valid email address.
     * @name Click Error: Please provide a valid email address.
     */
	public void Click_Error_Please_provide_a_valid_email_address()
	{
	    
		WebElement elem = getWebElement(Error_Please_provide_a_valid_email_addressElem);

		if (elem == null) {
			ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Error_Please_provide_a_valid_email_address", "Click_Error_Please_provide_a_valid_email_address failed. Unable to locate object: " + Error_Please_provide_a_valid_email_addressElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Error_Please_provide_a_valid_email_address", "Click_Error_Please_provide_a_valid_email_address failed. Unable to locate object: " + Error_Please_provide_a_valid_email_addressElem.toString());

 			Assert.fail("Unable to locate object: " + Error_Please_provide_a_valid_email_addressElem.toString());
        }
        
	}
     
	/**
 	 * Click Register
     * @name Click Register
     */
	public void Click_Register()
	{
        
		WebElement elem = getWebElement(RegisterElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Register", "Click_Register failed. Unable to locate object: " + RegisterElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Register", "Click_Register failed. Unable to locate object: " + RegisterElem.toString());

			Assert.fail("Unable to locate object: " + RegisterElem.toString());
        }

		elem.click();
        

		ExtentReportManager.passStep(m_Driver, "Click_Register");

		TestModellerLogger.PassStep(m_Driver, "Click_Register");
	}
      
	/**
 	 * Enter Email address *
     * @name Enter Email address *
     */
 	public void Enter_Email_address_(String Email_address_)
 	{
 	    
 		WebElement elem = getWebElement(Email_address_Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Email_address_", "Enter_Email_address_ failed. Unable to locate object: " + Email_address_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Email_address_", "Enter_Email_address_ failed. Unable to locate object: " + Email_address_Elem.toString());

 			Assert.fail("Unable to locate object: " + Email_address_Elem.toString());
         }

 		elem.sendKeys(Email_address_);
 		

  		ExtentReportManager.passStep(m_Driver, "Enter_Email_address_ " + Email_address_);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Email_address_ " + Email_address_);
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
 	}}