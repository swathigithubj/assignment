import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxchecking {

	public static void main(String[] args) throws InterruptedException {
		 //TODO Auto-generated method stub
  System.setProperty("webdriver.chrome.driver","C:\\Users\\15513\\Desktop\\chromedriver.exe");
  WebDriver driver =new ChromeDriver();
  driver.get("https://demoqa.com/checkbox");
   WebElement check=driver.findElement(By.xpath("//span[@class=\"rct-checkbox\"]"));
   
   System.out.println("The check box is selected" +  check.isSelected());
   if(check.isSelected()== false)
   
	   check.click();
   
  System.out.println("The check box status is"+check.isSelected());
   
      
   
   
	}

}
