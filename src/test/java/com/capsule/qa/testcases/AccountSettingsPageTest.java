package com.capsule.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.capsule.qa.base.TestBase;
import com.capsule.qa.pages.AccountSettingsPage;
import com.capsule.qa.pages.HomePage;
import com.capsule.qa.pages.LoginPage;

public class AccountSettingsPageTest extends TestBase {
	
	LoginPage loginpage;
	HomePage homepage;
	AccountSettingsPage accountsettings;

	public AccountSettingsPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginpage = new LoginPage();
		homepage = loginpage.signIn(prop.getProperty("username"), prop.getProperty("password"));
		accountsettings = homepage.navigateToAccountsPage();
		
	}
	
	@Test(priority = 1)
	public void validatePageHeader() {
		accountsettings.validatePageHeaderName();
		Assert.assertEquals(accountsettings.AccntSettingsName, "Account Settings", "Account settings header name mismatch");
		
	}
	
	@Test(priority = 2)
	public void validateAccountsTabTest() {
		accountsettings.validateAccountTab();
		Assert.assertEquals(accountsettings.accountName, "Account", "Account header name mismatch ");
		
	}
	
	@Test(priority = 3)
	public void validateInvoicesTabTest() {
		accountsettings.validateInvoicesTab();
		Assert.assertEquals(accountsettings.invoiceName, "Invoices", "Invoices header name mismatch ");
		
	}
	
	@Test(priority = 4)
	public void validateExportTabTest() {
		accountsettings.validateExportTab();
		Assert.assertEquals(accountsettings.exportName, "Export", "Export header name mismatch ");
		
	}
	
	@Test(priority = 5)
	public void validateAppearanceTabTest() {
		accountsettings.validateAppearanceTab();
		Assert.assertEquals(accountsettings.appearanceName, "Appearance", "Appearance header name mismatch ");
		
	}
	
	@Test(priority = 6)
	public void validateMailDropBoxTabTest() {
		accountsettings.validateMailDropBoxTab();
		Assert.assertEquals(accountsettings.mailDropBoxName, "Mail Drop Box", "Mail Drop Box header name mismatch ");	
	}
	
	
	@Test(priority = 7)
	public void validateUsersTabTest() {
		accountsettings.validateUsersTab();
		Assert.assertEquals(accountsettings.usersName, "Users", "Users header name mismatch ");	
	}
	
	
	@Test(priority = 8)
	public void validateOpportunitiesTabTest() {
		accountsettings.validateOpportunitiesTab();
		Assert.assertEquals(accountsettings.opportunitiesName, "Opportunities", "Opportunities header name mismatch ");
		Assert.assertEquals(accountsettings.milestoneNameText, "Bus Milestone", "Bus Milestone is not created");
	}
	
	@Test(priority = 9)
	public void validateTracksTabTest() {
		accountsettings.validateTracksTab();
		Assert.assertEquals(accountsettings.trackName, "Tracks", "Tracks header name mismatch ");
		Assert.assertEquals(accountsettings.getTaskName, "Priya Track", "Priya Track is not created");
	}
	
	
	@Test(priority = 10)
	public void validateTaskCategoriesTabTest() {
		accountsettings.validateTaskCategoriesTab();
		Assert.assertEquals(accountsettings.taskCategoriesName, "Task Categories", "Task Categories header name mismatch ");
		Assert.assertEquals(accountsettings.newCategoryVerifyName, "Millenial", "Millenial task category is not created");
	}
	
	@Test(priority = 11)
	public void validateCustomFieldsTabTest() {
		accountsettings.validateCustomFieldsTab();
		Assert.assertEquals(accountsettings.customFieldsName, "Custom Fields", "Custom Fields header name mismatch ");
	}
	
	
	@Test(priority = 12)
	public void validateTagsTabTest() {
		accountsettings.validateTagsTab();
		Assert.assertEquals(accountsettings.tagsName, "Tags and DataTags", "Tags and DataTags header name mismatch ");
		Assert.assertEquals(accountsettings.newTagNameVerify, "cart", "cart tag name is not created");
		
	}
	
	@Test(priority = 13)
	public void validateIntegrationsTabTest() {
		accountsettings.validateIntegrationsTab();
		Assert.assertEquals(accountsettings.integrationsName, "Integrations", "Integrations header name mismatch ");
		}
	
	@Test(priority = 14)
	public void validateTrashTabTest() {
		accountsettings.validateTrashTab();
		Assert.assertEquals(accountsettings.trashName, "Trash", "Trash header name mismatch ");
		}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
