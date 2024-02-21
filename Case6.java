package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Case6 {

WebDriver driver;
	
	public Case6(WebDriver driver) {
		this.driver = driver;
}
	
	String url = "https://automationexercise.com/";
	By contactUS = By.xpath("//a[@href=\"/contact_us\"]");
	By contactUSTxt = By.xpath("//div[@class=\"contact-form\"]/h2");
	By name = By.name("name");
	By email = By.name("email");
	By subject = By.name("subject");
	By message = By.id("message");
	By selectFile = By.name("upload_file");
	By upload = By.xpath("//form[@id=\"contact-us-form\"]/div[5]");
	By submit = By.name("submit");	
	By successMSG = By.xpath("//div[@class=\"status alert alert-success\"]");
	By homePage = By.xpath("//a[@class=\"btn btn-success\"]");
	
	public void case6() {
		driver.get(url);
		driver.findElement(contactUS).click();
		String txt = driver.findElement(contactUSTxt).getText();
		System.out.println(txt);
		driver.findElement(name).sendKeys("Akshay");
		driver.findElement(email).sendKeys("abc@gmail.com");
		driver.findElement(subject).sendKeys("SUBJECT");
		driver.findElement(message).sendKeys("MESSAGE");
		WebElement selectFiles = driver.findElement(selectFile);
		selectFiles.sendKeys("D:\\Akshay\\TestCase6_Upload File.docx");
		driver.findElement(submit).click();
		String alert = driver.switchTo().alert().getText();
		System.out.println(alert);
		driver.switchTo().alert().accept();
		String msg = driver.findElement(successMSG).getText();
		String SuccessAlert = "Success! Your details have been submitted successfully.";
		Assert.assertEquals(SuccessAlert, msg);
		driver.findElement(homePage).click();
	}
	
}
		
