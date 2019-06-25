package com.capsule.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.capsule.qa.base.TestBase;

public class NewCasePage extends TestBase {
	
	public String caseNameText, newNameText, status, status1, caseUserName;
	
	@FindBy(xpath = "//div[@class='entity-details-title']")
	WebElement caseName;
	
	@FindBy(xpath = "//a[@class = 'nav-bar-item nav-bar-item-cases ember-view']")
	WebElement casesIcon;
	
	@FindBy(xpath = "//span[@class = 'kase-summary-status-open']")
	WebElement caseStatus;
	
	@FindBy(xpath = "//a[@class= 'ember-view']")
	WebElement casesPageName;
	
	@FindBy(xpath = "//span[@class = 'kase-status is-open']")
	WebElement statusName;
	
	@FindBy(xpath = "//a[@class = 'ember-view']")
	WebElement userName;
	
	
	
	
	//Initializing the page objects
	public NewCasePage() {
		PageFactory.initElements(driver, this); //this means pointing to the current class object
		
		}
	
	public void verifyCaseName() {
		caseNameText = caseName.getText(); //test lost car
		System.out.println(caseNameText);
		status = caseStatus.getText(); //Open
		System.out.println(status);
		caseUserName = userName.getText();
		System.out.println(caseUserName); // Sunny C
		casesIcon.click();
		String casesPageNameText = casesPageName.getText();
		newNameText = casesPageNameText.substring(9, 22); //test lost car
		System.out.println(newNameText);
		status1 = statusName.getText(); //Open
		System.out.println(status1);
	
	}
	

}
