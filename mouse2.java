package WindowsHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class mouse2 {
	
static WebDriver driver;

public static void sweet() throws InterruptedException {
    WebElement findElement = driver.findElement(By.xpath("//button[@type='button']"));
    Thread.sleep(2000);
    findElement.click();

}
	
	public static void browserLaunch() {
	      driver=new ChromeDriver();
	      driver.get("http://www.greenstechnologys.com/");
	      driver.manage().window().maximize();
	      
		}
	
	private static void Actions3() throws InterruptedException {
       // Actions act=new Actions(driver);
        WebElement findElement = driver.findElement(By.linkText("Online Courses"));
        Thread.sleep(2000);
        findElement.click();
        
       // act.build().perform();
        
	}
	public static void main(String[] args) throws InterruptedException  {
		browserLaunch();
		sweet();
		 Actions3();
		 
		
		
	}

}
