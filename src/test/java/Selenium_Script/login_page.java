package Selenium_Script;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login_page {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver","C:\\\\Drivers\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.typingstudy.com/lesson/1/part/3");
		driver.manage().window().maximize();
	//	Thread.sleep(5000);
//		driver.findElement(By.name("username")).sendKeys("Admin");
//		driver.findElement(By.name("password")).sendKeys("admin123");
//		driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
//		
		String act_Ti=driver.getTitle();
		String exp_title="OrangeHRM";
		if(act_Ti.equals(exp_title))
		{
			System.out.println("Test passed");
		} else {
			System.out.println("Failed");
		}
		
		
		
		
		
		

	}

}
