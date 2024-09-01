package SearchContexts;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProductAndPrice {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']")).sendKeys("moto",Keys.ENTER);
		Thread.sleep(2000);
		
		List<WebElement> productName = driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
		List<WebElement> productPrice = driver.findElements(By.xpath("//div[@class='Nx9bqj _4b5DiR']"));
		
		for(int i=0;i<productName.size();i++) {
			for(int j=i;j<=i;j++) {
				System.out.println(productName.get(i).getText()+" - "+ productPrice.get(j).getText());
				System.out.println("---------------------------------------------------------------");
			}
		}
		driver.close();
		
	}

}
