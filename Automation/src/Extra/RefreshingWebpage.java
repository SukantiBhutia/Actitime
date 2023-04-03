package Extra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RefreshingWebpage {

	public static void main(String[] args) throws InterruptedException {

		//1. by using refresh() of Navigation Interface
		
		//2.by using JavascriptExecutor Interface
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		Thread.sleep(3000);
		
		//driver.get(driver.getCurrentUrl());
		driver.navigate().to(driver.getCurrentUrl());
		
	}

}
