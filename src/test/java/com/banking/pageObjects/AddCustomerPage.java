package com.banking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {
	public WebDriver driver;
	public AddCustomerPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="a[href='addcustomerpage.php']")
	WebElement newCustomerlink;
	@FindBy(xpath="//input[@name='name']")
	WebElement cname;
	@FindBy(xpath="//input[@value='m']")
	WebElement radiobtn;
	@FindBy(xpath="//input[@id='dob']")
	WebElement DOBbtn;
	@FindBy(xpath="//textarea[@name='addr']")
	WebElement adressbox;
	@FindBy(xpath="//input[@name='city']")
	WebElement citybox;
	@FindBy(xpath="//input[@name='state']")
	WebElement statebox;
	@FindBy(xpath="//input[@name='pinno']")
	WebElement pinbox;
	@FindBy(xpath="//input[@name='telephoneno']")
	WebElement mobilebox;
	@FindBy(xpath="//input[@name='emailid']")
	WebElement emailbox;
	@FindBy(xpath="//input[@name='password']")
	WebElement passbox;
	@FindBy(xpath="//input[@name='sub']")
	WebElement loginbox;
	
	
	
	
	
	
	public void newCustomerLink() {
		newCustomerlink.click();
	}
	public void Customername(String name) {
		cname.sendKeys(name);
	}
	public void genderselection() {
		radiobtn.click();
	}
	public void dob(String mm, String dd, String yy ) {
		DOBbtn.sendKeys(mm);
		DOBbtn.sendKeys(dd);
		DOBbtn.sendKeys(yy);
	}
	public void Cadress(String add) {
		adressbox.sendKeys(add);
	}
	public void Ccity(String city) {
		citybox.sendKeys(city);
	}
	public void Cstate(String state) {
		statebox.sendKeys(state);
	}
	public void Cpin(String pin) {
		pinbox.sendKeys(pin);
	}
	public void Cmobile(String mob) {
		mobilebox.sendKeys(mob);
	}
	public void Cemail(String emailID) {
		emailbox.sendKeys(emailID);
	}
	public void Cpass(String emailpass) {
		passbox.sendKeys(emailpass);
	}
	public void Clogin() {
		loginbox.click();
	}
}
