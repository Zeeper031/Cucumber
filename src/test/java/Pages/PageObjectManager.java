package Pages;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
	WebDriver driver;
	HomePage homePage;
	
	public PageObjectManager(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public HomePage getHomePageObject() {
		
		homePage = new HomePage(driver);
		return homePage;
	}

}
