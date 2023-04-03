package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAutoSuggestion {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(3000);
		List<WebElement>suggestions=driver.findElements(By.xpath("//span[text()='selenium']"));
		
		for(int i=0;i<suggestions.size(); i++)
		{
			if(suggestions.get(i).getText().equalsIgnoreCase("selenium webdriver"))
			{
				suggestions.get(i).click();
				break;
			}
		}
	}

}
