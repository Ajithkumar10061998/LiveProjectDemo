package testcases;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import commonfunctions.CommonFunctions;
import pageobjects.DashBoard_Page_Objects;

public class Test_Pending_Self_Review extends CommonFunctions {
	@Test
	public void dashboard() {
		Logger logger = Logger.getLogger(Test_Pending_Self_Review.class);
		PageFactory.initElements(driver,DashBoard_Page_Objects.class);
		
		logger.info("Checking the pending self review");
		DashBoard_Page_Objects.pending_Self_Review.click();
		
		logger.info("Status verfication");
		String actualStatus = DashBoard_Page_Objects.reviewStatus.getText();
		
		Assert.assertEquals(actualStatus,"Activated");
		
		logger.info("End of Pending self review");
	}
}
