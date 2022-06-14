import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browsercommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.setProperty("webdriver.gecko.driver","C:\\Users\\15513\\Desktop\\geckodriver.exe" );

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		          
		           System.out.println(driver.getCurrentUrl());
		           //System.out.println(driver.getPageSource());
		           System.out.println(driver.getTitle());
		           
		
	}

}

