package audienceAppManagers;

import org.openqa.selenium.WebDriver;

import audienceAppPageObjects.AudienceAppUATAudiencePage;
import audienceAppPageObjects.AudienceAppUATGoalsPage;
import audienceAppPageObjects.AudienceAppUATLogInPage ;
import audienceAppPageObjects.AudienceAppUATMarketPage;
import audienceAppPageObjects.AudienceAppUATProposalPage;

public class AudienceAppPageObjectManager {
	public WebDriver driver; 
	public AudienceAppUATLogInPage  audienceAppUATLogInPage ;
	public AudienceAppUATMarketPage marketPage;
	public AudienceAppUATAudiencePage audiencePage;
	public AudienceAppUATGoalsPage goalsPage;
	public AudienceAppUATProposalPage proposalPage;
	
	 public AudienceAppPageObjectManager(WebDriver driver) {
		 this.driver = driver;
	 }
	 
	 public AudienceAppUATLogInPage  getaudienceAppUATLogInPage (){ 
		 return (audienceAppUATLogInPage  == null) ? audienceAppUATLogInPage  = new AudienceAppUATLogInPage (driver) : audienceAppUATLogInPage ;
		 
		 }
	 public AudienceAppUATMarketPage getMarketPage(){
		  return (marketPage == null) ? marketPage = new AudienceAppUATMarketPage(driver) : marketPage;
		 
		 }
	 public AudienceAppUATAudiencePage getAudiencePage(){
		  return (audiencePage == null) ? audiencePage = new AudienceAppUATAudiencePage(driver) : audiencePage;
		 
		 }
	 public AudienceAppUATGoalsPage getGoalsPage(){
		  return (goalsPage == null) ? goalsPage = new AudienceAppUATGoalsPage(driver) : goalsPage;
		 
		 }
	 public AudienceAppUATProposalPage getProposalPage(){
		  return (proposalPage == null) ? proposalPage = new AudienceAppUATProposalPage(driver) : proposalPage;
		 
		 }
}
