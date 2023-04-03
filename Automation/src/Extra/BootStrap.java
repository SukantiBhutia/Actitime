package Extra;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrap {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/bibhu/AppData/Local/Microsoft/Windows/INetCache/IE/IV58U6IP/BootstrapDropDown[1].html");
        driver.findElement(By.xpath("//button[@type='button']")).click();
        List<WebElement> options=driver.findElements(By.xpath("//ul[@class='dropdown-menu']//a"));

      		for(int i=0;i<options.size();i++)
      		{
      			if(options.get(i).getText().equals("Myntra"))
      			{
      			options.get(i).click();
      			break;
      			}
      	}
      		if(driver.getTitle().contains("online shooping"))
      		{
      			System.out.println("navigated to myntra page");
      			
      		}
      		else
      		{
      			System.out.println("not navigated to myntra page");
      		}
        
      
	}

}
