package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Case17 {
	
	WebDriver driver;
	
	public Case17(WebDriver driver) {
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
	By deleteItem = By.xpath("//tbody/tr[1]/td[6]/a/i");
	
	public void case17() {
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
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.findElement(viewCart).click();
		driver.findElement(deleteItem).click();
		System.out.println("Item deleted Successfully");
		System.out.println(driver.findElement(By.xpath("//tbody")).getText());
		
	}

}
