package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateBackinitlearn360 {

	public static void main(String[] args) {
		// 1. setup the property of WebDriver to perform navigate on icons through chrome web browser.
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		// 2. Initialize WebDriver object through ChromeDriver class.
	        WebDriver browserObject=new ChromeDriver();
		// 3. Open the web page https://www.itlearn360.com/
	        browserObject.get("https://www.itlearn360.com/");
		// 4. Locate facebook icons using className locator and perform click
	        browserObject.findElement(By.className("fa-facebook")).click();
		// 5. Navigate back on main page using navigate and back method 
	        browserObject.navigate().back();
		// 6. Locate twitter icons using className locator and perform click
	        browserObject.findElement(By.className("fa-twitter")).click();
		// 7. Navigate back on main page using navigate and back method
	        browserObject.navigate().back();
	}

}
