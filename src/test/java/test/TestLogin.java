package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.SetUp;
import pages.HomePage;
import pages.LoginPage;

public class TestLogin extends SetUp{

	@Parameters("browser")
	@Test
	public void realizarLogin(String _browser)
	{
//		HomePage homePage = new HomePage(driver);
//		LoginPage loginPage = new LoginPage(driver);
//		homePage.clickOnLogin();
//		loginPage.sendEmail("daiane.macedo@hotmail.com");
//		loginPage.sendPass("daianerosamacedo");
//		loginPage.clickOnBtnLogin();
		
		
		
		new HomePage(driver)
		.clickOnLogin()
		.sendEmail("ffasd")
		.sendPass("sdfsadf")
		.clickOnBtnLogin();
		
//		new LoginPage(driver)
//		
//		.sendEmail("ffasd")
//		.sendPass("sdfsadf")
//		.clickOnBtnLogin();
				

	
	}
}
