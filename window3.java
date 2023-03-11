package WindowsHandling;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

public class window3 extends mouse3 {
	
	
	public static void main(String[] args) throws Throwable {
		browserLaun1();
		master();
		contact1();
		
		
		//String windowHandle = driver.getWindowHandle();
	//	System.out.println( windowHandle);
		
	//	System.out.println("---------------");
		
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		
		String s= "http://www.greenstechnologys.com/courses.html";
		String f="http://www.greenstechnologys.com/contact.php";
		
			for (String string : windowHandles) {
				
				if (driver.switchTo().window(string).getCurrentUrl().equals(s)) {
					
					break;
				}
					
			}
		}
	
}
		
		
			
		
	


