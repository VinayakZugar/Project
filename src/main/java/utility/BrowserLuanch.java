package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import configuration.PathConfig;

public class BrowserLuanch {

   static WebDriver driver;
	
	public static WebDriver Bl(String brows) {
		if(brows.equals("Chrome")) {
			ChromeOptions op = new ChromeOptions();
			op.addArguments("--remote-allow-origins=*");
		 driver = new ChromeDriver(op);
		 
		}else if(brows.equals("Edge")) {
		System.setProperty("webdriver.edge.driver",PathConfig.EdgeDriver);
		driver = new EdgeDriver();
			
		}else if(brows.equals("FireFox")) {
		System.setProperty("webdriver.gecko.driver",PathConfig.FireFoxDriv);
		 driver = new FirefoxDriver();
			
		}
		return driver;
	}
}
