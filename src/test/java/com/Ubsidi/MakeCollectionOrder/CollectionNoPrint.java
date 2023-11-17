package com.Ubsidi.MakeCollectionOrder;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Ubsidi.BasePackage.BaseInit;
import com.Ubsidi.BasePackage.BaseInit1;
import com.Ubsidi.DefaultPackage.DefaultMethods;
import com.Ubsidi.DefaultPackage.MyScreenRecorder;
import com.Ubsidi.Listeners.TestNGListeners;
import com.Ubsidi.Utility.GenerateExtentReports;
import com.Ubsidi.Utility.MyLibrary;
import com.Ubsidi.Utility.MyLibraryAdvance;
import com.Ubsidi.Utility.MyLibraryforNewOrder;
import com.Ubsidi.Utility.NewMyLibrary;
import com.aventstack.extentreports.Status;

@Listeners(TestNGListeners.class)        //bracket ke inside uss class ka name jisame , listeners ke method hai with .class
public class CollectionNoPrint extends BaseInit1{
	
	@BeforeSuite( enabled = true, groups = "Extent reports")
	public void reportsStart() throws Exception
	{
		GenerateExtentReports.testGenerateReports();
		System.out.println("Generate extent report started...");
		
	}
	
	@BeforeClass(groups = "group1")
	public void setUp() throws Exception
	{
		startUp1();
	}

	@Test(priority=1 ,groups = "group1")     // recording start aur sto-p method ko same group me rakha hai taki , iske bich wale Test fail hone par stop chalegaa hi chalega.
	public void startScreenRecordings1() throws Exception
	{

		//iss method ko call karne se pahale DefaultPackage ki sabhi class ko import ke le.  import com.Ubsidi.DefaultPackage.*;
		MyScreenRecorder.startRecording("EposTest");    //argument me video ka name kya rakhana hai , wo dena hai.
		System.out.println(" - ScreenRecording started...");
	}



	@Test(priority=2 ,groups = "group1")
	public void repeatTests() throws Exception 
	{
	     test = report.createTest(this.getClass().getName());  
	     test.log(Status.INFO, " Orders will start in some time");
	     
		//print date time
		DefaultMethods.printLocalDateTime();

		String stringNoOfOrders = appdata.getProperty("Collection_No_Of_Orders");
		
	    test.log(Status.INFO, "Total Orders Limit :"+stringNoOfOrders);

		//Print Total No. of Orders
		System.out.println("\r\n"+" <======>🛢️ Total No. of orders : "+stringNoOfOrders+" <======>\r\n");
		//convert string into integer
		int intNoOforders = Integer.parseInt(stringNoOfOrders);

		for (int coll = 1; coll <=intNoOforders ; coll++)

		{

			//print date time
			DefaultMethods.printLocalDateTime();

			System.out.println("order no. : "+coll+"\r\n");
			logs.info("order no. : "+coll);

			//new order button click
			NewMyLibrary.onlyNewOrderButtonClickActionsByTapCoordinate();


			//click on Collection
			MyLibraryAdvance.onlyClickOnCollection();

			//fill Collection cutomer details 
			//MyLibraryAdvance.CollectionCustomerDetails();
			MyLibraryAdvance.CollectionCustomerDetailsWithFakeData();
			

			//select food items
			System.out.println(" - Selected food Items ");
			logs.info(" - Selected food Items ");
			//NewMyLibrary.selectFoodItemsByCallMehtodByCoordinate(1, 0);
			//NewMyLibrary.selectFoodItemsByCallMehtodByCoordinate(2, 1);
			NewMyLibrary.changeCategory("Tandoori Mains");
			NewMyLibrary.selectFoodItemsByCallMehtodByCoordinateWithFakeData(1);
			NewMyLibrary.changeCategory("Balti Dishes");
			NewMyLibrary.selectFoodItemsByCallMehtodByCoordinateWithFakeData(2);
			NewMyLibrary.changeCategory("Biryani Dishes");
			NewMyLibrary.selectFoodItemsByCallMehtodByCoordinateWithFakeData(3);
			NewMyLibrary.changeCategory("Rices");
			NewMyLibrary.selectFoodItemsByCallMehtodByCoordinateWithFakeData(4);
			
			//print items price total
			NewMyLibrary.printItemsPriceTotal();

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


			//only Order History Button Click
			NewMyLibrary.onlyOrderHistoryButtonClickByCoordinateOnly();

			//only Click OnOrder History Order
			NewMyLibrary.onlyClickOnOrderHistoryOrderByCoordinateOnly();

			
			//print items price total
			NewMyLibrary.printItemsPriceTotal();

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
			
			Thread.sleep(3000);
			DefaultMethods.PullDownRefreshExample();
			Thread.sleep(3000);
			NewMyLibrary.openPaidOrderFromOrderHistory();
			
			

			//back history to home
			try {
				try {
					NewMyLibrary.backHistoryToHomeByCoordinate();
				}
				catch(Exception e)
				{
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
		System.out.println(" - ScreenRecording  ended...");


	}


	@AfterSuite( enabled = true, groups = "Extent reports")
	public void reportsEnd() throws Exception
	{
		GenerateExtentReports.testGenerateReportsEnd();
		System.out.println("Extent report generated successfully...");

		
	}
	
	
	
	@AfterClass(enabled=false)
	public  void tearDown()
	{
		MyLibrary.appClosed();
	}


}
