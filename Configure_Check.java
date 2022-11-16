package demopack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Configure_Check {

	public static void main(String[] args) {
		
		
		WebDriver driverf=new FirefoxDriver();
		
		
		System.setProperty("Webdriver.firefox.marionette","C:\\Users"
				+ "\\global1\\.eclipse\\geckodriver.exe");
		
		
		WebDriver driverc=new ChromeDriver();
		System.setProperty("Webdriver.chrome.driver","C:\\Users"
				+ "\\global1\\.eclipse\\chromedriver.exe");
		
		WebDriver driveredge=new EdgeDriver();
		System.setProperty("Webdriver.msedge.driver","C:\\Users"
				+ "\\global1\\.eclipse\\msedgedriver.exe");
		
	
		
		
	
		driverf.get("https://krninformatix.com/sample.html");
		driverc.get("https://krninformatix.com/sample.html");
		driveredge.get("https://krninformatix.com/sample.html");
		
		
		

	}

}
