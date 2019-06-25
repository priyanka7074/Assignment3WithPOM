package com.capsule.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.capsule.qa.base.TestBase;
import com.capsule.qa.pages.CasePage;
import com.capsule.qa.pages.HomePage;
import com.capsule.qa.pages.LoginPage;

public class CasePageTest extends TestBase{
	
	LoginPage loginpage;
	HomePage homepage;
	CasePage casepage;

	public CasePageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginpage = new LoginPage();
		homepage = loginpage.signIn(prop.getProperty("username"), prop.getProperty("password"));
		casepage = homepage.navigateToCasePage();
		
	}
	
	@Test
	public void navigateToNewCasePage() {
		casepage.clickOnAddCase();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
