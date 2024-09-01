package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingGetSize {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		WebElement size = driver.findElement(By.xpath("//div[@class='_3sdu8W emupdz']"));
		Dimension sizeOfTheWindow = size.getSize();
		System.out.println(sizeOfTheWindow);
		
		Point locationofthisWindow = size.getLocation();
		System.out.println(locationofthisWindow);
		
		driver.close();
	}
}
