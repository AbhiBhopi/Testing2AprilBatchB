package String;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class selenium {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\yadav\\Downloads\\chromedriver_win32\\chromedriver.exe");

	   RemoteWebDriver driver = new RemoteWebDriver();  // upcasting 
	   driver.get("https://vctcpune.com/");
	   
	  // Dimension D = new Dimension(300,400);
	//   driver.manage().window().setSize(D);        // set size
	   
	   
	//   Point p = new Point(300,400);              // set position
	//   driver.manage().window().setPosition(p); 
	
	}

}
