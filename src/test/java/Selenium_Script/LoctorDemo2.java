package Selenium_Script;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;


import io.github.bonigarcia.wdm.WebDriverManager;
public class LoctorDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();

		//Open app
		driver.get("http://www.automationpractice.pl/index.php");
		driver.manage().window().maximize(); 
		
		List<WebElement>slider=driver.findElements(By.className("homeslide"));
		
		System.out.println("Number of slider" +slider.size());
		
		
		List<WebElement> images=driver.findElements(By.tagName("img"));
		System.out.println("Total number of images:"+images.size());


	}

}
