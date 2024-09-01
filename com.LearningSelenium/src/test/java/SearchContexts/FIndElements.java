package SearchContexts;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FIndElements {
	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.flipkart.com/");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']")).sendKeys("Laptops",Keys.ENTER);
		 Thread.sleep(2000);
		 List<WebElement> allLaptopDetails = driver.findElements(By.xpath("//div[@class='yKfJKb row']"));
		 
		 for(int i=1;i<allLaptopDetails.size();i++) {
			 System.out.println(allLaptopDetails.get(i).getText());
			 System.out.println("----------------------------------------------------------------------------");
		 }
		 
		 driver.close();
		 
		 
	}

}
