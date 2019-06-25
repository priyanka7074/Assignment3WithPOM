package com.capsule.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.capsule.qa.base.TestBase;

public class AccountSettingsPage extends TestBase {
	
	public String AccntSettingsName, accountName,invoiceName, exportName, appearanceName, mailDropBoxName, usersName, opportunitiesName, milestoneNameText, trackName, getTaskName, taskCategoriesName, newCategoryVerifyName, customFieldsName, tagsName, newTagNameVerify, integrationsName, trashName;
	
	@FindBy(xpath = "//span[@class='settings-content-menu-title']")
	WebElement accntHeader;
	
	@FindBy(xpath = "//li[@class='selected']//a[contains(text(),'Account')]")
	WebElement acountLeftTab;
	
	@FindBy(xpath = "//h1[@class='settings-page-header']")
	WebElement acountHeader;
	
	@FindBy(xpath = "//a[contains(text(),'Invoices')]")
	WebElement invoicesLeftTab;
	
	@FindBy(xpath = "//header[@class='page-box-header']")
	WebElement invoicesHeader;
	
	@FindBy(xpath = "//a[contains(text(),'Export')]")
	WebElement exportLeftTab;
	
	@FindBy(xpath = "//h1[@class='settings-page-header']")
	WebElement exportHeader;
	
	@FindBy(xpath = "//a[contains(text(),'Appearance')]")
	WebElement appearanceLeftTab;
	
	@FindBy(xpath = "//h1[@class='settings-page-header']")
	WebElement appearanceHeader;
	
	@FindBy(name = "appearance:uploadDecorate:logoImage")
	WebElement chooseFileBtn;
	
	@FindBy(xpath = "//a[@class='btn-primary singlesubmit']")
	WebElement saveBtn;
	
	@FindBy(xpath = "//a[contains(text(),'Mail Drop Box')]")
	WebElement mailDropBoxLeftTab;
	
	@FindBy(xpath = "//h2[@class='settings-page-header']")
	WebElement mailDropBoxHeader;
	
	@FindBy(xpath = "//a[contains(text(),'Users')]")
	WebElement usersLeftTab;
	
	@FindBy(xpath = "//h2[@class='settings-page-header']")
	WebElement usersHeader;
	
	@FindBy(xpath = "//a[@class='action btn-primary btn-primary-clear']")
	WebElement addNewUserBtn;
	
	@FindBy(xpath = "//ul[@class='nav-panel']//a[contains(text(),'Opportunities')]")
	WebElement opportunitiesLeftTab;
	
	@FindBy(xpath = "//header[@class='page-box-header']")
	WebElement opportunitiesHeader;
	
	@FindBy(xpath = "//button[@class='btn-primary']")
	WebElement addNewMilestoneBtn;
	
	@FindBy(xpath = "//input[@class='form-input-text milestone-modal-name']")
	WebElement milestoneName;
	
	@FindBy(xpath = "//textarea[@class='form-input-text milestone-modal-description']")
	WebElement description;
	
	@FindBy(xpath = "//input[@class='form-input-text milestone-modal-probability']")
	WebElement probability;
	
	@FindBy(xpath = "//input[@class='form-input-text milestone-modal-days-until-stale']")
	WebElement staleDays;
	
	@FindBy(xpath = "//button[@class='async-button ember-view btn-primary']")
	WebElement saveMilestoneBtn;
	
	@FindBy(xpath = "//button[text()='Bus Milestone']")
	WebElement testMilestone;
	
	@FindBy(xpath = "//a[contains(text(),'Tracks')]")
	WebElement tracksLeftTab;
	
	@FindBy(xpath = "//h2[@class='settings-page-header']")
	WebElement tracksHeader;
	
	@FindBy(xpath = "//a[@class='action btn-primary btn-primary-clear']")
	WebElement addNewTrackBtn;
	
	@FindBy(xpath = "//input[@id='j_id118:trackDescriptionDecorate:trackDescription']")
	WebElement newtrackName;
	
	@FindBy(xpath = "//input[@id='j_id118:trackTagDecorate:trackTag']")
	WebElement newTagName;
	
	@FindBy(xpath = "//a[@class='btn-primary btn-clear singlesubmit']")
	WebElement saveTrackBtn;
	
	@FindBy(xpath = "//input[@id='j_id118:taskLines:0:taskDescriptionDecorate:taskDescription']")
	WebElement task;
	
	@FindBy(xpath = "//a[contains(text(),'Priya Track')]")
	WebElement verifyTask;
	
	@FindBy(xpath = "//a[contains(text(),'Task Categories')]")
	WebElement taskCategoriesLeftTab;
	
	@FindBy(xpath = "//h2[@class='settings-page-header']")
	WebElement taskCategoriesHeader;
	
	@FindBy(xpath = "//a[@class='action btn-primary btn-clear']")
	WebElement addNewCategoryBtn;
	
	@FindBy(xpath = "//input[@id='editCategoryForm:taskCategoryNameDecorate:taskCategoryName']")
	WebElement newCategoryName;
	
	@FindBy(xpath = "//span[@id='selectedColor']")
	WebElement newCategoryColor;
	
	@FindBy(xpath = "//span[@class='cp-color-chooser-color cp-color-9']")
	WebElement newCategoryColorSelect;
	
	@FindBy(xpath = "//input[@id='editCategoryForm:j_id170']")
	WebElement newCategorySaveBtn;
	
	@FindBy(xpath = "//a[contains(text(),'Millenial')]")
	WebElement newCategoryVerify;
	
