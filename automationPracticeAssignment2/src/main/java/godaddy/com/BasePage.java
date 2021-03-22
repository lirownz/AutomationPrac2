package godaddy.com;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

import org.testng.Assert;

public class BasePage{

	public WebDriver driver;

	//Constructor
	public BasePage (WebDriver driver){
		this.driver = driver;
	}

	public String getPageTitle (String pageTitle) {
		return pageTitle;
	}

	public void assertEqualsText (String actualTitle, String expectedTitle) {
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	public void assertTrueIfContain(boolean inPageSource) {
		Assert.assertTrue(inPageSource);
	}

	//window resize
	public void reSizeWindow(){
		// dimension the Chrome window to 800x600
		Dimension dimension = new Dimension(800, 600);
		driver.manage().window().setSize(dimension);
		// full screen the Chrome window
		driver.manage().window().fullscreen();
		// maximize the Chrome window
		driver.manage().window().maximize();
	}
}