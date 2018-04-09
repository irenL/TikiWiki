package com.tikiwiki.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.tikiwiki.utilities.Driver;

public class ArticlesPage {

private WebDriver driver;
	
	public ArticlesPage() {
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
		
	}
	
}
