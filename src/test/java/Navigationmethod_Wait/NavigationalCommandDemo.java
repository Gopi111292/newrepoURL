package Navigationmethod_Wait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommandDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();

		driver.navigate().to("https://www.amazon.in/");
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().to("https://www.flipkart.com/");
		System.out.println(driver.getCurrentUrl());

		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl()); 
		
		driver.navigate().refresh();

		
		driver.quit();// whole window close 
		driver.close();// current tab close 
	}

}
