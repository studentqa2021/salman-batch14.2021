package com.util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Highlighter {
public static void addcolor(WebDriver driver,WebElement element){
	
	
	JavascriptExecutor js = (JavascriptExecutor)  driver;
    js.executeScript("arguments[0].setAttribute('style', arguments[1]);",element , "color: yellow; border: 2px solid green;");
}
}
