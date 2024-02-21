package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Case3{
	
	WebDriver driver;
	
	public Case3(WebDriver driver) {
		this.driver = driver;
	}
	
	By signup_login = By.xpath("//a[@href='/login']");
	By logintxt = By.xpath("//div[@class=\"login-form\"]/h2");
	By emailID = By.name("email");
	By password = By.name("password");
	By submit = By.xpath("//button[@data-qa=\"login-button\"]");
	By errorTxt = By.xpath("//form[@action=\"/login\"]/p");
	
	public void case3() {
		driver.findElement(signup_login).click();
		String TitleofLogin = driver.findElement(logintxt).getText();
		System.out.println(TitleofLogin);
		driver.findElement(emailID).sendKeys("testinglak_excelr2@gmail.com");
		driver.findElement(password).sendKeys("ExcelR");
		driver.findElement(submit).click();
		String error_message = driver.findElement(errorTxt).getText();
		System.out.println(error_message);
	}

}
