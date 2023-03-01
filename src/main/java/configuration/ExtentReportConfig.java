package configuration;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportConfig {
	
	public static ExtentReports reportConfig() {
		 ExtentSparkReporter extent = new ExtentSparkReporter(new File(System.getProperty("user.dir")+"/target/Reports/report.html"));
		 extent.config().setTheme(Theme.STANDARD);
		 extent.config().setDocumentTitle("PrudentialFinancial");
		 ExtentReports report = new ExtentReports();
		 report.attachReporter(extent);
		 report.setSystemInfo("Environment", "SIT");
		 report.setSystemInfo("Executed by", "MockGroup 11 & 12");
		 report.setSystemInfo("Browser", "Chrome");
		 return report;
	}
}
