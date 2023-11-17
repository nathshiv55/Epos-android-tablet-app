package com.Ubsidi.BasePackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseInit {

	public static AndroidDriver driver;   //public static so we can use it anyWhere in Project.
	public static Properties appdata;     //public so we can use it anyWhere in Project. static so we can call it without class name.
	public static DesiredCapabilities caps;
	public static Logger logs;
	public static Actions actions;
	@SuppressWarnings("deprecation")
	public static AndroidTouchAction touchActions; 

	public static int i;

	@SuppressWarnings("deprecation")
	public  void startUp() throws Exception

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

		try {
			caps.setCapability("appPackage", appdata.getProperty("packageName"));
			caps.setCapability("appActivity", appdata.getProperty("activityName"));


			caps.setCapability(MobileCapabilityType.NO_RESET, "true");      //do not clear cache
			caps.setCapability(MobileCapabilityType.FULL_RESET, "false");   //do not install the app again 

			driver = new AndroidDriver (new URL ("http://0.0.0.0:4723/wd/hub"),caps);
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		     actions = new Actions(driver);
		     touchActions = new AndroidTouchAction(driver);


			try
			{
				
				boolean checkLogin = driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button")).isDisplayed(); 

				System.out.println("\r\n"+"******App already installed & open Successfully...******"+"\r\n");
				logs.info("App already installed & open Successfully...");
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

				//Click on Allow
				driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button")).click();
				Thread.sleep(4000);
				//LoginBusiness
				driver.findElement(By.id("com.ubsidi:id/input_username")).sendKeys(appdata.getProperty("email1"));
				driver.findElement(By.id("com.ubsidi:id/input_password")).sendKeys(appdata.getProperty("password1"));
				driver.findElement(By.id("com.ubsidi:id/btn_login")).click();
				Thread.sleep(4000);
				//select Tiffin tom Limited
				driver.findElement(By.id("com.ubsidi:id/tvBusiness")).click();
				driver.findElement(By.id("com.ubsidi:id/btnConfirm")).click();
				//fetching Data
				//Thread.sleep(120000);  //this was creating problem

				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));

				//Select auto sync mode
				//Click on Setting
				driver.findElement(By.id("com.ubsidi:id/tvSetting")).click();
				//Click on OrderSync Mode
				driver.findElement(By.id("com.ubsidi:id/tvOrderSyncMode")).click();
				//Click on Auto
				//Auto and manual button ko list me leke ...unn par click karwa do
				List<WebElement> modeName = driver.findElements(By.id("com.ubsidi:id/tvReason"));
				String getsyncIndex = appdata.getProperty("syncMode");
				//convert string into integer
				int syncIndex = Integer.parseInt(getsyncIndex); 
				modeName.get(syncIndex).click();    // auto is on 0 index
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

				//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
				Thread.sleep(5000);

			}

			catch(Exception e1)
			{
				Thread.sleep(1000);
				
				boolean checkNewOrderButton = driver.findElement(By.id("com.ubsidi:id/btnNewOrder")).isDisplayed(); 

				System.out.println("\r\n"+"******App already installed & open Successfully...******"+"\r\n");
				System.out.println("\r\n"+"******User Already Logged in  & Let's start test ...******"+"\r\n");
				logs.info("App already installed & open Successfully...");

				//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
				Thread.sleep(5000);
			}

		}
		catch(Exception e2) {
			//get App Name
			String appFileName = appdata.getProperty("appName");	

			caps.setCapability(MobileCapabilityType.APP, new File("C:\\Users\\Lenovo\\Documents\\apkFiles\\"+appFileName).getAbsolutePath());

			driver = new AndroidDriver (new URL ("http://0.0.0.0:4723/wd/hub"),caps);

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

			System.out.println("\r\n"+"******App installed Now & open successfully...******"+"\r\n");
			logs.info("App installed & open successfully...");

			//Click on Allow
			driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button")).click();
			Thread.sleep(4000);
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
			//Auto and manual button ko list me leke ...unn par click karwa do
			List<WebElement> modeName = driver.findElements(By.id("com.ubsidi:id/tvReason"));
			String getsyncIndex = appdata.getProperty("syncMode");
			//convert string into integer
			int syncIndex = Integer.parseInt(getsyncIndex); 
			modeName.get(syncIndex).click();    // auto is on 0 index
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
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));

			System.out.println("\r\n"+"******App already installed & open Successfully...******"+"\r\n");
			logs.info("App already installed & open Successfully...");

			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
			Thread.sleep(5000);

		}
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



