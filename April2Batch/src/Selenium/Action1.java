package Selenium;



import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Action1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\yadav\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	driver.get("https://www.facebook.com/login.php");
//	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);// selenium 3.141.59
	
	// selenium 4+
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	// WebDriverWait wait = new WebDriverWait(driver, 30); explicit wait ka object
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20)); // new version
	WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input [@type = 'te']")));
	System.out.println("start");
}
}