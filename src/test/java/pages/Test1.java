package pages;



import org.openqa.selenium.By;
import org.testng.annotations.Test;

import tests.BaseClass;

public class Test1 {
	
	public class login extends BaseClass{
		
		@Test
		public void login1() {
			
			driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Start\"]")).click();
			driver.findElement(By.className("android.widget.EditText")).click();
			driver.findElement(By.className("android.widget.EditText")).sendKeys("@local2010");
			driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Submit\"]")).click();
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button[1]\n")).click();
			System.out.println("first case");
			
		}
		@Test
		public void login2() {
			
			driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Start\"]")).click();
			driver.findElement(By.className("android.widget.EditText")).click();
			driver.findElement(By.className("android.widget.EditText")).sendKeys("@local2010");
			driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Cancel\"]")).click();
			System.out.println("second case");
			
		}
		
		
	}
	
	

}
