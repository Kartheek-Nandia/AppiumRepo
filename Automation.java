package Classes;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import bsh.Capabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class Automation 
{
	public void method() throws MalformedURLException, InterruptedException
	{
		File app = new File("C:\\Users\\nandi\\Downloads\\com.bt.bms_4.3.6.apk");
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "100");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		
		//App_package and app_Activity are used to invoke app without .apk file
//		capabilities.setCapability(MobileCapabilityType.APP_PACKAGE, "PackageName");
//		capabilities.setCapability(MobileCapabilityType.APP_ACTIVITY, "ActivityName you want to workon");
		
		
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.findElementById("com.bt.bms:id/btnLogin").click();
		driver.findElementById("com.bt.bms:id/edtemail").sendKeys("karthinandina@gmail.com");
		System.out.println(driver.getContext());
		driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Sign up\")").click();
		Thread.sleep(2000);
		driver.sendKeyEvent(AndroidKeyCode.HOME);
		DesiredCapabilities cap2 = new DesiredCapabilities();
		
		
		
		//UiSelector() is used to select elements with any attributes shown in Uiautometer table
//		driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Hello\")").click();
//		driver.findElementsByAndroidUIAutomator("new UiSelector().clickable('true')");
		
//		driver.sendKeyEvent(AndroidKeyCode.HOME); //used to click home button on device similarly to click back button etc.
	}
	public static void main(String args[]) throws MalformedURLException, InterruptedException
	{
		Automation obj = new Automation();
		obj.method();
		System.out.println("Done!!!!!!!");
	}
}
