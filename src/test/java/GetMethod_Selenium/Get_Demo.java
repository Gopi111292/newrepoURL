package GetMethod_Selenium;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		1) get methods
		
//		get(url) - opens the url on the browser
//		getTitle() - returns title of the page
//		getCurrentUrl() - retuns URL of the page
//		getPageSource()- returns source code of the page
//		getWindowHandle() - returns ID of the single Browser window
//		getWindowHandles() - retuns ID's of the multiple browser windows
		
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
//		getTitle() - returns title of the page
		
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl()); 
		
		System.out.println(driver.getPageSource());
		
		String windowId = driver.getWindowHandle();
		
		System.out.println(windowId);
		
		Set<String> windowids=driver.getWindowHandles();
		
		System.out.println(windowids);
		
		

	}

}
