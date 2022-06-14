import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class fluentwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\15513\\Desktop\\chromedriver.exe\\");//chrome path
		
		WebDriver driver=new ChromeDriver();//initializing driver
		
			
		driver.get("http://automationpractice.com/index.php");
		FluentWait wait=new FluentWait (driver);
		wait.withTimeout(Duration.ofSeconds(15));
		wait.pollingEvery(Duration.ofMillis(100));
		wait.ignoring(NullPointerException.class);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a")));
		//WebElement search= driver.findElement(By.id("search_query_top"));
		//search.sendKeys("men dress");
	    //driver.findElement(By.xpath("//button[@name='submit_search']")).click();
		WebElement woman=driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a"));
		Actions act=new Actions(driver);
		act.moveToElement(woman).click().perform();
	    
		
		
	}

}
