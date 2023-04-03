package PopUp;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ynta.com/?");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		for(int i=0;i<=9;i++)
			
		{
			Thread.sleep(1000);
			js.executeScript("window.scrollBy(0,100)");
	}
		for(int i=0;i<=9;i++)
		{
			Thread.sleep(1000);
			js.executeScript("window.scrollBy(0, 100)");
	}
}
}

