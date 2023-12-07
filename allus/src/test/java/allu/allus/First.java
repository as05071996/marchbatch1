package allu.allus;

import java.awt.Desktop.Action;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.youtube.com");
		driver.manage().window().maximize();
		List<WebElement> all =driver.findElements(By.id("search"));
		System.out.println("total video"+ all.size());
		WebElement video= driver.findElement(By.id("thumbnail"));
	    Actions ac =new Actions(driver);
	    ac.keyDown(Keys.CONTROL).click(video).keyUp(Keys.CONTROL).build().perform();
	    System.out.println("before swiching url is ");
	    System.out.println(driver.getCurrentUrl());
	    String firttab=driver.getWindowHandle();
	   Set<String>alltabs =driver.getWindowHandles();
	   System.out.println("total tabs/windows" +alltabs.size());
	   for(String s:alltabs) {
		   driver.switchTo().window(s);
	   }
	   System.out.println("after switching url is ");
	   System.out.println(driver.getCurrentUrl());
	   driver.switchTo().window(firttab);
	   System.out.println("final url is ");
	   System.out.println(driver.getCurrentUrl());
	   
	   
	 
	  
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	    
	
	}
}
