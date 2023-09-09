package testcases;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import commonfunctions.CommonFunctions;
import pageobjects.Admin_Page_Objects;

public class Test_User_Role_Status extends CommonFunctions {
	@Test
	public void system_user_role_status() throws AWTException {
		
		PageFactory.initElements(driver,Admin_Page_Objects.class);
		Logger logger = Logger.getLogger(Test_User_Role_Status.class);
		logger.info("Navigating to Admin Page");
		
		Admin_Page_Objects.admin_button.click();
		Admin_Page_Objects.user_Management_Link.click();
		
		logger.info("Clicking the User under user Management");
		Admin_Page_Objects.user_Link.click();

		logger.info("Instead of Select class I use Robot Class Functions");
		
		logger.info("Selecting the User Role");
		Admin_Page_Objects.user_Role.click(); 

		Robot key = new Robot();
		key.keyPress(KeyEvent.VK_DOWN); 
		key.keyRelease(KeyEvent.VK_DOWN);
		key.keyPress(KeyEvent.VK_ENTER); 
		key.keyRelease(KeyEvent.VK_ENTER);
		
		logger.info("Selecting the Status");
		Admin_Page_Objects.status_Dropdown.click();

		Robot keys = new Robot();
		keys.keyPress(KeyEvent.VK_DOWN); 
		keys.keyRelease(KeyEvent.VK_DOWN);
		keys.keyPress(KeyEvent.VK_ENTER); 
		keys.keyRelease(KeyEvent.VK_ENTER);

		logger.info("Searching the filtered Records");
		Admin_Page_Objects.search_button.click();
		
		logger.info("Verfication of records");
		
		String actualUser = Admin_Page_Objects.recordsFound_UserName.getText();
		Assert.assertEquals(actualUser,"Admin");

		String actualStatus = Admin_Page_Objects.recordsFound_Status.getText();
		Assert.assertEquals(actualStatus,"Enabled");
		
		logger.info("End of User Role Status Test Case");
	}


}
