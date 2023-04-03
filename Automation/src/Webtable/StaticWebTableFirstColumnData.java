package Webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTableFirstColumnData {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		
		List<WebElement> firstColumnData=driver.findElements(By.xpath("//table[@id='table1']//tbody/tr/td[1]"));
		
		for(int i=0; i<firstColumnData.size(); i++)
		{
			
			System.out.print(firstColumnData.get(i).getText());
			System.out.println();
	}

}
}
