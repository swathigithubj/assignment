import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\15513\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
                 driver.get("https://www.opencart.com/index.php?route=account/register");
                 driver.manage().window().maximize();
              WebElement drpbox=   driver.findElement(By.xpath("//select[@id='input-country']"));
              Select  option=new Select(drpbox);
            // option.selectByIndex(2);
            // option.selectByValue("173");
             option.selectByVisibleText("Denmark");                 
	}

}
