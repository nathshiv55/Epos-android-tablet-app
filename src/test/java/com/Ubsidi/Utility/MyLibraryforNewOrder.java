package com.Ubsidi.Utility;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Ubsidi.BasePackage.BaseInit;
import com.Ubsidi.BasePackage.BaseInit1;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class MyLibraryforNewOrder extends BaseInit1 {



	//only New Order Button Click
	public static void onlyNewOrderButtonClick() throws Exception
	{
		//UpSide New Order Button
		driver.findElement(By.id("com.ubsidi:id/btnNewOrder")).click();
		System.out.println(" - New Order Clicked "+"\r\n");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	}

	//Open Latest order From order History
	public static void openLatestOrderFromOrderHistory() throws Exception
	{
		try {


			boolean checkOrderHistoryBtn =  driver.findElement(By.id("com.ubsidi:id/tvOrderHistory")).isDisplayed();
			//click on Order history button
			WebElement orderHistorybtn = driver.findElement(By.id("com.ubsidi:id/tvOrderHistory"));
			//OrderHistory opening... text print
			System.out.println(" - "+orderHistorybtn.getText()+" Opening Now...");
			//Click on order history btn
			orderHistorybtn.click();

		}catch(Exception e) {

			System.out.println(" - Order History Already Open....");

		}
		try {
			Thread.sleep(6000);
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

			//print order Type/table name
			List<WebElement> historyOrderTypeList = driver.findElements(By.id("com.ubsidi:id/tvTableNumber"));
			//print Order 
			System.out.println("        - Order type/Table is : "+historyOrderTypeList.get(0).getText());
			historyOrderTypeList.clear();

			//click on Latest firstOne order
			List<WebElement> historyOrderNumberList = driver.findElements(By.id("com.ubsidi:id/tvOrderNumber"));
			//`System.out.println(historyOrderNumberList.size());
			//print Order details
			System.out.println("        - Order Number is : "+historyOrderNumberList.get(0).getText()+"\r\n");
			//Open Order
			historyOrderNumberList.get(0).click();

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));	
		}
		catch(Exception e)
		{

			//When an exception is chained, the getCause method is used to get the original cause. 
			System.out.println("Cause is : "+e.getCause());
			System.out.println("Message is : "+e.getMessage());
			e.printStackTrace();
		}
	}


	//Only order history Button Click
	public static void onlyOrderHistoryButtonClick() throws Exception
	{
		
			driver.findElement(By.id("com.ubsidi:id/tvOrderHistory")).click();

			System.out.println(" - Order History Opening Now... ");
			logs.info(" - Order History Opening Now... ");
			
			Thread.sleep(5000);


			
	}


	
	//only order history order open
	public static void onlyOrderHistoryOrderOpen() throws Exception
	{
		try {

			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

			//print order Type/table name
			List<WebElement> historyOrderTypeList = driver.findElements(By.id("com.ubsidi:id/tvTableNumber"));
			//print Order 
			System.out.println("        - Order type/Table is : "+historyOrderTypeList.get(0).getText());
			historyOrderTypeList.clear();

			//click on Latest firstOne order
			List<WebElement> historyOrderNumberList = driver.findElements(By.id("com.ubsidi:id/tvOrderNumber"));
			//`System.out.println(historyOrderNumberList.size());
			//print Order details
			System.out.println("        - Order Number is : "+historyOrderNumberList.get(0).getText()+"\r\n");
			//Open Order
			historyOrderNumberList.get(0).click();

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));	
		}
		catch(Exception e)
		{

			//When an exception is chained, the getCause method is used to get the original cause. 
			System.out.println("Cause is : "+e.getCause());
			System.out.println("Message is : "+e.getMessage());
			e.printStackTrace();
		}
	}

	//only History Order Number print 
	public static void onlyHistoryOrderNumberprint () throws Exception
	{
		List<WebElement> historyOrderNumberList = driver.findElements(By.id("com.ubsidi:id/tvOrderNumber"));
		//`System.out.println(historyOrderNumberList.size());
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	

		//print Order details
		System.out.println("        - Order Number is : "+historyOrderNumberList.get(0).getText()+"\r\n");
		logs.info("        - Order Number is : "+historyOrderNumberList.get(0).getText());

		historyOrderNumberList.clear();

		//Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	


	}

	//only History Order type/tableName print 
	public static void onlyHistoryOrderTypeORtableNameprint() throws Exception
	{	//print order Type/table name
		List<WebElement> historyOrderTypeList = driver.findElements(By.id("com.ubsidi:id/tvTableNumber"));
		//print Order 
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	

		System.out.println("        - Order type/Table is : "+historyOrderTypeList.get(0).getText());
		logs.info("        - Order type/Table is : "+historyOrderTypeList.get(0).getText());
		historyOrderTypeList.clear();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	
		//Thread.sleep(1000);

	}


	//only Click on Order History order 
	public static void onlyClickOnOrderHistoryOrder() throws Exception
	{	
		//click on Latest firstOne order
		List<WebElement> historyOrderNumberList = driver.findElements(By.id("com.ubsidi:id/tvOrderNumber"));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	
		
        String orderWhichIsGoingToBeClicked = historyOrderNumberList.get(0).getText();
        
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	

		//Open Order
		historyOrderNumberList.get(0).click();
		
		System.out.println(" - "+ orderWhichIsGoingToBeClicked +" is Opening Now..."+"\r\n");
		logs.info(" - "+ orderWhichIsGoingToBeClicked +" is Opening Now...");

		historyOrderNumberList.clear();

		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}	

	
	
	

	//Only Print Button Click
	public static void onlyPrintButtonClick() throws Exception
	{
		//Click on print button
		List<WebElement> sendPrintDiscSplit2 = driver.findElements(By.id("com.ubsidi:id/tvMenu"));
		//Click on print button
		sendPrintDiscSplit2.get(1).click();	
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	

	}


	//Only pay By Cash btn Click
	public static void onlyPayByCashBtnClick() throws InterruptedException
	{
		//click on pay by cash button
		String payByCashBtnText = driver.findElement(By.id("com.ubsidi:id/btnCash")).getText();
		
		driver.findElement(By.id("com.ubsidi:id/btnCash")).click();
		
		System.out.println(" - "+ payByCashBtnText +" is Clicked..."+"\r\n");
		logs.info(" - "+ payByCashBtnText +" is Clicked...");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	}
