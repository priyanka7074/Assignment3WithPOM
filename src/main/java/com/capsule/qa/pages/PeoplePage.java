package com.capsule.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.capsule.qa.base.TestBase;

public class PeoplePage extends TestBase{
	
	@FindBy(xpath = "//a[contains(text(),'Add Person')]")
	WebElement addAPersonBtn;
	
	
	
	//Initializing the page objects
			public PeoplePage() {
				PageFactory.initElements(driver, this); //this means pointing to the current class object
				
				}
			
			public String verifyPeoplePageTitle() {
				return driver.getTitle();
			
			}
			
			public ContactsPage clickAddAPerson() {
				
				JavascriptExecutor js = ((JavascriptExecutor) driver);
				js.executeScript("arguments[0].click();", addAPersonBtn);
				return new ContactsPage();
			}
	

}
