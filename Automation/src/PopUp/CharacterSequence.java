package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CharacterSequence {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com");
		WebElement username=driver.findElement(By.id("username"));
		
		StringBuffer buffer=new StringBuffer()
		.append("mi")
		.append("li")
		.append("bulu");
		
		username.sendKeys(buffer);
		
		StringBuilder builder=new StringBuilder()
				.append("mi")
				.append(" ")
				.append("li");
		username.sendKeys(builder);
				
		}

}
