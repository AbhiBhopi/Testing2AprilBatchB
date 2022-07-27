package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Execution {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\yadav\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();  // upcastin
		
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(3000);
		WebElement login  = driver.findElement(By.xpath("//a[text()='Login']"));
		Actions act = new Actions(driver);
		Thread.sleep(3000);
//		act.click() ;// left single click
//		act.doubleClick() ; // left double click
//		act.contextClick() ; // right click
//		act.moveToElement(targent ); // move to specicfic webelement
//		act.dragAndDrop(link, user); // kam nahi krt
//		act.build() ; // 2 more action combile in same line
//		act.perform() ; // to execute action on browser
		
		
		//act.moveToElement(login).perform();
		
		act.moveToElement(login).perform();
	}
}
