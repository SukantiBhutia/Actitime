package Extra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class InsecureWebsite {

	public static void main(String[] args) {
ChromeOptions options=new ChromeOptions();
options.setAcceptInsecureCerts(true);
System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
WebDriver driver = new ChromeDriver(options);
driver.get("https://entaxy.io/");

	}

}
