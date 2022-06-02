package tests;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeMethod;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;

import io.appium.java_client.android.AndroidDriver;


public class BaseClass {

	 protected AndroidDriver driver;
	DesiredCapabilities DC;

	private String appiumPort = "0.0.0.0";
	private String serverIp = "4723";
	private String platformName = "Android";
	private String platformVersion = "11";
	private String deviceName = "OnePlus Nord";

	@BeforeMethod
	
	public void setUp() throws MalformedURLException {
		DC = new DesiredCapabilities();

		DC.setCapability("platformName", platformName);
		DC.setCapability("platformVersion", platformVersion);
		DC.setCapability("deviceName", deviceName);
		DC.setCapability("newCommandTimeout", "1200");
		DC.setCapability("automationName", "UiAutomator2");
		DC.setCapability("UDID", "0324fea3");
		DC.setCapability("appPackage", "com.atsign.atsign_atmosphere_pro");
		DC.setCapability("appActivity", "com.atsign.atsign_atmosphere_pro.MainActivity");
		DC.setCapability("app", "/Users/geekyants/Downloads/Atsign.apk");
		driver = new AndroidDriver(new URL("http://" + appiumPort + ":" + serverIp + "/wd/hub"), DC);
		System.out.println("Application started....");

	}

}








