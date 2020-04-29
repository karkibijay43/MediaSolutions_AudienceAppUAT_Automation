package audienceAppUtilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



public class AudienceAppScreenShots {
	public static AudienceAppScreenShots audienceAppUATScreenShots;
	private WebDriver driver;
	File source;
	String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());

	public AudienceAppScreenShots(WebDriver driver) {
		this.driver = driver;
	}
	public void takeScreenShotAudienceAppUAT() {
		try {
			source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File(
					"/Users/p2815492/Syncplicity Folders/Media Solutions (James.A.Harris@charter.com )/Quality Assurance/Automation Testing Repo/AudienceAppUAT Automation Test Screenshots/AudienceAppUATRegressioin_"
							+ timeStamp + ".png"));
			System.out.println("Screenshot Taken!!!!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void takeScreenShotLoginTestAudienceAppUAT() {
		try {
			source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File(
					"/Users/p2815492/Syncplicity Folders/Media Solutions (James.A.Harris@charter.com )/Quality Assurance/Automation Testing Repo/AudienceAppUAT Automation Test Screenshots/AudienceApp_LogIn_feature/AudienceAppLoginTest_"
							+ timeStamp + ".png"));
			System.out.println("Screenshot Taken!!!!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
