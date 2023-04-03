package PopUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CapturingSeleniumLogFile {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.logfile", "./chromelogs/chromelogfile.text");
System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://demo.actitime.com/");

	}

	
}

