package HandleMouseEvent;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;



public class MouseOVerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

				driver.get("https://testsigma.com/");
			    driver.manage().window().maximize();
			    WebElement element = driver.findElement(By.xpath("//a[text()=’Resources’]"));

			    // Instantiate the Actions class
			    Actions actions = new Actions(driver);

			    // Perform the mouse hover action
			    actions.moveToElement(element).build().perform();

			    // close the browser
			    driver.close();

		
	}

}
