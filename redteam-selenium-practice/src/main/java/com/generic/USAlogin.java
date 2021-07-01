package com.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.util.Highlighter;

public class USAlogin implements Baselogin{

	@Override
	public void login() {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("http://automationpractice.com");
		driver.navigate().to("http://automationpractice.com");
		driver.manage().window().maximize();
		WebElement login=driver.findElement(By.xpath("//*[@class='login']"));
		Highlighter.addcolor(driver, login);
		
		//driver.findElement(By.xpath("//*[@class='login']"));//.click();
		driver.quit();
		
	
		
	}
		
	

}
