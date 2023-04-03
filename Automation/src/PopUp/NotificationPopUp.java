package PopUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopUp {

	public static void main(String[] args) {
  
		ChromeOptions options=new ChromeOptions();
		options.addArguments("diseable-notification");
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.singaporeair.com/");
		
		
		
		
		
		
		
		
		
		
	}

}
