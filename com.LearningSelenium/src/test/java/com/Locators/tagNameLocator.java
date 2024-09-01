package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagNameLocator {
	public static void main(String[] args) {
		//to launch the browser
		WebDriver driver=new ChromeDriver();
		//to maximize the window
		driver.manage().window().maximize();
		//to launch the application
		driver.get("https://demowebshop.tricentis.com/");
		//to identify the search text field with the help of tag name 
		WebElement searchTextField=driver.findElement(By.tagName("input"));
		searchTextField.sendKeys("admin");
		
	}

}
