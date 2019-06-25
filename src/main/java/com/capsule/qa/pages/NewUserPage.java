package com.capsule.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.capsule.qa.base.TestBase;

public class NewUserPage extends TestBase {
	
	public String verifyUser;
	
	@FindBy(id = "register:firstnameDecorate:firstName")
	WebElement firstName;
	
	@FindBy(xpath = "//input[@id='register:lastNameDecorate:lastName']")
	WebElement lastName;
	
	@FindBy(xpath = "//input[@id='register:emailDecorate:email']")
	WebElement emailID;
	
	@FindBy(xpath = "//input[@id='register:usernameDecorate:username']")
	WebElement userName;
	
	@FindBy(id = "register:save")
	WebElement inviteUserBtn;
	
	@FindBy(xpath = "//a[contains(text(),'Tom Sharma')]")
	WebElement verifyNewuser;
	
	
	//Initializing the page objects
		public NewUserPage() {
			PageFactory.initElements(driver, this); //this means pointing to the current class object
			
			}
	
	
	public void addANewUser(String fstName, String lstName, String email, String usName) {
		firstName.sendKeys(fstName);
		lastName.sendKeys(lstName);
		emailID.sendKeys(email);
		userName.sendKeys(usName);
		inviteUserBtn.click();
		verifyUser = verifyNewuser.getText();
		System.out.println(verifyUser);
	}
	

}
