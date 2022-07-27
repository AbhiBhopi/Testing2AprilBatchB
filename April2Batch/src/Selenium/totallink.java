package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class totallink {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\yadav\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();  // upcastin
		
	driver.get("https://www.w3schools.com/html/html_tables.asp");
	List<WebElement> noofRow = driver.findElements(By.xpath("//table[@id='customers']//tr"));
	// total number of row find out 
	System.out.println("total row" + noofRow.size());
	for(int a = 1;a<noofRow.size();a++) {
		List<WebElement> noofCell = driver.findElements(By.xpath("//table[@id='customers']//tr["+(a+1)+"]//td"));
		System.out.println("Row No :"+ a +"No of Cell"+ noofCell.size());
		for(int cell =0;cell<noofCell.size();cell++) {
			System.out.print(noofCell.get(cell).getText()+", ");
			
		}
		System.out.println();
		
	}
	
		

}
}