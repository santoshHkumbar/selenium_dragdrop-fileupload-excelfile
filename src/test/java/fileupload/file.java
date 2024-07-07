package fileupload;





import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class file {
	WebDriver driver;
	
	
	 @BeforeTest
	 public void bt() {
		 //open the website 
		 WebDriverManager.chromedriver().setup();
		 //open with Chrome browser
		 driver = new ChromeDriver();
		 //Visiting the application
		 driver.get("https://demo.automationtesting.in/FileUpload.html");
		 //window to be maximize
		 driver.manage().window().maximize();	

}
	 @Test(alwaysRun = true)
	 public void draganddrop() throws InterruptedException {
	     Thread.sleep(3000);
		// WebElement addFile = driver.findElement(By.xpath("[id='input-4']"));
		
		 WebElement fileInput = driver.findElement(By.id("input-4"));
		
		
		 String filePath = "C://Users//Dell//Desktop/flipkart_login";
		 fileInput.sendKeys(filePath);
		 driver.findElement(By.xpath("(//span[@class='hidden-xs'])[3]")).click();

		
		 
	 }
}