//back History ToHome
	public static void backHistoryToHome() throws InterruptedException 
	{	
		Thread.sleep(4000);  //there needs forcefully stop
		
		driver.findElement(By.id("com.ubsidi:id/chipBack")).click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Thread.sleep(5000);  //there needs forcefully stop
	}


	public static void selectStanwixFoodItems() throws Exception
	{
		try {

			//locate element everytime before use it.  warna kam nhi karega.
			System.out.println(" - Selected food Items ");
			logs.info(" - Selected food Items ");

			List<WebElement> tableFoodItemsList1 = driver.findElements(By.id("com.ubsidi:id/tvProduct"));
			System.out.println("   1. "+tableFoodItemsList1.get(0).getText());
			logs.info("   1. "+tableFoodItemsList1.get(0).getText());
			tableFoodItemsList1.get(0).click();
			Thread.sleep(1000);
			List<WebElement> tableFoodItemsList2 = driver.findElements(By.id("com.ubsidi:id/tvProduct"));
			System.out.println("   2. "+tableFoodItemsList2.get(1).getText());
			logs.info("   2. "+tableFoodItemsList2.get(1).getText());
			tableFoodItemsList2.get(1).click();
			Thread.sleep(1000);

			List<WebElement> tableFoodItemsList3 = driver.findElements(By.id("com.ubsidi:id/tvProduct"));
			System.out.println("   3. "+tableFoodItemsList3.get(2).getText());
			logs.info("   3. "+tableFoodItemsList3.get(2).getText());
			tableFoodItemsList3.get(2).click();
			Thread.sleep(1000);

			List<WebElement> tableFoodItemsList4 = driver.findElements(By.id("com.ubsidi:id/tvProduct"));
			System.out.println("   4. "+tableFoodItemsList4.get(3).getText());
			logs.info("   4. "+tableFoodItemsList4.get(3).getText());
			tableFoodItemsList4.get(3).click();
			Thread.sleep(1000);

			List<WebElement> tableFoodItemsList5 = driver.findElements(By.id("com.ubsidi:id/tvProduct"));
			System.out.println("   5. "+tableFoodItemsList5.get(4).getText());
			logs.info("   5. "+tableFoodItemsList5.get(4).getText());
			tableFoodItemsList5.get(4).click();
			Thread.sleep(1000);

			List<WebElement> tableFoodItemsList6 = driver.findElements(By.id("com.ubsidi:id/tvProduct"));
			//System.out.println("   6. "+tableFoodItemsList6.get(14).getText());
			tableFoodItemsList6.get(5).click();
			Thread.sleep(1000);

			List<WebElement> tableFoodItemsList7 = driver.findElements(By.id("com.ubsidi:id/tvProduct"));
			System.out.println("   6. 2 X "+tableFoodItemsList7.get(5).getText()+"\r\n");
			logs.info("   6. 2 X "+tableFoodItemsList7.get(5).getText()+"\r\n");
			tableFoodItemsList7.get(5).click();

			//Print Total
			System.out.println(" - Total is : "+ driver.findElement(By.id("com.ubsidi:id/tvGrandTotal")).getText()+"\r\n");
			logs.info(" - SubTotal is : "+ driver.findElement(By.id("com.ubsidi:id/tvGrandTotal")).getText()+"\r\n");
		}
		catch(Exception e)
		{

			//When an exception is chained, the getCause method is used to get the original cause. 
			System.out.println("Cause is : "+e.getCause());
			System.out.println("Message is : "+e.getMessage());
			e.printStackTrace();
		}
	}





}
