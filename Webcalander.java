package demopack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Webcalander {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://krninformatix.com/sample.html");
		
		//driver.manage().window().maximize();
		
	WebElement element=driver.findElement(By.xpath("//select[@id='cities']"));
		
	
	Select se=new Select(element);
		
	Thread.sleep(3000);
	
	List originalList=new ArrayList();
		
	
	
		
		List<WebElement> option=se.getOptions();
		
		
		for(WebElement e:option)
		{
			 originalList.add(e.getText());
			
		}
		
		System.out.println(originalList);  //ORIGINAL
		
		
		
		
		List temList=new ArrayList();
		
		temList=originalList;
		
		System.out.println(originalList); //before sorting
		
		Collections.sort(temList);
		
		System.out.println(temList);  //sorting element
		 
		if(originalList==temList) 
		{
			System.out.println("dropdown sorted");
		}
		else 
		{
			System.out.println("Drop down not sorted");
		}
		
		
		
		
		
		
		
		
		

	}

}
