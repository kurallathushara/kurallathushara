package com.banking.testCases;

import org.testng.annotations.Test;

import com.banking.pageObjects.AddCustomerPage;
import com.banking.pageObjects.LoginPage;
import com.banking.utilities.ReadConfig;

public class TC_NewCustomer_002 extends BaseClass{

	@Test
	public void AddNewCustomer() throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
				lp.setUsername(Username);
		lp.setPass(password);
		lp.LoginBtn();
		Thread.sleep(3000);
		
		AddCustomerPage addcustomer = new AddCustomerPage(driver);
		addcustomer.newCustomerLink();
		addcustomer.Customername(customername);
		addcustomer.genderselection();
		addcustomer.dob("10","15","1991");
		Thread.sleep(3000);
		addcustomer.Cadress(customerAdress);
		Thread.sleep(3000);
		addcustomer.Ccity(customercity);
		Thread.sleep(3000);
		addcustomer.Cstate(customerstate);
		addcustomer.Cpin(customerpin);
		addcustomer.Cmobile(customermobile);
		addcustomer.Cemail(customeremail);
		Thread.sleep(3000);
		addcustomer.Cpass(customerpass);
		Thread.sleep(3000);
		addcustomer.Clogin();
		logger.info("New customer login succesfull");
		
		
		
	}
}
