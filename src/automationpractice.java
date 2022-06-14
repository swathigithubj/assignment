import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class automationpractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\15513\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
       WebElement email= driver.findElement(By.xpath("//input[@type='text']"));
       email.sendKeys("abc@gmail.com");
       Thread.sleep(4000);
       WebElement password= driver.findElement(By.xpath("//input[@id='pass']"));
       password.sendKeys("login");
       Thread.sleep(4000);
       driver.findElement(By.xpath("//button[@name='login']")).click();
       Thread.sleep(4000);
       
        
        driver.close();
	}

}
