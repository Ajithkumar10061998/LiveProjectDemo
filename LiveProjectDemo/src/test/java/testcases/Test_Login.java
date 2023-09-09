package testcases;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonfunctions.CommonFunctions;
import pageobjects.LoginPage_Page_objects;

public class Test_Login extends CommonFunctions {
	@Test
	public void login() {
		
		Logger logger = Logger.getLogger(Test_Login.class);
		logger.info("Login into the Application with Valid Credits");
		
		String  userconfig= properties.getProperty("username");
		String passwordConfig = properties.getProperty("password");
		
		PageFactory.initElements(driver,LoginPage_Page_objects.class);
		
		LoginPage_Page_objects.userName.sendKeys(userconfig);
		LoginPage_Page_objects.password.sendKeys(passwordConfig);
		LoginPage_Page_objects.loginButton.click();

	}
}
