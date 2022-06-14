import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtabledemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\15513\\Desktop\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.toolsqa.com/selenium-webdriver/handle-dynamic-webtables-in-selenium-webdriver/");
		  
		List<WebElement> row=driver.findElements(By.xpath("//main[@role='main']/table/tbody/tr"));//xpath for finding row
		System.out.println(row.size());//row size
		
		for (WebElement allrow:row) 
		{
			
			System.out.println(allrow.getText());  //row text
			
		}
		List<WebElement> col=driver.findElements(By.xpath("//main[@role='main']/table/thead/tr/th/em/strong"));//xpath for column
		for (WebElement allcol:col) {
			System.out.println(allcol.getText());//prints all column
		}
		
		System.out.println(col.size());//prints column size
		
		WebElement ele=  driver.findElement(By.xpath("//main[@role='main']/table/tbody/tr[1]/td[1]"));//xpath for particular element
		
		String s=ele.getText();
		System.out.println(s);
		  

	}

}
