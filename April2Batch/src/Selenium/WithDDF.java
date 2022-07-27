package Selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithDDF {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	FileInputStream file = new FileInputStream("C:\\Users\\yadav\\OneDrive\\Desktop\\Screenshot\\Excel Parameter\\ZERODHA Credentials.xlsx");
	Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
	System.setProperty("webdriver.chrome.driver","C:\\Users\\yadav\\Downloads\\chromedriver_win32\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();  // upcastin
	
      driver.get("https://kite.zerodha.com/");
      driver.manage().window().maximize();
      
      // step 1 entering UN with using DDF
     String UN = sh.getRow(0).getCell(0).getStringCellValue();
     driver.findElement(By.xpath("//input[@type='text']")).sendKeys(UN);
     Thread.sleep(2000);
     
     //// step 2 entering PWD with using DDF
     String PWD = sh.getRow(1).getCell(0).getStringCellValue();
     driver.findElement(By.xpath("//input[@type='text']")).sendKeys(PWD);
}
}