package Selenium_Script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.automationpractice.pl/index.php");
		driver.manage().window().maximize(); 
		driver.findElement(By.id("_query_top")).sendKeys("T-shirt");
		driver.findElement(By.name("submit_search")).click();
		//driver.findElement(By.partialLinkText("Printed Chiffon")).click();
		driver.findElement(By.linkText("Printed Chiffon Dress")).click();
		


	}

}
