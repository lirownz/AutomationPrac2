package godaddy.com;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class baseTest{

	public WebDriver driver;

	public void setUpTest() {
		//setting Chrome driver from Maven  
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://www.godaddy.com/");
		driver.manage().window().maximize();
	}


	public void teardown () {
		//setting Chrome driver to quit after finishing all tests
		driver.quit();
		System.out.println("Test Completed");
	}
}
