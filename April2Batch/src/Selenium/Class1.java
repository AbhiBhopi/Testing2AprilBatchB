package Selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Class1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\yadav\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();  // upcastin
		driver.get("https://www.facebook.com");

		// 4 +
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// 3.141.59  deprecated - not in use
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Wait
		// Delay
		
		//D 30sec + 60 Sec => 90 Sec
		//W 30sec + 60 Sec => 30 to 90 Sec
		
		// Type of Wait
		// Implicit =>? WAiting Time
		// Explicit => Waiting Time + Condition
		// Fluent   => Waiting Time + Condition + Frequency
		
		// deprecated - not in use  - 3.141.59
		//WebDriverWait wait = new WebDriverWait(driver, 20); // 20 sec 
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20)); // 20 sec 
		
		WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Lin']")));

		System.out.println("start");
		//		
//
//		
//		
//		 
//		driver.get("https://www.flipkart.com/");
//		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
//		Thread.sleep(3000);
//		WebElement login  = driver.findElement(By.xpath("//a[text()='Login']"));
//		Actions act = new Actions(driver);
		Thread.sleep(3000);
//		
		
		
	}
	
	
}
