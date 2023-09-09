package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage_Page_objects {
	
	@FindBy(name="username")
	public static WebElement userName;
	
	@FindBy(name="password")
	public static WebElement password;
	
	@FindBy(xpath ="//button[@type='submit']")
	public static WebElement loginButton;
		

}

