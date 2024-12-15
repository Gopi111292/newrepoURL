package Frames_GetHandles;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class HandleFrameDemo {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("http://the-internet.herokuapp.com/iframe");
		driver.manage().window().maximize();
		driver.switchTo().frame("mce_0_ifr");
		driver.findElement(By.id("tinymce")).clear(); 
		driver.findElement(By.id("tinymce")).sendKeys("Welcome to automation");
		driver.findElement(By.id("tinymce")).sendKeys(Keys.CONTROL+"A"); //select text
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//button[@title='Bold']")).click();
		WebElement gettext = driver.findElement(By.xpath("//h3[text()='An iFrame containing the TinyMCE WYSIWYG Editor']"));
		String text =gettext.getText();
		System.out.println(text);
		
		driver.quit();
		
		
		
		
		
	}
}
