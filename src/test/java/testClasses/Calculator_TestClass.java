package testClasses;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pomClasses.CalculatorPom;
import utility.BrowserLuanch;
import utility.Screenshot;

public class Calculator_TestClass {
	//Calculator Automation
	WebDriver driver;
	CalculatorPom cp;
	String s;
	@SuppressWarnings("deprecation")
	@BeforeClass
	@Parameters("Browser")
	public void browserLaunch(String b) {
		driver=BrowserLuanch.Bl(b);
		driver.manage().window().maximize();
		driver.get("https://www.calculator.net/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		cp = new CalculatorPom(driver);
	}
	
	@Test
	public void TC_01_Multiplication() {
		s="TC_01";
		cp.multiplication();
		String txt = cp.anstxt();
		Assert.assertEquals(txt, " 222075");
		
	}
	@Test
	public void TC_02_Division(){
		s="TC_02";
		cp.divison();
		String txt = cp.anstxt();
		Assert.assertEquals(txt, " 20");
	
	}
	@Test
	public void TC_03_Addition(){
		s="TC_03";
		cp.addition();
		String txt = cp.anstxt();
		Assert.assertEquals(txt, " 111111");
		
	}
	@Test
	public void TC_04_Subtraction(){
		s="TC_04";
		cp.subtraction();
		String txt = cp.anstxt();
		Assert.assertEquals(txt, " 23329646");
		
	}
	
	
	@AfterMethod
	public void clear(ITestResult res) throws InterruptedException, IOException {
		Screenshot.failScreenshot(res, driver, s);
		Thread.sleep(1000);
		cp.clear();
	}
	
	@AfterClass
	public void teardown() {
		driver.close();
	}
	}
