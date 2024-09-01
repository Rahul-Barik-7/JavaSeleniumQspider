package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingGetLocation {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		WebElement size = driver.findElement(By.xpath("//div[@class='_3sdu8W emupdz']"));
		
		
		Point locationofthisWindow = size.getLocation();
		System.out.println(locationofthisWindow);
		
		driver.close();
}
}
