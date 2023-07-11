package Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utils.ContextSetup;

public class HomePage {
	
	public WebDriver driver;
	public ContextSetup contextSetup;
	public WebElement element;
	
	public HomePage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public WebElement getAmazonLogoButton() throws IOException{
		
		element = contextSetup.baseClass.webDriverManager().findElement(By.xpath("//*[@id=\"nav-logo-sprites\"]"));
		return element;
	}

}
