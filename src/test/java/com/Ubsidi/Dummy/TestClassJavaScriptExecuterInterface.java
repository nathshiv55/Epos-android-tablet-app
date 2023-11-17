package com.Ubsidi.Dummy;

import java.io.FileInputStream;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;
import com.Ubsidi.DefaultPackage.*;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Ubsidi.BasePackage.BaseInit1;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.remote.MobileCapabilityType;

@SuppressWarnings("unused")
public class TestClassJavaScriptExecuterInterface {
	
	public static AndroidDriver driver;   //public static so we can use it anyWhere in Project.
	public static Properties appdata;     //public so we can use it anyWhere in Project. static so we can call it without class name.
	public static DesiredCapabilities caps;
	public static Logger logs;
	public static Actions actions;
	@SuppressWarnings("deprecation")
	public static AndroidTouchAction touchActions; 


	public static int i;
	
	
	public static ExtentSparkReporter reporter = null;
	public static ExtentReports report  = null;
	public static ExtentTest test = null;
	
	
	
	@SuppressWarnings("deprecation")
	@Test
	public void setkkjhUp() throws Exception

	{
		logs = Logger.getLogger("devpinoyLogger");

		appdata = new Properties();
		FileInputStream fi = new FileInputStream("./src/test/resources/PropertiesData/AppData.properties");
		appdata.load(fi);

		caps = new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.DEVICE_NAME,appdata.getProperty("deviceName"));
		caps.setCapability(MobileCapabilityType.UDID,appdata.getProperty("udid"));
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME,appdata.getProperty("platformName"));
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION,appdata.getProperty("platformVersion"));
		caps.setCapability(MobileCapabilityType.AUTOMATION_NAME,appdata.getProperty("automatorName"));

		
			caps.setCapability("appPackage", appdata.getProperty("packageName"));
			caps.setCapability("appActivity", appdata.getProperty("activityName"));


			caps.setCapability(MobileCapabilityType.NO_RESET, "true");      //do not clear cache
			caps.setCapability(MobileCapabilityType.FULL_RESET, "false");   //do not install the app again 

			driver = new AndroidDriver (new URL ("http://0.0.0.0:4723/wd/hub"),caps);
		    actions = new Actions(driver);
		   touchActions = new AndroidTouchAction(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		//WebElement newOrderr = driver.findElement(By.id("com.ubsidi:id/btnNewOrder"));
		//newOrderr.click();
		WebElement newOrder1 = driver.findElement(By.id("com.ubsidi:id/btnNewOrder"));

		//JavascriptExecutor jscript = (JavascriptExecutor) driver;
		//jscript.executeScript("arguments[0].click()", newOrder1);
		
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", newOrder1);
		
   }
}