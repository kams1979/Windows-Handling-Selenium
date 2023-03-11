package WindowsHandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse_demo1 {
	
	static WebDriver driver;
	
	
	
	public static void browserLaunch() {
	      driver=new ChromeDriver();
	      driver.get("http://www.greenstechnologys.com/");
	      driver.manage().window().maximize();
	      
		}
	
	
	
	public static void actions() throws AWTException {
       Actions a =new Actions(driver);
       WebElement master = driver.findElement(By.linkText("Master Program"));
      // master.click();
       a.contextClick(master);
		a.build().perform();
     
    
		
       
	}
	public static void sweet() throws InterruptedException {
	       WebElement findElement = driver.findElement(By.xpath("(//button[@type='button'])[1]"));
	       
	       findElement.click();
		}

}
