package Selenium;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childbrowser1 {
	private static final ArrayList<String> String = null;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\yadav\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();  // upcastin
		
	driver.get("https://skpatro.github.io/demo/links/ ");
		Thread.sleep(2000);
driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();// click on new tab button
Set<String> ids = driver.getWindowHandles();
ArrayList<String>al=new ArrayList<String>(ids);
System.out.println(al);
String CWID = al.get(1);// child broweser adress
driver.switchTo().window(CWID);
Thread.sleep(2000);
driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
driver.switchTo().window(al.get(0));
driver.findElement(By.xpath("//input[@value='New Window']")).click();

}
}
