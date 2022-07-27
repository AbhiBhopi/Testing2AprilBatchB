package POPUP;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\yadav\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();  // upcastin
		
	driver.get("https://www.w3schools.com/html/html_tables.asp");
	List<WebElement> noOfRow = driver.findElements(By.xpath("//table[@id='customers']//tr"));
	System.out.println("total row" + noOfRow.size());
	for(int a = 1 ; a < noOfRow.size() ; a++) 
	{

		
		List<WebElement> noOfCell = driver.findElements(By.xpath("//table[@id='customers']//tr["+ (a+1) +"]//td"));
		System.out.println( "ROW No : " + a + " No Of Cell" + noOfCell.size());
		
		for(int cell = 0 ; cell < noOfCell.size() ; cell++ )
		{
			System.out.print(noOfCell.get(cell).getText() + ", ");
		}
		System.out.println(); // line change
		//table[@id='customers']//tr[3]//td
		//System.out.println(links.get(a).getText());
		
		////table[@id='customers']//tr[2]//td
		
		
		
	}
	
	}
}