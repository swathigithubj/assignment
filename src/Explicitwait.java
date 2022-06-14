import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\15513\\Desktop\\chromedriver.exe\\");//chrome path
		
		WebDriver driver=new ChromeDriver();//initializing driver
		
			
		  driver.get("https://www.easemytrip.com/");
		  
		  
		    driver.manage().window().maximize();
		  
		  driver.findElement(By.id("FromSector_show")).sendKeys("Newark");
		  driver.findElement(By.id("Editbox13_show")).sendKeys("Mumbai");
		  driver.findElement(By.id("ddate")).sendKeys("21/04/2022");
		  driver.findElement(By.className("src_btn")).click();
		  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Book Now']"))); //explicit command
			
		  driver.findElement(By.xpath("//button[text()='Book Now']")).click();

	}

}
