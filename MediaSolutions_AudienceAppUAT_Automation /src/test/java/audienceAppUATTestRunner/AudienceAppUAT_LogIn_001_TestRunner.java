package audienceAppUATTestRunner;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.cucumber.listener.ExtentProperties;
import com.cucumber.listener.Reporter;
import audienceAppManagers.AudienceAppWebDriverManager;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

@CucumberOptions(
		features ="/Users/p2815492/git/AudienceAppUATRepo/MediaSolutions_AudienceAppUAT_Automation /src/test/resources/AudienceAppUATFeatures/AudienceAppUAT_LogIn_001.feature", 
		glue = {"audienceAppUATStepDefinitions" 
				
		},
		plugin = { "com.cucumber.listener.ExtentCucumberFormatter:"
				
		},
		
		monochrome = true
		)

public class AudienceAppUAT_LogIn_001_TestRunner  {

	private TestNGCucumberRunner testNGCucumberRunner;
	WebDriver driver;
	AudienceAppWebDriverManager webDriverManager;
	

	@BeforeClass(alwaysRun = true)
	public void setUpClass() {
		ExtentProperties extentProperties = ExtentProperties.INSTANCE;
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		extentProperties.setReportPath("AudienceAppUAT_TestReport/AudienceAppUATDefaultReport_" + timeStamp + ".html");
		testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
	}

	@Test(groups = "cucumber", description = "Runs cucmber Features", dataProvider = "features")
	public void feature(CucumberFeatureWrapper cucumberFeature) {
		testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
	}

	@DataProvider
	public Object[][] features() {
		return testNGCucumberRunner.provideFeatures();
	}

	@AfterClass(alwaysRun = true)
	public void testDownClass() {
		Reporter.setSystemInfo("OS", "MAC");
		Reporter.setSystemInfo("AUTOMATION", "AudienceApp UAT");
		Reporter.assignAuthor("Bijay Karki");
		testNGCucumberRunner.finish();
		webDriverManager = new AudienceAppWebDriverManager();
		webDriverManager.closeDriver();
	}
}
