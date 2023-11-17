package com.Ubsidi.Utility;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Ubsidi.BasePackage.BaseInit;
import com.Ubsidi.BasePackage.BaseInit1;
import com.Ubsidi.DefaultPackage.DefaultMethods;

import io.appium.java_client.AppiumBy;

public class MyLibrary extends BaseInit1 {

	//choose A Table
	public static void chooseATable() throws InterruptedException, NumberFormatException
	{
		/*
      //Scroll down
		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
				+ ".scrollIntoView(new UiSelector()" + ".textMatches(\"" + "Table 9a" + "\").instance(0))"));  //enter text in this lines where you want to go.
		 */

		List<WebElement> tablesList = driver.findElements(By.id("com.ubsidi:id/tvTable"));
		//print Order Number
		int ton=i+1;
		System.out.println("          >>>>> Table Order No. : "+ton+"\r\n");
		logs.info("          >>>>> Table Order No. : "+ton+"\r\n");
		//print table name
		System.out.println(" - Selected table is : " + tablesList.get(i).getText()+"\r\n");
		logs.info(" - Selected table is : " + tablesList.get(i).getText()+"\r\n");
		//Click on table index 	
		tablesList.get(i).click();
		//Clear tableslist
		tablesList.clear();
		
		Thread.sleep(2000);	
	}

