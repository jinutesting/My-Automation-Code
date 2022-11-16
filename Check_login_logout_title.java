package demopack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Check_login_logout_title {

	public static void main(String[] args) throws InterruptedException {
	
		//login parent page
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://demo.actitime.com/login.do");

		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@href='javascript: void(0)'])[1]")).click();
		
		driver.findElement(By.xpath("//td[@id='changeStateLinkContainer']")).click();
		Thread.sleep(30000);
		
		driver.findElement(By.id("username")).sendKeys("admin");
		Thread.sleep(3000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		
		
		
		driver.findElement(By.id("loginButtonContainer")).click();
		//child page
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//a[@href='/logout.do']")).click();
		
	    driver.quit();
	
	
	}

}
