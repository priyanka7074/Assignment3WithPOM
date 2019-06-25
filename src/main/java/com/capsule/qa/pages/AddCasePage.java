package com.capsule.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.capsule.qa.base.TestBase;

public class AddCasePage extends TestBase {
	
	@FindBy(xpath = "//input[@class='search-select-input ember-view']")
	WebElement casePerson;
	
	@FindBy(xpath = "//span[@class = 'search-select-option-text']")
	WebElement casePersonName;
	
	@FindBy(xpath = "//input[@class='form-input-text kase-form-name']")
	WebElement caseName;
	
	@FindBy(xpath = "//textarea[@class='form-input-text kase-form-description']")
	WebElement description;
	
	@FindBy(xpath = "//input[@class='item-select-input ember-view']")
	WebElement tags;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement saveBtn;
	
	
	//Initializing the page objects
			public AddCasePage() {
				PageFactory.initElements(driver, this); //this means pointing to the current class object
				
				}
			
			public NewCasePage verifyAddACase() {
				casePerson.sendKeys("Sunny");
				casePersonName.click();
				caseName.sendKeys("test lost car");
				description.sendKeys("test");
				tags.sendKeys("car");
				tags.click();
				saveBtn.click();
				return new NewCasePage();
			
			}

}
