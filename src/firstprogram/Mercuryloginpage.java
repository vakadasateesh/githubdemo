package firstprogram;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mercuryloginpage {

	public static void main(String[] args) {
     //to read user inputs
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user name");
		String uid = sc.nextLine();
	    System.out.println("Enter pwd");
        String pwd = sc.nextLine();
	    sc.close();
	    
	  //to initialize browser
	    System.setProperty("webdriver.chrome.driver","./Driver\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
	    
	    driver.findElement(By.name("userName")).sendKeys(uid);
	    driver.findElement(By.name("password")).sendKeys(pwd);
	    driver.findElement(By.name("submit")).click();
	    
	   // to read page title
	    String  pgTitle =driver.getTitle();
	   // to compare page title
	    if(pgTitle.equals("Login:MercuryTours")) {
	    System.out.println("Successful login operation");
	    } 
	}

}
