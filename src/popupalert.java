import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popupalert {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("chrome.webdriver.driver","\"C:\\Users\\15513\\Desktop\\chromedriver.exe\\");
		
			         driver=new ChromeDriver();
			         JavascriptExecutor js = (JavascriptExecutor)driver;
					driver.get("https://demoqa.com/alerts");
					
					driver.manage().window().maximize();
					js.executeScript("window.scrollBy(100,300)");//scrolls windows by 300 pixel
					
					
					driver.findElement(By.id("alertButton")).click();					
					Alert al=driver.switchTo().alert();//switching to alert page
					Thread.sleep(4000);
					al.accept();//clicking ok in alert page
					
					driver.findElement(By.id("timerAlertButton")).click();
					Alert al1=driver.switchTo().alert();
					
					al1.accept();
					
					driver.findElement(By.id("confirmButton")).click();
					Alert al2=driver.switchTo().alert();
					Thread.sleep(3000);
					al2.accept();
					//al2.dismiss();
					

	}

}
