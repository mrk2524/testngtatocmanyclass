package TestNg;

import org.openqa.selenium.WebDriver;

public class CloseBrowser {
	public WebDriver driver = null;
	public CloseBrowser(WebDriver driver) {
		this.driver = driver;
	}
	public void close() {
		driver.close();
	}

}
