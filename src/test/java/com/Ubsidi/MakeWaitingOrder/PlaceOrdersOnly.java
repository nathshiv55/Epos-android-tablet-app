package com.Ubsidi.MakeWaitingOrder;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Ubsidi.BasePackage.BaseInit1;
import com.Ubsidi.DefaultPackage.DefaultMethods;
import com.Ubsidi.DefaultPackage.MyScreenRecorder;
import com.Ubsidi.Utility.MyLibrary;
import com.Ubsidi.Utility.MyLibraryAdvance;
import com.Ubsidi.Utility.NewMyLibrary;

public class PlaceOrdersOnly extends BaseInit1{

	@BeforeClass
	public void setUp() throws Exception
	{
		startUp1();
		//Thread.sleep(2000);	 

	}
	
	@Test(priority=1 ,groups = "group1")     // recording start aur sto-p method ko same group me rakha hai taki , iske bich wale Test fail hone par stop chalegaa hi chalega.
	public void startScreenRecordings1() throws Exception
	{
		
		//iss method ko call karne se pahale DefaultPackage ki sabhi class ko import ke le.  import com.Ubsidi.DefaultPackage.*;
     MyScreenRecorder.startRecording("EposTest");    //argument me video ka name kya rakhana hai , wo dena hai.
     System.out.println(" - ScreenRecording started.");
	}
	
	@Test(priority=2 ,groups = "group1")
	public void repeatTests() throws Exception 
	{
		//print date time
		DefaultMethods.printLocalDateTime();

		String stringNoOfOrders = appdata.getProperty("Waiting_No_Of_Orders");
		//Print Total No. of Orders
		System.out.println("\r\n"+"       »»——⍟——«« Total No. of orders : "+stringNoOfOrders+" »»——⍟——««\r\n");
		//convert string into integer
		int intNoOforders = Integer.parseInt(stringNoOfOrders);

		for (int wai = 1; wai <= intNoOforders ; wai++)
		{
			//print date time
			DefaultMethods.printLocalDateTime();

			System.out.println(" Order No. : "+wai+"\r\n");
			logs.info(" Order No. : "+wai);
			
			//new order button click
			NewMyLibrary.onlyNewOrderButtonClickActionsByTapCoordinate();
			
			//click on waiting 
			MyLibraryAdvance.onlyClickOnWaiting();

			//fill waiting cutomer details 
			MyLibraryAdvance.waitingCustomerDetails();
			
			
			
			//select food items
			System.out.println(" - Selected food Items ");
			logs.info(" - Selected food Items ");
			NewMyLibrary.selectFoodItemsByCallMehtodByCoordinateWithFakeData(1);
			NewMyLibrary.selectFoodItemsByCallMehtodByCoordinateWithFakeData(2);
			NewMyLibrary.selectFoodItemsByCallMehtodByCoordinateWithFakeData(3);
			
			NewMyLibrary.printItemsPriceTotal();	
			NewMyLibrary.calculateItemsTotal();
			
			
			
			MyLibrary.sendOrderButtonClick();

			MyLibrary.sendFullOrder(); 


			
			
		}
	}		
			@Test(priority=3 ,groups = "group1")
			public void stopScreenRecording1() throws Exception
			{

				MyScreenRecorder.stopRecording();
			     System.out.println(" - ScreenRecording  ended.");

				
			}
			
			
			@AfterClass(enabled=false)
			public void tearDown()
			{
				MyLibrary.appClosed();
			}


}
