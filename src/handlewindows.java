import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlewindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\15513\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();                  //Launching the web browser
		
		driver.findElement(By.id("tabButton")).click();
		Thread.sleep(2000);
		
		String singlewindow=driver.getWindowHandle();//get handle for current window
		
		Set<String> multiwindows=driver.getWindowHandles();//get multiple handles
		
		System.out.println(multiwindows.size());
		
		for (String swwindow:multiwindows) {
			driver.switchTo().window(swwindow);
			
	         System.out.println(driver.findElement(By.id("windowButton")).getText());
		}
		
		Thread.sleep(3000);
		driver.quit();

	}

}

