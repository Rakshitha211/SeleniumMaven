package testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest extends BaseClass{
		
	

	@Test
	public void LoginFailureTest() {
		
		test=report.startTest("LoginFailureTest");
		
		
		
		LoginPage login=new LoginPage();
			
			login.LoginFunction("rakshitha@gmail.com","Abc@12345");
			WebElement ErrorMsg = driver.findElement(By.id("msg_box")); 
			
			String ActualMsg = ErrorMsg.getText();
			String ExpMsg = "The email or password you have entered is invalid.";
			
			Assert.assertEquals(ActualMsg, ExpMsg);
			
			report.endTest(test);
			
	
	}
	
	
	
	
	@Test
	public void LoginSuccessTest() {	
		LoginPage login=new LoginPage();
			
		login.LoginFunction("rakshitha@gmail.com","Abc@12345");

	
	}
	
	
	@Test
	@Parameters({"Param1","Param2"})
	public void ParametereizedTest(String Username,String Password){
		
		LoginPage login=new LoginPage();
		login.LoginFunction(Username, Password);
		
	}
	
	
	@Test
	public void ExternalData() {
		
		
		String Username= sheet.getRow(1).getCell(0).getStringCellValue();
		String Password= sheet.getRow(1).getCell(1).getStringCellValue();
		
		
		LoginPage login=new LoginPage();
		login.LoginFunction(Username, Password);	
				
				
				
		
	}
	
	
	
	

}
