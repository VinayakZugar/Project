package testClasses;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import configuration.PathConfig;
import pomClasses.PrudenHome;
import pomClasses.QuotePom;
import utility.BrowserLuanch;

public class Test1 {
	WebDriver driver;
	PrudenHome pm;
	QuotePom q;
	String id;
	@BeforeClass
	public void browser() throws InterruptedException {
		driver=BrowserLuanch.Bl("Chrome");
		driver.get(PathConfig.appUrl);
		pm= new PrudenHome(driver);	
		pm.termLife(driver);
		
	}

	@BeforeMethod
	public void termL() throws InterruptedException{
		  q = new QuotePom(driver);
	}
	
	@Test
	public void Tc_01() {
		id="TC_01";
		String str = q.perc();
		Assert.assertEquals(str, "Start");
	}
	@Test
	public void Tc_02() throws InterruptedException {
		id="TC_02";
		q.haveInsuNO();
		Thread.sleep(1000);
		String str1 = q.perc();
		Assert.assertEquals(str1, "22%");
	}

	@Test
	public void Tc_04() throws InterruptedException {
		id="TC_04";
		q.gender();
		Thread.sleep(1000);
		String str2 = q.perc();
		Assert.assertEquals(str2, "30%");
	}
	@Test
	public void Tc_06() throws InterruptedException {
		q.TobaccoY();
		Thread.sleep(1000);
		String str2 = q.perc();
		Assert.assertEquals(str2, "36%");
	}
	@Test
	public void Tc_08() throws InterruptedException {
		q.MarriedY();
		Thread.sleep(1000);
		String str2 = q.perc();
		Assert.assertEquals(str2, "42%");
	}
	@Test
	public void Tc_10() throws InterruptedException {
		q.hasChildyes();
		Thread.sleep(1000);
		String str2 = q.perc();
		Assert.assertEquals(str2, "47%");
}
	@Test
	public void Tc_13() throws InterruptedException {
		q.month("July");
		q.day("09");
		q.year("2000");
		q.cnt();
		Thread.sleep(1000);
		String str2 = q.perc();
		Assert.assertEquals(str2, "56%");
		
	}
	@Test
	public void Tc_12() throws InterruptedException {
		q.cnt();
		Thread.sleep(2000);
		String str1 = q.merr();
		Assert.assertEquals(str1, "Month is required");
		String str4 = q.dayerr();
		Assert.assertEquals(str4, "Day is required");
		String str3 = q.yearerr();
		Assert.assertEquals(str3, "Year is required");
	}
	
	@AfterMethod
	public void tearMethod() {
		
	}
	

}
