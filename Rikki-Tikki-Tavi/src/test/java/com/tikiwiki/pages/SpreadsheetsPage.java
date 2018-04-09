package com.tikiwiki.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.tikiwiki.utilities.Driver;

public class SpreadsheetsPage {
	private WebDriver driver;

	public SpreadsheetsPage() {
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}

}
