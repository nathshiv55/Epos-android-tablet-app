package com.Ubsidi.BasePackage;

import java.io.FileInputStream;

import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseInit1 {

	public static AndroidDriver driver;   //public static so we can use it anyWhere in Project.
	public static Properties appdata;     //public so we can use it anyWhere in Project. static so we can call it without class name.
	public static DesiredCapabilities caps;
	public static Logger logs;
	public static Actions actions;
	@SuppressWarnings("deprecation")
	public static AndroidTouchAction touchActions; 


	public static int i;
	
	
	public static ArrayList<String> itemsNamesArray = new ArrayList<>();
	public static ArrayList<Double> itemsPricesArray = new ArrayList<>();

	public static String totalIs = null;
	
	public static ExtentSparkReporter reporter = null;
	public static ExtentReports report  = null;
	public static ExtentTest test = null;
	
	public  void startUp() throws Exception

		{
		     actions = new Actions(driver);
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
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
			     actions = new Actions(driver);

				
			
					//boolean checkLogin = driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button")).isDisplayed(); 

					//Click on Allow
					driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button")).click();
					Thread.sleep(5000);
				    //LoginBusiness
					driver.findElement(By.id("com.ubsidi:id/input_username")).sendKeys(appdata.getProperty("email1"));
					driver.findElement(By.id("com.ubsidi:id/input_password")).sendKeys(appdata.getProperty("password1"));
					driver.findElement(By.id("com.ubsidi:id/btn_login")).click();
					Thread.sleep(4000);
					//select Tiffin tom Limited
					driver.findElement(By.id("com.ubsidi:id/tvBusiness")).click();
					driver.findElement(By.id("com.ubsidi:id/btnConfirm")).click();
					//fetching Data
					//Thread.sleep(120000);
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));


					//Select auto sync mode
					//Click on Setting
					driver.findElement(By.id("com.ubsidi:id/tvSetting")).click();
					//Click on OrderSync Mode
					driver.findElement(By.id("com.ubsidi:id/tvOrderSyncMode")).click();
					//Click on Auto
					
				   List<WebElement> modeName = driver.findElements(By.id("com.ubsidi:id/tvReason"));
				   modeName.get(0).click();
					//Click on Confirm
					driver.findElement(By.id("com.ubsidi:id/btnConfirm")).click();
					//Enter password
					driver.findElement(By.id("com.ubsidi:id/etPassword")).sendKeys(appdata.getProperty("pwd1"));
					//Click on Confirm
					driver.findElement(By.id("com.ubsidi:id/btnConfirm")).click();

					//Select user name
					String wtName = appdata.getProperty("waiterName");
					// Construct the XPath expression
					String xpathExpression1 = "//android.widget.TextView[@text='" + wtName + "']";
					driver.findElement(By.xpath(xpathExpression1)).click();
					//Enter Password
					driver.findElement(By.id("com.ubsidi:id/input_password")).sendKeys(appdata.getProperty("pd1"));
					//Click on login
					driver.findElement(By.id("com.ubsidi:id/btn_login")).click();
					Thread.sleep(4000);

					System.out.println("\r\n"+"******App already installed & open Successfully...******"+"\r\n");
					logs.info("App already installed & open Successfully...");
					driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
				}

	@SuppressWarnings("deprecation")
	public  void startUp1() throws Exception
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

			}
	
	public void appUnstalled() throws IOException, InterruptedException{

		// Uninstall the app
		String appPackage = appdata.getProperty("packageName");    //Give package name of the app you want to uninstall
		driver.removeApp(appPackage);
		Thread.sleep(3000);

		System.out.println("******App uninstalled successfully...******\r\n");
		logs.info("App uninstalled successfully...");
		System.out.println("****************************************************************");
		// Close the driver
		driver.quit();
	}
}



