package dragdrop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdrag {
	WebDriver driver;
	
	
	 @BeforeTest
	 public void bt() {
		 //open the website 
		 WebDriverManager.chromedriver().setup();
		 //open with Chrome browser
		 driver = new ChromeDriver();
		 //Visiting the application
		 driver.get("https://v1.training-support.net/selenium/drag-drop");
		 //window to be maximize
		 driver.manage().window().maximize();	

}
	 @Test(alwaysRun = true)
	 public void draganddrop() throws InterruptedException {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 Actions action = new Actions(driver);
		 WebElement drag
         = driver.findElement(By.id("draggable"));
     WebElement drop
         = driver.findElement(By.id("droppable"));
     action.dragAndDrop(drag, drop)
     .build()
     .perform();
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
     driver.navigate().refresh();		 
	 }
	 
}
