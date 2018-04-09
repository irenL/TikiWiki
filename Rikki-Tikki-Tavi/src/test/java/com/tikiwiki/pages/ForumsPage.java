package com.tikiwiki.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.tikiwiki.utilities.Driver;

public class ForumsPage {
private WebDriver driver;
	
	public ForumsPage() {
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath = "//a[@href='#content_admin_forums1-2']")
	public WebElement ILYforumsCreateNewForumButton;
	
	@FindBy(id = "name")
	public WebElement ILYforumsNameEntryField; 	
	
	@FindBy(name = "description")
	public WebElement ILYforumsdescriptionEntryField;
	
	@FindBy(name = "save")
	public WebElement ILYforumsSaveButton;
	
	// !!!!WORK ON THIS!!!!!
	//@FindBy(xpath = "=//*[contains(text(), 'forum45')]/../../td[9]")
	//public WebElement ILYforumsHooverOver;

	//!!! ADD click on delete link
	
	@FindBy(xpath = "=//div[3]/button[2]")
	public WebElement ILYforumsPopUpOKButton;
	
	
	
	
	
}