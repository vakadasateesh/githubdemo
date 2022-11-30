package firstprogram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserintraction {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","./Driver\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://instagram.com");
		
	    driver.manage().window().maximize();
			
		driver.navigate().refresh();
		
		driver.navigate().back();                                            
	    
		driver.navigate().forward();
	    
    
		
		
	    
	    
	 
	  
	    
	   	    
	   
	  
	    
	    
	    
		
		
	

		
		
		
		
		
		
		
		
		
		
	}

}
