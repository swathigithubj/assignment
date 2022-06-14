import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;

public class firstselenium {
	static WebDriver driver;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C://Users//15513//Desktop//chromedriver.exe");
	    driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.close();
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\15513\\Desktop\\msedgedriver.exe");
		 driver = new EdgeDriver();
		 driver.get("https://www.amazon.com/");
		driver.close();
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\15513\\Desktop\\geckodriver.exe");
	    driver=new FirefoxDriver();
	    driver.get("https://mathkangaroo.org/mks/");
	    driver.close();
	}
	

}
