package org.testing.base;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class tc4 extends base 
{
@Test
public void testcase4() throws InterruptedException
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
	   
	   Thread.sleep(7000);			
		List<WebElement> ls=driver.findElements(By.id(pr.getProperty("ls")));
		ls.get(4).click();
		System.out.println("URL:-" +driver.getCurrentUrl());		
		Thread.sleep(5000);	
		WebElement like=driver.findElement(By.xpath(pr.getProperty("like")));
		like.click();
		System.out.println("video liked");		
		Thread.sleep(5000);
		WebElement signclicked=driver.findElement(By.xpath(pr.getProperty("signclicked")));
		signclicked.click();	
		Thread.sleep(5000);	
		WebElement signout = driver.findElement(By.xpath(pr.getProperty("signout")));
		signout.click();
		System.out.println("signed out");
		
}
}
