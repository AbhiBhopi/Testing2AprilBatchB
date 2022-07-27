package Selenium;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshot {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\yadav\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); 
	   driver.get("https://www.amazon.in/");
	
	   
	  File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  
	String random = RandomString.make(2);
	
	  File dest = new File("C:\\Users\\yadav\\OneDrive\\Desktop\\Screenshot\\Test"+random+".jpg");
	  
	  FileHandler.copy(source, dest);
	  
	}

}
