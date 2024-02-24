package seleniumPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openitlearn360socialmedia {

		public static void main(String[] args) {
			// 1. setup the property of WebDriver to perform navigate on icons through chrome web browser.
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
			// 2. Initialize WebDriver object through ChromeDriver class.
		        WebDriver browserObject=new ChromeDriver();
			// 3. Open the web page https://www.itlearn360.com/
		        browserObject.get("https://www.itlearn360.com/");
	}

}
