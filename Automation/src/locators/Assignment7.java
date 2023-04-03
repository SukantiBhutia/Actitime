package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("httpS://m.facebook.com/?locale=en-GB");
		driver.findElement(By.xpath("html//input[2]")).sendKeys("bulu7@gmail");


	}

}
