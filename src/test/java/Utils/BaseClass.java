package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public WebDriver driver;
	
	public WebDriver webDriverManager() throws IOException {
		
//		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\Features\\global.properties");
//		Properties prop = new Properties();
//		prop.load(file);

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.com.mx/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		return driver;
	}

}
