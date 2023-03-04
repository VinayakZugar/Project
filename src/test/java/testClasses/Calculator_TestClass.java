package testClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pomClasses.CalculatorPom;
import utility.BrowserLuanch;

public class Calculator_TestClass {
	
	WebDriver driver;
	CalculatorPom cp;
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
		cp.multiplication();
		String txt = cp.anstxt();
		Assert.assertEquals(txt, " 222075");
		
	}
	@Test
	public void TC_02_Division(){
		cp.divison();
		String txt = cp.anstxt();
		Assert.assertEquals(txt, " 20");
	
	}
	@Test
	public void TC_03_Addition(){
		cp.addition();
		String txt = cp.anstxt();
		Assert.assertEquals(txt, " 111111");
		
	}
	@Test
	public void TC_04_Subtraction(){
		cp.subtraction();
		String txt = cp.anstxt();
		Assert.assertEquals(txt, " 23329646");
		
	}
	@AfterMethod
	public void clear() throws InterruptedException {
		Thread.sleep(1000);
		cp.clear();
	}
	
	@AfterClass
	public void teardown() {
		driver.close();
	}

}
