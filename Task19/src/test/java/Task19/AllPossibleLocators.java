package Task19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AllPossibleLocators {

	public static void main(String[] args) throws Exception {
		// Task19. Q1
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.guvi.in/register");
		
		driver.findElement(By.className("login")).click(); // class name locator to locate login link
		
		driver.findElement(By.id("email")).sendKeys("akshayahari10@gmail.com"); // ID locator to locate email field of login page
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("12345"); //Locator to locate password field
		                                                       //using single attribute xpath
		Thread.sleep(300);
		
		driver.findElement(By.xpath("//a[contains(@id,'login-btn')]")).click(); //to locate login button by contains() method xpath
		
		driver.findElement(By.linkText("Forgot password ?")).click(); //to locate forgot password link using link text
        
		driver.findElement(By.cssSelector("[type=text]")).sendKeys("akshaya@gmail.com"); //locator to locate email field using css selector
	
		driver.findElement(By.tagName("button")).click(); //locator to click "send email" button using tagname
		
		driver.close();
	}

}
