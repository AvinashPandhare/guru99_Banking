package com.BaseLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	public static WebDriver driver;
	
	@BeforeClass
	public void initialisation() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\avina\\Desktop\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/");
	}
	
	@AfterClass
	public void tearDown() throws InterruptedException {
		
		Thread.sleep(10000);
		driver.quit();
	}
	

}
