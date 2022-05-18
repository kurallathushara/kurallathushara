package com.banking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
public WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(name="uid")
	WebElement username;
	@FindBy(name="password")
	WebElement pass;
	@FindBy(name="btnLogin")
	WebElement Login;
	
	public void setUsername(String uname) {
		username.sendKeys(uname);
	}
	
	public void setPass(String password) {
		pass.sendKeys(password);
	}
	
	public void LoginBtn() {
		Login.click();
	}
	
	
}
