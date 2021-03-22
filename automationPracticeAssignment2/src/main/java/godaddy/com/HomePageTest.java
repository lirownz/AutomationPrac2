package godaddy.com;

import org.testng.annotations.Test;


public class HomePageTest extends BaseTest {

	@Test
	public void checkReSizeWindow(){
		HomePage homePage = new HomePage(driver);
		homePage.goToURL().reSizeWindow();
	}

	@Test
	public void checkPageTitle(){
		HomePage homePage = new HomePage(driver);	
		//System.out.println(driver.getTitle());
		homePage.goToURL().assertEqualsText(driver.getTitle(),"Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy IL");		
	}

	@Test
	public void checkPageURL() {
		HomePage homePage = new HomePage(driver);
		homePage.goToURL().assertEqualsText(driver.getCurrentUrl(),"https://il.godaddy.com/en");
	}

	@Test
	public void checkGetPageSource() {
		HomePage homePage = new HomePage(driver);
		//getting page source
		homePage.goToURL().driver.getPageSource();	
	}

	@Test
	public void checkValidateTitleInPageSource() {
		HomePage homePage = new HomePage(driver);
		//checking if page source contain the page title
		//using "boolean Assert True" to check if page source contain the wanted string
		boolean titleInPageSource = driver.getPageSource().contains(driver.getTitle());
		homePage.goToURL().assertTrueIfContain(titleInPageSource);
	}
}
