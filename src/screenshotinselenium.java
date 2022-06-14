import java.io.File;
import java.io.IOException;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshotinselenium {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\15513\\Desktop\\chromedriver.exe");
		  WebDriver driver =new ChromeDriver();
		  driver.get("https://demoqa.com/");
		 TakesScreenshot ts= ((TakesScreenshot) driver);
		 File src= ts.getScreenshotAs(OutputType.FILE);
		 File target=new File("C:\\Users\\15513\\Desktop\\screen\\file1.png");
		 FileHandler.copy(src, target);  	
		
		System.out.println("Screenshot is captured");
		driver.close();

	}

	
}
