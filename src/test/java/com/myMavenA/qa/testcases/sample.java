package com.myMavenA.qa.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class sample {
	WebDriver driver;
@Test
public void start() {
	System.out.println("Hello"+System.getProperty("user.dir"));
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/chromedriver1"); 
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	String title=driver.getTitle();
	System.out.println(title);
	driver.close();
	
}
}
