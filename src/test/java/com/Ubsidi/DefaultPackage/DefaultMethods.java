package com.Ubsidi.DefaultPackage;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.Ubsidi.BasePackage.BaseInit1;
import com.github.javafaker.Faker;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class DefaultMethods extends BaseInit1 {
	
//Date time	
public static void printLocalDateTime()
{
	        //print date time
			LocalDateTime localDateTime = 		LocalDateTime.now();
			System.out.println("\r\n"+"Test Start time : "+localDateTime);
			
}

//Screenshot
public static String getScreenShot(String imageName, AndroidDriver driver)   //method ko jab call kre to ye dono, argument me de de.Ex:-  DefaultMethods.getScreenShot("enterPostcode", driver);
{

	TakesScreenshot ts = (TakesScreenshot) driver;  //ts will point where driver is pointing

	File scrFile = ts.getScreenshotAs(OutputType.FILE);
//src/test/resources me screenshots name ka folder bana do.
	String path = System.getProperty("user.dir") + "\\src\\test\\resources\\screenshots\\" +imageName+ System.currentTimeMillis() + ".png";

	// System.out.println(path);
	File destination = new File(path);

	try {

		FileUtils.copyFile(scrFile, destination);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println(e.getMessage());
	}

	return path;
}



//Scroll down
public static void scrollDownMethod(String textName)    //enter text name in argument whenever you call this method.
{
driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
		+ ".scrollIntoView(new UiSelector()" + ".textMatches(\"" + textName + "\").instance(0))"));  //enter text in this lines where you want to go.
}


//Generate random email id every time
public static void generateRandomEmail()
{
		String userName = ""+(int)(Math.random()*Integer.MAX_VALUE);
		String emailID = "user"+userName+"@yopmail.com";
		//Print Email id
		System.out.println("  - Email id is : "+emailID);	
}


//Generate random UserName
public static void generateRandomUserName()
{
	String userName = ""+(int)(Math.random()*Integer.MAX_VALUE);
	String RandomUserName = "User"+userName;
	//Print Email id
	System.out.println("  - User Name : "+RandomUserName);	
}

//Generate fake data. Note:- for this add depedency in pom.xml - java faker
public void generateFakeData()
{
	Faker faker = new Faker();

	String name = faker.name().fullName();
	String firstName = faker.name().firstName();
	String lastName = faker.name().lastName();

	String streetAddress = faker.address().streetAddress();
	
	String mobileNo = "07" + faker.number().digits(8);

	
	System.out.println(name);
	System.out.println(firstName);

	System.out.println(lastName);

	System.out.println(streetAddress);
	
	System.out.println(mobileNo);

}



@SuppressWarnings("deprecation")
public static void PullDownRefreshExample()
   {
        // Create an instance of your AppiumDriver, initialize it, and navigate to the page you want to refresh

        // Assuming you have a driver instance created and navigated to the page

        // Get the dimensions of the device screen
        Dimension size = driver.manage().window().getSize();

        // Define starting and ending points for the pull-down gesture
        int startX = size.width / 2; // Center of the screen horizontally
        int startY = size.height / 4; // 25% from the top of the screen
        int endY = size.height * 3 / 4; // 75% from the top of the screen

        // Perform the pull-down refresh gesture     
        touchActions.press(PointOption.point(startX, startY))
                .moveTo(PointOption.point(startX, endY))
                .release()
                .perform();

        // Wait for the refresh to complete and continue with your test
    }
}











