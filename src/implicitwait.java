import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class implicitwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\15513\\Desktop\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.easemytrip.com/");
	    driver.manage().window().maximize();
	  WebElement from = driver.findElement(By.id("FromSector_show"));
	  from.sendKeys("Newark");
	  WebElement to=driver.findElement(By.id("Editbox13_show"));
	  to.sendKeys("Mumbai");
	  driver.findElement(By.id("ddate")).sendKeys("21/04/2022");
	  driver.findElement(By.className("src_btn")).click();
	  driver.findElement(By.xpath("//button[text()='Book Now']")).click();
		
		
				
	}
	

}
