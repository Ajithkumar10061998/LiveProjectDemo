package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Admin_Page_Objects {
	
	@FindBy(xpath = "//a[@class='oxd-main-menu-item']")
	public static WebElement admin_button;
	
	@FindBy(xpath = "(//span[@class='oxd-topbar-body-nav-tab-item'])[1]")
	public static WebElement user_Management_Link;
	
	@FindBy(xpath = "//a[text()='Users']")
	public static WebElement user_Link;
	
	@FindBy(xpath = "(//div[@tabindex=\"0\"])[1]")
	public static WebElement user_Role;

	@FindBy(xpath = "(//div[@tabindex=\"0\"])[2]")
	public static WebElement status_Dropdown;
	
	@FindBy(xpath = "//button[@type='submit']")
	public static WebElement search_button;
	
	@FindBy(xpath = "(//div[text()='Admin'])[1]")
	public static  WebElement recordsFound_UserName;
	
	
	@FindBy(xpath = "(//div[text()='Enabled'])[1]")
	public static  WebElement recordsFound_Status;
}