	//new Table Customer Details
	public static void newTableCustomerDetails() throws Exception
	{
		//name
		System.out.println(" - Table Customer Details");
		logs.info(" - Table Customer Details");
		driver.findElement(By.id("com.ubsidi:id/etName")).sendKeys(appdata.getProperty("nameT"));
		System.out.println("   Name : "+appdata.getProperty("nameT"));
		logs.info("   Name : "+appdata.getProperty("nameT"));
		//email
		driver.findElement(By.id("com.ubsidi:id/etEmail")).sendKeys(appdata.getProperty("emailAddressT"));
		System.out.println("   Email Address : "+appdata.getProperty("emailAddressT"));
		logs.info("   Email Address : "+appdata.getProperty("emailAddressT"));
		//Contact no.
		driver.findElement(By.id("com.ubsidi:id/etMobile")).sendKeys(appdata.getProperty("ContactNumberT"));
		System.out.println("   Contact No. : "+appdata.getProperty("ContactNumberT")+"\r\n");
		logs.info("   Contact No. : "+appdata.getProperty("ContactNumberT")+"\r\n");
		//No of diners 3
		String stringNoOfDiners = appdata.getProperty("NoOfDiners");
		//Print No. of Diners
		System.out.println("   No. of diners : "+stringNoOfDiners+"\r\n");
		logs.info("   No. of diners : "+stringNoOfDiners+"\r\n");
		//convert string into integer
		int intNoOfDiners = Integer.parseInt(stringNoOfDiners); 
		for(int count =1;count<intNoOfDiners;count++)
		{
			driver.findElement(By.id("com.ubsidi:id/ivSecIncrease")).click();
		}		
		//SignUp for newsletter 
		WebElement newsLetterTick = driver.findElement(By.id("com.ubsidi:id/signupForNewsletter"));
		System.out.println("   "+newsLetterTick.getText()+" : ✔️\r\n");
		logs.info("   "+newsLetterTick.getText()+" : ✔️\r\n");
		newsLetterTick.click();
		//Click on Confirm 
		driver.findElement(By.id("com.ubsidi:id/btnConfirm")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	//select Table Food Items
	public static void selectTableFoodItems() throws Exception
	{
		/*
		//All food items into a list
		List<WebElement> tableFoodItemsList = driver.findElements(By.id("com.ubsidi:id/tvProduct"));
		//Select food items
			tableFoodItemsList.get(0).click();	
			Thread.sleep(2000);	
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120, 1));
			tableFoodItemsList.get(6).click();
			Thread.sleep(2000);	
			tableFoodItemsList.get(7).click();
			Thread.sleep(2000);	
			tableFoodItemsList.get(8).click();
			Thread.sleep(2000);	
			tableFoodItemsList.get(11).click();
			Thread.sleep(2000);	

			System.out.println(" - Selected food Items ");
			System.out.println("   1. "+tableFoodItemsList.get(0).getText());
			System.out.println("   2. "+tableFoodItemsList.get(6).getText());
			System.out.println("   3. "+tableFoodItemsList.get(7).getText());
			System.out.println("   4. "+tableFoodItemsList.get(8).getText());
			System.out.println("   5. "+tableFoodItemsList.get(11).getText());
		 */

		//locate element everytime before use it.  warna kam nhi karega.
		System.out.println(" - Selected food Items ");
		logs.info(" - Selected food Items ");
		
		List<WebElement> tableFoodItemsList1 = driver.findElements(By.id("com.ubsidi:id/tvProduct"));
		System.out.println("   1. "+tableFoodItemsList1.get(0).getText());
		logs.info("   1. "+tableFoodItemsList1.get(0).getText());
		tableFoodItemsList1.get(0).click();
		
		Thread.sleep(1000);

		List<WebElement> tableFoodItemsList2 = driver.findElements(By.id("com.ubsidi:id/tvProduct"));
		System.out.println("   2. "+tableFoodItemsList2.get(6).getText());
		logs.info("   2. "+tableFoodItemsList2.get(6).getText());
		tableFoodItemsList2.get(6).click();

		Thread.sleep(1000);

		List<WebElement> tableFoodItemsList3 = driver.findElements(By.id("com.ubsidi:id/tvProduct"));
		System.out.println("   3. "+tableFoodItemsList3.get(7).getText());
		logs.info("   3. "+tableFoodItemsList3.get(7).getText());
		tableFoodItemsList3.get(7).click();
		
		Thread.sleep(1000);


		List<WebElement> tableFoodItemsList4 = driver.findElements(By.id("com.ubsidi:id/tvProduct"));
		System.out.println("   4. "+tableFoodItemsList4.get(8).getText());
		logs.info("   4. "+tableFoodItemsList4.get(8).getText());
		tableFoodItemsList4.get(8).click();
		
		Thread.sleep(1000);


		List<WebElement> tableFoodItemsList5 = driver.findElements(By.id("com.ubsidi:id/tvProduct"));
		System.out.println("   5. "+tableFoodItemsList5.get(11).getText());
		logs.info("   5. "+tableFoodItemsList5.get(11).getText());
		tableFoodItemsList5.get(11).click();
		
		Thread.sleep(1000);


		List<WebElement> tableFoodItemsList6 = driver.findElements(By.id("com.ubsidi:id/tvProduct"));
		//System.out.println("   6. "+tableFoodItemsList6.get(14).getText());
		tableFoodItemsList6.get(14).click();
		
		Thread.sleep(1000);

		List<WebElement> tableFoodItemsList7 = driver.findElements(By.id("com.ubsidi:id/tvProduct"));
		System.out.println("   6. 2 X "+tableFoodItemsList7.get(14).getText()+"\r\n");
		logs.info("   6. 2 X "+tableFoodItemsList7.get(14).getText()+"\r\n");
		tableFoodItemsList7.get(14).click();
		
		Thread.sleep(1000);
		
		//Print Total
		System.out.println(" - Total is : "+ driver.findElement(By.id("com.ubsidi:id/tvGrandTotal")).getText()+"\r\n");
		logs.info(" - Total is : "+ driver.findElement(By.id("com.ubsidi:id/tvGrandTotal")).getText()+"\r\n");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


	}



	//Send Order button click
	public static void sendOrderButtonClick() throws Exception
	{
		try {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("com.ubsidi:id/tvMenu")));
		List<WebElement> sendPrintDiscSplit1 = driver.findElements(By.id("com.ubsidi:id/tvMenu"));	
		//Click on Send button
		sendPrintDiscSplit1.get(0).click();
        System.out.println(" - Send order Button Clicked."+"\r\n");
        logs.info(" - Send order Button Clicked.");
		sendPrintDiscSplit1.clear();	
		//Thread.sleep(2000);
		}catch(NoSuchElementException e1) 

		{

			//take Screenshot
			DefaultMethods.getScreenShot( "UiBreaking101", driver);
			System.out.println("Error : Trying to 2nd time.... "+""+"NoSuchElementException");
			logs.info("Error : Trying to 2nd time.... "+""+"NoSuchElementException");
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("com.ubsidi:id/tvMenu")));
			List<WebElement> sendPrintDiscSplit1 = driver.findElements(By.id("com.ubsidi:id/tvMenu"));	
			//Click on Send button
			sendPrintDiscSplit1.get(0).click();
	        System.out.println(" - Send order Button Clicked."+"\r\n");
	        logs.info(" - Send order Button Clicked.");
			sendPrintDiscSplit1.clear();	
			//Thread.sleep(2000);
		}
		catch(TimeoutException e2)

		{

			//take Screenshot
			DefaultMethods.getScreenShot( "UiBreaking202", driver);
			System.out.println("Error : Trying to 2nd time.... "+"\r\n"+"TimeoutException");	
			logs.info("Error : Trying to 2nd time.... "+"\r\n"+"TimeoutException");

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("com.ubsidi:id/tvMenu")));
			List<WebElement> sendPrintDiscSplit1 = driver.findElements(By.id("com.ubsidi:id/tvMenu"));	
			//Click on Send button
			sendPrintDiscSplit1.get(0).click();
	        System.out.println(" - Send order Button Clicked."+"\r\n");
	        logs.info(" - Send order Button Clicked.");
			sendPrintDiscSplit1.clear();	
			//Thread.sleep(2000);
		}
		catch(StaleElementReferenceException e3)

		{
			//take Screenshot
			DefaultMethods.getScreenShot( "UiBreaking303", driver);
			System.out.println("Error : Trying to 2nd time.... "+"\r\n"+"StaleElementReferenceException");	
			logs.info("Error : Trying to 2nd time.... "+"\r\n"+"StaleElementReferenceException");

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("com.ubsidi:id/tvMenu")));
			List<WebElement> sendPrintDiscSplit1 = driver.findElements(By.id("com.ubsidi:id/tvMenu"));	
			//Click on Send button
			sendPrintDiscSplit1.get(0).click();
	        System.out.println(" - Send order Button Clicked."+"\r\n");
	        logs.info(" - Send order Button Clicked.");
			sendPrintDiscSplit1.clear();	
			//Thread.sleep(2000);

		}


	}

	//1. type of send order  = Send full order
	public static void sendFullOrder() throws Exception
	{
		try {

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.ubsidi:id/btnSendFullOrder")));
			WebElement sendFullOrderbtn = driver.findElement(By.id("com.ubsidi:id/btnSendFullOrder"));
			//Print order type
			//System.out.println("\r\n"+"     "+sendFullOrderbtn.getText()+"  : Done\r\n"+"\r\n");
			//logs.info("     "+sendFullOrderbtn.getText()+"  : Done\r\n"+"\r\n");
			//Click on Send button
			sendFullOrderbtn.click();
			System.out.println("\r\n"+"     Send full Order"+"  : Done\r\n"+"\r\n");
			logs.info("      Send full Order"+"  : Done");
			
	}catch(NoSuchElementException e1) 

	{

		//take Screenshot
		DefaultMethods.getScreenShot( "UiBreaking101", driver);
		System.out.println("Error : Trying to 2nd time.... "+""+"NoSuchElementException");
		logs.info("Error : Trying to 2nd time.... "+""+"NoSuchElementException");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.ubsidi:id/btnSendFullOrder")));
		WebElement sendFullOrderbtn = driver.findElement(By.id("com.ubsidi:id/btnSendFullOrder"));
		//Print order type
		System.out.println("\r\n"+"     "+sendFullOrderbtn.getText()+"  : Done\r\n"+"\r\n");
		logs.info("     "+sendFullOrderbtn.getText()+"  : Done\r\n"+"\r\n");
		//Click on Send button
		sendFullOrderbtn.click();
	}
	catch(TimeoutException e2)

	{

		//take Screenshot
		DefaultMethods.getScreenShot( "UiBreaking202", driver);
		System.out.println("Error : Trying to 2nd time.... "+"\r\n"+"TimeoutException");	
		logs.info("Error : Trying to 2nd time.... "+"\r\n"+"TimeoutException");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.ubsidi:id/btnSendFullOrder")));
		WebElement sendFullOrderbtn = driver.findElement(By.id("com.ubsidi:id/btnSendFullOrder"));
		//Print order type
		System.out.println("\r\n"+"     "+sendFullOrderbtn.getText()+"  : Done\r\n"+"\r\n");
		logs.info("     "+sendFullOrderbtn.getText()+"  : Done\r\n"+"\r\n");
		//Click on Send button
		sendFullOrderbtn.click();
	}
	catch(StaleElementReferenceException e3)

	{
		//take Screenshot
		DefaultMethods.getScreenShot( "UiBreaking303", driver);
		System.out.println("Error : Trying to 2nd time.... "+"\r\n"+"StaleElementReferenceException");	
		logs.info("Error : Trying to 2nd time.... "+"\r\n"+"StaleElementReferenceException");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.ubsidi:id/btnSendFullOrder")));
		WebElement sendFullOrderbtn = driver.findElement(By.id("com.ubsidi:id/btnSendFullOrder"));
		//Print order type
		System.out.println("\r\n"+"     "+sendFullOrderbtn.getText()+"  : Done\r\n"+"\r\n");
		logs.info("     "+sendFullOrderbtn.getText()+"  : Done\r\n"+"\r\n");
		//Click on Send button
		sendFullOrderbtn.click();
	}
}
	

	//2. type of send order = Send Duplicate full order
	public static void sendDuplicateFullOrder() throws Exception
	{
		WebElement sendDuplicateFullOrderbtn = driver.findElement(By.id("com.ubsidi:id/btnSendDuplicateFullOrder"));
		//Print order type
		System.out.println("     "+sendDuplicateFullOrderbtn.getText()+"  : Done\r\n");
		logs.info("     "+sendDuplicateFullOrderbtn.getText()+"  : Done\r\n");
		//Click on Send button
		sendDuplicateFullOrderbtn.click();
		
		Thread.sleep(5000);

	}

	//3. type of send order = Send Order Update
	public static void sendOrderUpdate() throws Exception
	{
		WebElement sendOrderUpdatebtn = driver.findElement(By.id("com.ubsidi:id/btnSendDuplicateFullOrder"));
		//Print order type
		System.out.println("     "+sendOrderUpdatebtn.getText()+"  : Done\r\n");
		logs.info("     "+sendOrderUpdatebtn.getText()+"  : Done\r\n");
		//Click on Send button
		sendOrderUpdatebtn.click();
		
		Thread.sleep(5000);

	}

	//4. type of send order = Send Duplicate Order Update
	public static void sendDuplicateOrderUpdate() throws Exception
	{
		WebElement sendDuplicateOrderUpdatebtn = driver.findElement(By.id("com.ubsidi:id/btnSendDuplicateFullOrder"));
		//Print order type
		System.out.println("     "+sendDuplicateOrderUpdatebtn.getText()+"  : Done\r\n");
		logs.info("     "+sendDuplicateOrderUpdatebtn.getText()+"  : Done\r\n");
		//Click on Send button
		sendDuplicateOrderUpdatebtn.click();
		Thread.sleep(5000);

	}

	//print Button  Click
	public static void printButtonClick() throws Exception
	{
		
		
		//Click on Table - Open table once again	
		List<WebElement> tablesListForPrint = driver.findElements(By.id("com.ubsidi:id/tvTable"));
		//print table name
		System.out.println(" - " + tablesListForPrint.get(i).getText()+" is open Again to Print ");
		logs.info(" - " + tablesListForPrint.get(i).getText()+" is open Again to Print ");
		//Click on table index 	
		tablesListForPrint.get(i).click();
		//Clear tableslist
		tablesListForPrint.clear();
		
        Thread.sleep(4000);		
		//Click on print button
		List<WebElement> sendPrintDiscSplit2 = driver.findElements(By.id("com.ubsidi:id/tvMenu"));
		//Click on print button
		sendPrintDiscSplit2.get(1).click();	
	}

	//1. Print-All button click
	public static void printAllbutton() throws Exception
	{
		//print the - print type
		System.out.println("      >.>.> "+driver.findElement(By.id("com.ubsidi:id/btnPrintAll")).getText()+"\r\n");
		logs.info("      >.>.> "+driver.findElement(By.id("com.ubsidi:id/btnPrintAll")).getText()+"\r\n");
		//click on print all
		driver.findElement(By.id("com.ubsidi:id/btnPrintAll")).click();	
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		Thread.sleep(4000);

	}

	//2. print  Bill Button  Click
	public static void printBillButton() throws Exception
	{
		//print the - print type
		System.out.println("      >.>.> "+driver.findElement(By.id("com.ubsidi:id/btnPrintBill")).getText()+"\r\n");
		logs.info("      >.>.> "+driver.findElement(By.id("com.ubsidi:id/btnPrintBill")).getText()+"\r\n");
		//click on print bill
		driver.findElement(By.id("com.ubsidi:id/btnPrintBill")).click();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		Thread.sleep(4000);
	}


	//Discount 
	public static void discountButtonClick() throws Exception
	{
		
		List<WebElement> sendPrintDiscSplit3 = driver.findElements(By.id("com.ubsidi:id/tvMenu"));
		//Click on print button
		sendPrintDiscSplit3.get(2).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		
	}

	//1. Percentage Discount 
	public static void percentageDiscount() throws Exception
	{
		String pa1 = appdata.getProperty("percentageAmountFirstDigit");
		String pa2 = appdata.getProperty("percentageAmountSecondDigit");
		String perfirstDigitId1 = "com.ubsidi:id/btn"+pa1;
		String persecondDigitId2 = "com.ubsidi:id/btn"+pa2;

		driver.findElement(By.id(perfirstDigitId1)).click();
		driver.findElement(By.id(persecondDigitId2)).click();
		System.out.println(" - Percentage Discount is : "+pa1+pa2+"%"+"\r\n");
		logs.info(" - Percentage Discount is : "+pa1+pa2+"%"+"\r\n");
		
		//Click 2 times on 0
		driver.findElement(By.id("com.ubsidi:id/btn0")).click();
		driver.findElement(By.id("com.ubsidi:id/btn0")).click();
		//Click on Apply discount 
		driver.findElement(By.id("com.ubsidi:id/btnConfirm")).click();
		
		Thread.sleep(2000);
		
		//Print subtotal
		System.out.println(" - SubTotal is : "+driver.findElement(By.id("com.ubsidi:id/tvSubtotal")).getText()+"\r\n");
		logs.info(" - SubTotal is : "+driver.findElement(By.id("com.ubsidi:id/tvSubtotal")).getText()+"\r\n");
		//Print discount amount
		System.out.println(" - Discount Amount is : "+driver.findElement(By.id("com.ubsidi:id/tvDiscount")).getText()+"\r\n");
		logs.info(" - Discount Amount is : "+driver.findElement(By.id("com.ubsidi:id/tvDiscount")).getText()+"\r\n");
		//Print Total
		System.out.println(" - Total is : "+driver.findElement(By.id("com.ubsidi:id/tvGrandTotal")).getText()+"\r\n");	
		logs.info(" - Total is : "+driver.findElement(By.id("com.ubsidi:id/tvGrandTotal")).getText()+"\r\n");

	}

	//2. Flat Discount 
	public static void FlatDiscount() throws Exception
	{
		//Click on Flat Amount button
		driver.findElement(By.id("com.ubsidi:id/btnFlat")).click();
		
		String fa1 = appdata.getProperty("flatAmountFirstDigit");
		String fa2 = appdata.getProperty("flatAmountSecondDigit");
		String firstDigitId1 = "com.ubsidi:id/btn"+fa1;
		String secondDigitId2 = "com.ubsidi:id/btn"+fa2;

		driver.findElement(By.id(firstDigitId1)).click();
		driver.findElement(By.id(secondDigitId2)).click();
		System.out.println(" - Flat Discount is : £"+fa1+fa2+"\r\n");
		logs.info(" - Flat Discount is : £"+fa1+fa2+"\r\n");
		//Click 2 times on 0
		driver.findElement(By.id("com.ubsidi:id/btn0")).click();
		driver.findElement(By.id("com.ubsidi:id/btn0")).click();
		//Click on Apply discount 
		driver.findElement(By.id("com.ubsidi:id/btnConfirm")).click();
		
		Thread.sleep(2000);
		
		//Print subtotal
		System.out.println(" - SubTotal is : "+driver.findElement(By.id("com.ubsidi:id/tvSubtotal")).getText()+"\r\n");
		logs.info(" - SubTotal is : "+driver.findElement(By.id("com.ubsidi:id/tvSubtotal")).getText()+"\r\n");
		//Print discount amount
		System.out.println(" - Discount Amount is : "+driver.findElement(By.id("com.ubsidi:id/tvDiscount")).getText()+"\r\n");
		logs.info(" - Discount Amount is : "+driver.findElement(By.id("com.ubsidi:id/tvDiscount")).getText()+"\r\n");
		//Print Total
		System.out.println(" - Total is : "+driver.findElement(By.id("com.ubsidi:id/tvGrandTotal")).getText()+"\r\n");
		logs.info(" - Total is : "+driver.findElement(By.id("com.ubsidi:id/tvGrandTotal")).getText()+"\r\n");

	}


	//pay By Cash
		public static void payByCash() throws Exception 
		{
			//Open table 
			//Click on Table - Open table once again	
			List<WebElement> tablesList = driver.findElements(By.id("com.ubsidi:id/tvTable"));
			//print table name
			System.out.println(" - " + tablesList.get(i).getText()+" is open Again to Pay By Cash ");
			logs.info(" - " + tablesList.get(i).getText()+" is open Again to Pay By Cash ");
			//Click on table index 	
			tablesList.get(i).click();
			//Clear tableslist
			tablesList.clear();
			
			Thread.sleep(4000);
			
			//click on pay by cash button
			driver.findElement(By.id("com.ubsidi:id/btnCash")).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));		
			
		}
		

		//1. Full
		public static void fullPayment() throws InterruptedException
		{
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

			//get Total
			String orderTotalString = driver.findElement(By.id("com.ubsidi:id/tvGrandTotal")).getText();
		    //print total	
			System.out.println(" - Total is : "+orderTotalString+"\r\n");	
			logs.info(" - Total is : "+orderTotalString+"\r\n");	
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

			//Click on Full
			WebElement paymentModefull =driver.findElement(By.id("com.ubsidi:id/btnFull"));
			//Print payment by 
			System.out.println("          Payment by : "+paymentModefull.getText()+"\r\n");	
			logs.info("          Payment by : "+paymentModefull.getText()+"\r\n");
			paymentModefull.click();
			
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			//Thread.sleep(4000);
		}
		
		//2. Enter Amount
		public static void enterAmountPayment() throws InterruptedException
		{
			//get Total
			String orderTotalString = driver.findElement(By.id("com.ubsidi:id/tvGrandTotal")).getText();
		    //print total	
			System.out.println(" - Total is : "+orderTotalString+"\r\n");	
			logs.info(" - Total is : "+orderTotalString+"\r\n");	

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

			// Enter amount
			WebElement paymentModeEnterAmount =driver.findElement(By.id("com.ubsidi:id/etCashAmount"));
			//Print payment by 
			System.out.println("          Payment by : "+paymentModeEnterAmount.getText()+"\r\n");	
			// Enter amount
			paymentModeEnterAmount.sendKeys(orderTotalString);
			//Click on Pay
			driver.findElement(By.id("com.ubsidi:id/btnPay")).click();

			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			Thread.sleep(4000);

		}
		
		

		//Split Bill(between 2 person)
		public static void splitBill() throws Exception
		{
			System.out.println("       Split Bill :-"+"\r\n");
			//Open table 
			//Click on Table - Open table once again	
			List<WebElement> tablesList = driver.findElements(By.id("com.ubsidi:id/tvTable"));
			//print table name
			System.out.println(" - " + tablesList.get(i).getText()+" is open Again to Split amount ");
			//Click on table index 	
			tablesList.get(i).click();
			//Clear tableslist
			tablesList.clear();
			
			Thread.sleep(2000);	
			
			//click on Split
			List<WebElement> sendPrintDiscSplit4 = driver.findElements(By.id("com.ubsidi:id/tvMenu"));
			//Click on Split button
			sendPrintDiscSplit4.get(3).click();
			
			Thread.sleep(2000);	

			List<WebElement> itemPayble1 = driver.findElements(By.id("com.ubsidi:id/tvProduct"));
			//Click on person1 items
			System.out.println(" - Person 1 Items");
			//item1
			System.out.println("     1. "+itemPayble1.get(0).getText());
			itemPayble1.get(0).click();
			//item2
			System.out.println("     2. "+itemPayble1.get(1).getText());
			itemPayble1.get(1).click();
			
			Thread.sleep(1000);	
			
			List<WebElement> itemPayble2 = driver.findElements(By.id("com.ubsidi:id/tvProduct"));
			//item3
			System.out.println("     3. "+itemPayble2.get(0).getText()+"\r\n");
			itemPayble2.get(0).click();
			
			//person1 payble Amount is
			WebElement person1Pay = driver.findElement(By.id("com.ubsidi:id/btnPayBill"));
			String person1PayString = person1Pay.getText();
			System.out.println("      웃   Persaon 1 Have to "+person1PayString+"\r\n");	
			
			Thread.sleep(1000);	
			
			//Click on Person2
			List<WebElement> personList1 = driver.findElements(By.id("com.ubsidi:id/rbTitle"));
			//Click on person2
			personList1.get(1).click();
			
			Thread.sleep(1000);	
			
			//Click on person2 items
			System.out.println(" - Person 2 Items");
			List<WebElement> itemPayble3 = driver.findElements(By.id("com.ubsidi:id/tvProduct"));
			
			//item4
			System.out.println("     4. "+itemPayble3.get(0).getText());
			itemPayble3.get(0).click();
			
			//item5
			System.out.println("     5. "+itemPayble3.get(1).getText());
			itemPayble3.get(1).click();
			
			Thread.sleep(1000);	

			List<WebElement> itemPayble4 = driver.findElements(By.id("com.ubsidi:id/tvProduct"));
			//Item6
			System.out.println("     6. "+itemPayble4.get(0).getText());
			itemPayble4.get(0).click();
			
			Thread.sleep(1000);	
			
			List<WebElement> itemPayble5 = driver.findElements(By.id("com.ubsidi:id/tvProduct"));
			//Item7
			System.out.println("     7. "+itemPayble5.get(0).getText()+"\r\n");
			itemPayble5.get(0).click();
			
			Thread.sleep(1000);	
			
			
			//person2 payble amount is
			WebElement person2Pay = driver.findElement(By.id("com.ubsidi:id/btnPayBill"));
			String person2PayString = person2Pay.getText();
			System.out.println("      웃   Person 2 have to "+person2PayString+"\r\n");	
			
		}


		
		//Split Person pay by enter amount (2 person)
		public static void splitPersonEnterAmountPayment() throws Exception
		{
			System.out.println("   Payment :-"+"\r\n");
			//get pay amount of both person
			//Store  person2 pay amount
			WebElement person2Pay1 = driver.findElement(By.id("com.ubsidi:id/btnPayBill"));
			String person2PayIs = person2Pay1.getText();
			//person1 pay amount is
			//Click on Person1
			List<WebElement> personList3 = driver.findElements(By.id("com.ubsidi:id/rbTitle"));
			//Click on person1
			personList3.get(0).click();
			//store person1 pay amount
			WebElement person1Pay1 = driver.findElement(By.id("com.ubsidi:id/btnPayBill"));
			String person1PayIs = person1Pay1.getText();
			
			//Person 1 pay
			//Click on person 1
			List<WebElement> personList2 = driver.findElements(By.id("com.ubsidi:id/rbTitle"));
			//Click on person1
			personList2.get(0).click();
			//Click on Pay button
			person1Pay1.click();
			
			//Click on Cash Button
			List<WebElement> paymentModeCashCardCheque1 = driver.findElements(By.id("com.ubsidi:id/tvMenu"));
			//Click on Cash Button
			System.out.println(" - Payment Mode is : "+paymentModeCashCardCheque1.get(0).getText());
			paymentModeCashCardCheque1.get(0).click();
			
			
			// Enter amount
			WebElement paymentModeEnterAmount1 =driver.findElement(By.id("com.ubsidi:id/etCashAmount"));
			//Print payment by 
			System.out.println("          Payment by : "+paymentModeEnterAmount1.getText()+"\r\n");	
			// Enter amount
			paymentModeEnterAmount1.sendKeys(person1PayIs);
			//Click on Pay
			driver.findElement(By.id("com.ubsidi:id/btnPay")).click();
			
			System.out.println(" - Person 1 Payment Sucessfull...✅\r\n");
			Thread.sleep(3000);
			
			
			//Person 2 pay
			//click on pay by cash button
			driver.findElement(By.id("com.ubsidi:id/btnCash")).click();
			//Click on person 2
			List<WebElement> personList4 = driver.findElements(By.id("com.ubsidi:id/rbTitle"));
			//Click on person2
			personList4.get(1).click();
			
			//Click on Cash Button
			List<WebElement> paymentModeCashCardCheque2 = driver.findElements(By.id("com.ubsidi:id/tvMenu"));
			//Click on Cash Button
			System.out.println(" - Payment Mode is : "+paymentModeCashCardCheque2.get(0).getText());
			paymentModeCashCardCheque2.get(0).click();
			

			// Enter amount
			WebElement paymentModeEnterAmount2 =driver.findElement(By.id("com.ubsidi:id/etCashAmount"));
			//Print payment by 
			System.out.println("          Payment by : "+paymentModeEnterAmount2.getText()+"\r\n");	
			// Enter amount
			paymentModeEnterAmount2.sendKeys(person2PayIs);
			//Click on Pay
			driver.findElement(By.id("com.ubsidi:id/btnPay")).click();
			
			System.out.println(" - Person 2 Payment Sucessfull...✅\r\n");
			Thread.sleep(3000);
		}

		//Split person pay by full( 2 person)
		public static void splitPersonFullPayment() throws Exception
		{
			System.out.println("   Payment :-"+"\r\n");
				
			//Person 1 pay
			//Click on person 1
			List<WebElement> personList2 = driver.findElements(By.id("com.ubsidi:id/rbTitle"));
			//Click on person1
			personList2.get(0).click();
			//Click on Pay button
			WebElement person1Pay1 = driver.findElement(By.id("com.ubsidi:id/btnPayBill"));
			person1Pay1.click();
			
			//Click on Cash Button
			List<WebElement> paymentModeCashCardCheque1 = driver.findElements(By.id("com.ubsidi:id/tvMenu"));
			//Click on Cash Button
			System.out.println(" - Payment Mode is : "+paymentModeCashCardCheque1.get(0).getText());
			paymentModeCashCardCheque1.get(0).click();
			
			//Click on Full
			WebElement paymentModefull1 =driver.findElement(By.id("com.ubsidi:id/btnFull"));
			//Print payment by 
			System.out.println("          Payment by : "+paymentModefull1.getText()+"\r\n");	
			paymentModefull1.click();
			
			System.out.println(" - Person 2 Payment Sucessfull...✅\r\n");
			Thread.sleep(3000);			

			//Person 2 pay
			//click on pay by cash button
			driver.findElement(By.id("com.ubsidi:id/btnCash")).click();
			//Click on person 2
			List<WebElement> personList4 = driver.findElements(By.id("com.ubsidi:id/rbTitle"));
			//Click on person2
			personList4.get(1).click();
			
			//Click on Cash Button
			List<WebElement> paymentModeCashCardCheque2 = driver.findElements(By.id("com.ubsidi:id/tvMenu"));
			//Click on Cash Button
			System.out.println(" - Payment Mode is : "+paymentModeCashCardCheque2.get(0).getText());
			paymentModeCashCardCheque2.get(0).click();
			
			//Click on Full
			WebElement paymentModefull2 =driver.findElement(By.id("com.ubsidi:id/btnFull"));
			//Print payment by 
			System.out.println("          Payment by : "+paymentModefull2.getText()+"\r\n");	
			paymentModefull2.click();
						
			System.out.println(" - Person 2 Payment Sucessfull...✅\r\n");
			Thread.sleep(3000);		
		}
		
		
		//*Choose new order type Waiting/Collection/Delivery
		
		//Choose new order type Waiting
		public static void newOrderWaiting() throws Exception
		{
		
			
			
/*
			try {
				//if new order button is displayed 
				boolean checkDeviceName = driver.findElement(By.id("com.ubsidi:id/tvDeviceId")).isDisplayed(); 
				
				Thread.sleep(4000);
				
				
				//Click on New order
				List<WebElement> leftSideOptionslist1 = driver.findElements(By.id("com.ubsidi:id/tvName"));
				//Click on new order button
				//New Order index is 1
				Thread.sleep(3000);
				leftSideOptionslist1.get(1).click();
				leftSideOptionslist1.clear();
					
			}catch(Exception e)
			{
				//Click on New Order Button
				//Expend Option List
				driver.findElement(By.id("com.ubsidi:id/fab")).click();
				
				Thread.sleep(4000);
						 
				//Click on New order
				List<WebElement> leftSideOptionslist1 = driver.findElements(By.id("com.ubsidi:id/tvName"));
				//Click on new order button
				//New Order index is 
				Thread.sleep(3000);
				leftSideOptionslist1.get(1).click();
				leftSideOptionslist1.clear();
			}
		*/
	
				
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

			//Click On Waiting 
			driver.findElement(By.id("com.ubsidi:id/tvWaiting")).click();   //isako bhi alag method kr do
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

			//print title
			WebElement waitingOrderTitle = driver.findElement(By.id("com.ubsidi:id/tvTitle"));
			System.out.println("\r\n"+"          >>>>>>>>> "+waitingOrderTitle.getText()+" <<<<<<<<<<<<\r\n");
			//Customer Details 
			System.out.println(" - Waiting Customer Details\r\n");
			//send name 
			driver.findElement(By.id("com.ubsidi:id/etName")).sendKeys(appdata.getProperty("waitingUserName"));
			System.out.println("   Name : "+appdata.getProperty("waitingUserName")+"\r\n");

			//click on signUp for NewsLetter
			WebElement newsLetterTick = driver.findElement(By.id("com.ubsidi:id/signupForNewsletter"));
			System.out.println("   "+newsLetterTick.getText()+" : ✔️\r\n");
			newsLetterTick.click();
			//Click on Confirm Button
			driver.findElement(By.id("com.ubsidi:id/btnConfirm")).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		}

		//Choose new order type Collection
		public static void newOrderCollection() throws Exception
		{		
			
			//UpSide New Order Button
			driver.findElement(By.id("com.ubsidi:id/btnNewOrder")).click();
/*
			try {
				//if new order button is displayed 
				boolean checkDeviceName = driver.findElement(By.id("com.ubsidi:id/tvDeviceId")).isDisplayed(); 
				
				//Click on New order
				List<WebElement> leftSideOptionslist1 = driver.findElements(By.id("com.ubsidi:id/tvName"));
				//Click on new order button
				//New Order index is 1
				Thread.sleep(2000);
				leftSideOptionslist1.get(1).click();
						
			}catch(Exception e)
			{
				//Click on New Order Button
				//Expend Option List
				driver.findElement(By.id("com.ubsidi:id/fab")).click();
				
				Thread.sleep(1000);
						 
				//Click on New order
				List<WebElement> leftSideOptionslist1 = driver.findElements(By.id("com.ubsidi:id/tvName"));
				//Click on new order button
				//New Order index is 1
				Thread.sleep(3000);
				leftSideOptionslist1.get(1).click();			
			}
	*/		
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
			//Click On Collection
			driver.findElement(By.id("com.ubsidi:id/tvCollection")).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
			
			//print title
			WebElement waitingOrderTitle = driver.findElement(By.id("com.ubsidi:id/tvTitle"));
			System.out.println("\r\n"+"          >>>>>>>>> "+waitingOrderTitle.getText()+" <<<<<<<<<<<<\r\n");
			//Customer Details 
			System.out.println(" - Collection Customer Details\r\n");
			//send name 
			driver.findElement(By.id("com.ubsidi:id/etName")).sendKeys(appdata.getProperty("collectionUserName"));
			System.out.println("   Name       : "+appdata.getProperty("collectionUserName"));
			//send mobile number
			driver.findElement(By.id("com.ubsidi:id/etPhone")).sendKeys(appdata.getProperty("collectionMobileNo"));
			System.out.println("   Mobile No. : "+appdata.getProperty("collectionMobileNo")+"\r\n");

			//click on signUp for NewsLetter
			WebElement newsLetterTick = driver.findElement(By.id("com.ubsidi:id/signupForNewsletter"));
			System.out.println("   "+newsLetterTick.getText()+" : ✔️\r\n");
			newsLetterTick.click();
			//Click on Confirm Button
			driver.findElement(By.id("com.ubsidi:id/btnConfirm")).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
			
		}

		//Choose new order type Delivery
		public static void newOrderDelivery() throws Exception
		{
			//UpSide New Order Button
			driver.findElement(By.id("com.ubsidi:id/btnNewOrder")).click();
/*
			try {
				//if new order button is displayed 
				boolean checkDeviceName = driver.findElement(By.id("com.ubsidi:id/tvDeviceId")).isDisplayed(); 
				
				//Click on New order
				List<WebElement> leftSideOptionslist1 = driver.findElements(By.id("com.ubsidi:id/tvName"));
				//Click on new order button
				//New Order index is 1
				Thread.sleep(3000);
				leftSideOptionslist1.get(1).click();
						
			}catch(Exception e)
			{
				//Click on New Order Button
				//Expend Option List
				driver.findElement(By.id("com.ubsidi:id/fab")).click();
				
				Thread.sleep(1000);
						 
				//Click on New order
				List<WebElement> leftSideOptionslist1 = driver.findElements(By.id("com.ubsidi:id/tvName"));
				//Click on new order button
				//New Order index is 1
				Thread.sleep(3000);
				leftSideOptionslist1.get(1).click();			
			}
	*/		
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
			//Click On Delivery
			driver.findElement(By.id("com.ubsidi:id/tvDelivery")).click();
			//print title
			WebElement waitingOrderTitle = driver.findElement(By.id("com.ubsidi:id/tvTitle"));
			System.out.println("\r\n"+"          >>>>>>>>> "+waitingOrderTitle.getText()+" <<<<<<<<<<<<\r\n");
			//Customer Details 
			System.out.println(" - Delivery Customer Details\r\n");
			//send name 
			driver.findElement(By.id("com.ubsidi:id/etName")).sendKeys(appdata.getProperty("deliveryUserName"));
			System.out.println("   Name           : "+appdata.getProperty("deliveryUserName"));
			//send mobile number
			driver.findElement(By.id("com.ubsidi:id/etPhone")).sendKeys(appdata.getProperty("deliveryMobileNo"));
			System.out.println("   Mobile No      : "+appdata.getProperty("deliveryMobileNo"));
			//enter House number 
			driver.findElement(By.id("com.ubsidi:id/etHouse")).sendKeys(appdata.getProperty("deliveryHouserNo"));
			System.out.println("   Houser No/Name : "+appdata.getProperty("deliveryHouserNo"));
			//Enter PostCode
			driver.findElement(By.id("com.ubsidi:id/etPostcode")).sendKeys(appdata.getProperty("deliveryPostCode"));
			System.out.println("   PostCode       : "+appdata.getProperty("deliveryPostCode"));
			//Click on LOOK UP button
			driver.findElement(By.id("com.ubsidi:id/btnSearch")).click();
			Thread.sleep(3000);
			//Print StreetName and City/town
			System.out.println("       Street    : "+driver.findElement(By.id("com.ubsidi:id/etStreet")).getText());
			System.out.println("       City/Town : "+driver.findElement(By.id("com.ubsidi:id/etTown")).getText()+"\r\n");		
			//click on signUp for NewsLetter
			WebElement newsLetterTick = driver.findElement(By.id("com.ubsidi:id/signupForNewsletter"));
			System.out.println("   "+newsLetterTick.getText()+" : ✔️\r\n");
			newsLetterTick.click();
			 //Scroll down
			driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
					+ ".scrollIntoView(new UiSelector()" + ".textMatches(\"" + "Confirm" + "\").instance(0))"));  //enter text in this lines where you want to go.
			 
			//Click on Confirm Button
			driver.findElement(By.id("com.ubsidi:id/btnConfirm")).click();
					
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
			
		}
		
		
	//Factory reseat data
	public static void factoryDataReset()
	{
		//Expend Option List
		driver.findElement(By.id("com.ubsidi:id/fab")).click();
		//Scroll down
		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
						+ ".scrollIntoView(new UiSelector()" + ".textMatches(\"" + "Settings" + "\").instance(0))"));  //enter text in this lines where you want to go.
				 
		//Click on settings
		//scroll down hone ke bad , jo element dikh rhe hai , wo iss list me store honge
		List<WebElement> leftSideOptionslist3 = driver.findElements(By.id("com.ubsidi:id/tvName"));
		//Click on Settings button
		//Srttings  index is 3
		leftSideOptionslist3.get(3).click();
		
		driver.switchTo().window("");
		//Scroll down
		driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
								+ ".scrollIntoView(new UiSelector()" + ".textMatches(\"" + "Clear Cache" + "\").instance(0))"));  //enter text in this lines where you want to go.
					
		List<WebElement> srttingsOptionslist = driver.findElements(By.id("com.ubsidi:id/tvName"));
		srttingsOptionslist.get(1).click();
		
		driver.findElement(By.id("com.ubsidi:id/btnConfirm"));

	}
		
	
	
	public static void appClosed()
	{	
		try {
			Thread.sleep(2000);
			driver.quit();

			System.out.println(" - App Closed...\r\n" + "");
			System.out.println("---------------**------------------------***---------------------------**---------------\r\n");

			logs.info(" - App Closed...");
			logs.info("---------------**------------------------***---------------------------**---------------");
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



