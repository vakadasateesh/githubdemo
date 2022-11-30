package firstprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginoperationsf {

	public static void main(String[] args) {
    
	
		System.setProperty("webdriver.chrome.driver","./Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
       
        driver.get("https://demo.guru99.com/test/newtours/index.php");
        
        // to perform login operation
        driver.findElement(By.name("userName")).sendKeys("Mercury");
        driver.findElement(By.name("password")).sendKeys("Mercury"); 
        driver.findElement(By.name("submit")).click();
   
       
      
      
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
	}

}
