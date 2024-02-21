package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Case7 {

	WebDriver driver;
	
	public Case7(WebDriver driver) {
		this.driver = driver;
	}
	
	By testCase = By.xpath("//a[@href=\"/test_cases\"]");
	
	public void case7() {
		driver.get("https://automationexercise.com/");
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(testCase).click();
		String titleTest = driver.getTitle();
		System.out.println(titleTest);
	}
}
