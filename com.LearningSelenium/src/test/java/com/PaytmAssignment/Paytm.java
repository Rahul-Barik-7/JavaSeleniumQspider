package com.PaytmAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Paytm {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://paytm.com/");
		
		//Thread.sleep(2000);
		driver.findElement(By.id("srcCode")).click();
		driver.findElement(By.xpath("//img[@class='Dr08x']")).click();
		driver.findElement(By.xpath("//input[@id='text-box']")).sendKeys("Mumbai");
		driver.findElement(By.xpath("//div[text()='Mumbai, Maharashtra, India']")).click();
		
		
		
	}

}
