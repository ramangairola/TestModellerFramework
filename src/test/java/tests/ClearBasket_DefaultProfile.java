package tests;

import reports.TestNGListener;
import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ie.curiositysoftware.allocation.dto.ResultMergeMethod;
import ie.curiositysoftware.allocation.dto.DataAllocationRow;
import reports.ExtentTestListener;
import ie.curiositysoftware.allocation.dto.DataAllocationResult;
import ie.curiositysoftware.allocation.engine.DataAllocation;
import utilities.testmodeller.TestModellerLogger;

//http://mytestworkspace.cloud.testinsights.io/app/#!/model-engine/guid/7a4d464d-5925-4369-90f5-ed017b3ba61b
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1120, profileId = 100493)
public class ClearBasket_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"ClearBasket","ClearBasket - Default Profile"})
    @TestModellerPath(guid = "0e15b6f2-1591-44d2-9782-45e6115774a9")
    public void VerifyThatUserIsAbleToClearCart()
    {
        
        pages.myAccountPage _myAccountPage = new pages.myAccountPage(driver);
    TestModellerLogger.SetLastNodeGuid("8f90c93a-dc33-404e-b246-76f42b2aeb16");
    _myAccountPage.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("c05841ba-667e-4912-84e8-f626e0e12bbe");
    _myAccountPage.Click_MyAccount();

pages.LoginPage _LoginPage = new pages.LoginPage(driver);
    TestModellerLogger.SetLastNodeGuid("57059072-1899-4408-b0f2-49a68b50d1c4");
    _LoginPage.Enter_Username_or_email_address_("test3@test.com");

    TestModellerLogger.SetLastNodeGuid("351812b9-02e2-41d1-a68e-35be5054f6a9");
    _LoginPage.Enter_Password_("test3@test.com");

    TestModellerLogger.SetLastNodeGuid("12651ffe-cfb1-4370-961a-bbb3bf1861ad");
    _LoginPage.Click_Login();

    TestModellerLogger.SetLastNodeGuid("6a4dd713-a566-49c9-8b51-90239ffa3719");
    _myAccountPage.Click_shopLink();

pages.Products_Automation_Practice_Site _Products_Automation_Practice_Site = new pages.Products_Automation_Practice_Site(driver);
    TestModellerLogger.SetLastNodeGuid("c06f4385-53f7-4f27-b764-883b4063b6c8");
    _Products_Automation_Practice_Site.Assert_Selenium_Ruby();

    TestModellerLogger.SetLastNodeGuid("4dc909d2-1cc3-4a68-9730-dc53f7341998");
    _Products_Automation_Practice_Site.Click_Add_to_basket();

    TestModellerLogger.SetLastNodeGuid("068d5234-4cce-4a9d-a981-f1678df31b91");
    _Products_Automation_Practice_Site.Click_ClickCartLink();

pages.BasketAutomation_Practice_Site _BasketAutomation_Practice_Site = new pages.BasketAutomation_Practice_Site(driver);
    TestModellerLogger.SetLastNodeGuid("c7c57c7a-177e-49da-987e-11799b7027ba");
    _BasketAutomation_Practice_Site.Assert_Selenium_Ruby();

    TestModellerLogger.SetLastNodeGuid("33b1b6c5-7e54-4f8e-8cc2-bfeec78ff8ff");
    _BasketAutomation_Practice_Site.Click_Unknown();

    TestModellerLogger.SetLastNodeGuid("61309e3a-b222-47d2-b405-dd2e5a927242");
    _BasketAutomation_Practice_Site.Assert__Your_basket_is_currently_empty();

    TestModellerLogger.SetLastNodeGuid("ce907f0f-a0b2-48da-b018-fad3c68fa0df");
    _BasketAutomation_Practice_Site.Click__Return_To_Shop_();

    TestModellerLogger.SetLastNodeGuid("def266d8-3413-4b2c-8fa9-aec1e5fa95d1");
    _myAccountPage.Click_MyAccount();

    TestModellerLogger.SetLastNodeGuid("81b6622e-5dce-4555-80dd-627eecd4b691");
    _myAccountPage.Click_Sign_out();

    }


}