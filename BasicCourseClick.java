package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasicCourseClick {
	public WebDriver driver = null;
	public void GreenBox(WebDriver driver) {
		this.driver= driver;
	}
	By clickgreenbox =By.className("greenbox");
	public void action() {
		driver.findElement(clickgreenbox).click();
		System.out.println(" Successfully clicked on Green Box");
	}

}
