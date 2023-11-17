package com.Ubsidi.MakeTableOrder;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Ubsidi.BasePackage.BaseInit;
import com.Ubsidi.Utility.MyLibrary;

public class TableOrder extends BaseInit {

	@BeforeClass
	public void setUp() throws Exception
	{
		startUp();
		//Thread.sleep(2000);
	}
	
	@Test(priority =1)
	public void repeatTests() throws Exception 
	{
		
		String stringNoOfOrders = appdata.getProperty("noOfOrders");
		//Print Total No. of Orders
		System.out.println("\r\n"+" <======> Total No. of orders : "+stringNoOfOrders+" <======>\r\n");
		//convert string into integer
		int intNoOforders = Integer.parseInt(stringNoOfOrders);

		for (i = 0; i <intNoOforders ; i++) 
			
		{
			MyLibrary.chooseATable();
			MyLibrary.newTableCustomerDetails();
			MyLibrary.selectTableFoodItems();
			
			MyLibrary.discountButtonClick();
			//MyLibrary.percentageDiscount();
			MyLibrary.FlatDiscount();
			
			MyLibrary.sendOrderButtonClick();
			MyLibrary.sendFullOrder(); 
			
			MyLibrary.printButtonClick();
			MyLibrary.printAllbutton();
			
			MyLibrary.printButtonClick();
			MyLibrary.printBillButton();
			
			//MyLibrary.splitBill();
			//MyLibrary.splitPersonEnterAmountPayment();
			//MyLibrary.splitPersonFullPayment();
			
			MyLibrary.payByCash();
			MyLibrary.fullPayment();
			//MyLibrary.enterAmountPayment();
		}
	}
		
	@AfterClass(enabled = false)
	public  void tearDown()
	{
		MyLibrary.appClosed();
	}
}
