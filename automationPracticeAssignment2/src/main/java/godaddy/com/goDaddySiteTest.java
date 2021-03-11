package godaddy.com;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class goDaddySiteTest extends basePage {
	
	@BeforeClass
	public void setUpBasePest(){
		super.setUpBaseTest();
	}

	@Test
	public void reSizeWindow(){
		super.reSizeWindow();
	}

	@Test
	public void testPageTitle() {
		//Assert.assertEquals(driver.getTitle(),"Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy IL");
		super.assertEqualsText(driver.getTitle(), "Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy IL");
	}

	@Test
	public void testPageURL() {
		super.assertEqualsText(driver.getCurrentUrl(),"https://www.godaddy.com/");
	}

	@Test
	public void testPageSource() {
		//printing page source
		System.out.println(driver.getPageSource());		
	}

	@Test
	public void validateTitleInPageSource() {
		//checking if page source contain the page title
		// using "boolean Assert True" to check if page source contain the wanted string
		boolean titleInPageSource = driver.getPageSource().contains("Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy IL");
		super.assertTrueIfContain(titleInPageSource);
	}

	@AfterClass
	public void teardownBasePage(){
		super.teardownBaseTest();
	}
}
