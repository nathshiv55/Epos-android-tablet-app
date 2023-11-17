package com.Ubsidi.MakeTableOrder;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Ubsidi.BasePackage.BaseInit;
import com.Ubsidi.Utility.MyLibrary;
import com.Ubsidi.Utility.MyLibraryforNewOrder;

public class AllOrderFirstPayLater extends BaseInit {

	@BeforeClass
	public void setUp() throws Exception
	{
		startUp();
		//Thread.sleep(2000);
	}

	@Test(priority =1)
	public void repeatTestsForOrder() throws Exception 
	{

		String stringNoOfOrders = appdata.getProperty("noOfOrders");
		//Print Total No. of Orders
		System.out.println("\r\n"+" <======> Total No. of orders : "+stringNoOfOrders+" <======>\r\n");
		//convert string into integer
		int intNoOforders = Integer.parseInt(stringNoOfOrders);

		for (i = 0; i <intNoOforders ; i++)
		{
			System.out.println("          - Orders...\r\n");
			logs.info("          - Orders...");
			MyLibrary.chooseATable();
			MyLibrary.newTableCustomerDetails();
			MyLibrary.selectTableFoodItems();

			MyLibrary.discountButtonClick();
			//MyLibrary.percentageDiscount();
			MyLibrary.FlatDiscount();

			MyLibrary.sendOrderButtonClick();
			MyLibrary.sendFullOrder(); 

			//MyLibrary.printButtonClick();
			//MyLibrary.printAllbutton();

			//MyLibrary.printButtonClick();
			//MyLibrary.printBillButton();

			//MyLibrary.splitBill();
			//MyLibrary.splitPersonEnterAmountPayment();
			//MyLibrary.splitPersonFullPayment();

			//MyLibrary.payByCash();
			//MyLibrary.fullPayment();
			//MyLibrary.enterAmountPayment();
		}
	}


	@Test(priority =2)
	public void repeatTestsForPayment() throws Exception 
	{
		System.out.println("       - Payment ...\r\n");
		logs.info("          - Payment...");
		String stringNoOfOrders = appdata.getProperty("noOfOrders");
		//Print Total No. of Orders
		System.out.println("\r\n"+" <======> Total No. of orders : "+stringNoOfOrders+" <======>\r\n");
		//convert string into integer
		int intNoOforders = Integer.parseInt(stringNoOfOrders);

		for (i = 0; i <intNoOforders ; i++)
		{

			MyLibrary.chooseATable();
			//MyLibrary.newTableCustomerDetails();
			//MyLibrary.selectTableFoodItems();

			//MyLibrary.discountButtonClick();
			//MyLibrary.percentageDiscount();
			//MyLibrary.FlatDiscount();

			//MyLibrary.sendOrderButtonClick();
			//MyLibrary.sendFullOrder(); 

			//MyLibrary.printButtonClick();
			//MyLibrary.printAllbutton();

			//MyLibrary.printButtonClick();
			//MyLibrary.printBillButton();

			//MyLibrary.splitBill();
			//MyLibrary.splitPersonEnterAmountPayment();
			//MyLibrary.splitPersonFullPayment();

			//MyLibrary.payByCash()
			MyLibraryforNewOrder.onlyPayByCashBtnClick();
			MyLibrary.fullPayment();
			//MyLibrary.enterAmountPayment();
		}	
	}


	@Test(priority =3,invocationCount = 1, enabled = true)
	public void repeatAgain() throws Exception 
	{
		Thread.sleep(3000);
		repeatTestsForOrder();
		repeatTestsForPayment();
			
	}
	@AfterClass(enabled = false)
	public  void tearDown()
	{
		MyLibrary.appClosed();

	}
}
