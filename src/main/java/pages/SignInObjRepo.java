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

// http://mytestworkspace.cloud.testinsights.io/app/#!/module-collection/guid/8ecd4810-75df-4801-983a-5830c7744d8c
@TestModellerModule(guid = "8ecd4810-75df-4801-983a-5830c7744d8c")
public class SignInObjRepo extends BasePage
{
	public SignInObjRepo (WebDriver driver)
	{
		super(driver);
	}




}