package PopUp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Pause {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:/en-gb.facebook.com/");
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		Actions actions=new Actions(driver);
		actions.pause(Duration.ofSeconds(3));
		actions.sendKeys("mili").pause(Duration.ofSeconds(3));
		actions.sendKeys(Keys.TAB).pause(Duration.ofSeconds(3));
		actions.sendKeys("bhutia").pause(Duration.ofSeconds(3));
		actions.sendKeys(Keys.TAB).pause(Duration.ofSeconds(3));
		actions.sendKeys("9337209724").pause(Duration.ofSeconds(3));
		actions.sendKeys(Keys.TAB).pause(Duration.ofSeconds(3));
		actions.sendKeys("abc").perform();
		
		
	}

}
