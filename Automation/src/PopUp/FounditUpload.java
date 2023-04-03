package PopUp;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FounditUpload {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.foundit.in/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='heroSection-buttonContainer_secondaryBtn__text']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='file']")).click();
		Thread.sleep(5000);
		StringSelection file=new StringSelection("C:\\Users\\bibhu\\OneDrive\\Desktop\\Resume.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().getContents(file);
		
	}

}
