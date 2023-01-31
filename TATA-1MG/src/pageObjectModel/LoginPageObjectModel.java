package pageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObjectModel {

	
	@FindBy(xpath = "//span[text()='Login']")
	public static WebElement LoginButton;
	
	@FindBy(xpath = "//label[@class='style__input-label___1kYYX']")
	public static WebElement Email;
	
	@FindBy(xpath = "//a[@class='button-text']")
	public static WebElement Login;
	
	
	
	
	
	
	
	
	
	
}
