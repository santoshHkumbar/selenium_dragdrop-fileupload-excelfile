package loginpagefromexcelfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import io.github.bonigarcia.wdm.WebDriverManager;

public class loginpage {

	WebDriver driver;
	
	
	 @BeforeTest
	 public void bt() {
		 //open the website 
		 WebDriverManager.chromedriver().setup();
		 //open with Chrome browser
		 driver = new ChromeDriver();
		 //Visiting the application
		 driver.get("https://www.instagram.com/accounts/login/?hl=en");
		 //window to be maximize
		 driver.manage().window().maximize();	

}
	
	 @Test(alwaysRun = true)
	 public void login() throws InterruptedException, IOException {
		 
		 	File  excel = new  File("C:\\Users\\Dell\\Desktop\\Book2.xlsx");
		 	FileInputStream fls = new FileInputStream(excel);
		 	XSSFWorkbook wb = new XSSFWorkbook(fls);
		 	XSSFSheet sht = wb.getSheet("instgram");
		     int rowcount =sht.getLastRowNum();
		     for (int i=0;i<=rowcount;i++) {
		      String c1=  	 sht.getRow(i).getCell(0).getStringCellValue();
		      String c2=  	 sht.getRow(i).getCell(0).getStringCellValue();
		      System.out.println(c1);
		      System.out.println(c1);
		     }
		  
		 
		 
		 
		 
	 }
}
