package KeyboardActionScroll;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardAction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demoqa.com/text-box");
		
		 WebElement fullName = driver.findElement(By.id("userName"));
	        fullName.sendKeys("Mr.Peter Haynes");
	        
	        //Enter the Email
	        WebElement email=driver.findElement(By.id("userEmail"));
	        email.sendKeys("PeterHaynes@toolsqa.com");
	        
	        // Enter the Current Address
	        WebElement currentAddress=driver.findElement(By.id("currentAddress"));
	        currentAddress.sendKeys("43 School Lane London EC71 9GO");
	        

	        
	    	Actions act=new Actions(driver);

	        
	    	/ctrl +a

	    	act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();


	    	//ctrl +c
	    	act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();


	    	//tab
	    	act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
	    	//act.sendKeys(Keys.TAB).perform(); // only if want to press single key then prefer this

	    	//ctrl+v
	    	act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
	       

	        
		

	}

}
