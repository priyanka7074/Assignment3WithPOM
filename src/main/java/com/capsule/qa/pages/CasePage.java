package com.capsule.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.capsule.qa.base.TestBase;

public class CasePage extends TestBase {
	
	@FindBy(xpath = "//a[contains(text(), 'Add Case')]")
	WebElement addCaseBtn;
	
	
	//Initializing the page objects
		public CasePage() {
			PageFactory.initElements(driver, this); //this means pointing to the current class object
			
			}
		
		public AddCasePage clickOnAddCase() {
			addCaseBtn.click();
			return new AddCasePage();
		}
	

}
