package firstprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hrmproject {

	public static void main(String[] args) throws InterruptedException {
	
		// to initialize the browser
		System.setProperty("webdriver.chrome.driver","./Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		// to perform login operation
	    driver.findElement(By.name("username")).sendKeys("Admin");	
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		

	}

}
