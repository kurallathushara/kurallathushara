package com.banking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class ReadConfig {
	

	
		public WebDriver driver;
		public Properties pro;
		public ReadConfig()
		{
			File src = new File("./Configuration/config.properties");

			try {
				FileInputStream fis = new FileInputStream(src);
				pro = new Properties();
				pro.load(fis);
			} catch (Exception e) {
				System.out.println("Exception is " + e.getMessage());
			}
		}
		

	public String getBaseURL() {
		String url = pro.getProperty("baseURL");
		return url;
	}

	public String getUserID() {
		String UID = pro.getProperty("UserID");
		return UID;
	}

	public String getpassword() {
		String pass = pro.getProperty("Password");
		return pass;
	}

	public String chromepath() {
		String chrome = pro.getProperty("chromePath");
		return chrome;
	}

	public String firepfoxath() {
		String firefox = pro.getProperty("firefoxPath");
		return firefox;
	}
	public String getCustomrName() {
String Cname= pro.getProperty("customerName");
		return Cname;
		
	}
	public String getAddress() {
	String caddress=	pro.getProperty("address");
		return caddress;
		
	}
	public String getCity() {
	String Ccity=	pro.getProperty("city");
		return Ccity;
	}
	public String getState() {
		String Cstate= pro.getProperty("state");
		return Cstate;
	}
	
	public String getpin() {
		String Cpin= pro.getProperty("pin");
		return Cpin;
	}
	public String getDOB() {
		String CDOB= pro.getProperty("pin");
		return CDOB;
	}
	
	
	public String getmobile() {
		String Cmobile= pro.getProperty("mobile");
		return Cmobile;
	}
	
	public String getemail() {
		String Cemail= pro.getProperty("email");
		return Cemail;
	}
	public String getemailpassword() {
		String Cemailpass= pro.getProperty("emailpassword");
		return Cemailpass;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
