package com.capsule.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.capsule.qa.base.TestBase;
import com.capsule.qa.pages.HomePage;
import com.capsule.qa.pages.LoginPage;
import com.capsule.qa.pages.PeoplePage;

public class PeoplePageTest extends TestBase {
	
	LoginPage loginpage;
	HomePage homepage;
	PeoplePage peoplepage;
	
	
	public PeoplePageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginpage = new LoginPage();
		homepage = loginpage.signIn(prop.getProperty("username"), prop.getProperty("password"));
		peoplepage = homepage.clickOnPersonIcon();
		
	}
	
	@Test(priority = 1)
	public void verifyPeoplePageTitleTest() {
		String peoplePageTitle = peoplepage.verifyPeoplePageTitle();
		Assert.assertEquals(peoplePageTitle, "People & Organizations | Student CRM", "People Page Title mismatch");
		
	}
	
	@Test(priority = 2)
	public void navigateToContactsPage() {
		peoplepage.clickAddAPerson();
	} 
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
