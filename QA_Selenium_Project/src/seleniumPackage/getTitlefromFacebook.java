package seleniumPackage;

import javax.annotation.processing.Generated;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTitlefromFacebook {

	public static void main(String[] args) {
		// TODO// 1. setup the property of chromedriver to perform "navigate" through chrome web browser.
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		// 2. Initialize WebDriver object through ChromeDriver class.
	      WebDriver  b = new ChromeDriver();
		// 3. Open the web page https://www.facebook.com/
	        b.get("https://www.facebook.com/");
		// 4. In the print line we are using getTitle method .This will give the title of current page
	        //here is the error asking to create the o class that is mentioned in the following line
	        System.out.println("this is " + b.getTitle() + " website");
	}

}
