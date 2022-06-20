package screens;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import tests.BaseClass;

public class Demo {
	
	public static AppiumDriver driver;

	public Demo(AppiumDriver driver) {
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), BaseClass.class);
	}

}
