package firstprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys_willnot_overwrite {

	public static void main(String[] args) throws InterruptedException {
     System.setProperty("webdriver.chrome.driver","./Driver\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     driver.get("https://login.salesforce.com");
     driver.manage().window().maximize();
     
     //create object for "username"editbox
    WebElement uidobj = driver.findElement(By.id("username"));
     // to focus on "username" editbox
     uidobj.click();
     // Enter "Mindq"
     uidobj.sendKeys("Mindq");
     //Enter "Systems"
     uidobj.sendKeys("Sytems");
     Thread.sleep(5000);
     
	}

}
