import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class navaigation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","C:\\Users\\15513\\Desktop\\geckodriver.exe" );
		WebDriver driver=new FirefoxDriver();
		// driver.get("https://www.amazon.com/");
		driver.navigate().to("https://www.flipkart.com/");
		//driver.get("https://www.flipkart.com/");
		//driver.navigate().back();
		//driver.navigate().forward();
		//driver.navigate().refresh();
	}

}
