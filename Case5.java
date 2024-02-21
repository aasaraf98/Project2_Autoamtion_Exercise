package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Case5 {
	
	WebDriver driver;
	
	public Case5(WebDriver driver) {
		this.driver = driver;
	}
	
	String url = "https://automationexercise.com/";
	By signup_login = By.xpath("//a[@href='/login']");
	By signup_text = By.xpath("//div[@class=\"signup-form\"]/h2");
	By Name = By.name("name");
	By emailId = By.xpath("//input[@data-qa=\"signup-email\"]");
	By submit = By.xpath("//button[@data-qa=\"signup-button\"]");
	By signupMSG = By.xpath("//form[@action=\"/signup\"]/p");
	
	public void case5() {
		driver.get(url);
		driver.findElement(signup_login).click();
		String TitleofSignup = driver.findElement(signup_text).getText();
		System.out.println(TitleofSignup);
		driver.findElement(Name).sendKeys("Akshay");
		driver.findElement(emailId).sendKeys("testingb_excelr2@gmail.com");
		driver.findElement(submit).click();
		String expeceted = "Email Address already exist!";
		String actual = driver.findElement(signupMSG).getText();
		System.out.println(actual);
		Assert.assertEquals(expeceted, actual);
	}
}
