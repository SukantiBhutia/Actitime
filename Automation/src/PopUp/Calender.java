package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.britishairways.com/");
		Thread.sleep(4000);
		driver.findElement(By.id("ensCloseBanner")).click();
		driver.findElement(By.xpath("//div[@class='outbound date-selection']")).click();
		Thread.sleep(3000);
		WebElement monthyear=driver.findElement(By.xpath("//span[@class='month-name bold ng-binding']"));
		//System.out.println(monthyear.getText());
		
		String month=monthyear.getText().split(" ")[0];
		String year=monthyear.getText().split(" ")[1];
		
		
		while(!(month.equals("january")&& year.equals("2024")))
		{
			Thread.sleep(1000);
			
		
	}

}
}
