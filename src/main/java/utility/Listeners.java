package utility;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

public class Listeners {

	public static void failScreenshot(ITestResult res,WebDriver driver,String file) throws IOException {
		if(ITestResult.FAILURE==res.getStatus()) {
			Screenshot.ScreenS(driver, file);
		}
		
	}

}
