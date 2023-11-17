package com.Ubsidi.Utility;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.checkerframework.checker.units.qual.N;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v116.overlay.model.LineStyle.Pattern;
import org.openqa.selenium.devtools.v116.storage.Storage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Ubsidi.BasePackage.BaseInit1;
import com.Ubsidi.DefaultPackage.DefaultMethods;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.github.javafaker.Faker;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

@SuppressWarnings("deprecation")
public class NewMyLibrary extends BaseInit1 {




	//only New Order Button Click
	public static void onlyNewOrderButtonClickActions() throws Exception
	{
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.ubsidi:id/btnNewOrder")));

			//UpSide New Order Button
			actions.click(driver.findElement(By.id("com.ubsidi:id/btnNewOrder"))).perform();

			System.out.println(" - New Order button Clicked "+"\r\n");
			logs.info(" - New Order button Clicked");
		}
		catch(NoSuchElementException e1) 

		{

			//take Screenshot
			DefaultMethods.getScreenShot( "UiBreaking001", driver);
			System.out.println("Error : Trying to 2nd time.... "+""+"NoSuchElementException");
			logs.info("Error : Trying to 2nd time.... "+""+"NoSuchElementException");

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.ubsidi:id/btnNewOrder")));

			//UpSide New Order Button
			actions.click(driver.findElement(By.id("com.ubsidi:id/btnNewOrder"))).perform();

			System.out.println(" - New Order button Clicked "+"\r\n");
			logs.info(" - New Order button Clicked");
		}
		catch(TimeoutException e2)

		{

			//take Screenshot
			DefaultMethods.getScreenShot( "UiBreaking002", driver);
			System.out.println("Error : Trying to 2nd time.... "+"\r\n"+"TimeoutException");	
			logs.info("Error : Trying to 2nd time.... "+"\r\n"+"TimeoutException");


			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.ubsidi:id/btnNewOrder")));

			//UpSide New Order Button
			actions.click(driver.findElement(By.id("com.ubsidi:id/btnNewOrder"))).perform();

			System.out.println(" - New Order button Clicked "+"\r\n");
			logs.info(" - New Order button Clicked");
		}
		catch(StaleElementReferenceException e3)

