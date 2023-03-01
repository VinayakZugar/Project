package utility;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import configuration.PathConfig;

public class Screenshot {
	
	public static void ScreenS(WebDriver driver,String fileName) throws IOException {
		Date d = new Date();
		String date = d.toString().replace(":", "_");
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File(PathConfig.ScreenSPath+fileName+date+".png");
		FileHandler.copy(src, dest);
	}	
}
