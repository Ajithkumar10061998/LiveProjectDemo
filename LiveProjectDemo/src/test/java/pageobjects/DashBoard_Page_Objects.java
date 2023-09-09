package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashBoard_Page_Objects {
@FindBy(xpath = "//p[text()='(1) Pending Self Review']")
	public static WebElement pending_Self_Review;

@FindBy(xpath = "//div[text()='Activated']")
public static WebElement reviewStatus;



}
