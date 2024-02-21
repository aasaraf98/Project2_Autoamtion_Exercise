package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Case1 {
	
	WebDriver driver;
	
	public Case1(WebDriver driver) {
		this.driver = driver;
	}
	
	By title = By.xpath("html/head/title");
	By signup_login = By.xpath("//a[@href='/login']");
	By signup_text = By.xpath("//div[@class=\"signup-form\"]/h2");
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
	By verifyDelete = By.xpath("//h2[@class=\"title text-center\"]/b");
	By continueDelete = By.xpath("//a[@data-qa=\"continue-button\"]");
	
	public void Case_1() {	
	String TitleofHomePage = driver.findElement(title).getText();
	System.out.println(TitleofHomePage);
	driver.findElement(signup_login).click();
	String TitleofSignup = driver.findElement(signup_text).getText();
	System.out.println(TitleofSignup);
	driver.findElement(Name).sendKeys("Akshay");
	driver.findElement(emailId).sendKeys("testingo_excelr_ak2@gmail.com");
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
	String deleteVerify = driver.findElement(deleteAccount).getText();
	System.out.println(deleteVerify);
	driver.findElement(deleteAccount).click();
	driver.findElement(continueDelete).click();
	}
}
