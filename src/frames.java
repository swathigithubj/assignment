import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\15513\\Desktop\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		System.out.println(driver.findElement(By.xpath("//div[@id='framesWrapper']/div[1]")).getText());
	    driver.switchTo().frame("frame1");
	    System.out.println(driver.findElement(By.id("sampleHeading")).getText());
	    driver.switchTo().defaultContent();
	    driver.switchTo().frame("frame2");
	    System.out.println(driver.findElement(By.id("sampleHeading")).getText());
	    
	    
	}

}
