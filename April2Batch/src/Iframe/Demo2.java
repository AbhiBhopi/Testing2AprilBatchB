package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\yadav\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();  // upcastin
		
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		Thread.sleep(2000);
WebElement iframe1 = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));

	driver.switchTo().frame(iframe1);
	driver.findElement(By.xpath("//button[@type='button']")).click();
	//driver.switchTo().defaultContent();
	driver.switchTo().parentFrame();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@id='tryhome']")).click();
	}
}