	@FindBy(xpath = "//a[contains(text(),'Custom Fields')]")
	WebElement customFieldsLeftTab;
	
	@FindBy(xpath = "//h2[@class='settings-page-header']")
	WebElement customFieldsHeader;
	
	@FindBy(xpath = "//a[contains(text(),'Tags')]")
	WebElement tagsLeftTab;
	
	@FindBy(xpath = "//h2[@class='settings-page-header']")
	WebElement tagsHeader;
	
	@FindBy(xpath = "//a[@class='action btn-primary btn-clear']")
	WebElement addNewTagBtn;
	
	@FindBy(xpath = "//input[@id='j_id172:tagNameDecorate:tagName']")
	WebElement addNewTagName;
	
	@FindBy(xpath = "//input[@class='btn-primary singlesubmit']")
	WebElement addNewTagSaveBtn;
	
	@FindBy(xpath = "//a[contains(text(),'cart')]")
	WebElement tagsNameVerify;
	
	@FindBy(xpath = "//a[contains(text(),'Integrations')]")
	WebElement integrationsLeftTab;
	
	@FindBy(xpath = "//h2[@class='settings-page-header']")
	WebElement integrationsHeader;
	
	@FindBy(xpath = "//a[contains(text(),'Trash')]")
	WebElement trashLeftTab;
	
	@FindBy(xpath = "//h2[@class='settings-page-header']")
	WebElement trashHeader;
	
	
	
	
	
	//Initializing the page objects
			public AccountSettingsPage() {
				PageFactory.initElements(driver, this); //this means pointing to the current class object
				}
			
			
			public void validatePageHeaderName() {
				AccntSettingsName = accntHeader.getText();
				System.out.println(AccntSettingsName);
			}

			
			public void validateAccountTab() {
				acountLeftTab.click();
				accountName = acountHeader.getText();
				System.out.println(accountName);
				}
			
			
			public void validateInvoicesTab() {
				invoicesLeftTab.click();
				invoiceName = invoicesHeader.getText();
				System.out.println(invoiceName);
				}
			
			
			public void validateExportTab() {
				exportLeftTab.click();
				exportName = exportHeader.getText();
				System.out.println(exportName);
				}
			
			
			public void validateAppearanceTab() {
				appearanceLeftTab.click();
				appearanceName = appearanceHeader.getText();
				System.out.println(appearanceName);
				chooseFileBtn.sendKeys("D:\\Java_Naveen notes\\pause.png");
				saveBtn.click();
				}
			
			
			public void validateMailDropBoxTab() {
				mailDropBoxLeftTab.click();
				mailDropBoxName = mailDropBoxHeader.getText();
				System.out.println(mailDropBoxName);
				}
			
			
			public NewUserPage validateUsersTab() {
				usersLeftTab.click();
				usersName = usersHeader.getText();
				System.out.println(usersName);
				addNewUserBtn.click();
				return new NewUserPage();
				}
			
			
			public void validateOpportunitiesTab() {
				opportunitiesLeftTab.click();
				opportunitiesName = opportunitiesHeader.getText();
				System.out.println(opportunitiesName);
				addNewMilestoneBtn.click();
				milestoneName.sendKeys("Bus Milestone");
				description.sendKeys("This is a test milestone");
				probability.sendKeys("30");
				staleDays.sendKeys("20");
				saveMilestoneBtn.click();
				milestoneNameText = testMilestone.getText();
				System.out.println(milestoneNameText);
				}
			
			
			public void validateTracksTab() {
				tracksLeftTab.click();
				trackName = tracksHeader.getText();
				System.out.println(trackName);
				addNewTrackBtn.click();
				newtrackName.sendKeys("Priya Track");
				newTagName.sendKeys("tester");
				task.sendKeys("ptest");
				saveTrackBtn.click();
			    getTaskName = verifyTask.getText();
				System.out.println(getTaskName);
				}
			
			
			public void validateTaskCategoriesTab() {
				taskCategoriesLeftTab.click();
				taskCategoriesName = taskCategoriesHeader.getText();
				System.out.println(taskCategoriesName);
				addNewCategoryBtn.click();
				newCategoryName.sendKeys("Millenial");
				newCategoryColor.click();
				newCategoryColorSelect.click();
				newCategorySaveBtn.click();
				newCategoryVerifyName = newCategoryVerify.getText();
				System.out.println(newCategoryVerifyName);
				}
			
			
			public void validateCustomFieldsTab() {
				customFieldsLeftTab.click();
				customFieldsName = customFieldsHeader.getText();
				System.out.println(customFieldsName);
			}
			
			
			public void validateTagsTab() {
				tagsLeftTab.click();
				tagsName = tagsHeader.getText();
				System.out.println(tagsName);
				addNewTagBtn.click();
				addNewTagName.sendKeys("cart");
				addNewTagSaveBtn.click();
				newTagNameVerify = tagsNameVerify.getText();
				System.out.println(newTagNameVerify);
			}
			
			
			public void validateIntegrationsTab() {
				integrationsLeftTab.click();
				integrationsName = integrationsHeader.getText();
				System.out.println(integrationsName);
				List<WebElement> configureBtnList = driver.findElements(By.xpath("//a[contains(text(),'Configure')]"));
				System.out.println("No Of Configure buttons in the Integrations Page are: "+configureBtnList.size());
			}
			
			
			public void validateTrashTab() {
				trashLeftTab.click();
				trashName = trashHeader.getText();
				System.out.println(trashName);
			}
			

}
