package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class American {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.americanairlines.in/intl/in/index.jsp?");
		driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).click();
		driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).click();
	}

}
