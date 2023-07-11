package StepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import Pages.HomePage;
import Pages.PageObjectManager;
import Utils.ContextSetup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeStepDefinitions {
	
	public WebDriver driver;
	public ContextSetup contextSetup;
	public PageObjectManager pageObjectManager;
	
	
	public HomeStepDefinitions(ContextSetup contextSetup) {
		
		this.contextSetup = contextSetup;
	}
	
	@Given("User is in Home Page")
	public void User_is_in_home_page() throws IOException {
	    
		pageObjectManager = new PageObjectManager(contextSetup.baseClass.webDriverManager());
		HomePage homePage = pageObjectManager.getHomePageObject();
		homePage.getAmazonLogoButton().click();
	}
	@And("User search a {string} in search box")
	public void user_search_a_in_search_box(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("User select first option")
	public void user_select_first_option() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("Validate item title should contain {string}")
	public void validate_item_title_should_contain(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


}
