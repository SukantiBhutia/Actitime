package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessBrowseTesting {

	public static void main(String[] args) throws InterruptedException {
ChromeOptions options=new ChromeOptions();
options.addArguments("headless");
System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://demo.actitime.com/");
System.out.println("logpage title is:"+driver.getTitle());
driver.findElement(By.id("username")).sendKeys("admin");
driver.findElement(By.name("pwd")).sendKeys("manager");
driver.findElement(By.id("loginButton")).click();
Thread.sleep(3000);

System.out.println("homepage title:"+driver.getTitle());
	}

}

