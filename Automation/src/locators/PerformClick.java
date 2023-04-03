package locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PerformClick {

	public static void main(String[] args) {
    System.setProperty("WebDriver.chrome.driver", "./drivers/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    
	driver.get("httpS://m.facebook.com/?locale=en-GB");

	


	}

}
