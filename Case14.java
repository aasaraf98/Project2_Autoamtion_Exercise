package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import testCases.Case1;

public class Case14 {
	
WebDriver driver;
	
	public Case14(WebDriver driver) {
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
	By proceedToCheckOut = By.xpath("//a[@class=\"btn btn-default check_out\"]");
	By login = By.xpath("//*[@id=\"checkoutModal\"]/div/div/div[2]/p[2]/a");
	By cart = By.xpath("//a[@href=\"/view_cart\"]");
	By deiveryaddress = By.id("address_delivery");
	By Name = By.name("name");
	By emailId = By.xpath("//input[@data-qa=\"signup-email\"]");
	By submit = By.xpath("//button[@data-qa=\"signup-button\"]");
	By accountDetails = By.xpath("//div[@class=\"login-form\"]/h2/b");
	By radioButton = By.id("id_gender1");
	By password = By.id("password");
	By day = By.id("days");
	By month = By.id("months");
	By year = By.id("years");
	By newsletter = By.xpath("//label[@for = 'newsletter']");
	By offers = By.xpath("//label[@for = 'optin']");
	By first_name = By.id("first_name");
	By last_name = By.id("last_name");
	By company = By.id("company");
	By address = By.id("address1");
	By address2 = By.id("address2");
	By country = By.id("country");
	By state = By.id("state");
	By city = By.id("city");
	By zipcode = By.id("zipcode");
	By mobile = By.id("mobile_number");
	By create_account = By.xpath("//button[@data-qa=\"create-account\"]");
	By accountCreatedText = By.xpath("//h2[@data-qa=\"account-created\"]");
	By continuebtn = By.xpath("//a[@data-qa=\"continue-button\"]");
	By loggedInAs = By.xpath("//ul[@class=\"nav navbar-nav\"]/li[10]/a");
	By deleteAccount = By.xpath("//a[@href=\"/delete_account\"]");
	By continueDelete = By.xpath("//a[@data-qa=\"continue-button\"]");

	
	public void case14() {
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
		driver.findElement(proceedToCheckOut).click();
		driver.findElement(By.xpath("//*[@id=\"checkoutModal\"]/div/div/div[2]/p[2]/a")).click();
		
		driver.findElement(Name).sendKeys("Akshay");
		driver.findElement(emailId).sendKeys("testingo_excelr_aksh2@gmail.com");
		driver.findElement(submit).click();
		String TitleofAccountpage = driver.findElement(accountDetails).getText();
		System.out.println(TitleofAccountpage);
		driver.findElement(radioButton).click();
		driver.findElement(password).sendKeys("ExcelR");
		Select dropDown = new Select(driver.findElement(day));
		dropDown.selectByVisibleText("17");
		Select dropDown1 = new Select(driver.findElement(month));
		dropDown1.selectByVisibleText("March");
		Select dropDown2 = new Select(driver.findElement(year));
		dropDown2.selectByVisibleText("1998");
		driver.findElement(newsletter).click();
		driver.findElement(offers).click();
		driver.findElement(first_name).sendKeys("AK");
		driver.findElement(last_name).sendKeys("SA");
		driver.findElement(company).sendKeys("ExcelR");
		driver.findElement(address).sendKeys("Fursungi");
		driver.findElement(address2).sendKeys("Hadapsar");
		driver.findElement(state).sendKeys("Maharashta");
		driver.findElement(city).sendKeys("PUNE");
		driver.findElement(zipcode).sendKeys("123456");
		driver.findElement(mobile).sendKeys("1234567890");
		driver.findElement(create_account).click();
		System.out.println("Congratulations! Your new account has been successfully created!");
		String text = driver.findElement(accountCreatedText).getText();
		System.out.println(text);
		driver.findElement(continuebtn).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String LoggedInAsUsername = driver.findElement(loggedInAs).getText();
		System.out.println(LoggedInAsUsername);

		
		driver.findElement(cart).click();
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
