package audienceAppPageObjects;


import org.openqa.selenium.WebDriver;

import audienceAppManagers.WebDriverManager;
import dataProvider.ConfigFileReader;

public class LogInPage {
	ConfigFileReader configFileReader;
	public WebDriver driver;
	
	public LogInPage(WebDriver driver) {
		this.driver = driver;
	
	}
	

}
