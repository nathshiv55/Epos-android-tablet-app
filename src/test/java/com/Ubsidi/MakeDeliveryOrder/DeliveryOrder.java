package com.Ubsidi.MakeDeliveryOrder;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Ubsidi.BasePackage.BaseInit;
import com.Ubsidi.BasePackage.BaseInit1;
import com.Ubsidi.Utility.MyLibrary;
import com.Ubsidi.Utility.MyLibraryforNewOrder;

public class DeliveryOrder extends BaseInit {

	@BeforeClass
	public void setUp() throws Exception
	{
		startUp();
	}
	@Test
	public void repeatTests() throws Exception 
	{
		String stringNoOfOrders = appdata.getProperty("Delivery_No_Of_Orders");
		//Print Total No. of Orders
		System.out.println("\r\n"+" <======>🛢️ Total No. of orders : "+stringNoOfOrders+" <======>\r\n");
		//convert string into integer
		int intNoOforders = Integer.parseInt(stringNoOfOrders);

		for (int del = 1; del <= intNoOforders ; del++)
			
          {
			
			System.out.println(" Order No. : "+del+"\r\n");

			
		MyLibrary.newOrderDelivery();

		MyLibrary.selectTableFoodItems();

		//MyLibrary.discountButtonClick();
	//	MyLibrary.percentageDiscount();
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
