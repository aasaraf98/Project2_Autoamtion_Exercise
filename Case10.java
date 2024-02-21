package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Case10 {
	
WebDriver driver;
	
	public Case10(WebDriver driver) {
		this.driver = driver;
	}
	
	String URL = "http://automationexercise.com";
	By txt = By.xpath("//div[@class=\"single-widget\"]/h2");
	By email = By.id("susbscribe_email");
	By submit = By.id("subscribe");
	By subscriptionTxt = By.xpath("//div[@class=\"alert-success alert\"]");

	
	public void case10() {
		driver.get(URL);
		String title = driver.getTitle();
		System.out.println(title);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)", "");
		String txt1 = driver.findElement(txt).getText();
		System.out.println(txt1);
		driver.findElement(email).sendKeys("prathamesh171994@gmail.com");
		driver.findElement(submit).click();
		String success = driver.findElement(subscriptionTxt).getText();
		System.out.println(success);
		
	}
}
