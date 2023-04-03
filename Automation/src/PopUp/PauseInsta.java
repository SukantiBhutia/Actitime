package PopUp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PauseInsta {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='_aacl _aaco _aacw _aad0 _aad7']")).click();
		
		Actions actions=new Actions(driver);
		actions.pause(Duration.ofSeconds(3));
		actions.sendKeys("9337209724").pause(Duration.ofSeconds(3));
		actions.sendKeys(Keys.TAB).pause(Duration.ofSeconds(3));
		actions.sendKeys("milibhutia").pause(Duration.ofSeconds(3));
		actions.sendKeys(Keys.TAB).pause(Duration.ofSeconds(3));

		actions.sendKeys("bulu143").pause(Duration.ofSeconds(3));
		actions.sendKeys(Keys.TAB).pause(Duration.ofSeconds(3));
		actions.sendKeys("abc").perform();

		
		
	}

}
