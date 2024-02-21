package testCases;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Case4 {
	
	WebDriver driver;
	
	public Case4(WebDriver driver) {
		this.driver = driver;
	}
	
	String url = "https://automationexercise.com/";
	By signup_login = By.xpath("//a[@href='/login']");
	By logintxt = By.xpath("//div[@class=\"login-form\"]/h2");
	By emailID = By.name("email");
	By password = By.name("password");
	By submit = By.xpath("//button[@data-qa=\"login-button\"]");
	By loggedInAs = By.xpath("//ul[@class=\"nav navbar-nav\"]/li[10]/a");
	By logout = By.xpath("//a[@href=\"/logout\"]");
	
	
	
	public void case4() {
		driver.get(url);
		driver.findElement(signup_login).click();
		String TitleofLogin = driver.findElement(logintxt).getText();
		System.out.println(TitleofLogin);
		driver.findElement(emailID).sendKeys("testingb_excelr2@gmail.com");
		driver.findElement(password).sendKeys("ExcelR");
		driver.findElement(submit).click();
		String LoggedInAsUsername = driver.findElement(loggedInAs).getText();
		System.out.println(LoggedInAsUsername);
		driver.findElement(logout).click();
		String login = "Login to your account";
		String TitleofLogin1 = driver.findElement(logintxt).getText();
		System.out.println(TitleofLogin1);
		Assert.assertEquals(login, TitleofLogin1);
	}

}
