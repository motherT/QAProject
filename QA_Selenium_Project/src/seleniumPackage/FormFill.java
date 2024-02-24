package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormFill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
			 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
				
			    // 2. Initialize Webdriver object through ChromeDriver class.
			  ChromeDriver  browserObject = new ChromeDriver();
			    // 3. Open form page of http://www.training.qaonlinetraining.com/testPage.php
			    browserObject.get("http://www.training.qaonlinetraining.com/testPage.php");
			    
			    browserObject.findElement(By.name("name")).sendKeys("Rose");
			    
			    browserObject.findElement(By.name("email")).sendKeys("trose@gmail.com");
			    browserObject.findElement(By.name("website")).sendKeys("kp.org");
			    
			    browserObject.findElement(By.name("comment")).sendKeys("This is a great company");
			   // browserObject.findElement(By.name("submit")).click();;
	}

}
