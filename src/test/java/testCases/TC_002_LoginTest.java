package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;


public class TC_002_LoginTest extends BaseClass{
	
		@Test(groups={"Sanity","Master"})
	public void VerifyLogin()
	{
		logger.info("***** Starting TC_002_LoginTest  ****");	
		try
		{
	
		HomePage hp =new HomePage(driver);
		    hp.clickMyAccount();
		    logger.info("clicked on myaccount link on the home page..");
			hp.clickLogin();
			logger.info("clicked on login link under myaccount..");

	LoginPage lp= new LoginPage(driver);
	
			lp.EnterEmailAddress(p.getProperty("email"));	
			lp.EnterPassword(p.getProperty("password"));
			lp.ClickLoginButton();
			logger.info("clicked on login Button after entering details.");

			MyAccountPage mp= new MyAccountPage(driver);	
			
            boolean targetPage= mp.isMyAccountPageExists();
            Assert.assertTrue(targetPage);

			logger.info("**** Finished TC_002_Pass****");
			
			mp.clickLogout();
		}
		catch(Exception e)
		{
			Assert.fail();
			logger.info("**** Finished TC_002_Fail****");
		}
		
		logger.info("**** Finished TC_002_LoginTest  ****");

			
			
				
	
	
	}
	
	

}
