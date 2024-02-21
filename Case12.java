package testCases;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Case12 {
	
	WebDriver driver;
	
	public Case12(WebDriver driver) {
		this.driver = driver;
	}
	

	String URL = "http://automationexercise.com";
	By products = By.xpath("//a[@href=\"/products\"]");
	By img = By.xpath("//div[@class=\"col-sm-4\"][1]/div/div/div/img");
	By img1= By.xpath("//div[@class=\"col-sm-4\"][2]/div/div/div/img");
	By AddtoCart = By.xpath("//div[@class=\"col-sm-4\"][1]/div/div/div/div/a");
	By AddtoCart2 = By.xpath("//div[@class=\"col-sm-4\"][2]/div/div/div/div/a");
	By ContinueShop = By.xpath("//*[@id=\"cartModal\"]/div/div/div[3]/button");
	By viewCart = By.xpath("//*[@id='cartModal']/div/div/div[2]/p[2]/a");
	By product1 = By.xpath("//tr[@id=\"product-1\"]/td[2]/h4/a");
	By price = By.xpath("//tr[@id=\"product-1\"]/td[3]/p");
	By quantity = By.xpath("//tr[@id=\"product-1\"]/td[4]/button");
	By total = By.xpath("//tr[@id=\"product-1\"]/td[5]/p");
	
	By product2 = By.xpath("//tr[@id=\"product-2\"]/td[2]/h4/a");
	By price2 = By.xpath("//tr[@id=\"product-2\"]/td[3]/p");
	By quantity2 = By.xpath("//tr[@id=\"product-2\"]/td[4]/button");
	By total2 = By.xpath("//tr[@id=\"product-2\"]/td[5]/p");
//	By total2 = By.xpath("//tr[@id=\"product-2\"]/td[5]/p");)
	
	public void case12() {
		driver.get(URL);
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(products).click();
		Actions action = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");
		WebElement Image = driver.findElement(img);
		action.moveToElement(Image).perform();
		driver.findElement(AddtoCart).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(ContinueShop).click();
		WebElement Image2 = driver.findElement(img1);
		action.moveToElement(Image2).perform();
		driver.findElement(AddtoCart2).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(viewCart).click();
		System.out.println("Product Name - " + driver.findElement(product1).getText());
		System.out.println("Price - " + driver.findElement(price).getText());
		System.out.println("Quantity - " + driver.findElement(quantity).getText());
		System.out.println("Total - " + driver.findElement(total).getText());
		System.out.println("");
		System.out.println("Product Name - " + driver.findElement(product2).getText());
		System.out.println("Price - " + driver.findElement(price2).getText());
		System.out.println("Quantity - " + driver.findElement(quantity2).getText());
		System.out.println("Total - " + driver.findElement(total2).getText());
	}
}
