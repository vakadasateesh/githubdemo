package firstprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class editbox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com");
		// to enter "Mindq"in "username"edit box
		driver.findElement(By.id("username")).sendKeys("Mindq");
		// to pause the execution
		Thread.sleep(5000);
		// to clear the data
		driver.findElement(By.id("username")).clear();

	}

}
