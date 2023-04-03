package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeHomePage {

		@FindBy(id="logoutLink")
		private WebElement logoutLink;
		
		public ActitimeHomePage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		public void logoutMethod()
		{
			logoutLink.click();
		}
		}

	