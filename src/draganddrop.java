import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\15513\\Desktop\\chromedriver.exe");
		  WebDriver driver =new ChromeDriver();
		  driver.get("https://demoqa.com/droppable");
		  driver.manage().window().maximize();
		  
		  driver.findElement(By.id("droppableExample-tab-accept")).click();
		  
		// WebElement drag= driver.findElement(By.xpath("//div[@id='notAcceptable' and @style='position: relative;']"));
		 WebElement drag= driver.findElement(By.xpath("//div[@id='acceptable']"));
		 WebElement drop=driver.findElement(By.xpath("//div[@id='notAcceptable']/following::div[1]"));
		 
		 Actions act=new Actions(driver);
		 act.dragAndDrop(drag, drop);
		 act.build().perform();
		 
		  
		 
		  

	}

}
