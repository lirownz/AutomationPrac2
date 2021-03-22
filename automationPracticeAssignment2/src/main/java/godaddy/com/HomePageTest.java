package godaddy.com;

import org.testng.annotations.Test;


public class HomePageTest extends BaseTest {


	@Test
	public void checkReSizeWindow(){
		HomePage homePage = new HomePage(driver);
		homePage.reSizeWindow();
	}

	@Test
	public void testPageTitle() {
		HomePage homePage = new HomePage(driver);
		//Assert.assertEquals(driver.getTitle(),"Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy IL");
		homePage.assertEqualsText(driver.getTitle(), "Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy IL");
		//super.assertEqualsText(driver.getTitle(), "Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy IL");
	}

	@Test
	public void testPageURL() {
		HomePage homePage = new HomePage(driver);
		homePage.assertEqualsText(driver.getCurrentUrl(),"https://www.godaddy.com/");
	}

	@Test
	public void testPageSource() {
		//printing page source
		System.out.println(driver.getPageSource());		
	}

	@Test
	public void validateTitleInPageSource() {
		HomePage homePage = new HomePage(driver);
		//checking if page source contain the page title
		// using "boolean Assert True" to check if page source contain the wanted string
		boolean titleInPageSource = driver.getPageSource().contains("Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy IL");
		homePage.assertTrueIfContain(titleInPageSource);
	}
}
