package demopack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Package_check {

	public static void main(String[] args) {
WebDriver driverf=new FirefoxDriver();
		
		
		System.setProperty("Webdriver.firefox.marionette","C:\\Users"
				+ "\\global1\\.eclipse\\geckodriver.exe");
		
		driverf.get("https://krninformatix.com/sample.html");
	}

}
