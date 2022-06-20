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

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;


public class BaseClass {
//	AppiumDriver driver;
	public AppiumDriver driver;
	
	
	
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
	
	@Test(description= "verify login page")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test case validation")
	@Story("story name:to check first case with allure")
	@Step("first case")
	public void login1() throws InterruptedException {
		
		
		
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Start\"]")).click();
		driver.findElement(By.className("android.widget.EditText")).click();
		driver.findElement(By.className("android.widget.EditText")).sendKeys("@local2010");
		
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Submit\"]")).click();
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
//		By uploadFile = By.xpath("//android.view.View[@content-desc=\"Upload backup key file\"]");
//		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(uploadFile));
//		wait.until(ExpectedConditions.presenceOfElementLocated(uploadFile)).click();
//		wait.until(ExpectedConditions.stalenessOf(element));
//		wait.until(ExpectedConditions.presenceOfElementLocated(uploadFile)).click();
//		
//		By fetchFile = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView[18]/androidx.cardview.widget.CardView/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.ImageView[1]");
//		WebElement element1 = wait.until(ExpectedConditions.presenceOfElementLocated(fetchFile));
//		wait.until(ExpectedConditions.presenceOfElementLocated(fetchFile)).click();
//		wait.until(ExpectedConditions.stalenessOf(element));
//		wait.until(ExpectedConditions.presenceOfElementLocated(fetchFile)).click();

		
//		driver.findElement(By.className("android.view.View")).click();
//		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView[18]/androidx.cardview.widget.CardView/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.ImageView[1]"
				
			
//				)).click();
		
		
//		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button[1]\n")).click();
		System.out.println("first case");
		
	}
	
	@AfterTest
	public void teardown() {
		System.out.println("done");
		
	}

}