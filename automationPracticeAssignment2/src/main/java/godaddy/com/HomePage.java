package godaddy.com;
 
import org.openqa.selenium.WebDriver;
 
public class HomePage extends BasePage {
 
    //Constructor
    public HomePage (WebDriver driver) {
        super(driver);
    }
 
    //Page Variables
    String baseURL = "https://www.godaddy.com/";
 
    //Page Methods
    //Go to Homepage
    public HomePage goDaddyCom (){
        driver.get(baseURL);
        return this;
    }
}