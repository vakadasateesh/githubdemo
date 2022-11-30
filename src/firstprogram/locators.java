package firstprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		//"Forgotten"
		//"password?"
		//"ten pass"
		 driver.findElement(By.partialLinkText("Forgotten")).click();
		 driver.findElement(By.partialLinkText("password?")).click(); 
		 driver.findElement(By.partialLinkText("ten pass")).click();
        

		
	}

}
