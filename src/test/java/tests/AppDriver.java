//package tests;
//
//import org.openqa.selenium.WebDriver;
//
//import io.appium.java_client.android.AndroidDriver;
//
//public class AppDriver {
//
//	private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
//
//	public static AndroidDriver getDriver() {
//
//		return (AndroidDriver) driver.get();
//
//	}
//
//	public static void setDriver(AndroidDriver Driver) {
//		driver.set(Driver);
//	}
//
//}