package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Case16 {
	
	WebDriver driver;
	
	public Case16(WebDriver driver) {
		this.driver = driver;
	}
	
	By signup_login = By.xpath("//a[@href='/login']");
	By logintxt = By.xpath("//div[@class=\"login-form\"]/h2");
	By emailID = By.name("email");
	By password = By.name("password");
	By submit = By.xpath("//button[@data-qa=\"login-button\"]");
	By deleteAccount = By.xpath("//a[@href=\"/delete_account\"]");
	By verifyDelete = By.xpath("//h2[@class=\"title text-center\"]/b");
	By continueDelete = By.xpath("//a[@data-qa=\"continue-button\"]");
	By loggedInAs = By.xpath("//ul[@class=\"nav navbar-nav\"]/li[10]/a");
	String URL = "http://automationexercise.com";
	By products = By.xpath("//a[@href=\"/products\"]");
	By img = By.xpath("//div[@class=\"col-sm-4\"][1]/div/div/div/img");
	By img1= By.xpath("//div[@class=\"col-sm-4\"][2]/div/div/div/img");
	By AddtoCart = By.xpath("//div[@class=\"col-sm-4\"][1]/div/div/div/div/a");
	By AddtoCart2 = By.xpath("//div[@class=\"col-sm-4\"][2]/div/div/div/div/a");
	By ContinueShop = By.xpath("//*[@id=\"cartModal\"]/div/div/div[3]/button");
	By viewCart = By.xpath("//*[@id='cartModal']/div/div/div[2]/p[2]/a");
	By proceedToCheckOut = By.xpath("//a[@class=\"btn btn-default check_out\"]");
	By deiveryaddress = By.id("address_delivery");

	
	public void case16() {
		driver.findElement(signup_login).click();
		String TitleofLogin = driver.findElement(logintxt).getText();
		System.out.println(TitleofLogin);
		driver.findElement(emailID).sendKeys("testingo_excelr_ak2@gmail.com");
		driver.findElement(password).sendKeys("ExcelR");
		driver.findElement(submit).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String LoggedInAsUsername = driver.findElement(loggedInAs).getText();
		System.out.println(LoggedInAsUsername);
		
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
		driver.findElement(proceedToCheckOut).click();
		
		System.out.println(driver.findElement(deiveryaddress).getText());
		driver.findElement(By.xpath("//textarea[@class=\"form-control\"]")).sendKeys("Order Placed");
		driver.findElement(By.xpath("//a[@href=\"/payment\"]")).click();
		driver.findElement(By.name("name_on_card")).sendKeys("ExcelR");
		driver.findElement(By.name("card_number")).sendKeys("9876 5432 1098");
		driver.findElement(By.name("cvc")).sendKeys("000");
		driver.findElement(By.name("expiry_month")).sendKeys("12");
		driver.findElement(By.name("expiry_year")).sendKeys("1994");
		driver.findElement(By.id("submit")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class=\"alert-success alert\"]")).getText());
		driver.findElement(deleteAccount).click();
		driver.findElement(continueDelete).click();
		
	}

	
	
	

}
