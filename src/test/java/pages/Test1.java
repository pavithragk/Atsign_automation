package pages;



import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
import tests.BaseClass;

public class Test1 {
	
	public class login extends BaseClass{
		
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
//			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
//			By uploadFile = By.xpath("//android.view.View[@content-desc=\"Upload backup key file\"]");
//			WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(uploadFile));
//			wait.until(ExpectedConditions.presenceOfElementLocated(uploadFile)).click();
//			wait.until(ExpectedConditions.stalenessOf(element));
//			wait.until(ExpectedConditions.presenceOfElementLocated(uploadFile)).click();
//			
//			By fetchFile = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView[18]/androidx.cardview.widget.CardView/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.ImageView[1]");
//			WebElement element1 = wait.until(ExpectedConditions.presenceOfElementLocated(fetchFile));
//			wait.until(ExpectedConditions.presenceOfElementLocated(fetchFile)).click();
//			wait.until(ExpectedConditions.stalenessOf(element));
//			wait.until(ExpectedConditions.presenceOfElementLocated(fetchFile)).click();

			
//			driver.findElement(By.className("android.view.View")).click();
//			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView[18]/androidx.cardview.widget.CardView/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.ImageView[1]"
					
				
//					)).click();
			
			
//			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button[1]\n")).click();
			System.out.println("first case");
			
		}
		@Test(description= "verify second case")
		@Severity(SeverityLevel.CRITICAL)
		@Description("Test case validation2")
		@Story("story name:to check second case with allure")
		@Step("second case")
		public void login2() {
			
			driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Start\"]")).click();
			driver.findElement(By.className("android.widget.EditText")).click();
			driver.findElement(By.className("android.widget.EditText")).sendKeys("@local2010");
			driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Cancel\"]")).click();
			System.out.println("second case");
			
		}
		
		
	}
	
	

}
