package com.capsule.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.capsule.qa.base.TestBase;

public class ContactsPage extends TestBase{
	
	public String newContactsName,peoplePageContact;
	
	@FindBy(id = "party:fnDecorate:fn")
	WebElement firstName;
	
	@FindBy(id = "party:lnDecorate:ln")
	WebElement lastName;
	
	@FindBy(id = "party:tagsDecorate:tagComboBox")
	WebElement tagName;
	
	@FindBy(id = "party:j_id325:0:phnDecorate:number")
	WebElement phoneNumber;
	
	@FindBy(id = "party:j_id342:0:emlDecorate:nmbr")
	WebElement emailID;
	
	@FindBy(id = "party:save")
	WebElement saveBtn;
	
	@FindBy(xpath = "//span[@class='party-details-title']")
	WebElement contact;
	
	@FindBy(xpath = "//a[@class= 'nav-bar-item nav-bar-item-parties ember-view']")
	WebElement personIcon;
	
	@FindBy(xpath = "//a[contains(text(),'Sunny C')]")
	WebElement peopleContact;
	
	
	//Initializing the page objects
	public ContactsPage() {
		PageFactory.initElements(driver, this); //this means pointing to the current class object
		
		}
	
	public void addAPerson(String title, String ftName, String ltName, String tags, String phone, String email) {
		
		Select select = new Select(driver.findElement(By.name("party:j_id108:j_id116")));
		select.selectByVisibleText(title);
		firstName.sendKeys(ftName);
		lastName.sendKeys(ltName);
		tagName.sendKeys(tags);
		phoneNumber.sendKeys(phone);
		emailID.sendKeys(email);
		saveBtn.click();
		String contactsPageName = contact.getText();
	    newContactsName = contactsPageName.substring(3, 10);
		System.out.println(newContactsName);
		personIcon.click();
		peoplePageContact = peopleContact.getText();
		System.out.println(peoplePageContact);
		
	}

}
