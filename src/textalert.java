import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class textalert {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\15513\\Desktop\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://demoqa.com/alerts");
			driver.findElement(By.id("promtButton")).click();
			Thread.sleep(4000);
			Alert al=driver.switchTo().alert();
			al.sendKeys("Hello");
			Thread.sleep(4000);
			System.out.println(al.getText());
					al.accept();
					
			
	}

}
