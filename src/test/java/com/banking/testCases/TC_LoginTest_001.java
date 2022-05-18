package com.banking.testCases;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.banking.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass{

@Test	
public void LoginTest() throws IOException {
	

	logger.info("got URL");
	LoginPage lp= new LoginPage(driver);
	lp.setUsername(Username);
	lp.setPass(password);
	lp.LoginBtn();
	logger.info("LoggIn on succesful");
System.out.println(	driver.getTitle());
if(driver.getTitle().equalsIgnoreCase("Guru99 Bank Manager HomePage")) {
	Assert.assertTrue(true);
	logger.info("Login test passed");
	}
else {
	capturescreen(driver, "LoginTest");
	Assert.assertTrue(false);
}

}


}
