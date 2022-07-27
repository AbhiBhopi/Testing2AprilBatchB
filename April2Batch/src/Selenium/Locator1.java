package Selenium;

import java.lang.StackWalker.Option;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Locator1 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\yadav\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();  // upcastin
		
	driver.get("https://www.w3schools.com/html/html_tables.asp");
		Thread.sleep(2000);
		List<WebElement> noofRow = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		
		// no of row present in webtable
		System.out.println("No Of Rows : "+ noofRow.size());
		for(int i=1;i<noofRow.size();i++) {
			List<WebElement> noofCell = driver.findElements(By.xpath("//table[@id='customers']//tr["+(i+1)+"]//td"));
			System.out.println("Row NO :"+ i +" No of Cell : "+noofCell.size());
			
			for(int cell=0;cell<noofCell.size();cell++) {
				System.out.print(noofCell.get(cell).getText()+", ");
				
			}
			System.out.println();
			
		}
		
	
	
	
	
	
	
	
	
	
	
	}
}

