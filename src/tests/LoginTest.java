package tests;

import java.lang.reflect.Method;
import java.util.Properties;

import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import coreUtils.SeleniumHandle;
import pages.LoginPage;

public class LoginTest extends LoginPage{
	public static Properties prop;
	
	public LoginTest() {
	
		PageFactory.initElements(SeleniumHandle.driver, LoginPage.class);
	}
	
	
	@BeforeClass
	public void setUp(){
		
		new LoginTest();
		
	}

	
	@BeforeMethod
	public void entryCriteria(Method method){
		
		String testName = method.getName();
		System.out.println("*********** " + testName + " ***********");
		
	}
	
	
	@Test
	public void loginTest() throws InterruptedException{
		SeleniumHandle.getDriver();
		SeleniumHandle.operUrl("url");
		SeleniumHandle.typeIn(username, "ghogare.nitin@gmail.com");
		SeleniumHandle.typeIn(password, "lavab7!@#");
		SeleniumHandle.clickOnButton(AmazonContinueBtn);
		SeleniumHandle.clickOnButton(loginButton);
		
	}
	
	
	@AfterMethod
	public void exitCriteria(ITestResult results){
		
		results.getStatus();
		
	}
	
	@AfterClass
	public void tearDown(){}
	
	
}
