package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Case2 {
	
	WebDriver driver;
	
	public Case2(WebDriver driver) {
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
	
	public void case2() {
		driver.findElement(signup_login).click();
		String TitleofLogin = driver.findElement(logintxt).getText();
		System.out.println(TitleofLogin);
		driver.findElement(emailID).sendKeys("testing_excelr22@gmail.com");
		driver.findElement(password).sendKeys("ExcelR");
		driver.findElement(submit).click();
		String LoggedInAsUsername = driver.findElement(loggedInAs).getText();
		System.out.println(LoggedInAsUsername);
		String deleteVerify = driver.findElement(deleteAccount).getText();
		System.out.println(deleteVerify);
		driver.findElement(deleteAccount).click();
		driver.findElement(continueDelete).click();
		
	}
	

}
