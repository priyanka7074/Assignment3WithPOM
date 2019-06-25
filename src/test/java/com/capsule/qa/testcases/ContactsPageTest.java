package com.capsule.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.capsule.qa.base.TestBase;
import com.capsule.qa.pages.ContactsPage;
import com.capsule.qa.pages.HomePage;
import com.capsule.qa.pages.LoginPage;
import com.capsule.qa.pages.PeoplePage;
import com.capsule.qa.util.TestUtil;

public class ContactsPageTest extends TestBase {
	
	LoginPage loginpage;
	HomePage homepage;
	PeoplePage peoplepage;
	ContactsPage contactspage;
	TestUtil testutil;
	String sheetName = "Person";
	
	public ContactsPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginpage = new LoginPage();
		homepage = loginpage.signIn(prop.getProperty("username"), prop.getProperty("password"));
		peoplepage = homepage.clickOnPersonIcon();
		contactspage = peoplepage.clickAddAPerson();
		
	}
	
	@DataProvider
	public Object[][] getCapsuleTestData() {
		Object data[][] = TestUtil.getTestData(sheetName);
		return data;
		
	}
	
	@Test(priority = 1, dataProvider = "getCapsuleTestData")
	public void validateNewPersonTest(String title,String firstName,String lastName,String tags,String phoneNo,String email) {
		
		contactspage.addAPerson(title, firstName, lastName, tags, phoneNo, email);	
		Assert.assertEquals(contactspage.newContactsName, contactspage.peoplePageContact,"Contact name mismatch");
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}


}
