package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFuntions.CommonFunctions;
import pageObjectModel.LoginPageObjectModel;

public class LoginTestCase extends CommonFunctions{
	
	@Test
	public void TESTCASE1() {
		
		PageFactory.initElements(fire1,LoginPageObjectModel.class);
		fire1.manage().timeouts().getImplicitWaitTimeout();
		LoginPageObjectModel.LoginButton.click();
		LoginPageObjectModel.Email.sendKeys(username1);
		LoginPageObjectModel.Login.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
