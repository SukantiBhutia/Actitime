package Webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTableFetchingHeaders {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		List<WebElement> headers=driver.findElements(By.xpath("//table[@id='table1']"));
		for(int i=0; i<headers.size(); i++)
		{
			System.out.println("headers of the webtable is :" +headers.get(i).getText());
	}

}
}
