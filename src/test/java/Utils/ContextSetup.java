package Utils;

import org.openqa.selenium.WebDriver;

public class ContextSetup {
	
	public WebDriver driver;
	public BaseClass baseClass;
	
	public ContextSetup() {
		
		baseClass = new BaseClass();
		
	}

}
