package DMRC;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DelhiMetro {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://delhimetrorail.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("buttonDismiss1")).click();
		Thread.sleep(2000);
		WebElement totalLength = driver.findElement(By.xpath("//p[text()='Total Network Length (km)']/../div"));
		System.out.println(totalLength.getText());
		WebElement totalLines = driver.findElement(By.xpath("//p[text()='Total no of Lines']/../div"));
		System.out.println(totalLines.getText());
		WebElement totalStation = driver.findElement(By.xpath("//p[text()='Total no of Stations']/../div"));
		System.out.println(totalStation.getText());
		Thread.sleep(2000);
		
		
		driver.findElement(By.id("FromStation")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[text()='MILLENNIUM CITY CENTRE GURUGRAM']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//font[text()='ROHINI SECTOR - 18, 19']")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("ToStation")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[text()='NOIDA ELECTRONIC CITY']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//font[text()='DWARKA SECTOR - 10']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[text()='Show Route & Fare']")).click();
		
		driver.close();
		
		
		
	}
}
