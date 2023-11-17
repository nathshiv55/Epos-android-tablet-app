package com.Ubsidi.MakeWaitingOrder;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Ubsidi.Analyzer.MyRetry;
import com.Ubsidi.BasePackage.BaseInit;
import com.Ubsidi.BasePackage.BaseInit1;
import com.Ubsidi.Utility.MyLibrary;
import com.Ubsidi.Utility.MyLibraryAdvance;
import com.Ubsidi.Utility.MyLibraryforNewOrder;

public class StanwixWaitingOrder extends BaseInit1 {



	@BeforeClass
	public void setUp() throws Exception
	{
		startUp1();
		//Thread.sleep(2000);
	}
	 @Test
	public void repeatTests() throws Exception 
	{
		String stringNoOfOrders = appdata.getProperty("Waiting_No_Of_Orders");
		//Print Total No. of Orders
		System.out.println("\r\n"+"       »»——⍟——«« Total No. of orders : "+stringNoOfOrders+" »»——⍟——««\r\n");
		//convert string into integer
		int intNoOforders = Integer.parseInt(stringNoOfOrders);

		for (int wai = 1; wai <= intNoOforders ; wai++)
		{

			System.out.println(" Order No. : "+wai+"\r\n");
			logs.info(" Order No. : "+wai);

			MyLibraryforNewOrder.onlyNewOrderButtonClick();
			MyLibrary.newOrderWaiting();

			//MyLibrary.selectTableFoodItems();
			
			//MyLibraryforNewOrder.selectStanwixFoodItems();
			
			System.out.println(" - Selected food Items ");
			logs.info(" - Selected food Items ");
			MyLibraryAdvance.selectFoodItemsByCallMehtod(1, 0);
			MyLibraryAdvance.selectFoodItemsByCallMehtod(2, 1);
			MyLibraryAdvance.selectFoodItemsByCallMehtod(3, 2);
			MyLibraryAdvance.selectFoodItemsByCallMehtod(4, 3);
			MyLibraryAdvance.selectFoodItemsByCallMehtod(5, 4);

			//MyLibrary.discountButtonClick();
			//MyLibrary.percentageDiscount();
			//MyLibrary.FlatDiscount();

			MyLibrary.sendOrderButtonClick();
			MyLibrary.sendFullOrder(); 
			//MyLibrary.sendDuplicateFullOrder();
			//MyLibrary.sendOrderUpdate();
			//MyLibrary.sendDuplicateOrderUpdate();

			//MyLibraryforNewOrder.openLatestOrderFromOrderHistory();

			//MyLibraryforNewOrder.onlyPrintButtonClick();
			//MyLibrary.printAllbutton();

			//MyLibraryforNewOrder.openLatestOrderFromOrderHistory();


			//MyLibraryforNewOrder.onlyPrintButtonClick();
			//MyLibrary.printBillButton();

			//MyLibraryforNewOrder.openLatestOrderFromOrderHistory();

			//MyLibrary.splitBill();
			//MyLibrary.splitPersonEnterAmountPayment();
			//MyLibrary.splitPersonFullPayment();

			//MyLibraryforNewOrder.openLatestOrderFromOrderHistory();
			MyLibraryforNewOrder.onlyOrderHistoryButtonClick();

			//MyLibraryforNewOrder.onlyOrderHistoryOrderOpen();
			MyLibraryforNewOrder.onlyHistoryOrderNumberprint();
			MyLibraryforNewOrder.onlyHistoryOrderTypeORtableNameprint();
			MyLibraryforNewOrder.onlyClickOnOrderHistoryOrder();

			MyLibraryforNewOrder.onlyPayByCashBtnClick();
			MyLibrary.fullPayment();

			MyLibraryforNewOrder.backHistoryToHome();


			//MyLibraryforNewOrder.openLatestOrderFromOrderHistory();

			//MyLibraryforNewOrder.onlyPayByCashBtnClick();
			//MyLibrary.enterAmountPayment();
		}
	}

	@AfterClass(enabled=false)
	public  void tearDown()
	{
		MyLibrary.appClosed();
	}

}
