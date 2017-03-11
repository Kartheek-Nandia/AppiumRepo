
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class BrowserCode {
	
  @Test
  public void TestCase1() throws MalformedURLException
  {
	  File app = new File("C:\\Users\\nandi\\Downloads\\com.raaga.android.2.0.4.apk");
	  DesiredCapabilities capabilities = new DesiredCapabilities();
	  capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
	  capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
	  capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "100");
	  capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Browser");
//	  capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
	  
	  AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	  
	  driver.findElementById("lst-ib").sendKeys("Cricinfo");
	  driver.findElementById("lst-ib").sendKeys(Keys.ENTER);
	  
	  System.out.println("Done!!!!!!!!!\n");
  }
}
