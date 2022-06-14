package exercisesinselenium;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the browser");
		String browser=sc.nextLine();
		if(browser.equals("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\15513\\Desktop\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.google.com/");
		}
		else if(browser.equals("firefox")) {
			System.setProperty("webdriver.firefox.driver","C:\\Users\\15513\\Desktop\\geckodriver.exe\\");
			WebDriver driver=new FirefoxDriver();
			driver.get("https://www.google.com/");
			
		}
		else{
			System.setProperty("webdriver.edge.driver","C:\\Users\\15513\\Desktop\\msedgedriver.exe\\");
			WebDriver driver=new EdgeDriver();
			driver.get("https://www.google.com/");
			
		}

	}

}