		{
			//take Screenshot
			DefaultMethods.getScreenShot( "UiBreaking003", driver);
			System.out.println("Error : Trying to 2nd time.... "+"\r\n"+"StaleElementReferenceException");	
			logs.info("Error : Trying to 2nd time.... "+"\r\n"+"StaleElementReferenceException");


			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.ubsidi:id/btnNewOrder")));

			//UpSide New Order Button
			actions.click(driver.findElement(By.id("com.ubsidi:id/btnNewOrder"))).perform();

			System.out.println(" - New Order button Clicked "+"\r\n");
			logs.info(" - New Order button Clicked");
		}	

	}



	//only New Order Button Click
	public static void onlyNewOrderButtonClickActionsByTapCoordinate() throws Exception
	{
		try {

			//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.ubsidi:id/btnNewOrder")));
			//wait.until(ExpectedConditions.textMatches(By.id("username"), Pattern.values());

			//UpSide New Order Button
			//actions.click(driver.findElement(By.id("com.ubsidi:id/btnNewOrder"))).perform();
			//	touchActions.tap(TapOptions.tapOptions().withElement(ElementOption.element(driver.findElement(By.id("com.ubsidi:id/btnNewOrder"))))).perform();
			WebElement views = driver.findElement(By.id("com.ubsidi:id/btnNewOrder"));
			
	
			Point point = views.getLocation();
			touchActions.tap(PointOption.point(point.x+2,point.y+1)).perform();

			System.out.println(" - New Order button Clicked "+"\r\n");
			logs.info(" - New Order button Clicked");
		}
		catch(NoSuchElementException e1) 

		{

			//take Screenshot
			DefaultMethods.getScreenShot( "UiBreaking001", driver);
			System.out.println("Error : Trying to 2nd time.... "+""+"NoSuchElementException");
			logs.info("Error : Trying to 2nd time.... "+""+"NoSuchElementException");

			//   AndroidTouchAction touchActions = new AndroidTouchAction(driver);


			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.ubsidi:id/btnNewOrder")));

			//UpSide New Order Button
			//actions.click(driver.findElement(By.id("com.ubsidi:id/btnNewOrder"))).perform();
			//	touchActions.tap(TapOptions.tapOptions().withElement(ElementOption.element(driver.findElement(By.id("com.ubsidi:id/btnNewOrder"))))).perform();
			WebElement views = driver.findElement(By.id("com.ubsidi:id/btnNewOrder"));

			Point point = views.getLocation();
			touchActions.tap(PointOption.point(point.x+2,point.y+1)).perform();

			System.out.println(" - New Order button Clicked "+"\r\n");
			logs.info(" - New Order button Clicked");
		}
		catch(TimeoutException e2)

		{

			//take Screenshot
			DefaultMethods.getScreenShot( "UiBreaking002", driver);
			System.out.println("Error : Trying to 2nd time.... "+"\r\n"+"TimeoutException");	
			logs.info("Error : Trying to 2nd time.... "+"\r\n"+"TimeoutException");


			//AndroidTouchAction touchActions = new AndroidTouchAction(driver);


			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.ubsidi:id/btnNewOrder")));

			//UpSide New Order Button
			//actions.click(driver.findElement(By.id("com.ubsidi:id/btnNewOrder"))).perform();
			//	touchActions.tap(TapOptions.tapOptions().withElement(ElementOption.element(driver.findElement(By.id("com.ubsidi:id/btnNewOrder"))))).perform();
			WebElement views = driver.findElement(By.id("com.ubsidi:id/btnNewOrder"));

			Point point = views.getLocation();
			touchActions.tap(PointOption.point(point.x+2,point.y+1)).perform();

			System.out.println(" - New Order button Clicked "+"\r\n");
			logs.info(" - New Order button Clicked");
		}
		catch(StaleElementReferenceException e3)

		{
			//take Screenshot
			DefaultMethods.getScreenShot( "UiBreaking003", driver);
			System.out.println("Error : Trying to 2nd time.... "+"\r\n"+"StaleElementReferenceException");	
			logs.info("Error : Trying to 2nd time.... "+"\r\n"+"StaleElementReferenceException");


			//AndroidTouchAction touchActions = new AndroidTouchAction(driver);


			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.ubsidi:id/btnNewOrder")));

			//UpSide New Order Button
			//actions.click(driver.findElement(By.id("com.ubsidi:id/btnNewOrder"))).perform();
			//	touchActions.tap(TapOptions.tapOptions().withElement(ElementOption.element(driver.findElement(By.id("com.ubsidi:id/btnNewOrder"))))).perform();
			WebElement views = driver.findElement(By.id("com.ubsidi:id/btnNewOrder"));

			Point point = views.getLocation();
			touchActions.tap(PointOption.point(point.x+2,point.y+1)).perform();

			System.out.println(" - New Order button Clicked "+"\r\n");
			logs.info(" - New Order button Clicked");
		}	

	}




	//Select food items by calling method
	public static void selectFoodItemsByCallMehtodByCoordinate(int SNo ,int foodItemIndex) throws Exception    //pass SNo and Index Number during calling this method
	{
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			//locate element everytime before use it.  warna kam nhi karega.
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("com.ubsidi:id/tvProduct")));
			List<WebElement> tableFoodItemsList1 = driver.findElements(By.id("com.ubsidi:id/tvProduct"));
			System.out.println("     " + SNo +".  " +tableFoodItemsList1.get(foodItemIndex).getText());
			logs.info("     " + SNo +".  " +tableFoodItemsList1.get(foodItemIndex).getText());

			Point point = tableFoodItemsList1.get(foodItemIndex).getLocation();
			touchActions.tap(PointOption.point(point.x+2,point.y+1)).perform();



			//tableFoodItemsList1.get(foodItemIndex).click();

			tableFoodItemsList1.clear();
			Thread.sleep(200);
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));

		}catch(NoSuchElementException e1) 

		{

			//take Screenshot
			DefaultMethods.getScreenShot( "UiBreaking111", driver);
			System.out.println("Error : Trying to 2nd time.... "+""+"NoSuchElementException");
			logs.info("Error : Trying to 2nd time.... "+""+"NoSuchElementException");

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			//locate element everytime before use it.  warna kam nhi karega.
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("com.ubsidi:id/tvProduct")));
			List<WebElement> tableFoodItemsList1 = driver.findElements(By.id("com.ubsidi:id/tvProduct"));
			System.out.println("     " + SNo +".  " +tableFoodItemsList1.get(foodItemIndex).getText());
			logs.info("     " + SNo +".  " +tableFoodItemsList1.get(foodItemIndex).getText());

			Point point = tableFoodItemsList1.get(foodItemIndex).getLocation();
			touchActions.tap(PointOption.point(point.x+2,point.y+1)).perform();

			//tableFoodItemsList1.get(foodItemIndex).click();

			tableFoodItemsList1.clear();
			Thread.sleep(500);
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));

		}
		catch(TimeoutException e2)

		{

			//take Screenshot
			DefaultMethods.getScreenShot( "UiBreaking222", driver);
			System.out.println("Error : Trying to 2nd time.... "+"\r\n"+"TimeoutException");	
			logs.info("Error : Trying to 2nd time.... "+"\r\n"+"TimeoutException");

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			//locate element everytime before use it.  warna kam nhi karega.
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("com.ubsidi:id/tvProduct")));
			List<WebElement> tableFoodItemsList1 = driver.findElements(By.id("com.ubsidi:id/tvProduct"));
			System.out.println("     " + SNo +".  " +tableFoodItemsList1.get(foodItemIndex).getText());
			logs.info("     " + SNo +".  " +tableFoodItemsList1.get(foodItemIndex).getText());

			Point point = tableFoodItemsList1.get(foodItemIndex).getLocation();
			touchActions.tap(PointOption.point(point.x+2,point.y+1)).perform();

			//tableFoodItemsList1.get(foodItemIndex).click();

			tableFoodItemsList1.clear();
			Thread.sleep(500);
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));

		}
		catch(StaleElementReferenceException e3)

		{
			//take Screenshot
			DefaultMethods.getScreenShot( "UiBreaking333", driver);
			System.out.println("Error : Trying to 2nd time.... "+"\r\n"+"StaleElementReferenceException");	
			logs.info("Error : Trying to 2nd time.... "+"\r\n"+"StaleElementReferenceException");

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			//locate element everytime before use it.  warna kam nhi karega.
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("com.ubsidi:id/tvProduct")));
			List<WebElement> tableFoodItemsList1 = driver.findElements(By.id("com.ubsidi:id/tvProduct"));
			System.out.println("     " + SNo +".  " +tableFoodItemsList1.get(foodItemIndex).getText());
			logs.info("     " + SNo +".  " +tableFoodItemsList1.get(foodItemIndex).getText());

			Point point = tableFoodItemsList1.get(foodItemIndex).getLocation();
			touchActions.tap(PointOption.point(point.x+2,point.y+1)).perform();

			//tableFoodItemsList1.get(foodItemIndex).click();

			tableFoodItemsList1.clear();
			Thread.sleep(500);
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));

		}



	}










	//Select food items by calling method with fake data
	public static void selectFoodItemsByCallMehtodByCoordinateWithFakeData(int SNo) throws Exception    //pass SNo and Index Number during calling this method
	{
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			//locate element everytime before use it.  warna kam nhi karega.
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("com.ubsidi:id/tvProduct")));
			List<WebElement> tableFoodItemsList1 = driver.findElements(By.id("com.ubsidi:id/tvProduct"));
			//store item price
			List<WebElement> tableFoodItemsPrice1 = driver.findElements(By.id("com.ubsidi:id/tvPrice"));
			
			int noOfItemsInListIs = tableFoodItemsList1.size();

			Faker faker = new Faker();
			//it will generate a number from 0 to 8
			int foodItemIndex =  faker.number().numberBetween(0, noOfItemsInListIs);    //between 0 (inclusive) and noOfItemsInListIs (exclusive). 
			String itemNameIs = tableFoodItemsList1.get(foodItemIndex).getText();
			String itemPriceIs = tableFoodItemsPrice1.get(foodItemIndex).getText();

			System.out.println("     " + SNo +".  " +itemNameIs+" --> "+itemPriceIs);

			logs.info("     " + SNo +".  " +itemNameIs+" --> "+itemPriceIs);


			//trim the fist letter of price String from front-end
			String trimmedItemPriceIs = itemPriceIs.substring(1); // Remove the first character

			//Convert string into double
			double itemPriceIsInDouble = Double.parseDouble(trimmedItemPriceIs);

			// Add items to the ArrayList which is globally initialized in BaseInit class.
			itemsNamesArray.add(itemNameIs);
			itemsPricesArray.add(itemPriceIsInDouble);


			Point point = tableFoodItemsList1.get(foodItemIndex).getLocation();
			touchActions.tap(PointOption.point(point.x+2,point.y+1)).perform();

			//tableFoodItemsList1.get(foodItemIndex).click();	
			tableFoodItemsList1.clear();
			tableFoodItemsPrice1.clear();

			Thread.sleep(200);
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));

		}catch(NoSuchElementException e1) 

		{

			//take Screenshot
			DefaultMethods.getScreenShot( "UiBreaking111", driver);
			System.out.println("Error : Trying to 2nd time.... "+""+"NoSuchElementException");
			logs.info("Error : Trying to 2nd time.... "+""+"NoSuchElementException");

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			//locate element everytime before use it.  warna kam nhi karega.
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("com.ubsidi:id/tvProduct")));
			List<WebElement> tableFoodItemsList1 = driver.findElements(By.id("com.ubsidi:id/tvProduct"));
			//store item price
			List<WebElement> tableFoodItemsPrice1 = driver.findElements(By.id("com.ubsidi:id/tvPrice"));
			
			int noOfItemsInListIs = tableFoodItemsList1.size();

			Faker faker = new Faker();
			//it will generate a number from 0 to 8
			int foodItemIndex =  faker.number().numberBetween(0, noOfItemsInListIs);    //between 0 (inclusive) and noOfItemsInListIs (exclusive). 
			String itemNameIs = tableFoodItemsList1.get(foodItemIndex).getText();
			String itemPriceIs = tableFoodItemsPrice1.get(foodItemIndex).getText();

			System.out.println("     " + SNo +".  " +itemNameIs+" --> "+itemPriceIs);

			logs.info("     " + SNo +".  " +itemNameIs+" --> "+itemPriceIs);


			//trim the fist letter of price String from front-end
			String trimmedItemPriceIs = itemPriceIs.substring(1); // Remove the first character

			//Convert string into double
			double itemPriceIsInDouble = Double.parseDouble(trimmedItemPriceIs);

			// Add items to the ArrayList
			itemsNamesArray.add(itemNameIs);
			itemsPricesArray.add(itemPriceIsInDouble);


			Point point = tableFoodItemsList1.get(foodItemIndex).getLocation();
			touchActions.tap(PointOption.point(point.x+2,point.y+1)).perform();

			//tableFoodItemsList1.get(foodItemIndex).click();	
			tableFoodItemsList1.clear();
			tableFoodItemsPrice1.clear();

			Thread.sleep(200);
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		}
		catch(TimeoutException e2)

		{

			//take Screenshot
			DefaultMethods.getScreenShot( "UiBreaking222", driver);
			System.out.println("Error : Trying to 2nd time.... "+"\r\n"+"TimeoutException");	
			logs.info("Error : Trying to 2nd time.... "+"\r\n"+"TimeoutException");

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			//locate element everytime before use it.  warna kam nhi karega.
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("com.ubsidi:id/tvProduct")));
			List<WebElement> tableFoodItemsList1 = driver.findElements(By.id("com.ubsidi:id/tvProduct"));
			//store item price
			List<WebElement> tableFoodItemsPrice1 = driver.findElements(By.id("com.ubsidi:id/tvPrice"));
			
			int noOfItemsInListIs = tableFoodItemsList1.size();

			Faker faker = new Faker();
			//it will generate a number from 0 to 8
			int foodItemIndex =  faker.number().numberBetween(0, noOfItemsInListIs);    //between 0 (inclusive) and noOfItemsInListIs (exclusive). 
			String itemNameIs = tableFoodItemsList1.get(foodItemIndex).getText();
			String itemPriceIs = tableFoodItemsPrice1.get(foodItemIndex).getText();

			System.out.println("     " + SNo +".  " +itemNameIs+" --> "+itemPriceIs);

			logs.info("     " + SNo +".  " +itemNameIs+" --> "+itemPriceIs);


			//trim the fist letter of price String from front-end
			String trimmedItemPriceIs = itemPriceIs.substring(1); // Remove the first character

			//Convert string into double
			double itemPriceIsInDouble = Double.parseDouble(trimmedItemPriceIs);

			// Add items to the ArrayList
			itemsNamesArray.add(itemNameIs);
			itemsPricesArray.add(itemPriceIsInDouble);


			Point point = tableFoodItemsList1.get(foodItemIndex).getLocation();
			touchActions.tap(PointOption.point(point.x+2,point.y+1)).perform();

			//tableFoodItemsList1.get(foodItemIndex).click();	
			tableFoodItemsList1.clear();
			tableFoodItemsPrice1.clear();

			Thread.sleep(200);
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		}
		catch(StaleElementReferenceException e3)

		{
			//take Screenshot
			DefaultMethods.getScreenShot( "UiBreaking333", driver);
			System.out.println("Error : Trying to 2nd time.... "+"\r\n"+"StaleElementReferenceException");	
			logs.info("Error : Trying to 2nd time.... "+"\r\n"+"StaleElementReferenceException");

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			//locate element everytime before use it.  warna kam nhi karega.
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("com.ubsidi:id/tvProduct")));
			List<WebElement> tableFoodItemsList1 = driver.findElements(By.id("com.ubsidi:id/tvProduct"));
			//store item price
			List<WebElement> tableFoodItemsPrice1 = driver.findElements(By.id("com.ubsidi:id/tvPrice"));
			
			int noOfItemsInListIs = tableFoodItemsList1.size();

			Faker faker = new Faker();
			//it will generate a number from 0 to 8
			int foodItemIndex =  faker.number().numberBetween(0, noOfItemsInListIs);    //between 0 (inclusive) and noOfItemsInListIs (exclusive). 
			String itemNameIs = tableFoodItemsList1.get(foodItemIndex).getText();
			String itemPriceIs = tableFoodItemsPrice1.get(foodItemIndex).getText();

			System.out.println("     " + SNo +".  " +itemNameIs+" --> "+itemPriceIs);

			logs.info("     " + SNo +".  " +itemNameIs+" --> "+itemPriceIs);


			//trim the fist letter of price String from front-end
			String trimmedItemPriceIs = itemPriceIs.substring(1); // Remove the first character

			//Convert string into double
			double itemPriceIsInDouble = Double.parseDouble(trimmedItemPriceIs);

			// Add items to the ArrayList
			itemsNamesArray.add(itemNameIs);
			itemsPricesArray.add(itemPriceIsInDouble);


			Point point = tableFoodItemsList1.get(foodItemIndex).getLocation();
			touchActions.tap(PointOption.point(point.x+2,point.y+1)).perform();

			//tableFoodItemsList1.get(foodItemIndex).click();	
			tableFoodItemsList1.clear();
			tableFoodItemsPrice1.clear();

			Thread.sleep(200);
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		}

	}




	//Calculate item total
	public static void calculateItemsTotal( )      
	{
		try {

			System.out.println(" -- Items are : "+"\r\n");
			// Access and print items Name 
			for (String itemsAre : itemsNamesArray) 
			{
				System.out.println("   - " + itemsAre+"\r\n");
			}

			// Calculate the total price
			double calculatedtTotalPriceIs = 0.0;
			for (double price : itemsPricesArray)
			{
				calculatedtTotalPriceIs += price;
			}
			System.out.println(" - Calculated Total price is  :  "+calculatedtTotalPriceIs);



			//verify total
			System.out.println(" - Order Total Verifing..."+"\r\n");
			//convert double into string 
			String doubleAsString = Double.toString(calculatedtTotalPriceIs);

			if(doubleAsString.startsWith(totalIs))   //totalIs come from printItemsPriceTotal( ) method. its globally defined.
			{
				System.out.println("   Verified Result : Item total is correct"+"\r\n");
			}
			else
			{
				System.out.println(" 🐞 🐛 Bug found : Item total is Not correct"+"\r\n");
			}

		}catch(Exception e)
		{
			System.out.println(e.getMessage() );
		}

	}


	
	


	//Change category
	public static void changeCategory(String categoryName) throws Exception    
	{

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		String xpathExpression = "//android.widget.TextView[@text='"+categoryName+"']";

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathExpression)));

		driver.findElement(By.xpath(xpathExpression)).click();
		System.out.println("   > Category : "+categoryName);
		logs.info("   > Category : "+categoryName);		

		Thread.sleep(50);
	}






	//print items price total
	public static void printItemsPriceTotal( ) throws Exception    
	{
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.ubsidi:id/tvGrandTotal")));
		//Print Total
		totalIs = driver.findElement(By.id("com.ubsidi:id/tvGrandTotal")).getText();
		System.out.println("\r\n"+" - Total is : "+totalIs+"\r\n");
		logs.info(" - Total is : "+ totalIs+"\r\n");

	}








	//Only order history Button Click
	public static void onlyOrderHistoryButtonClickJavascript() throws Exception
	{
		try {


			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.ubsidi:id/tvOrderHistory")));
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text='Order History']")));

			WebElement oH = driver.findElement(By.id("com.ubsidi:id/tvOrderHistory"));
			actions.click(oH).perform();

			//driver.findElement(By.xpath("//android.widget.TextView[@text='Order History']")).click();

			System.out.println(" - Order History Opening Now... Actions");
			logs.info(" - Order History Opening Now... ");	
		}catch(NoSuchElementException e1) 

		{

			//take Screenshot
			DefaultMethods.getScreenShot( "UiBreaking11", driver);
			System.out.println("Error : Trying to 2nd time.... "+""+"NoSuchElementException");
			logs.info("Error : Trying to 2nd time.... "+""+"NoSuchElementException");

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.ubsidi:id/tvOrderHistory")));
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text='Order History']")));

			WebElement oH = driver.findElement(By.id("com.ubsidi:id/tvOrderHistory"));
			actions.click(oH).perform();

			//driver.findElement(By.xpath("//android.widget.TextView[@text='Order History']")).click();

			System.out.println(" - Order History Opening Now... Actions");
			logs.info(" - Order History Opening Now... ");	
		}
		catch(TimeoutException e2)

		{

			//take Screenshot
			DefaultMethods.getScreenShot( "UiBreaking22", driver);
			System.out.println("Error : Trying to 2nd time.... "+"\r\n"+"TimeoutException");	
			logs.info("Error : Trying to 2nd time.... "+"\r\n"+"TimeoutException");

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.ubsidi:id/tvOrderHistory")));
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text='Order History']")));

			WebElement oH = driver.findElement(By.id("com.ubsidi:id/tvOrderHistory"));
			actions.click(oH).perform();

			//driver.findElement(By.xpath("//android.widget.TextView[@text='Order History']")).click();

			System.out.println(" - Order History Opening Now... Actions");
			logs.info(" - Order History Opening Now... ");	
		}
		catch(StaleElementReferenceException e3)

		{
			//take Screenshot
			DefaultMethods.getScreenShot( "UiBreaking33", driver);
			System.out.println("Error : Trying to 2nd time.... "+"\r\n"+"StaleElementReferenceException");	
			logs.info("Error : Trying to 2nd time.... "+"\r\n"+"StaleElementReferenceException");

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.ubsidi:id/tvOrderHistory")));
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text='Order History']")));

			WebElement oH = driver.findElement(By.id("com.ubsidi:id/tvOrderHistory"));
			actions.click(oH).perform();

			//driver.findElement(By.xpath("//android.widget.TextView[@text='Order History']")).click();

			System.out.println(" - Order History Opening Now... Actions");
			logs.info(" - Order History Opening Now... ");	
		}
	}






	//Only order history Button Click
	public static void onlyOrderHistoryButtonClickByCoordinate() throws Exception
	{
		try {


			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.ubsidi:id/tvOrderHistory")));
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text='Order History']")));

			WebElement oH = driver.findElement(By.id("com.ubsidi:id/tvOrderHistory"));

			Point point = oH.getLocation();
			touchActions.tap(PointOption.point(point.x+2,point.y+1)).perform();

			//driver.findElement(By.xpath("//android.widget.TextView[@text='Order History']")).click();

			System.out.println(" - Order History Opening Now... Actions");
			logs.info(" - Order History Opening Now... ");	
			Thread.sleep(1200);
		}catch(NoSuchElementException e1) 

		{

			//take Screenshot
			DefaultMethods.getScreenShot( "UiBreaking11", driver);
			System.out.println("Error : Trying to 2nd time.... "+""+"NoSuchElementException");
			logs.info("Error : Trying to 2nd time.... "+""+"NoSuchElementException");


			//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.ubsidi:id/tvOrderHistory")));
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text='Order History']")));

			WebElement oH = driver.findElement(By.id("com.ubsidi:id/tvOrderHistory"));

			Point point = oH.getLocation();
			touchActions.tap(PointOption.point(point.x+2,point.y+1)).perform();

			//driver.findElement(By.xpath("//android.widget.TextView[@text='Order History']")).click();

			System.out.println(" - Order History Opening Now... Actions");
			logs.info(" - Order History Opening Now... ");				}
		catch(TimeoutException e2)

		{

			//take Screenshot
			DefaultMethods.getScreenShot( "UiBreaking22", driver);
			System.out.println("Error : Trying to 2nd time.... "+"\r\n"+"TimeoutException");	
			logs.info("Error : Trying to 2nd time.... "+"\r\n"+"TimeoutException");


			//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.ubsidi:id/tvOrderHistory")));
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text='Order History']")));

			WebElement oH = driver.findElement(By.id("com.ubsidi:id/tvOrderHistory"));

			Point point = oH.getLocation();
			touchActions.tap(PointOption.point(point.x+2,point.y+1)).perform();

			//driver.findElement(By.xpath("//android.widget.TextView[@text='Order History']")).click();

			System.out.println(" - Order History Opening Now... Actions");
			logs.info(" - Order History Opening Now... ");	
		}
		catch(StaleElementReferenceException e3)

		{
			//take Screenshot
			DefaultMethods.getScreenShot( "UiBreaking33", driver);
			System.out.println("Error : Trying to 2nd time.... "+"\r\n"+"StaleElementReferenceException");	
			logs.info("Error : Trying to 2nd time.... "+"\r\n"+"StaleElementReferenceException");


			//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.ubsidi:id/tvOrderHistory")));
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text='Order History']")));

			WebElement oH = driver.findElement(By.id("com.ubsidi:id/tvOrderHistory"));

			Point point = oH.getLocation();
			touchActions.tap(PointOption.point(point.x+2,point.y+1)).perform();

			//driver.findElement(By.xpath("//android.widget.TextView[@text='Order History']")).click();

			System.out.println(" - Order History Opening Now... Actions");
			logs.info(" - Order History Opening Now... ");	
		}
	}





	//Only order history Button Click
	public static void onlyOrderHistoryButtonClickByCoordinateOnly() throws Exception
	{
		try {

			//Thread.sleep(1900);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(12));

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.ubsidi:id/tvOrderHistory")));
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text='Order History']")));

			WebElement oH = driver.findElement(By.id("com.ubsidi:id/tvOrderHistory"));

			Point point = oH.getLocation();
			//How to get button x,y coordinate -> point varible ko print krwa lo
			System.out.println(point);

		    touchActions.tap(PointOption.point(point.x+1,point.y+1)).perform();

			//touchActions.tap(PointOption.point(157, 404)).perform();     //(157, 404)

			//driver.findElement(By.xpath("//android.widget.TextView[@text='Order History']")).click();

			System.out.println(" - Order History Opening Now... x,y Coordinate");
			logs.info(" - Order History Opening Now... ");	
			Thread.sleep(1600);
		}catch(NoSuchElementException e1) 

		{

			//take Screenshot
			DefaultMethods.getScreenShot( "UiBreaking11", driver);
			System.out.println("Error : Trying to 2nd time.... "+""+"NoSuchElementException");
			logs.info("Error : Trying to 2nd time.... "+""+"NoSuchElementException");



			//Thread.sleep(1900);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(12));

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.ubsidi:id/tvOrderHistory")));
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text='Order History']")));

			WebElement oH = driver.findElement(By.id("com.ubsidi:id/tvOrderHistory"));

			Point point = oH.getLocation();
			//How to get button x,y coordinate -> point varible ko print krwa lo
			//System.out.println(point);

		    touchActions.tap(PointOption.point(point.x+1,point.y-1)).perform();

			//touchActions.tap(PointOption.point(157, 404)).perform();     //(157, 404)

			//driver.findElement(By.xpath("//android.widget.TextView[@text='Order History']")).click();

			System.out.println(" - Order History Opening Now... x,y Coordinate");
			logs.info(" - Order History Opening Now... ");	
			Thread.sleep(1600);
		}
		catch(TimeoutException e2)

		{

			//take Screenshot
			DefaultMethods.getScreenShot( "UiBreaking22", driver);
			System.out.println("Error : Trying to 2nd time.... "+"\r\n"+"TimeoutException");	
			logs.info("Error : Trying to 2nd time.... "+"\r\n"+"TimeoutException");

			//Thread.sleep(1900);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(12));

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.ubsidi:id/tvOrderHistory")));
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text='Order History']")));

			WebElement oH = driver.findElement(By.id("com.ubsidi:id/tvOrderHistory"));

			Point point = oH.getLocation();
			//How to get button x,y coordinate -> point varible ko print krwa lo
			//System.out.println(point);

		    touchActions.tap(PointOption.point(point.x+1,point.y-1)).perform();

			//touchActions.tap(PointOption.point(157, 404)).perform();     //(157, 404)

			//driver.findElement(By.xpath("//android.widget.TextView[@text='Order History']")).click();

			System.out.println(" - Order History Opening Now... x,y Coordinate");
			logs.info(" - Order History Opening Now... ");	
			Thread.sleep(1600);
		}
		catch(StaleElementReferenceException e3)

		{
			//take Screenshot
			DefaultMethods.getScreenShot( "UiBreaking33", driver);
			System.out.println("Error : Trying to 2nd time.... "+"\r\n"+"StaleElementReferenceException");	
			logs.info("Error : Trying to 2nd time.... "+"\r\n"+"StaleElementReferenceException");



			//Thread.sleep(1900);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(12));

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.ubsidi:id/tvOrderHistory")));
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text='Order History']")));

			WebElement oH = driver.findElement(By.id("com.ubsidi:id/tvOrderHistory"));

			Point point = oH.getLocation();
			//How to get button x,y coordinate -> point varible ko print krwa lo
			//System.out.println(point);

		    touchActions.tap(PointOption.point(point.x+1,point.y-1)).perform();

			//touchActions.tap(PointOption.point(157, 404)).perform();     //(157, 404)

			//driver.findElement(By.xpath("//android.widget.TextView[@text='Order History']")).click();

			System.out.println(" - Order History Opening Now... x,y Coordinate");
			logs.info(" - Order History Opening Now... ");	
			Thread.sleep(1600);
		}
	}








	//only Click on Order History order 
	public static void onlyClickOnOrderHistoryOrderActions() throws Exception

	{	
		try {

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			//click on Latest firstOne order
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("com.ubsidi:id/tvOrderNumberIOrder")));
			//print order Type/table name
			List<WebElement> historyOrderTypeList = driver.findElements(By.id("com.ubsidi:id/tvOrderNumberIOrder"));

			String orderWhichIsGoingToBeClicked = historyOrderTypeList.get(0).getText();       

			//Open Order
			//historyOrderNumberList.get(0).click();

			actions.click(historyOrderTypeList.get(0)).perform();

			System.out.println(" - "+ orderWhichIsGoingToBeClicked +" is Opening Now...Actions"+"\r\n");
			logs.info(" - "+ orderWhichIsGoingToBeClicked +" is Opening Now...");

			historyOrderTypeList.clear();	

		}catch(NoSuchElementException e1) 

		{

			//take Screenshot
			DefaultMethods.getScreenShot( "UiBreaking11", driver);
			System.out.println("Error : Trying to 2nd time.... "+""+"NoSuchElementException");
			logs.info("Error : Trying to 2nd time.... "+""+"NoSuchElementException");

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			//click on Latest firstOne order
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("com.ubsidi:id/tvOrderNumberIOrder")));
			//print order Type/table name
			List<WebElement> historyOrderTypeList = driver.findElements(By.id("com.ubsidi:id/tvOrderNumberIOrder"));

			String orderWhichIsGoingToBeClicked = historyOrderTypeList.get(0).getText();       

			//Open Order
			//historyOrderNumberList.get(0).click();

			actions.click(historyOrderTypeList.get(0)).perform();

			System.out.println(" - "+ orderWhichIsGoingToBeClicked +" is Opening Now...Actions"+"\r\n");
			logs.info(" - "+ orderWhichIsGoingToBeClicked +" is Opening Now...");

			historyOrderTypeList.clear();	

		}
		catch(TimeoutException e2)

		{

			//take Screenshot
			DefaultMethods.getScreenShot( "UiBreaking22", driver);
			System.out.println("Error : Trying to 2nd time.... "+"\r\n"+"TimeoutException");	
			logs.info("Error : Trying to 2nd time.... "+"\r\n"+"TimeoutException");

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			//click on Latest firstOne order
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("com.ubsidi:id/tvOrderNumberIOrder")));
			//print order Type/table name
			List<WebElement> historyOrderTypeList = driver.findElements(By.id("com.ubsidi:id/tvOrderNumberIOrder"));

			String orderWhichIsGoingToBeClicked = historyOrderTypeList.get(0).getText();       

			//Open Order
			//historyOrderNumberList.get(0).click();

			actions.click(historyOrderTypeList.get(0)).perform();

			System.out.println(" - "+ orderWhichIsGoingToBeClicked +" is Opening Now...Actions"+"\r\n");
			logs.info(" - "+ orderWhichIsGoingToBeClicked +" is Opening Now...");

			historyOrderTypeList.clear();	
		}
		catch(StaleElementReferenceException e3)

		{
			//take Screenshot
			DefaultMethods.getScreenShot( "UiBreaking33", driver);
			System.out.println("Error : Trying to 2nd time.... "+"\r\n"+"StaleElementReferenceException");	
			logs.info("Error : Trying to 2nd time.... "+"\r\n"+"StaleElementReferenceException");

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			//click on Latest firstOne order
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("com.ubsidi:id/tvOrderNumberIOrder")));
			//print order Type/table name
			List<WebElement> historyOrderTypeList = driver.findElements(By.id("com.ubsidi:id/tvOrderNumberIOrder"));

			String orderWhichIsGoingToBeClicked = historyOrderTypeList.get(0).getText();       

			//Open Order
			//historyOrderNumberList.get(0).click();

			actions.click(historyOrderTypeList.get(0)).perform();

			System.out.println(" - "+ orderWhichIsGoingToBeClicked +" is Opening Now...Actions"+"\r\n");
			logs.info(" - "+ orderWhichIsGoingToBeClicked +" is Opening Now...");

			historyOrderTypeList.clear();	

		}
		catch(IndexOutOfBoundsException  e4) {

			//take Screenshot
			DefaultMethods.getScreenShot( "UiBreaking33", driver);
			System.out.println("Error : Trying to 2nd time.... "+"\r\n"+"StaleElementReferenceException");	
			logs.info("Error : Trying to 2nd time.... "+"\r\n"+"StaleElementReferenceException");

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			//click on Latest firstOne order
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("com.ubsidi:id/tvOrderNumberIOrder")));
			//print order Type/table name
			List<WebElement> historyOrderTypeList = driver.findElements(By.id("com.ubsidi:id/tvOrderNumberIOrder"));

			String orderWhichIsGoingToBeClicked = historyOrderTypeList.get(0).getText();       

			//Open Order
			//historyOrderNumberList.get(0).click();

			actions.click(historyOrderTypeList.get(0)).perform();

			System.out.println(" - "+ orderWhichIsGoingToBeClicked +" is Opening Now...Actions"+"\r\n");
			logs.info(" - "+ orderWhichIsGoingToBeClicked +" is Opening Now...");

			historyOrderTypeList.clear();		

		}
	}






	//only Click on Order History order 
	public static void onlyClickOnOrderHistoryOrderByCoordinate() throws Exception

	{	
		try {
			//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			//click on Latest firstOne order
			//	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("com.ubsidi:id/tvOrderNumberIOrder")));
			//print order Type/table name
			//	List<WebElement> historyOrderTypeList = driver.findElements(By.id("com.ubsidi:id/tvOrderNumberIOrder"));

			//	String orderWhichIsGoingToBeClicked = historyOrderTypeList.get(0).getText();       

			//Open Order

			///	Point point = historyOrderTypeList.get(0).getLocation();
			//Point point1 = ("434","8877");

			//	System.out.println(point);
			//touchActions.tap(PointOption.point(point.x,point.y)).perform();

			touchActions.tap(PointOption.point(184, 353)).perform();
			// touchActions.tap(PointOption.point(point.x,point.y)).perform();
			//System.out.println(" - "+ orderWhichIsGoingToBeClicked +" is Opening Now...Actions"+"\r\n");
			//	logs.info(" - "+ orderWhichIsGoingToBeClicked +" is Opening Now...");

			//	historyOrderTypeList.clear();	

		}catch(NoSuchElementException e1) 

		{

			//take Screenshot
			DefaultMethods.getScreenShot( "UiBreaking11", driver);
			System.out.println("Error : Trying to 2nd time.... "+""+"NoSuchElementException");
			logs.info("Error : Trying to 2nd time.... "+""+"NoSuchElementException");

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			//click on Latest firstOne order
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("com.ubsidi:id/tvOrderNumberIOrder")));
			//print order Type/table name
			List<WebElement> historyOrderTypeList = driver.findElements(By.id("com.ubsidi:id/tvOrderNumberIOrder"));

			String orderWhichIsGoingToBeClicked = historyOrderTypeList.get(0).getText();       

			//Open Order
			//historyOrderNumberList.get(0).click();

			//actions.click(historyOrderTypeList.get(0)).perform();
			Point point = historyOrderTypeList.get(0).getLocation();
			touchActions.tap(PointOption.point(point.x+2,point.y+1)).perform();

			System.out.println(" - "+ orderWhichIsGoingToBeClicked +" is Opening Now...Actions"+"\r\n");
			logs.info(" - "+ orderWhichIsGoingToBeClicked +" is Opening Now...");

			historyOrderTypeList.clear();	


			historyOrderTypeList.clear();	

		}
		catch(TimeoutException e2)

		{

			//take Screenshot
			DefaultMethods.getScreenShot( "UiBreaking22", driver);
			System.out.println("Error : Trying to 2nd time.... "+"\r\n"+"TimeoutException");	
			logs.info("Error : Trying to 2nd time.... "+"\r\n"+"TimeoutException");

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			//click on Latest firstOne order
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("com.ubsidi:id/tvOrderNumberIOrder")));
			//print order Type/table name
			List<WebElement> historyOrderTypeList = driver.findElements(By.id("com.ubsidi:id/tvOrderNumberIOrder"));

			String orderWhichIsGoingToBeClicked = historyOrderTypeList.get(0).getText();       

			//Open Order
			//historyOrderNumberList.get(0).click();

			//actions.click(historyOrderTypeList.get(0)).perform();
			Point point = historyOrderTypeList.get(0).getLocation();
			touchActions.tap(PointOption.point(point.x+2,point.y+1)).perform();

			System.out.println(" - "+ orderWhichIsGoingToBeClicked +" is Opening Now...Actions"+"\r\n");
			logs.info(" - "+ orderWhichIsGoingToBeClicked +" is Opening Now...");

			historyOrderTypeList.clear();	

		}
		catch(StaleElementReferenceException e3)

		{
			//take Screenshot
			DefaultMethods.getScreenShot( "UiBreaking33", driver);
			System.out.println("Error : Trying to 2nd time.... "+"\r\n"+"StaleElementReferenceException");	
			logs.info("Error : Trying to 2nd time.... "+"\r\n"+"StaleElementReferenceException");

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			//click on Latest firstOne order
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("com.ubsidi:id/tvOrderNumberIOrder")));
			//print order Type/table name
			List<WebElement> historyOrderTypeList = driver.findElements(By.id("com.ubsidi:id/tvOrderNumberIOrder"));

			String orderWhichIsGoingToBeClicked = historyOrderTypeList.get(0).getText();       

			//Open Order
			//historyOrderNumberList.get(0).click();

			//actions.click(historyOrderTypeList.get(0)).perform();
			Point point = historyOrderTypeList.get(0).getLocation();
			touchActions.tap(PointOption.point(point.x+2,point.y+1)).perform();

			System.out.println(" - "+ orderWhichIsGoingToBeClicked +" is Opening Now...Actions"+"\r\n");
			logs.info(" - "+ orderWhichIsGoingToBeClicked +" is Opening Now...");

			historyOrderTypeList.clear();	


		}
		catch(IndexOutOfBoundsException  e4) {

			//take Screenshot
			DefaultMethods.getScreenShot( "UiBreaking33", driver);
			System.out.println("Error : Trying to 2nd time.... "+"\r\n"+"StaleElementReferenceException");	
			logs.info("Error : Trying to 2nd time.... "+"\r\n"+"StaleElementReferenceException");

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			//click on Latest firstOne order
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("com.ubsidi:id/tvOrderNumberIOrder")));
			//print order Type/table name
			List<WebElement> historyOrderTypeList = driver.findElements(By.id("com.ubsidi:id/tvOrderNumberIOrder"));

			String orderWhichIsGoingToBeClicked = historyOrderTypeList.get(0).getText();       

			//Open Order
			//historyOrderNumberList.get(0).click();

			//actions.click(historyOrderTypeList.get(0)).perform();
			Point point = historyOrderTypeList.get(0).getLocation();
			touchActions.tap(PointOption.point(point.x+2,point.y+1)).perform();

			System.out.println(" - "+ orderWhichIsGoingToBeClicked +" is Opening Now...Actions"+"\r\n");
			logs.info(" - "+ orderWhichIsGoingToBeClicked +" is Opening Now...");

			historyOrderTypeList.clear();	


		}
	}













	//only Click on Order History order 
	public static void onlyClickOnOrderHistoryOrderByCoordinateOnly() throws Exception

	{	
		try {


			touchActions.tap(PointOption.point(246, 389)).perform(); 


			System.out.println(" -Order is Opening Now...Coordinate"+"\r\n");
			logs.info(" -Order is Opening Now...Coordinate");
		}catch(NoSuchElementException e1) 

		{

			//take Screenshot
			DefaultMethods.getScreenShot( "UiBreaking11", driver);
			System.out.println("Error : Trying to 2nd time.... "+""+"NoSuchElementException");
			logs.info("Error : Trying to 2nd time.... "+""+"NoSuchElementException");

			Thread.sleep(1000);

			touchActions.tap(PointOption.point(246, 389)).perform();

			System.out.println(" -Order is Opening Now...Coordinate"+"\r\n");
			logs.info(" -Order is Opening Now...Coordinate");
		}
		catch(TimeoutException e2)

		{

			//take Screenshot
			DefaultMethods.getScreenShot( "UiBreaking22", driver);
			System.out.println("Error : Trying to 2nd time.... "+"\r\n"+"TimeoutException");	
			logs.info("Error : Trying to 2nd time.... "+"\r\n"+"TimeoutException");

			Thread.sleep(1000);
			touchActions.tap(PointOption.point(246, 389)).perform();

			System.out.println(" -Order is Opening Now...Coordinate"+"\r\n");
			logs.info(" -Order is Opening Now...Coordinate");

		}
		catch(StaleElementReferenceException e3)

		{
			//take Screenshot
			DefaultMethods.getScreenShot( "UiBreaking33", driver);
			System.out.println("Error : Trying to 2nd time.... "+"\r\n"+"StaleElementReferenceException");	
			logs.info("Error : Trying to 2nd time.... "+"\r\n"+"StaleElementReferenceException");

			touchActions.tap(PointOption.point(246, 389)).perform();



		}
		catch(IndexOutOfBoundsException  e4) {

			//take Screenshot
			DefaultMethods.getScreenShot( "UiBreaking33", driver);
			System.out.println("Error : Trying to 2nd time.... "+"\r\n"+"StaleElementReferenceException");	
			logs.info("Error : Trying to 2nd time.... "+"\r\n"+"StaleElementReferenceException");

			touchActions.tap(PointOption.point(246, 389)).perform();
			System.out.println(" -Order is Opening Now...Coordinate"+"\r\n");
			logs.info(" -Order is Opening Now...Coordinate");
		}
	}







	//Only pay By Cash btn Click
	public static void onlyPayByCashBtnClickByCoordinate() throws InterruptedException
	{
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.ubsidi:id/btnCash")));

			WebElement payByCashBtn =	driver.findElement(By.id("com.ubsidi:id/btnCash"));
			//click on pay by cash button
			String payByCashBtnText = payByCashBtn.getText();

			//driver.findElement(By.id("com.ubsidi:id/btnCash")).click();
			Point point = payByCashBtn.getLocation();
			touchActions.tap(PointOption.point(point.x+2,point.y+1)).perform();

			System.out.println(" - "+ payByCashBtnText +" is Clicked..."+"\r\n");
			logs.info(" - "+ payByCashBtnText +" is Clicked...");

			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		}catch(NoSuchElementException e1) 

		{

			//take Screenshot
			DefaultMethods.getScreenShot( "UiBreaking11", driver);
			System.out.println("Error : Trying to 2nd time.... "+""+"NoSuchElementException");
			logs.info("Error : Trying to 2nd time.... "+""+"NoSuchElementException");

			/*	if the Order history button din't work, but code exucuted successdully ,
				that time we need here again to tap on Order after no such element exception
			 */
			touchActions.tap(PointOption.point(246, 389)).perform(); 


			System.out.println(" -Order is Opening Now...Order opened thught payByButton Code"+"\r\n");
			logs.info(" -Order is Opening Now...Order opened thught payByButton Code"+"\r\n");





			//after this we need to click on Pay by cash button 


			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.ubsidi:id/btnCash")));

			WebElement payByCashBtn =	driver.findElement(By.id("com.ubsidi:id/btnCash"));
			//click on pay by cash button
			String payByCashBtnText = payByCashBtn.getText();

			//driver.findElement(By.id("com.ubsidi:id/btnCash")).click();
			Point point = payByCashBtn.getLocation();
			touchActions.tap(PointOption.point(point.x+2,point.y+1)).perform();

			System.out.println(" - "+ payByCashBtnText +" is Clicked..."+"\r\n");
			logs.info(" - "+ payByCashBtnText +" is Clicked...");

			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		}
		catch(TimeoutException e2)

		{

			//take Screenshot
			DefaultMethods.getScreenShot( "UiBreaking22", driver);
			System.out.println("Error : Trying to 2nd time.... "+"\r\n"+"TimeoutException");	
			logs.info("Error : Trying to 2nd time.... "+"\r\n"+"TimeoutException");



			/*	if the Order history button din't work, but code exucuted successdully ,
					that time we need here again to tap on Order after TimeoutException
			 */
			touchActions.tap(PointOption.point(246, 389)).perform(); 

			System.out.println(" -Order is Opening Now...Order opened thught payByButton Code"+"\r\n");
			logs.info(" -Order is Opening Now...Order opened thught payByButton Code"+"\r\n");




			//after this we need to click on Pay by cash button 


			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.ubsidi:id/btnCash")));

			WebElement payByCashBtn =	driver.findElement(By.id("com.ubsidi:id/btnCash"));
			//click on pay by cash button
			String payByCashBtnText = payByCashBtn.getText();

			//driver.findElement(By.id("com.ubsidi:id/btnCash")).click();
			Point point = payByCashBtn.getLocation();
			touchActions.tap(PointOption.point(point.x+2,point.y+1)).perform();

			System.out.println(" - "+ payByCashBtnText +" is Clicked..."+"\r\n");
			logs.info(" - "+ payByCashBtnText +" is Clicked...");

			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		}
		catch(StaleElementReferenceException e3)

		{
			//take Screenshot
			DefaultMethods.getScreenShot( "UiBreaking33", driver);
			System.out.println("Error : Trying to 2nd time.... "+"\r\n"+"StaleElementReferenceException");	
			logs.info("Error : Trying to 2nd time.... "+"\r\n"+"StaleElementReferenceException");



			/*	if the Order history button din't work, but code exucuted successdully ,
					that time we need here again to tap on Order after TimeoutException
			 */
			touchActions.tap(PointOption.point(246, 389)).perform(); 


			System.out.println(" -Order is Opening Now...Order opened thught payByButton Code"+"\r\n");
			logs.info(" -Order is Opening Now...Order opened thught payByButton Code"+"\r\n");




			//after this we need to click on Pay by cash button 

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.ubsidi:id/btnCash")));

			WebElement payByCashBtn =	driver.findElement(By.id("com.ubsidi:id/btnCash"));
			//click on pay by cash button
			String payByCashBtnText = payByCashBtn.getText();

			//driver.findElement(By.id("com.ubsidi:id/btnCash")).click();
			Point point = payByCashBtn.getLocation();
			touchActions.tap(PointOption.point(point.x+2,point.y+1)).perform();

			System.out.println(" - "+ payByCashBtnText +" is Clicked..."+"\r\n");
			logs.info(" - "+ payByCashBtnText +" is Clicked...");

			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		}



	}










	//only New Order Button Click
	public static void onlyNewOrderButtonClickActionsTouch() throws Exception
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.ubsidi:id/btnNewOrder")));
		AndroidTouchAction touchActions = new AndroidTouchAction(driver);
		touchActions.tap(TapOptions.tapOptions().withElement(ElementOption.element(driver.findElement(By.id("com.ubsidi:id/btnNewOrder"))))).perform();

		System.out.println(" - New Order button Clicked ....touchActions"+"\r\n");
		logs.info(" - New Order button Clicked");
	}


	
	

	//open Paid Order From Order History
	public static void openPaidOrderFromOrderHistory() throws Exception
	{
		
		try {


			touchActions.tap(PointOption.point(246, 389)).perform(); 


			System.out.println(" -Order is Opening Now...Coordinate"+"\r\n");
			logs.info(" -Order is Opening Now...Coordinate");
			
			Thread.sleep(1200);
		    test.log(Status.PASS, "Order hasbeen sucessfully placed");

			//take Screenshot
			String placedOrder = DefaultMethods.getScreenShot( "Order Details", driver);
			//Add screenshot in extent report
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(placedOrder, "Completed Order").build());
						
			//click on Close button
			driver.findElement(By.id("com.ubsidi:id/btnClose")).click();
					
			
		}catch(NoSuchElementException e1) 

		{

			//take Screenshot
			DefaultMethods.getScreenShot( "UiBreaking11", driver);
			System.out.println("Error : Trying to 2nd time.... "+""+"NoSuchElementException");
			logs.info("Error : Trying to 2nd time.... "+""+"NoSuchElementException");

			touchActions.tap(PointOption.point(246, 389)).perform(); 


			System.out.println(" -Order is Opening Now...Coordinate"+"\r\n");
			logs.info(" -Order is Opening Now...Coordinate");
			
			Thread.sleep(1200);

			//take Screenshot
			DefaultMethods.getScreenShot( "Order Details", driver);
						
			//click on Close button
			driver.findElement(By.id("com.ubsidi:id/btnClose")).click();
		}
		catch(TimeoutException e2)

		{

			//take Screenshot
			DefaultMethods.getScreenShot( "UiBreaking22", driver);
			System.out.println("Error : Trying to 2nd time.... "+"\r\n"+"TimeoutException");	
			logs.info("Error : Trying to 2nd time.... "+"\r\n"+"TimeoutException");


			touchActions.tap(PointOption.point(246, 389)).perform(); 


			System.out.println(" -Order is Opening Now...Coordinate"+"\r\n");
			logs.info(" -Order is Opening Now...Coordinate");
			
			Thread.sleep(1200);

			//take Screenshot
			DefaultMethods.getScreenShot( "Order Details", driver);
						
			//click on Close button
			driver.findElement(By.id("com.ubsidi:id/btnClose")).click();
		}
		catch(StaleElementReferenceException e3)

		{
			//take Screenshot
			DefaultMethods.getScreenShot( "UiBreaking33", driver);
			System.out.println("Error : Trying to 2nd time.... "+"\r\n"+"StaleElementReferenceException");	
			logs.info("Error : Trying to 2nd time.... "+"\r\n"+"StaleElementReferenceException");


			touchActions.tap(PointOption.point(246, 389)).perform(); 


			System.out.println(" -Order is Opening Now...Coordinate"+"\r\n");
			logs.info(" -Order is Opening Now...Coordinate");
			
			Thread.sleep(1200);

			//take Screenshot
			DefaultMethods.getScreenShot( "Order Details", driver);
						
			//click on Close button
			driver.findElement(By.id("com.ubsidi:id/btnClose")).click();


		}
		catch(IndexOutOfBoundsException  e4) {

			//take Screenshot
			DefaultMethods.getScreenShot( "UiBreaking33", driver);
			System.out.println("Error : Trying to 2nd time.... "+"\r\n"+"StaleElementReferenceException");	
			logs.info("Error : Trying to 2nd time.... "+"\r\n"+"StaleElementReferenceException");

			touchActions.tap(PointOption.point(246, 389)).perform(); 


			System.out.println(" -Order is Opening Now...Coordinate"+"\r\n");
			logs.info(" -Order is Opening Now...Coordinate");
			
			Thread.sleep(1200);

			//take Screenshot
			DefaultMethods.getScreenShot( "Order Details", driver);
						
			//click on Close button
			driver.findElement(By.id("com.ubsidi:id/btnClose")).click();
		}	
		
		
	}
	
	
	
	
	
	

	//back History ToHome
	public static void backHistoryToHomeByCoordinate() throws InterruptedException, TimeoutException 
	{	
		try {
			try {
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(14));

				//wait untill visibility of order history text
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text='> Order history']")));
				WebElement arrowBackButton = driver.findElement(By.id("com.ubsidi:id/chipBack"));

				Point point = arrowBackButton.getLocation();		
				touchActions.tap(PointOption.point(point.x,point.y)).perform();

				//  actions.click(driver.findElement(By.id("com.ubsidi:id/chipBack"))).perform();

				//driver.findElement(By.id("com.ubsidi:id/chipBack")).click();

				System.out.println(" - Aerrow Back Button is Clicked..."+"\r\n"+"---------------------------------------------"+"\r\n");
			}catch(Exception e)
			{
				//agar payment hone ke bad menu page pe stuck ho gya hai to uska back battun click ho jayega.
				driver.findElement(By.id("com.ubsidi:id/chipBack")).click();
				System.out.println("Menu page Arrow back button is clicked ");


				//usake bad history page ka back button click ho jayega 
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(18));

				//wait untill visibility of order history
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text='> Order history']")));
				WebElement arrowBackButton = driver.findElement(By.id("com.ubsidi:id/chipBack"));

				Point point = arrowBackButton.getLocation();		
				touchActions.tap(PointOption.point(point.x,point.y)).perform();

				//  actions.click(driver.findElement(By.id("com.ubsidi:id/chipBack"))).perform();

				//driver.findElement(By.id("com.ubsidi:id/chipBack")).click();

				System.out.println(" - Aerrow Back Button is Clicked..."+"\r\n");


			}
		}catch(NoSuchElementException e1) 

		{

			//take Screenshot
			DefaultMethods.getScreenShot( "UiBreaking1", driver);

			System.out.println("Error : Application Ui Breaks. Directly nevigate to home page"+"\r\n"+"NoSuchElementException");		
		}
		catch(TimeoutException e2)

		{
			System.out.println(" catch(TimeoutException e2) part running now... ");

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(18));

			//wait untill visibility of order history
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text='> Order history']")));
			WebElement arrowBackButton = driver.findElement(By.id("com.ubsidi:id/chipBack"));

			Point point = arrowBackButton.getLocation();		
			touchActions.tap(PointOption.point(point.x,point.y)).perform();

			//  actions.click(driver.findElement(By.id("com.ubsidi:id/chipBack"))).perform();

			//driver.findElement(By.id("com.ubsidi:id/chipBack")).click();

			System.out.println(" - Aerrow Back Button is Clicked..."+"\r\n");
		}
		catch(StaleElementReferenceException e3)

		{

			//take Screenshot
			DefaultMethods.getScreenShot( "UiBreaking3", driver);

			System.out.println("Error : Application Ui Breaks. Directly nevigate to home page"+"\r\n"+"StaleElementReferenceException");		
		}



	}





	//Click on Order by javascriptExecutor
	public static void clickOnOrderByJavascriptExecutor() 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		//click on Latest firstOne order
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("com.ubsidi:id/tvOrderNumberIOrder")));
		//print order Type/table name
		List<WebElement> historyOrderTypeList = driver.findElements(By.id("com.ubsidi:id/tvOrderNumberIOrder"));

		//String orderWhichIsGoingToBeClicked = historyOrderTypeList.get(0).getText();       

		
		JavascriptExecutor jscript = (JavascriptExecutor) driver;
		
		jscript.executeScript("arguments[0].style.border='7px solid red'", historyOrderTypeList.get(0));
		jscript.executeScript("arguments[0].click();", historyOrderTypeList.get(0));
		System.out.println("  Order open by jse");
	}




	
	

	//payment by click on Pay Order from Order History
	public static void paymentByClickOnPayOrderfromOrderHistory() 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		//click on Latest firstOne order
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("com.ubsidi:id/cvAction")));
		//print order Type/table name
		List<WebElement> payOrderBtns = driver.findElements(By.id("com.ubsidi:id/cvAction"));
		
		//click on pay order 
		payOrderBtns.get(0).click();
		System.out.println("clicked on pay order");
		
		
		//click on CASH btn
		
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
		//click on Latest firstOne order
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text='Cash']")));
		driver.findElement(By.xpath("//android.widget.TextView[@text='Cash']")).click();
		
		
		
		
	}





}
