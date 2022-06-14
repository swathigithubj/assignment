package exercisesinselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\15513\\Desktop\\chromedriver.exe");
		System.setProperty("webdriver.edge.driver","C:\\Users\\15513\\Desktop\\msedgedriver.exe\\");
		System.setProperty("webdriver.firefox.driver","C:\\Users\\15513\\Desktop\\geckodriver.exe\\");
		
		//WebDriver driver=new EdgeDriver();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		
		

	}
	

}
