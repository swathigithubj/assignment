import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multidropselect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\15513\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//div[text()='Select Option']")).click();
		//driver.findElement(By.xpath("//div[text()='Group 2, option 1']")).click();
		driver.findElement(By.xpath("//div[text()='Select...']")).click();
		driver.findElement(By.xpath("//div[text()='Green']")).click();
		driver.findElement(By.xpath("//div[text()='Blue']")).click();
	
		
		
		
	}
	

}
