package project2_POM;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;
import org.testng.asserts.*;

import testCases.Case1;
import testCases.Case10;
import testCases.Case2;
import testCases.Case3;
import testCases.Case4;
import testCases.Case5;
import testCases.Case6;
import testCases.Case7;
import testCases.Case8;
import testCases.Case9;
import testCases.Case11;
import testCases.Case12;
import testCases.Case13;
import testCases.Case14;
import testCases.Case15;
import testCases.Case16;
import testCases.Case17;

public class MainPOMfile {
	
	WebDriver driver;
	
	@BeforeTest
	public void Launch() {
	System.setProperty("webdriver.chrome.driver", "C:\\Java_Eclipse\\chromedriver-win64\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	ChromeOptions co = new ChromeOptions();
	co.addArguments("--load-extension=...\\adblock");
	driver.get("http://automationexercise.com");
	} 
	
	@Test
	public void a_TestCase1() {
		Case1 scenario1 = new Case1(driver);
		scenario1.Case_1();
	}
	
	@Test
	public void b_TestCase2() {
		Case2 scenario2 = new Case2(driver);
		scenario2.case2();
	}
	
	@Test
	public void c_TestCase3() {
		Case3 scenario3 = new Case3(driver);
		scenario3.case3();
	}
	
	@Test
	public void d_TestCase4() {
		Case4 scenario4 = new Case4(driver);
		scenario4.case4();
		}
	
	@Test
	public void e_TestCase5() {
		Case5 scenario5 = new Case5(driver);
		scenario5.case5();
		}
	
	@Test
	public void f_TestCase6() {
		Case6 scenario6 = new Case6(driver);
		scenario6.case6();
	}
	
	@Test
	public void g_TestCase7() {
		Case7 scenario7 = new Case7(driver);
		scenario7.case7();
	}
	
	@Test
	public void h_TestCase8() {
		Case8 scenario8 = new Case8(driver);
		scenario8.case8();
	}
	
	@Test
	public void i_TestCase9() {
		Case9 scenario9 = new Case9(driver);
		scenario9.case9();
	}
	
	@Test
	public void j_TestCase10() {
		Case10 scenario10 = new Case10(driver);
		scenario10.case10();
	}
	
	@Test
	public void k_TestCase11() {
		Case11 scenario11 = new Case11(driver);
		scenario11.case11();
	}
	
	@Test
	public void l_TestCase12() {
		Case12 scenario12 = new Case12(driver);
		scenario12.case12();
	}
	
	@Test
	public void m_TestCase13() {
		Case13 scenario13 = new Case13(driver);
		scenario13.case13();
	}
	
	@Test
	public void n_TestCase14() {
		Case14 sceanrio14 = new Case14(driver);
		sceanrio14.case14();
	}
	
	@Test
	public void o_TestCase15() {
		Case15 sceanrio15 = new Case15(driver);
		sceanrio15.case15();
	}
	
	@Test
	public void p_TestCase16() {
		Case16 sceanrio16 = new Case16(driver);
		sceanrio16.case16();
	}
	
	@Test
	public void p_TestCase17() {
		Case17 sceanrio17 = new Case17(driver);
		sceanrio17.case17();
	}
}

