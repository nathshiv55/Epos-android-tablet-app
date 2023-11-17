package com.Ubsidi.MakeWaitingOrder;

import com.Ubsidi.DefaultPackage.*;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Ubsidi.BasePackage.BaseInit;
import com.Ubsidi.BasePackage.BaseInit1;
import com.Ubsidi.DefaultPackage.DefaultMethods;
import com.Ubsidi.Utility.MyLibrary;
import com.Ubsidi.Utility.MyLibraryAdvance;
import com.Ubsidi.Utility.MyLibraryforNewOrder;
import com.Ubsidi.Utility.NewMyLibrary;

public class StanwixWaitingOrderAdvance extends BaseInit1 {



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
			
			/*
			//new order button click
			try
			{
				try
				{
					try
					{
						NewMyLibrary.onlyNewOrderButtonClickActions();

					}
					catch(Exception e)
					{
						NewMyLibrary.onlyNewOrderButtonClickActions();
						System.out.println(" - 2nd time work...");	

					}

				}
				catch(Exception e1)
				{
					NewMyLibrary.onlyNewOrderButtonClickActions();
					System.out.println(" - 3nd time work...");	

				}

			}
			catch(Exception e2)
			{
				NewMyLibrary.onlyNewOrderButtonClickActions();
				System.out.println(" - 4nd time work...");	

			}	
*/
			//NewMyLibrary.onlyNewOrderButtonClickActionsTouch();
			NewMyLibrary.onlyNewOrderButtonClickActionsByTapCoordinate();

			//click on waiting 
			MyLibraryAdvance.onlyClickOnWaiting();

			//fill waiting cutomer details 
			MyLibraryAdvance.waitingCustomerDetails();


			//select food items
			System.out.println(" - Selected food Items ");
			logs.info(" - Selected food Items ");
			//MyLibraryAdvance.selectFoodItemsByCallMehtod(1, 0);
			//MyLibraryAdvance.selectFoodItemsByCallMehtod(2, 1);
			//NewMyLibrary.selectFoodItemsByCallMehtodByCoordinate(1, 0);
			//NewMyLibrary.selectFoodItemsByCallMehtodByCoordinate(2, 1);
			//MyLibraryAdvance.selectFoodItemsByCallMehtod(3, 2);
			//MyLibraryAdvance.selectFoodItemsByCallMehtod(4, 3);
			//MyLibraryAdvance.selectFoodItemsByCallMehtod(5, 4);
			
			NewMyLibrary.selectFoodItemsByCallMehtodByCoordinateWithFakeData(1);
			NewMyLibrary.selectFoodItemsByCallMehtodByCoordinateWithFakeData(2);
			NewMyLibrary.selectFoodItemsByCallMehtodByCoordinateWithFakeData(3);
			

			NewMyLibrary.printItemsPriceTotal();	
			NewMyLibrary.calculateItemsTotal();
			

			//send Order Button click
			try
			{
				try
				{
					try
					{
						MyLibrary.sendOrderButtonClick();

					}
					catch(Exception e)
					{
						MyLibrary.sendOrderButtonClick();
						System.out.println(" - 2nd time work...");	


					}

				}
				catch(Exception e1)
				{
					MyLibrary.sendOrderButtonClick();
					System.out.println(" - 3nd time work...");	

				}

			}
			catch(Exception e2)
			{
				MyLibrary.sendOrderButtonClick();
				System.out.println(" - 4nd time work...");	

			}	

			//Send full order
			try
			{
				try
				{
					try
					{
						MyLibrary.sendFullOrder(); 

					}
					catch(Exception e)
					{
						MyLibrary.sendFullOrder(); 
						System.out.println(" - 2nd time work...");	

					}

				}
				catch(Exception e1)
				{
					MyLibrary.sendFullOrder(); 
					System.out.println(" - 3nd time work...");	

				}

			}
			catch(Exception e2)
			{
				MyLibrary.sendFullOrder(); 
				System.out.println(" - 4nd time work...");	

			}	
			/*
			//only Order History Button Click
			try
			{
				try
				{
					try
					{
						MyLibraryAdvance.onlyOrderHistoryButtonClick();

					}
					catch(Exception e)
					{
						MyLibraryAdvance.onlyOrderHistoryButtonClick();
						System.out.println(" - 2nd time work...");	

					}

				}
				catch(Exception e1)
				{
					MyLibraryAdvance.onlyOrderHistoryButtonClick();
					System.out.println(" - 3nd time work...");	

				}

			}
			catch(Exception e2)
			{
				MyLibraryAdvance.onlyOrderHistoryButtonClick();
				System.out.println(" - 4nd time work...");	

			}	
			 */

			//NewMyLibrary.onlyOrderHistoryButtonClickJavascript();
			NewMyLibrary.onlyOrderHistoryButtonClickByCoordinateOnly();


