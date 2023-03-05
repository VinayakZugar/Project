package utility;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;

import configuration.PathConfig;
import configuration.TestNgListeners;

public class Screenshot extends TestNgListeners   {
	static String date;
	public static File ScreenS(WebDriver driver,String fileName) throws IOException {
		Date d = new Date();
	    date = d.toString().replace(":", "_");
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File(PathConfig.ScreenSPath+fileName+date+".png");
		FileHandler.copy(src, dest);
		return dest;
	}	
	
	public static void failScreenshot(ITestResult res,WebDriver driver,String file) throws IOException {
		if(ITestResult.FAILURE==res.getStatus()) {
			Screenshot.ScreenS(driver, file);
			
			String path = PathConfig.ScreenSPath+file+date+".png";
			test.addScreenCaptureFromPath(path);
		}
	}
}
