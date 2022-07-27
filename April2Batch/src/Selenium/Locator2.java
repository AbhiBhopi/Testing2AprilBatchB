package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator2 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\yadav\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();  // upcasting 
	   driver.get("https://www.facebook.com/login/");
	   Thread.sleep(2000);
	// driver.findElement(By.xpath("(//input[contains(@class,'inputtext')])[1]")).sendKeys("abhi.bhopi@gmail.com");
	// driver.findElement(By.xpath("//a[contains(text(),'acc')]")).click();
	boolean result=driver.findElement(By.xpath("//button[@value='1']")).isEnabled();
	System.out.println(result);
	if(result == true) {
		System.out.println("element is enable ");
	}
	else {System.out.println("element is disabled");}
	}
	}
