package com.PaytmAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AirVistaraTicketBookSite {
	
	 public static void main(String[] args) throws InterruptedException {
		
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.airvistara.com/in/en");
		 
		 // select from 
		 
		 driver.findElement(By.id("onewaytrip")).click();
		 driver.findElement(By.xpath("//input[@name='flightSearchFrom']")).sendKeys("Goa");
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//span[text()=', Dabolim (GOI) ']")).click();
		 Thread.sleep(3000);
		 //select to 
		 driver.findElement(By.xpath("//input[@name='flightSearchTo']")).sendKeys("Delhi");
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//span[text()=' (DEL) ']")).click();
		 
		 //date
		 
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//a[text()='5']")).click();
		 Thread.sleep(3000);
		 
		 //select person
		 
		 for(int i=0 ; i<=3 ;i++)
		 {
			 driver.findElement(By.xpath("//button[@id='adds_adult']")).click();
		 }
		 
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//button[@class='col-xs-12 done_btn aubergine-button-dark passengerModalBtn']")).click();
		 
		 // clicking on search button
		 
		 driver.findElement(By.xpath("//button[@id='book-flight-widget']")).click();
		 
	}
}
