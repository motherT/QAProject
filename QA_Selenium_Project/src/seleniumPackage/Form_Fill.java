package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form_Fill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		
	    // 2. Initialize Webdriver object through ChromeDriver class.
	  ChromeDriver  browserObject = new ChromeDriver();
	    // 3. Open form page of http://www.training.qaonlinetraining.com/testPage.php
	    browserObject.get("http://www.training.qaonlinetraining.com/testPage.php");
	    
	    browserObject.findElement(By.name("name")).sendKeys("Tissy");
	    browserObject.findElement(By.name("email")).sendKeys("tissypalack322@gmail.com");
	    browserObject.findElement(By.name("website")).sendKeys("ITLearn360");
	     browserObject.findElement(By.name("comment")).sendKeys("This is an e-learning portal");
	    //browserObject.findElement(By.name("submit")).click();;
	     
	     
	 
	}

}
