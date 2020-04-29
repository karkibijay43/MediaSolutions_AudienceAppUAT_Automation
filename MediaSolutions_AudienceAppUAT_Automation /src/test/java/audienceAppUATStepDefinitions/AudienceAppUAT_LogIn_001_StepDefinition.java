package audienceAppUATStepDefinitions;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import audienceAppDataProvider.AudienceAppConfigFileReader;
import audienceAppManagers.AudienceAppPageObjectManager;
import audienceAppManagers.AudienceAppWebDriverManager;
import audienceAppPageObjects.AudienceAppUATLogInPage;
import audienceAppUtilities.AudienceAppScreenShots;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class AudienceAppUAT_LogIn_001_StepDefinition {
	WebDriver driver;
	AudienceAppConfigFileReader audienceAppconfigFileReader;
	AudienceAppPageObjectManager audienceAppPageObjectManager;
	AudienceAppWebDriverManager webDriverManager;
	AudienceAppUATLogInPage  audienceAppUATLogInPage ;
	AudienceAppScreenShots audienceAppScreenShots;
	
	@Given("^User is on AudienceApp UAT Log in Page$")
	public void user_Is_On_AudienceApp_UAT_LohIn_Page() {
		webDriverManager = new AudienceAppWebDriverManager();
		driver = AudienceAppWebDriverManager.getDriver();
		audienceAppconfigFileReader = new AudienceAppConfigFileReader();
		audienceAppPageObjectManager = new AudienceAppPageObjectManager(driver);
		audienceAppUATLogInPage  = audienceAppPageObjectManager.getaudienceAppUATLogInPage ();
		audienceAppUATLogInPage .navigateTo_AudienceAppUATLogInPage ();
		//audienceAppconfigFileReader.getApplicationLoginURL();
	}

	@When("^User enters Login email and password and clicks log in$")
	public void enter_Email_And_Password() throws IOException {
		audienceAppUATLogInPage  = audienceAppPageObjectManager.getaudienceAppUATLogInPage ();
		audienceAppUATLogInPage .enter_LogInEmail("c-bijay.karki@charter.com");
		audienceAppUATLogInPage .enter_LogInPassword("Metallica@8848");
		audienceAppUATLogInPage .clickLogIn();

	}

	@Then("^User lands on request AudienceAPP page$")
	public void verify_AudienceApp_DashBoard() {
		audienceAppUATLogInPage  = audienceAppPageObjectManager.getaudienceAppUATLogInPage ();
		audienceAppUATLogInPage .click_Button_LetsBegin();
		audienceAppScreenShots = new AudienceAppScreenShots(driver);
		audienceAppScreenShots.takeScreenShotLoginTestAudienceAppUAT();
		
	}
}
