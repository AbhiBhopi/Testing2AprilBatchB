package POPUP;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chil_browser {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\yadav\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.get("https://skpatro.github.io/demo/links/");
		
		driver.findElement(By.xpath("//input[@value='New Tab']")).click();
Set<String> ids = driver.getWindowHandles();
ArrayList<String> al = new ArrayList<String>(ids);
String CWID = al.get(1); // get adress of child window
driver.switchTo().window(CWID);
Thread.sleep(5000);
driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();// click on training
driver.switchTo().window(al.get(0));
// click on new window in main page
driver.findElement(By.xpath("//input[@value='New Window']")).click();




}
}