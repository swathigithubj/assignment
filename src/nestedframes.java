import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class nestedframes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\15513\\Desktop\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/nestedframes");
		System.out.println(driver.findElement(By.xpath("//div[@id='framesWrapper']/div")).getText());
		//driver.close();
		driver.switchTo().frame("frame1");
		System.out.println(driver.findElement(By.tagName("body")).getText());
		driver.switchTo().defaultContent();
		System.out.println(driver.findElement(By.xpath("")).getText());
		driver.switchTo().frame("//iframe[contains(text(),'Child Iframe']");
		System.out.println(driver.findElement(By.tagName("body")).getText());
	}

}
