package com.Ubsidi.MakeWaitingOrder;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Ubsidi.BasePackage.BaseInit;
import com.Ubsidi.Utility.MyLibrary;
import com.Ubsidi.Utility.MyLibraryforNewOrder;

public class WaitingOrder extends BaseInit {


	@BeforeClass
	public void setUp() throws Exception
	{
		startUp();
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
			
		MyLibrary.newOrderWaiting();

		MyLibrary.selectTableFoodItems();

		MyLibrary.discountButtonClick();
		MyLibrary.percentageDiscount();
		//MyLibrary.FlatDiscount();
		
		MyLibrary.sendOrderButtonClick();
		MyLibrary.sendFullOrder(); 
		//MyLibrary.sendDuplicateFullOrder();
		//MyLibrary.sendOrderUpdate();
		//MyLibrary.sendDuplicateOrderUpdate();

		MyLibraryforNewOrder.openLatestOrderFromOrderHistory();
		
		MyLibraryforNewOrder.onlyPrintButtonClick();
		MyLibrary.printAllbutton();
		
		MyLibraryforNewOrder.openLatestOrderFromOrderHistory();

		
		MyLibraryforNewOrder.onlyPrintButtonClick();
		MyLibrary.printBillButton();
			
		//MyLibraryforNewOrder.openLatestOrderFromOrderHistory();
	
		//MyLibrary.splitBill();
		//MyLibrary.splitPersonEnterAmountPayment();
		//MyLibrary.splitPersonFullPayment();
		
		MyLibraryforNewOrder.openLatestOrderFromOrderHistory();

		MyLibraryforNewOrder.onlyPayByCashBtnClick();
		MyLibrary.fullPayment();
		
		MyLibraryforNewOrder.backHistoryToHome();

		
		//MyLibraryforNewOrder.openLatestOrderFromOrderHistory();

		//MyLibraryforNewOrder.onlyPayByCashBtnClick();
		//MyLibrary.enterAmountPayment();
		}
	}

	@AfterClass
	public  void tearDown()
	{
		MyLibrary.appClosed();
	}
}
