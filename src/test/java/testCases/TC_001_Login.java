package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pageobjectclasses.DashboardPage;
import Pageobjectclasses.LoginPage;
import testBase.BaseClass;

public class TC_001_Login extends BaseClass {
	
	@Test
	public void test_Login() {
		logger.debug("***Application log.....");
		logger.info("**** Starting TC_001_Login Test****");
		try
		{
		LoginPage lp=new LoginPage(driver);
		lp.setFirstname(rb.getString("username"));
		logger.info("Entering username");
		lp.setPassword(rb.getString("password"));
		logger.info("Entering password");
		lp.clickLogin();
		logger.info("click on lohin button");
		
		DashboardPage dp=new DashboardPage(driver);
		logger.info("validating login page");
		String act_msg=dp.getDashbord();
		Assert.assertEquals(act_msg, "Dashboard","Test passed");
		}
		catch(Exception e) {
			logger.error("Test is failed");
			Assert.fail();
		}
		logger.info("**** Finished TC_001_Login Test****");
	}
	
	

}
