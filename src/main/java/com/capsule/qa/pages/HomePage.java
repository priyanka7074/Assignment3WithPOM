package com.capsule.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.capsule.qa.base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(id = "ember18")
	WebElement personIcon;
	
	@FindBy(xpath = "//a[@class = 'nav-bar-item nav-bar-item-cases ember-view']")
	WebElement casesIcon;
	
	@FindBy(xpath = "//div[@class = 'menu-select-selected-option ember-view nav-bar-item nav-bar-account-button']")
	WebElement accDrpdwn;
	
	@FindBy(xpath = "//a[contains(text(),'Account Settings')]")
	WebElement accntSettings;
	
	
	//Initializing the page objects
		public HomePage() {
			PageFactory.initElements(driver, this); //this means pointing to the current class object
			
			}
		
		public String verifyHomePageTitle() {
			
			return driver.getTitle();
		}
		
		public PeoplePage clickOnPersonIcon() {
			personIcon.click();
			return new PeoplePage();
			
		}
		
		public CasePage navigateToCasePage() {
			casesIcon.click();
			return new CasePage();
			
		}
		
		public AccountSettingsPage navigateToAccountsPage() {
			accDrpdwn.click();
			Actions action = new Actions(driver);
			action.moveToElement(accntSettings);
			accntSettings.click();
			return new AccountSettingsPage();
			
		}
		
		
}
