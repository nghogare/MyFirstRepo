package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	@FindBy(how=How.XPATH , using ="//input[@id='ap_email']")
	public static WebElement username;
	
	@FindBy(how=How.XPATH , using ="//input[@id='ap_password']")
	public static WebElement password;
	
	@FindBy(how=How.ID , using ="//input[@id='signInSubmit']")
	public static WebElement loginButton;
	
	@FindBy(how=How.XPATH , using ="//input[@id='continue']")
	public static WebElement AmazonContinueBtn;
	
	
	public void launchLoginPage(){
		
		
		
	}
	
	
}
