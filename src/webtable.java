import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webtable {

	public static void main(String[] args) {
		
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\15513\\Desktop\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.w3schools.com/html/html_tables.asp");
	  List<WebElement> row= driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
	  List<WebElement> col=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th"));
	  
	 	  System.out.println(row.size());
	 	  System.out.println(col.size());
	  
	}
}