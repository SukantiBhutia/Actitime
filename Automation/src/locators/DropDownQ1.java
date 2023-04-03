package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownQ1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("httpS://m.facebook.com/?locale=en-GB");
		driver.findElement(By.xpath("//a[@role='button']")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("bulu");
		driver.findElement( By.name("lastname")).sendKeys("khilar");
		driver.findElement(By.xpath("//button[@value='Next'][1]")).click();
		WebElement dayDropDownlist=driver.findElement(By.id("day"));
		Select select1=new Select(dayDropDownlist);
		select1.selectByVisibleText("14");
		
		WebElement monthDropDownlist=driver.findElement(By.id("month"));
		Select select2=new Select(monthDropDownlist);
		select2.selectByVisibleText("feb");
		
		WebElement yearDropDownlist=driver.findElement(By.id("year"));
		Select select3=new Select(yearDropDownlist);
		select3.selectByVisibleText("year");

	}

}
