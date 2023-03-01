package utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Base {

	public static WebDriver driver;
	  
	public static void scrollbyamount(int a,int b) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("scroll("+a+","+b+")");
	}
	
	public static void scrollintoView(WebElement ele) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView(true);", ele);
	}
	
	public static void presstab() {
		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB).perform();
	}
	
	public static void alertPopUp() {
		driver.switchTo().alert().dismiss();
	}
	
	public static void draganddrop(WebElement drag,WebElement drop) {
		Actions act = new Actions(driver);
		act.dragAndDrop(drag, drop).perform();
	}
	
	public static double strTodouble(String str) {
		 double d = Double.parseDouble(str);
		return d;
	}
	
	public static float strTofloat(String str) {
		float d = Float.parseFloat(str);
		return d;
	}
	
	public static long strTolong(String str) {
		 long d = Long.parseLong(str);
		return d;
	}
	public static String longTostring(long i) {
		String d = String.valueOf(i);
		return d;
	}
}
