package HandleStatic_DynamicWebTable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticTableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://testautomationpractice.blogspot.com/");

		driver.manage().window().maximize();
		
		int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		int cols=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		
		System.out.println("Book Name"+"     "+"Author"+"    "+"Subject"+"       "+"Price");
		
		/*
		 * for(int r =2; r<=rows;r++) { for(int c=1; c<=cols; c++) { String
		 * value=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+
		 * "]//td["+c+"]")).getText(); System.out.print(value + "\t");
		 * 
		 * } System.out.println(); }
		 */
		
		for(int r =2; r<=rows;r++) {
			String author=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[2]")).getText();
			
			if(author.equals("Mukesh")) {
				
				String bookname=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[1]")).getText();
				System.out.println(author+"    "+bookname);

			}
			
		}
			
		driver.close();

	}
	
}
