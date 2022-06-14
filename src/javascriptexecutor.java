import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptexecutor {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\15513\\Desktop\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.browserstack.com/users/sign_in");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementById('user_email_login').value='abc@gmail.com';");
		js.executeScript("document.getElementById('user_password').value='hellowelcome';");
		js.executeScript("document.getElementById('user_submit').click();");
		js.executeScript("alert('welcome');");
		

}
}