package locators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentAscendingDescending {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/bibhu/OneDrive/Documents/abcd.html");
		WebElement dropdownList=driver.findElement(By.xpath("//select[@name='students']"));
        Select select=new Select(dropdownList);
        List<WebElement>allOptions=select.getOptions();
        
        ArrayList<String> arraylist=new ArrayList<>();
        for(int i=0;i<allOptions.size();i++)
        {
        	String text=allOptions.get(i).getText();
        	arraylist.add(text);
        }
         Collections.sort(arraylist);
         System.out.println("ascending order sorting is :" +arraylist);
         Collections.sort(arraylist, Collections.reverseOrder());
         System.out.println("descending order sorting is :" +arraylist);

        

	}

}
