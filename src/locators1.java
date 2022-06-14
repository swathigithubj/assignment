import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators1 {
	
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\15513\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		//driver.get("https://demoqa.com/radio-button");
		//driver.get("https://demoqa.com/checkbox");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("#userName")).sendKeys("abc");
        Thread.sleep(1000);
	    
		WebElement email=driver.findElement(By.xpath("//*[@id=\"userEmail\"]"));
				email.sendKeys("abc@gmail.com");
		  Thread.sleep(1000);
		driver.findElement(By.id("currentAddress")).sendKeys("defghty");
		  Thread.sleep(1000);
		driver.findElement(By.id("permanentAddress")).sendKeys("defghty");
		  Thread.sleep(1000);
		driver.findElement(By.cssSelector("#submit")).click();

		//driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/label")).click();
		//driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[1]/ol/li/span/label/span[1]/svg/path")).click();
}
}
