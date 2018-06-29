package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasicCourseClick {
	public WebDriver driver = null;
	public BasicCourseClick(WebDriver driver) {
		this.driver= driver;
	}
	By clickbasiccourse =By.linkText("Basic Course");
	public void action() {
		driver.findElement(clickbasiccourse).click();
		System.out.println(" Successfully click on Basic Course");
	}
}
