package org.sample;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ManagerFile {
	static WebDriver driver;
	
@BeforeClass
public static void launchBrowser() {
	WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
}
@AfterClass
public static void quitBrowser() {
driver.quit();
}
@Before
public void setStartDate() {
Date d=new Date();
System.out.println(d);
}
@After
public void setEndDate() {
	Date d=new Date();
	System.out.println(d);
}
@Test
public void tc1() {
WebElement findElement = driver.findElement(By.id("email"));
findElement.sendKeys("wwwwwww");

WebElement findElement2 = driver.findElement(By.id("pass"));
findElement2.sendKeys("1234343");

WebElement findElement3 = driver.findElement(By.name("login"));
findElement3.click();
}




	}

