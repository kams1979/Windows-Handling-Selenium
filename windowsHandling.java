package WindowsHandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

public class windowsHandling extends mouse_demo1{
	public static void main(String[] args) throws Throwable {
		browserLaunch();
		 actions();
		 sweet();
		   Robot r= new Robot(); 
			 
			 r.keyPress(KeyEvent.VK_DOWN);
			 r.keyPress(KeyEvent.VK_DOWN);
			 r.keyRelease(KeyEvent.VK_DOWN);
		     r.keyPress(KeyEvent.VK_ENTER);
		     r.keyRelease(KeyEvent.VK_ENTER);
		    
		
	     
	     String windowHandle = driver.getWindowHandle();
	     System.out.println(windowHandle);
	     
	     System.out.println("---------------*********---------------");
	     
	     Set<String> windowHandles = driver.getWindowHandles();
	     System.out.println(windowHandles);
	     
	     String s="http://www.greenstechnologys.com/courses.html";
				
	     for (String string : windowHandles) {
	    	 if (driver.switchTo().window(string).getCurrentUrl().equals(s)) {
	    		 break;
				
			}

			}				
			}
		
					
		
	     
	     
	}

