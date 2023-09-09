package commonfunctions;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonFunctions {

	public static Properties properties = null;
	public static WebDriver driver = null;
	static Logger logger = Logger.getLogger(CommonFunctions.class);


	public void propertiesloader() throws Exception {

		FileInputStream propertyfetcher = new FileInputStream("config.properties");
		properties = new Properties();
		properties.load(propertyfetcher);

	}

	@BeforeSuite
	public void browserLaunch() throws Exception {
		PropertyConfigurator.configure("log4j.properties");
		logger.info("Orange HRM Test Begins");
		logger.info("Loading the Property Files");
		propertiesloader();

		String browsers = properties.getProperty("browser");
		if (browsers.equalsIgnoreCase("chrome")) {
			logger.info("Launching Chrome Browser");
			WebDriverManager.chromedriver().setup();
			ChromeOptions ops = new ChromeOptions();
			ops.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(ops);

		} else if (browsers.equalsIgnoreCase("firefox")) {
			logger.info("Launching Firefox Browser");
			WebDriverManager.firefoxdriver().setup(); 
			driver = new FirefoxDriver();
		}

		String url = properties.getProperty("url");
        driver.get(url);
		driver.manage().window().maximize();
		logger.info("Application Launched successfully");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	}
	@AfterSuite
	public void tearDown() {
		
		logger.info("Execution Done-Closing The Browser");
		driver.quit();

	}



}


