package com.tikiwiki.step_definitions;

import org.openqa.selenium.WebDriver;

import com.tikiwiki.pages.MainPage;
import com.tikiwiki.utilities.Driver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ArticlesStepDefs {

	WebDriver driver = Driver.getDriver();
	MainPage mainPage = new MainPage();
	
	@When("^I click on the New Articles$")
	public void i_click_on_the_New_Articles() {
	   
	}

	@Then("^I type in Title input field:$")
	public void i_type_in_Title_input_field(DataTable arg1) {
	    
	}

	@Then("^I type in Heading input field:$")
	public void i_type_in_Heading_input_field(DataTable arg1) {
	   
	}

	@Then("^I type in Body input field:$")
	public void i_type_in_Body_input_field(DataTable arg1) {
	   
	}

	@Then("^I click on button save$")
	public void i_click_on_button_save() {
	  
	}

	@Then("^I should see new Article for \"([^\"]*)\"$")
	public void i_should_see_new_Article_for(String arg1) {
	   
	}

	@When("^I click on the List Articles$")
	public void i_click_on_the_List_Articles() {
	  
	}

	@Then("^I type in search input field:$")
	public void i_type_in_search_input_field(DataTable arg1) {
	   	}

	@Then("^I should see in table of Article list only articles that contains \"([^\"]*)\"$")
	public void i_should_see_in_table_of_Article_list_only_articles_that_contains(String arg1) {
	    
	}
	
}
