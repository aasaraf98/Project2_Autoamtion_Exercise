package testCases;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Case13 {
	
	WebDriver driver;
	
	public Case13(WebDriver driver) {
		this.driver = driver;
	}
	
	String URL = "http://automationexercise.com";
	By products = By.xpath("//a[@href=\"/products\"]");
	By viewProd = By.xpath("//a[@href=\"/product_details/1\"]");
	By quantity = By.id("quantity");
	By addToCart = By.xpath("//button[@class=\"btn btn-default cart\"]");
	By viewCart = By.xpath("//*[@id='cartModal']/div/div/div[2]/p[2]/a");
	By product1 = By.xpath("//tr[@id=\"product-1\"]/td[2]/h4/a");
	By price = By.xpath("//tr[@id=\"product-1\"]/td[3]/p");
	By quantity1 = By.xpath("//tr[@id=\"product-1\"]/td[4]/button");
	By total = By.xpath("//tr[@id=\"product-1\"]/td[5]/p");
	
	public void case13() {
		driver.get(URL);
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(products).click();
		driver.findElement(viewProd).click();
		String title1 = driver.getTitle();
		System.out.println(title1);
		driver.findElement(quantity).clear();
		driver.findElement(quantity).sendKeys("4");
		driver.findElement(addToCart).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(viewCart).click();
		
		System.out.println("Product Name - " + driver.findElement(product1).getText());
		System.out.println("Price - " + driver.findElement(price).getText());
		System.out.println("Quantity - " + driver.findElement(quantity1).getText());
		System.out.println("Total - " + driver.findElement(total).getText());
	}

}
