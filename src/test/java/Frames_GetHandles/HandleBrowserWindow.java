package Frames_GetHandles;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class HandleBrowserWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		Set<String> windowIds = driver.getWindowHandles();
		
		List<String>windowidsList= new ArrayList(windowIds);
		String parentWindowID=windowidsList.get(0);
		String childWindowID=windowidsList.get(1);
		
		driver.switchTo().window(childWindowID);
		driver.findElement(By.xpath("//div[@class='d-flex web-menu-btn']//li[1]//a[1]")).click();

		
		driver.switchTo().window(parentWindowID);
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
		driver.quit();



		
		
	}

}
