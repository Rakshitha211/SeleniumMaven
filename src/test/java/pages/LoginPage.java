package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import testcases.BaseClass;

public class LoginPage {
	
		WebDriver driver=BaseClass.driver;
		
		
		ExtentTest test=BaseClass.test;
		
	//=============== WebElements ==================================
		@FindBy(linkText="Log in")
		WebElement loginBtn;
		
		@FindBy(name="user_login")
		WebElement Uname;
		
		@FindBy(name="user_pwd")
		WebElement Pwd;
		
		@FindBy(name="btn_login")
		WebElement LgnBtn;
		
		@FindBy(className="rememberMe")
		WebElement remember;
		
		//constructor
		public LoginPage() {
			
			PageFactory.initElements(driver, this);
		}
		
		
	
	//===================== Functions================================
public void LoginFunction(String Username, String Password) {
	
		loginBtn.click();
		test.log(LogStatus.PASS, "Click on Login link", "Login link clicked successfully"); //customized report
		
		Uname.sendKeys(Username);
		test.log(LogStatus.PASS, "Enter uname", "Name entered successfully");
		
		Pwd.sendKeys(Password);
		test.log(LogStatus.PASS, "Enter Password", "Password entered successfully");
		
		remember.click();
		test.log(LogStatus.PASS, "Click on Remember me", " clicked successfully");
		
		LgnBtn.click();
		test.log(LogStatus.PASS, "Click on click button", "Login button clicked successfully");
		
		
	}


//public void UICheck() {
//	Assert.assertTrue(Uname.isDisplayed());
//}

}