			/*		



      //only History Order Number print
			try
			{
				try
				{
					try
					{
						MyLibraryAdvance.onlyHistoryOrderNumberprint();

					}
					catch(Exception e)
					{
						MyLibraryAdvance.onlyHistoryOrderNumberprint();
						System.out.println(" - 2nd time work...");	

					}

				}
				catch(Exception e1)
				{
					MyLibraryAdvance.onlyHistoryOrderNumberprint();
					System.out.println(" - 3nd time work...");	

				}

			}
			catch(Exception e2)
			{
				MyLibraryAdvance.onlyHistoryOrderNumberprint();
				System.out.println(" - 4nd time work...");	

			}	


			//only History Order Type OR table Name print
			try
			{
				try
				{
					try
					{
						MyLibraryAdvance.onlyHistoryOrderTypeORtableNameprint();

					}
					catch(Exception e)
					{
						MyLibraryAdvance.onlyHistoryOrderTypeORtableNameprint();
						System.out.println(" - 2nd time work...");	

					}

				}
				catch(Exception e1)
				{
					MyLibraryAdvance.onlyHistoryOrderTypeORtableNameprint();
					System.out.println(" - 3nd time work...");	

				}

			}
			catch(Exception e2)
			{
				MyLibraryAdvance.onlyHistoryOrderTypeORtableNameprint();
				System.out.println(" - 4nd time work...");	

			}	
			 */	
			//only Click OnOrder History Order

			/*
			try
			{
				try
				{
					try
					{
						MyLibraryAdvance.onlyClickOnOrderHistoryOrder();

					}
					catch(Exception e)
					{
						MyLibraryAdvance.onlyClickOnOrderHistoryOrder();
						System.out.println(" - 2nd time work...");	

					}

				}
				catch(Exception e1)
				{
					MyLibraryAdvance.onlyClickOnOrderHistoryOrder();
					System.out.println(" - 3nd time work...");	

				}

			}
			catch(Exception e2)
			{
				MyLibraryAdvance.onlyClickOnOrderHistoryOrder();
				System.out.println(" - 4nd time work...");	

			}	
			 */
			//NewMyLibrary.onlyClickOnOrderHistoryOrderActions();
			
			//NewMyLibrary.onlyClickOnOrderHistoryOrderByCoordinateOnly();
			NewMyLibrary.clickOnOrderByJavascriptExecutor();
			
			
			//only Pay By Cash Btn Click 
			try
			{
				try
				{
					try
					{
						//MyLibraryAdvance.onlyPayByCashBtnClick();
						NewMyLibrary.onlyPayByCashBtnClickByCoordinate();
					}
					catch(Exception e)
					{
						//MyLibraryAdvance.onlyPayByCashBtnClick();
						NewMyLibrary.onlyPayByCashBtnClickByCoordinate();

						System.out.println(" - 2nd time work...");	

					}

				}
				catch(Exception e1)
				{
					//MyLibraryAdvance.onlyPayByCashBtnClick();
					NewMyLibrary.onlyPayByCashBtnClickByCoordinate();

					System.out.println(" - 3nd time work...");	

				}

			}
			catch(Exception e2)
			{
				//MyLibraryAdvance.onlyPayByCashBtnClick();
				NewMyLibrary.onlyPayByCashBtnClickByCoordinate();

				System.out.println(" - 4nd time work...");	

			}

			//full payment
			try
			{
				try
				{
					try
					{
						MyLibrary.fullPayment();

					}
					catch(Exception e)
					{
						MyLibrary.fullPayment();
						System.out.println(" - 2nd time work...");	

					}

				}
				catch(Exception e1)
				{
					MyLibrary.fullPayment();
					System.out.println(" - 3nd time work...");	

				}

			}
			catch(Exception e2)
			{
				MyLibrary.fullPayment();
				System.out.println(" - 4nd time work...");	

			}

			//back history to home
			//MyLibraryAdvance.backPaymentToHome();
			try {
				try {
					//MyLibraryAdvance.backHistoryToHome();
					NewMyLibrary.backHistoryToHomeByCoordinate();
				}
				catch(Exception e)
				{
					//MyLibraryAdvance.backHistoryToHome();
					NewMyLibrary.backHistoryToHomeByCoordinate();
				}
			}
			catch(Exception e2)
			{
				System.out.println("searching for new order button");
			
			}



		}
	}

	
	@Test(priority=3 ,groups = "group1")
	public void stopScreenRecording1() throws Exception
	{

		MyScreenRecorder.stopRecording();
	     System.out.println(" - ScreenRecording  ended.");

		
	}
	
	
	@AfterClass(enabled=false)
	public  void tearDown()
	{
		MyLibrary.appClosed();
	}

}
