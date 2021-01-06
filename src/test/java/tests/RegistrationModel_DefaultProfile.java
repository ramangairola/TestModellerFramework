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

//http://mytestworkspace.cloud.testinsights.io/app/#!/model-engine/guid/62535e54-0088-433e-85cf-2cc48f93fb0e
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1095, profileId = 100487)
public class RegistrationModel_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"RegistrationModel","RegistrationModel - Default Profile"})
    @TestModellerPath(guid = "e6efe933-c6f7-422e-9073-f520933aa59d")
    public void GotoURLPositiveEnterEmailaddressPositiveEnterPasswordClickRegisterClickErrorPleaseprovideavalid1()
    {
        
        pages.Registration _Registration = new pages.Registration(driver);
    TestModellerLogger.SetLastNodeGuid("743ca2d4-a5a8-4951-b108-5e29a27d4115");
    _Registration.GoToURL();

    TestModellerLogger.SetLastNodeGuid("70b0103c-02fb-4a8f-8052-5e717ce0ceda");
    _Registration.Enter_Email_address_("roni_cost@example.com");

    TestModellerLogger.SetLastNodeGuid("4ba6dd90-e20f-4f7e-892d-6daf403b68b5");
    _Registration.Enter_Password_("PasswordValid");

    TestModellerLogger.SetLastNodeGuid("d2a0a08d-1b87-422d-b8cc-01cdbaa9eb8d");
    _Registration.Click_Register();

    TestModellerLogger.SetLastNodeGuid("43e52335-cece-4e03-b855-d86eab78dbe4");
    _Registration.Click_Error_Please_provide_a_valid_email_address();

    }


    @Test  (groups= {"RegistrationModel","RegistrationModel - Default Profile"})
    @TestModellerPath(guid = "400ece98-31a7-4938-afb7-92e4d938c132")
    public void GotoURLPositiveEnterEmailaddressNegativeEnterPassword2()
    {
        
        pages.Registration _Registration = new pages.Registration(driver);
    TestModellerLogger.SetLastNodeGuid("743ca2d4-a5a8-4951-b108-5e29a27d4115");
    _Registration.GoToURL();

    TestModellerLogger.SetLastNodeGuid("70b0103c-02fb-4a8f-8052-5e717ce0ceda");
    _Registration.Enter_Email_address_("roni_cost@example.com");

    TestModellerLogger.SetLastNodeGuid("9deef445-cc28-425a-b7d3-76a892b92669");
    _Registration.Enter_Password_("invalidPassword");

    }


    @Test  (groups= {"RegistrationModel","RegistrationModel - Default Profile"})
    @TestModellerPath(guid = "187781d6-dd82-42f5-ad57-bf834ce96786")
    public void GotoURLNegativeEnterEmailaddress3()
    {
        
        pages.Registration _Registration = new pages.Registration(driver);
    TestModellerLogger.SetLastNodeGuid("743ca2d4-a5a8-4951-b108-5e29a27d4115");
    _Registration.GoToURL();

    TestModellerLogger.SetLastNodeGuid("2ac9ad8e-257c-46c7-8f58-177555af4a46");
    _Registration.Enter_Email_address_("abcd");

    }


    @Test  (groups= {"RegistrationModel","RegistrationModel - Default Profile"})
    @TestModellerPath(guid = "8c0b1808-7b99-49ca-b411-a193e2a63094")
    public void GotoURLNegativeEnterEmailaddress4()
    {
        
        pages.Registration _Registration = new pages.Registration(driver);
    TestModellerLogger.SetLastNodeGuid("743ca2d4-a5a8-4951-b108-5e29a27d4115");
    _Registration.GoToURL();

    TestModellerLogger.SetLastNodeGuid("2ac9ad8e-257c-46c7-8f58-177555af4a46");
    _Registration.Enter_Email_address_("");

    }


}