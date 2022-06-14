import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\15513\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/menu");
		driver.manage().window().maximize();
		WebElement dr = driver.findElement(By.linkText("Main Item 2"));
		Actions act=new Actions(driver);
		act.moveToElement(dr);
		act.build().perform();
		WebElement dr2=driver.findElement(By.linkText("SUB SUB LIST »"));
		act.moveToElement(dr2).perform();
		System.out.println(dr2.getText());
		WebElement sub=driver.findElement(By.linkText("Sub Sub Item 1"));
	
		act.moveToElement(sub).perform();
		
		
		
		

	}

}
