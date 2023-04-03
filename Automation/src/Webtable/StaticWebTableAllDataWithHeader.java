package Webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTableAllDataWithHeader {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		WebElement allDataWithHeader=driver.findElement(By.xpath("//table[@id='table1']//tbody//tr"));
		
		System.out.println(allDataWithHeader.getText());
		

	}

}
