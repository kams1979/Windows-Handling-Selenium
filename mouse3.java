package WindowsHandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse3 {
	
	
static WebDriver driver;
	
	
	
	public static void browserLaun1() {
	      driver=new ChromeDriver();
	      driver.get("http://www.greenstechnologys.com/");
	      driver.manage().window().maximize();
	      
		}
	
	public static void master() throws Throwable {
		WebElement findElement = driver.findElement(By.linkText("Master Program"));
		Actions a =new Actions(driver);
	      // master.click();
	       a.contextClick(findElement);
			a.build().perform();
			
             Robot r= new Robot(); 
			 
			 r.keyPress(KeyEvent.VK_DOWN);
			// r.keyPress(KeyEvent.VK_DOWN);
			 r.keyRelease(KeyEvent.VK_DOWN);
		     r.keyPress(KeyEvent.VK_ENTER);
		     r.keyRelease(KeyEvent.VK_ENTER);
	}
	
	
	public static void contact1() throws Throwable {
		WebElement findElement1 = driver.findElement(By.linkText("CONTACT US"));
		Actions a1 =new Actions(driver);
	      // master.click();
	       a1.contextClick(findElement1);
			a1.build().perform();
			
           Robot r= new Robot(); 
			 
			 r.keyPress(KeyEvent.VK_DOWN);
			// r.keyPress(KeyEvent.VK_DOWN);
			 r.keyRelease(KeyEvent.VK_DOWN);
		     r.keyPress(KeyEvent.VK_ENTER);
		     r.keyRelease(KeyEvent.VK_ENTER);
	}
	
	
	
	
	
	}

	

