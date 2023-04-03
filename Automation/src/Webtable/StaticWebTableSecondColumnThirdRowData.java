package Webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTableSecondColumnThirdRowData {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
List<WebElement> SecondColumnThirdRowData=driver.findElements(By.xpath("//table[@id='table1']//tbody//tr[3]/td[2]"));
		
		for(int i=0; i<SecondColumnThirdRowData.size(); i++)
		{
			
			System.out.print(SecondColumnThirdRowData.get(i).getText());
			System.out.println();
	}

}
}
