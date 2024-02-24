package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigatetolinkedIn {

	public static void main(String[] args) {
		// 1. setup the property of WebDriver to perform navigate on icons through chrome web browser.
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		// 2. Initialize WebDriver object through ChromeDriver class.
	        WebDriver browserObject=new ChromeDriver();
		// 3. Open the web page https://www.itlearn360.com/
	        browserObject.get("https://www.itlearn360.com/");
	     // 12. Locate linkedIn icons using className locator and perform click
	        browserObject.findElement(By.className("fa-linkedin")).click();
	        // 14. Close the browser
	        browserObject.close();
	}

}
