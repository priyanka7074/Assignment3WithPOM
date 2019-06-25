package com.capsule.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.capsule.qa.base.TestBase;
import com.capsule.qa.pages.AccountSettingsPage;
import com.capsule.qa.pages.HomePage;
import com.capsule.qa.pages.LoginPage;
import com.capsule.qa.pages.NewUserPage;
import com.capsule.qa.util.TestUtil;

public class NewUserPageTest extends TestBase {

	LoginPage loginpage;
	HomePage homepage;
	AccountSettingsPage accountsettings;
	NewUserPage newuserpage;
	TestUtil testutil;
	String sheetName = "User";

	public NewUserPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginpage = new LoginPage();
		homepage = loginpage.signIn(prop.getProperty("username"), prop.getProperty("password"));
		accountsettings = homepage.navigateToAccountsPage();
		newuserpage = accountsettings.validateUsersTab();
	}

	@DataProvider
	public Object[][] getCapsuleTestDatas() {
		Object data[][] = TestUtil.getTestData(sheetName);
		return data;
	}

	@Test(dataProvider = "getCapsuleTestDatas")
	public void validateNewUserTest(String firstName, String lastName, String email, String userName) {
		newuserpage.addANewUser(firstName, lastName, email, userName);
		Assert.assertEquals(newuserpage.verifyUser, "Tom Sharma", "New User Tom Sharma is not matching");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
