package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickHold {
            public static void main(String[] args) throws InterruptedException {
            	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
    			WebDriver driver = new ChromeDriver();
    			driver.get("httpS://m.facebook.com/?locale=en-GB");
    			WebElement link=driver.findElement(By.xpath("//a[@id='forgot-password-link']"));
    			Actions actions=new Actions(driver);
    			actions.click(link).perform();
    			Thread.sleep(3000);
    			actions.release(link).perform();
	
			

	}
		
}
