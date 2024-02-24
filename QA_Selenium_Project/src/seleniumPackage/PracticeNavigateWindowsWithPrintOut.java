package seleniumPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeNavigateWindowsWithPrintOut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("WebDriver.Chrome.Driver", "C:\\Program Files\\chromedriver.exe");
//create new object
   WebDriver browserObject = new ChromeDriver();
   browserObject.get("https://www.facebook.com/");
   //In the print line we are using the getTitle method. This will give the title of current page
   System.out.println("this is"+browserObject.getTitle()+"website");
   //in the next line we are using getCurrentUrl method
   System.out.println("Url is:"+browserObject.getCurrentUrl());
   //use nabigate method to go the next website http://www.twitter.com
   browserObject.navigate().to("http://www.twitter.com/");
   //In the print line we are using the getTitle method
   System.out.println("this is"+browserObject.getTitle()+"website");
   //in the next line we are using the getCurrentUrl method. This will give the current url
   System.out.println("Url is:"+browserObject.getCurrentUrl());
   //using the  navigate method, we move to the next website www.instagram.com
   browserObject.navigate().to("http://www.instagram.com/");
   //in the print line we are using getTitle method. This will give the title of the current page
   System.out.println("this is"+browserObject.getTitle()+"website");
   //In the next print line we are using the getCurrentUrl method
   System.out.println("Url is:"+browserObject.getCurrentUrl());
   //using the navigate method, we move next to 
	}

}
