package firstprogram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class absolutexpath {

	public static void main(String[] args) throws Exception {
	
	System.setProperty("webdriver.chrome.driver","./Driver\\chromedriver.exe");	
	WebDriver driver =new ChromeDriver();	
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//username
	//driver.findElement(By.name("username")).sendKeys("Admin");
	driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	Thread.sleep(2000);
	
	//password
	driver.findElement(By.name("password")).sendKeys("admin123");
	Thread.sleep(2000);
	
	//login
	//driver.findElement(By.xpath("//button[@type='submit']")).click();
	//driver.findElement(By.xpath("//button[text()=' Login ']")).click();
	//driver.findElement(By.linkText(" Login ")).click();
	driver.findElement(By.xpath("//button[contains(@type,'s')]")).click();

	Thread.sleep(2000);
	
	
	
	
	
	}

}
