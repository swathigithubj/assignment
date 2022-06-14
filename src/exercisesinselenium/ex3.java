package exercisesinselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.firefox.driver","C:\\Users\\15513\\Desktop\\geckodriver.exe\\");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.nextgenerationautomation.com/post/selenium-coding-exercises");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//label[text()='Password']")).sendKeys("automation");
		driver.findElement(By.xpath("//div[@id='okButton_SM_ROOT_COMP13']/button")).click();
		

	}

}
