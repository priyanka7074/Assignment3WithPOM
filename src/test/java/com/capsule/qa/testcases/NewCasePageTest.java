package com.capsule.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.capsule.qa.base.TestBase;
import com.capsule.qa.pages.AddCasePage;
import com.capsule.qa.pages.CasePage;
import com.capsule.qa.pages.HomePage;
import com.capsule.qa.pages.LoginPage;
import com.capsule.qa.pages.NewCasePage;

public class NewCasePageTest extends TestBase {
	
	LoginPage loginpage;
	HomePage homepage;
	CasePage casepage;
	AddCasePage addcasepage;
	NewCasePage newcasepage;

	public NewCasePageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginpage = new LoginPage();
		homepage = loginpage.signIn(prop.getProperty("username"), prop.getProperty("password"));
		casepage = homepage.navigateToCasePage();
		addcasepage = casepage.clickOnAddCase();
		newcasepage = addcasepage.verifyAddACase();
	}
	
	@Test
	public void verifyNewCaseNameTest() {
		
		newcasepage.verifyCaseName();
		Assert.assertEquals(newcasepage.caseNameText, newcasepage.newNameText,"Case names are not matching");
		Assert.assertEquals(newcasepage.status, newcasepage.status1, "Case Status are not matching");
		Assert.assertEquals(newcasepage.caseUserName, "Sunny C", "Case user name not assigned to the same user");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
