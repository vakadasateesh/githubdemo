package firstprogram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriver {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		
		
	}

}
