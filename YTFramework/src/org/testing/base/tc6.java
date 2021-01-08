package org.testing.base;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
public class tc6 extends base
{
@Test
public void testcase6() throws InterruptedException
{
	 WebElement signin=driver.findElement(By.xpath(pr.getProperty("signin")));
	   signin.click();
	   WebElement email=driver.findElement(By.xpath(pr.getProperty("email")));
	   email.sendKeys("shilbansl@gmail.com");
	   WebElement next=driver.findElement(By.xpath(pr.getProperty("next")));
	   next.click();
	   Thread.sleep(5000);
	   WebElement password = driver.findElement(By.xpath(pr.getProperty("password")));
	   password.sendKeys("lalit38384");
	   WebElement next1=driver.findElement(By.xpath(pr.getProperty("next")));
	   next1.click();
	   System.out.println("Login successful");
	   
	   
	   Thread.sleep(5000);	
		WebElement video= driver.findElement(By.xpath(pr.getProperty("video")));
		Actions ac= new Actions(driver);
		ac.click(video).build().perform();	
		System.out.println("video clicked");
		
		Thread.sleep(5000);	
		
		ac.sendKeys(Keys.PAGE_DOWN).perform();
		System.out.println("Page down");
		Thread.sleep(5000);	
		
		WebElement comment=driver.findElement(By.xpath(pr.getProperty("comment")));
		comment.click();	
		Thread.sleep(5000);	
		WebElement comment1=driver.findElement(By.xpath(pr.getProperty("comment1")));
		comment1.sendKeys("nice");
		System.out.println("comment typed");
		Thread.sleep(5000);	
		WebElement comment_button=driver.findElement(By.xpath(pr.getProperty("comment_button")));
		comment_button.click();    
		Thread.sleep(5000);
		
		WebElement signclicked=driver.findElement(By.xpath(pr.getProperty("signclicked")));
		signclicked.click();
	
		Thread.sleep(5000);	
		WebElement signout = driver.findElement(By.xpath(pr.getProperty("signout")));
		signout.click();
		System.out.println("signed out");
}
}
