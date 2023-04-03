package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment11 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("httpS://m.facebook.com/?locale=en-GB");
		driver.findElement(By.xpath("//a[@id = 'signup-button']")).click();
		driver.findElement(By.xpath("//input[@name ='firstname']")).sendKeys("mili");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("bhutia");
		driver.findElement(By.xpath("//button[@value='Next'][1]")).click();
		driver.findElement(By.xpath("//select[@name='birthday_day']")).sendKeys("25");
		driver.findElement(By.xpath("//select[@name='birthday_month']")).sendKeys("SEPTEMBER");
		driver.findElement(By.xpath("//select[@name='birthday_year']")).sendKeys("1996");
		driver.findElement(By.xpath("//button[@value='Next'][1]")).click();
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9337209724");
		driver.findElement(By.xpath("//button[@value='Next'][1]")).click();

	}

}
