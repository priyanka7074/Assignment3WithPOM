package com.capsule.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.capsule.qa.base.TestBase;
import com.capsule.qa.pages.HomePage;
import com.capsule.qa.pages.LoginPage;

public class HomePageTest extends TestBase {
	
	LoginPage loginpage;
	HomePage homepage;
	

	public HomePageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginpage = new LoginPage();
		homepage = loginpage.signIn(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	@Test(priority = 1)
	public void verifyHomePagTitleTest() {
		String homePageTitle = homepage.verifyHomePageTitle();
		Assert.assertEquals(homePageTitle, "Dashboard | Student CRM", "Home Page Title mismatch");
		
	}
	
	@Test(priority = 2)
	public void navigateToPeoplePage() {
		homepage.clickOnPersonIcon();
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
