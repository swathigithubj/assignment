import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class cookies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\15513\\Desktop\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		System.out.println("\n" +"Before adding a cookie"+"\n");
		
		Set <Cookie> allcookies=driver.manage().getCookies();//fetching cookies
		System.out.println(allcookies.size());//printing size
		for(Cookie singcookie: allcookies) {
			System.out.println(singcookie.getName()+":"+singcookie.getDomain()+":"+singcookie.getValue());
		}                                                                                                 //printing each cookie name and value
		System.out.println(driver.manage().getCookieNamed("session-token"));//getting the cookie details based on the name
		
		//adding new cookie
		System.out.println("\n"+"After adding a cookie"+"\n");
		
		Cookie addmycookie=new Cookie("first cookie","abcd");
		driver.manage().addCookie(addmycookie);
		System.out.println(addmycookie);
		
		Set <Cookie> allcookies1=driver.manage().getCookies();//fetching cookies
		System.out.println(allcookies1.size());
		for (Cookie modcookie:allcookies1) {
			System.out.println(modcookie.getName()+":"+modcookie.getValue());
		}
		System.out.println("\n"+"After Deleting a cookie"+"\n");
		
		driver.manage().deleteCookieNamed("ubid-main");
		Set <Cookie> deletecookies=driver.manage().getCookies();
		System.out.println(deletecookies.size());
		for(Cookie deletecookie:deletecookies) {
			System.out.println(deletecookie.getName()+deletecookie.getValue());
		}
		
	}
	
}