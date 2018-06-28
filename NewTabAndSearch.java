package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewTabAndSearch {
	public WebDriver driver = null;
	public NewTabAndSearch(WebDriver driver) {
		this.driver = driver;
	}
	
	By textenter =By.id("name");
	By pop = By.linkText("Launch Popup Window");
	By submit = By.id("submit");
	By proceed =By.linkText("Proceed");
	public void action(String text) {
		driver.findElement(pop).click();
		String handle = driver.getWindowHandle();
		for(String newtab : driver.getWindowHandles()) {
			driver.switchTo().window(newtab);
			//driver.findElement(pop).click();
			
			   
		}
		driver.findElement(textenter).sendKeys(text);
		driver.findElement(submit).click();
		driver.switchTo().window(handle);
		driver.findElement(proceed).click();
		
		
		System.out.println("Successfully opening of new tab and seacrching"); 

}

}
