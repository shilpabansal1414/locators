package org.testing.base;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class base 
{
public ChromeDriver driver;
public Properties pr;

@BeforeMethod
public void before() throws IOException
{
	System.setProperty("webdriver.chrome.driver", "../YTFramework/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.youtube.com");
	driver.manage().window().maximize();
	File f= new File("../YTFramework/locator.properties");
	FileReader fr= new FileReader(f);
	 pr= new Properties();
	 pr.load(fr);
	
	
}

@AfterMethod
public void after()
{
	driver.close();
	System.out.println("browser is closed");
}
}
