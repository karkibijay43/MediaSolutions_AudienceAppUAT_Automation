package audienceAppPageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import adPortalDataProvider.ConfigFileReader;

public class AudienceAppUATLogInPage {
	ConfigFileReader configFileReader;
	public WebDriver driver;
	String audienceAppUATLogInURL = "https://uat01.omniapp.tv/#/login";
	By txtBox_LogInEmail = By.id("user.name");
	By txtBox_LogInPassword = By.id("user.pass");
	By button_LogIn = By.id("btn-login");
	By button_lets_begin = By.xpath("//button[@class='col-xs-3 col-md-3 col-sm-3 btn btn-primary dataCo-banner-button col-xs-9 ng-binding']");
	
	
	
	public AudienceAppUATLogInPage(WebDriver driver) {
		this.driver = driver;
		configFileReader = new ConfigFileReader();

	}

	public void navigateTo_AudienceAppUATLogInPage() {
		driver.get(audienceAppUATLogInURL);
	}

	public void enter_LogInEmail(String email) {
		driver.findElement(txtBox_LogInEmail).clear();
		driver.findElement(txtBox_LogInEmail).sendKeys(email);
	}

	public void enter_LogInPassword(String password) {
		driver.findElement(txtBox_LogInPassword).clear();
		driver.findElement(txtBox_LogInPassword).sendKeys(password);
	}

	public void clickLogIn() {
		driver.findElement(button_LogIn).click();
	}
	
	public void click_Button_LetsBegin() {
		driver.findElement(button_lets_begin);
	}
}
