package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Case9 {
	
WebDriver driver;
	
	public Case9(WebDriver driver) {
		this.driver = driver;
	}
	
	String URL = "http://automationexercise.com";
	By products = By.xpath("//a[@href=\"/products\"]");
	By searchProduct = By.id("search_product");
	By searchButton = By.xpath("//i[@class=\"fa fa-search\"]");
	By viewProduct = By.xpath("//div[@class=\"col-sm-4\"][1]/div/div[2]/ul/li");
	By productName = By.xpath("//div[@class=\"product-information\"]/h2");
	By category = By.xpath("//div[@class=\"product-information\"]/p[1]");
	By availability = By.xpath("//div[@class=\"product-information\"]/p[2]");
	By condition = By.xpath("//div[@class=\"product-information\"]/p[3]");
	By brand = By.xpath("//div[@class=\"product-information\"]/p[4]");
	By price = By.xpath("//div[@class=\"product-information\"]/span/span");
	
	public void case9() {
		driver.get(URL);
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(products).click();
		String title1 = driver.getTitle();
		System.out.println(title1);
		driver.findElement(searchProduct).sendKeys("T Shirt");
		driver.findElement(searchButton).click();
		driver.findElement(viewProduct).click();
		System.out.println("Product Name - " + driver.findElement(productName).getText());
		System.out.println("Category - " + driver.findElement(category).getText());
		System.out.println("Price - " + driver.findElement(price).getText());
		System.out.println("Availability - " + driver.findElement(availability).getText());
		System.out.println("Condition - " + driver.findElement(condition).getText());
		System.out.println("Brand - " + driver.findElement(brand).getText());
	}


}
