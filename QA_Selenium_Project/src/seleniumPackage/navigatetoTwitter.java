package seleniumPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigatetoTwitter {

	public static void main(String[] args) {
		// TODO Auto// 1. setup the property of chromedriver to perform "navigate" through chrome web browser.
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		// 2. Initialize WebDriver object through ChromeDriver class.
	      WebDriver  browserObject = new ChromeDriver();
		// 3. Open the web page https://www.facebook.com/
	        browserObject.get("https://www.facebook.com/");
		// 4. In the print line we are using getTitle method .This will give the title of current page
	        System.out.println("this is " + browserObject.getTitle() + " website");
		// 5. In next line we are using getCurrentUrl method .This will give the current url of the webpage
	        System.out.println("url is: " + browserObject.getCurrentUrl());
	       // 6. Using the navigate method we move to next webite http://www.instagram.com/
	        browserObject.navigate().to("http://www.instagram.com/");
		// 7. In the print line we are uing getTitle method .This will give the title of current page
	        System.out.println("this is " + browserObject.getTitle() + " website");
		// 8. In next line we are using getCurrentUrl method .This will give the current url of the webpage
	        System.out.println("url is: " + browserObject.getCurrentUrl());
	       // 9. Using navigate method we again move to next website http://www.twitter.com/
	        browserObject.navigate().to("http://www.twitter.com/");

	}

}
