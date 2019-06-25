package com.capsule.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.capsule.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	@FindBy(id = "login:usernameDecorate:username")
	WebElement loginId;
	
	@FindBy(id = "login:passwordDecorate:password")
	WebElement password;
	
	@FindBy(id = "login:login")
	WebElement signinBtn;
	

	//Initializing the page objects
	public LoginPage() {
		PageFactory.initElements(driver, this); //this means pointing to the current class object
		
		}
	
	public HomePage signIn(String un, String pwd) {
		
		loginId.sendKeys(un);
		password.sendKeys(pwd);
		signinBtn.click();
		return new HomePage();
		
	}
	
	
	
	
	

}
