package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeLoginPage {

     //Declaration
		
		@FindBy(id="username") 
		private WebElement usernameTextfield;
		
		@FindBy(name="pwd")
		private WebElement passwordTextfield;
		
		@FindBy(id="keepmeLoggedInCheckBox")
		private WebElement keepLoggedInCheckBox;
		
		
		@FindBy(xpath="//div[.='Login ']")
		private WebElement loginButton;
		
		@FindBy(xpath="//a[.='Forgot your password']")
		private WebElement forgotyourpasswordLink;
		
		@FindBy(xpath="//a[.='actiTIME Inc.']")
		private WebElement actitimeincLink;
		
		//Initialization
		
		public ActitimeLoginPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//utilization
		
		public void loginMethod() throws InterruptedException
		{
			usernameTextfield.sendKeys("admin");
			passwordTextfield.sendKeys("manager");
			keepLoggedInCheckBox.click();
			loginButton.click();
			Thread.sleep(3000);
		}
		public void forgotpasswordMethod()
		{
			forgotyourpasswordLink.click();
		}
		public void actitimeincMethod()
		{
			actitimeincLink.click();
		}
		
		
}		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
		
		
	
	


