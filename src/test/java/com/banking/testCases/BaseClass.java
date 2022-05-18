package com.banking.testCases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.banking.utilities.ReadConfig;

public class BaseClass extends ReadConfig{

	ReadConfig readconfig= new ReadConfig();
	
	
	public String baseURL= readconfig.getBaseURL();
	public String Username= readconfig.getUserID();
	public String password= readconfig.getpassword();
	public String customername= readconfig.getCustomrName();
	public String customerdate= readconfig.getDOB();
	public String customerAdress= readconfig.getAddress();
	public String customercity= readconfig.getCity();
	public String customerstate= readconfig.getState();
	public String customerpin= readconfig.getpin();
	public String customermobile= readconfig.getmobile();
	public String customeremail= readconfig.getemail();
	public String customerpass= readconfig.getemailpassword();

	
	public WebDriver driver;
	public static Logger logger;
	
	@Parameters("browser")
	@BeforeClass
	public void sedtup(String br) {
		logger= Logger.getLogger("SDET");
		PropertyConfigurator.configure("Log4j.properties");
	if(br.equals("chrome")) {
		
		
		System.setProperty("webdriver.chrome.driver", readconfig.chromepath());
		driver= new ChromeDriver();
		//logger= logger.getLogger("SDET");

	}else if (br.equals("fire fox")){
		System.setProperty("webdriver.gecko.driver", readconfig.firepfoxath());
		driver= new ChromeDriver();
	}
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get(baseURL);
	driver.manage().window().maximize();
		
	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
	}
	public void capturescreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts= (TakesScreenshot)driver;
          File source= ts.getScreenshotAs(OutputType.FILE);
        File target = new File(System.getProperty("user.dir")+"/Screenshots/"+ tname+ ".png");
        FileUtils.copyFile(source, target);
        System.out.println("Screenshot taken");
        
		
			}
}
