package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment12 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.americanairlines.in/intl/in/index.jsp?");
		driver.findElement(By.id("reservationFlightSearchForm.originAirport")).sendKeys("san");
		Thread.sleep(3000);
		List<WebElement>suggestions1=driver.findElements(By.xpath("//a[contains(text(),'san']"));
		for(int i =0;i<suggestions1.size();i++)
		{
			if(suggestions1.get(i).getText().contains("Antonio"))
			{
		     suggestions1.get(i).click();
		     break;
			}
			
		}
		
		driver.findElement(By.id("reservationFlightSearchForm.originAirport")).sendKeys("les");
		Thread.sleep(3000);
		List<WebElement>suggestions2=driver.findElements(By.xpath("//a[contains(text(),'san']"));
		for(int i =0;i<suggestions2.size();i++)
		{
			if(suggestions2.get(i).getText().contains("Vegas"))
			{
		     suggestions1.get(i).click();
		     break;
		}
     }
		WebElement adultDropdownList=driver.findElement(By.id("flightSearchForm.adultPassengerCount"));
		Select select1=new Select(adultDropdownList);
		select1.selectByVisibleText("4");
		
		WebElement childrenDropdownList=driver.findElement(By.id("flightSearchForm.childPassengerCount"));
		Select select2=new Select(childrenDropdownList);
		select2.selectByVisibleText("3");
		
		
		
		
		
}
}