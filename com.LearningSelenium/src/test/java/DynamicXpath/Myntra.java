package DynamicXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.myntra.com/");
		Thread.sleep(2000);
		// searching product
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("watch", Keys.ENTER);
		Thread.sleep(2000);

		WebElement productPrice = driver.findElement(By.xpath(
				"//h4[text()='Vyb Halo Analogue Watch']/ancestor::a[contains(@href,'watches/fastrack/fastrack-vyb-halo-women-dial')]/descendant::div[@class='product-price']"));
		System.out.println("Product price is : " + productPrice.getText());

		driver.close();
	}
}
