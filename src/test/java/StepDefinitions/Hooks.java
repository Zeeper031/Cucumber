package StepDefinitions;

import java.io.IOException;

import Utils.ContextSetup;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	public ContextSetup contextSetup;
	
	public Hooks(ContextSetup contextSetup) {
		
		this.contextSetup = contextSetup;
	}
	
	
	@After
	public void afterScenario() throws IOException {
		
		contextSetup.baseClass.webDriverManager().quit();
	}

}
