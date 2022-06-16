//package tests;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeMethod;
//import java.net.MalformedURLException;
//import java.net.URL;
//
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.testng.annotations.BeforeMethod;
//
//import io.appium.java_client.android.AndroidDriver;
//
//
//public class BaseClass {
//
//	 protected AndroidDriver driver;
//	DesiredCapabilities DC;
//
//	private String appiumPort = "127.0.0.0.0";
//	private String serverIp = "4723";
//	private String platformName = "Android";
//	private String platformVersion = "11";
//	private String deviceName = "OnePlus Nord";
//
//	@BeforeMethod
//	
//	public void setUp() throws MalformedURLException {
//		DC = new DesiredCapabilities();
//
//		DC.setCapability("platformName", platformName);
//		DC.setCapability("platformVersion", platformVersion);
//		DC.setCapability("deviceName", deviceName);
//		DC.setCapability("newCommandTimeout", "1200");
//		DC.setCapability("automationName", "UiAutomator2");
//		DC.setCapability("UDID", "0324fea3");
//		DC.setCapability("appPackage", "com.atsign.atsign_atmosphere_pro");
//		DC.setCapability("appActivity", "com.atsign.atsign_atmosphere_pro.MainActivity");
//		DC.setCapability("app", "/Users/geekyants/Downloads/Atsign.apk");
//		driver = new AndroidDriver(new URL("http://" + appiumPort + ":" + serverIp + "/wd/hub"), DC);
//		System.out.println("Application started....");
//
//	}
//
//}

package tests;
import java.util.concurrent.TimeUnit;



import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;


public class BaseClass {
//	AppiumDriver driver;
	public AppiumDriver driver;
	
	
	
	@SuppressWarnings("deprecation")
	@BeforeTest
	public void setup()  {
		
		try {
			DesiredCapabilities capabilities = new DesiredCapabilities();
			File classpathRoot = new File(System.getProperty("user.dir"));
	        File appDir = new File(classpathRoot, "./apps");
			File app = new File(appDir.getCanonicalPath(), "Atsign.apk");
		
		
			  capabilities.setCapability("automationName", "Uiautomator2");
			  capabilities.setCapability("platformName","Android");
			  capabilities.setCapability("platformVersion", "11");
			  capabilities.setCapability("deviceName", "OnePlus Nord");
			  capabilities.setCapability("app", app.getAbsolutePath());
			  capabilities.setCapability("autoGrantPermissions", true);
			  capabilities.setCapability("noReset", false);
			  capabilities.setCapability("appPackage",
			  "com.atsign.atsign_atmosphere_pro");
			  capabilities.setCapability("appActivity",
			  "com.atsign.atsign_atmosphere_pro.MainActivity");
			  capabilities.setCapability("useNewWDA",true);
			  capabilities.setCapability("autoAcceptAlerts", true); 
			  driver = new  AppiumDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
			  driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
			 

		}catch(Exception exp) {
			System.out.println("Cause is : "+exp.getCause());
			System.out.println("Message is : "+exp.getMessage());
			exp.printStackTrace();
			
		}
		
		 
		
	}
	
	@AfterTest
	public void teardown() {
		System.out.println("done");
		
	}

}