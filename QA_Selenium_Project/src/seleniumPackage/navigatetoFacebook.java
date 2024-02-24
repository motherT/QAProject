package seleniumPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigatetoFacebook {

	public static void main(String[] args) {
		//setup the property of chromedriver to perform "navigate" through chrome web browser.
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		// 2. Initialize WebDriver object through ChromeDriver class.
	      WebDriver  browserObject = new ChromeDriver();
		// 3. Open the web page https://www.facebook.com/
	      //the cursor is placed in the email field by default
	        browserObject.get("https://www.facebook.com/");
	}

}
