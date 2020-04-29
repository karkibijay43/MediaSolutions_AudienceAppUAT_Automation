package audienceAppUATStepDefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import com.cucumber.listener.Reporter;
import audienceAppManagers.AudienceAppWebDriverManager;
import audienceAppUtilities.AudienceAppScreenShots;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class AudienceAppUATTestHooks {
	WebDriver driver;
	AudienceAppScreenShots audienceAppUATScreenShots;
	AudienceAppWebDriverManager webDriverManager;	
	
	@Before
	public void beforeScenario(Scenario scenario) {
		System.out.println("Started execution for the scenario : " + scenario.getName());
	}
	@Before("@@AudienceAppLogInDefault")
	public void AudienceAppLogInDefault(Scenario scenario) {

		System.out.println("=========================================");
		System.out.println("Executing before AudienceAppLogInDefault");
		System.out.println("=========================================");
	}
	
	@After()
	public void afterScenario(Scenario scenario) throws IOException {
		System.out.println("Completed execution for the scenario :" + scenario.getName());
		System.out.println(scenario.getName() + " Status - " + scenario.getStatus());
		 webDriverManager = new AudienceAppWebDriverManager(); 
		 driver = AudienceAppWebDriverManager.getDriver();
		 //if (scenario.isFailed()) 
		try {
			byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			File screenshot_with_scenario_name = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshot_with_scenario_name,
			new File("/Users/p2815492/Syncplicity Folders/Media Solutions (James.A.Harris@charter.com )/Quality Assurance/Automation Testing Repo/AudienceAppUAT Test Result Screenshots/"+ scenario.getName() + ".png"));
			System.out.println(scenario.getName());
			scenario.embed(screenshot, "image/png");
			  Reporter.setSystemInfo("OS", "MAC"); 
			  Reporter.setSystemInfo("AUTOMATION", "AudienceApp UAT"); 
			  Reporter.assignAuthor("Bijay Karki");
			Reporter.addScreenCaptureFromPath("/Users/p2815492/Syncplicity Folders/Media Solutions (James.A.Harris@charter.com )/Quality Assurance/Automation Testing Repo/AudienceAppUAT Test Result Screenshots/"+ scenario.getName() + ".png");
		} 
		catch 
		(WebDriverException somePlatformsDontSupportScreenshots) {
			System.err.println(somePlatformsDontSupportScreenshots.getMessage());
		}
	}

}
