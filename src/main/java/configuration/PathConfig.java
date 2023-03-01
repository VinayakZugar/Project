package configuration;

public class PathConfig {
	
	public static String appUrl = "https://www.prudential.com/";
	
	public static String TestDPath = System.getProperty("user.dir")+"/src/test/resources/testData/TD.xlsx";
	
	public static String ScreenSPath = System.getProperty("user.dir")+"/target/Screenshot/";
	
	public static String CDriver = System.getProperty("user.dir")+"/src/main/resources/drivers/chromedriver.exe";
	
	public static String EdgeDriver = System.getProperty("user.dir")+"/src/main/resources/drivers/geckodriver.exe";
	
	public static String FireFoxDriv = System.getProperty("user.dir")+"/src/main/resources/drivers/msedgedriver.exe";		
}