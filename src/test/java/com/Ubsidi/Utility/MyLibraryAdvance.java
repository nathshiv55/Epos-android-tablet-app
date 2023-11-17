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

import com.Ubsidi.BasePackage.BaseInit1;
import com.Ubsidi.DefaultPackage.DefaultMethods;
import com.github.javafaker.Faker;

import io.appium.java_client.android.AndroidDriver;

public class MyLibraryAdvance extends BaseInit1{


	//only New Order Button Click
	public static void onlyNewOrderButtonClick() throws Exception
	{
try {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.ubsidi:id/btnNewOrder")));

		//UpSide New Order Button
		driver.findElement(By.id("com.ubsidi:id/btnNewOrder")).click();

		System.out.println(" - New Order button Clicked "+"\r\n");
		logs.info(" - New Order button Clicked");
}catch(NoSuchElementException e1) 

{

	//take Screenshot
	DefaultMethods.getScreenShot( "UiBreaking001", driver);
	System.out.println("Error : Trying to 2nd time.... "+""+"NoSuchElementException");
	logs.info("Error : Trying to 2nd time.... "+""+"NoSuchElementException");

	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.ubsidi:id/btnNewOrder")));

	//UpSide New Order Button
	driver.findElement(By.id("com.ubsidi:id/btnNewOrder")).click();

	System.out.println(" - New Order button Clicked "+"\r\n");
	logs.info(" - New Order button Clicked");
}
catch(TimeoutException e2)

{

	//take Screenshot
	DefaultMethods.getScreenShot( "UiBreaking002", driver);
	System.out.println("Error : Trying to 2nd time.... "+"\r\n"+"TimeoutException");	
	logs.info("Error : Trying to 2nd time.... "+"\r\n"+"TimeoutException");

	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.ubsidi:id/btnNewOrder")));

	//UpSide New Order Button
	driver.findElement(By.id("com.ubsidi:id/btnNewOrder")).click();

	System.out.println(" - New Order button Clicked "+"\r\n");
	logs.info(" - New Order button Clicked");
}
catch(StaleElementReferenceException e3)

{
	//take Screenshot
	DefaultMethods.getScreenShot( "UiBreaking003", driver);
	System.out.println("Error : Trying to 2nd time.... "+"\r\n"+"StaleElementReferenceException");	
	logs.info("Error : Trying to 2nd time.... "+"\r\n"+"StaleElementReferenceException");

	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.ubsidi:id/btnNewOrder")));

	//UpSide New Order Button
	driver.findElement(By.id("com.ubsidi:id/btnNewOrder")).click();

	System.out.println(" - New Order button Clicked "+"\r\n");
	logs.info(" - New Order button Clicked");
}	

	}



	//Choose new order type Waiting
	public static void onlyClickOnWaiting() throws Exception
	{
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.ubsidi:id/tvWaiting")));
			//Click On Waiting 
			driver.findElement(By.id("com.ubsidi:id/tvWaiting")).click();  
			System.out.println(" - Choose :- Waiting "+"\r\n");
			logs.info(" - Choose :- Waiting");
		}catch(NoSuchElementException e1) 

		{

			//take Screenshot
			DefaultMethods.getScreenShot( "UiBreaking111", driver);
			System.out.println("Error : Trying to 2nd time.... "+""+"NoSuchElementException");
			logs.info("Error : Trying to 2nd time.... "+""+"NoSuchElementException");

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.ubsidi:id/tvWaiting")));
			//Click On Waiting 
			driver.findElement(By.id("com.ubsidi:id/tvWaiting")).click(); 
			System.out.println(" - Choose :- Waiting "+"\r\n");
			logs.info(" - Choose :- Waiting");
		}
		catch(TimeoutException e2)

		{

			//take Screenshot
			DefaultMethods.getScreenShot( "UiBreaking222", driver);
			System.out.println("Error : Trying to 2nd time.... "+"\r\n"+"TimeoutException");	
			logs.info("Error : Trying to 2nd time.... "+"\r\n"+"TimeoutException");

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.ubsidi:id/tvWaiting")));
			//Click On Waiting 
			driver.findElement(By.id("com.ubsidi:id/tvWaiting")).click(); 
			System.out.println(" - Choose :- Waiting "+"\r\n");
			logs.info(" - Choose :- Waiting");
		}
		catch(StaleElementReferenceException e3)

		{
			//take Screenshot
			DefaultMethods.getScreenShot( "UiBreaking333", driver);
			System.out.println("Error : Trying to 2nd time.... "+"\r\n"+"StaleElementReferenceException");	
			logs.info("Error : Trying to 2nd time.... "+"\r\n"+"StaleElementReferenceException");

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.ubsidi:id/tvWaiting")));
			//Click On Waiting 
			driver.findElement(By.id("com.ubsidi:id/tvWaiting")).click(); 
			System.out.println(" - Choose :- Waiting "+"\r\n");
			logs.info(" - Choose :- Waiting");
		}	
	}


	// Waiting Customer Details
	public static void waitingCustomerDetails() throws Exception
	{
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.ubsidi:id/tvTitle")));
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
			//driver.findElement(By.id("com.ubsidi:id/btnConfirmNOrder")).click();
			Thread.sleep(1700);
		}catch(TimeoutException e2)

		{

			//take Screenshot
			DefaultMethods.getScreenShot( "UiBreaking222", driver);
			System.out.println("Error : Trying to 2nd time.... "+"\r\n"+"TimeoutException");	
			logs.info("Error : Trying to 2nd time.... "+"\r\n"+"TimeoutException");

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.ubsidi:id/tvTitle")));
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
			//driver.findElement(By.id("com.ubsidi:id/btnConfirmNOrder")).click();
			Thread.sleep(1700);
		}
	}



	//Choose new order type Waiting
	public static void newOrderWaiting() throws Exception
	{

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.ubsidi:id/tvWaiting")));

		//Click On Waiting 
		driver.findElement(By.id("com.ubsidi:id/tvWaiting")).click();   //isako bhi alag method kr do

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.ubsidi:id/tvTitle")));

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
		//driver.findElement(By.id("com.ubsidi:id/btnConfirmNOrder")).click();


	}
	
	
	
	
	
	
	//Choose new order type Collection
		public static void onlyClickOnCollection() throws Exception
		{
			try {
				
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.ubsidi:id/tvCollection")));
				//Click On Waiting 
				driver.findElement(By.id("com.ubsidi:id/tvCollection")).click();
				System.out.println(" - Choose :- Collection "+"\r\n");
				logs.info(" - Choose :- Collection");
				
			}catch(NoSuchElementException e1) 

			{

				//take Screenshot
				//DefaultMethods.getScreenShot( "UiBreaking111", driver);
				
				System.out.println("Error : Trying to 2nd time.... "+""+"NoSuchElementException");
				logs.info("Error : Trying to 2nd time.... "+""+"NoSuchElementException");
				

				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.ubsidi:id/tvCollection")));
				//Click On Waiting 
				driver.findElement(By.id("com.ubsidi:id/tvCollection")).click();
				System.out.println(" - Choose :- Collection "+"\r\n");
				logs.info(" - Choose :- Collection");
			}
			catch(TimeoutException e2)

			{

				//take Screenshot
				//DefaultMethods.getScreenShot( "UiBreaking222", driver);
				
				System.out.println("Error : Trying to 2nd time.... "+"\r\n"+"TimeoutException");	
				logs.info("Error : Trying to 2nd time.... "+"\r\n"+"TimeoutException");

				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.ubsidi:id/tvCollection")));
				//Click On Waiting 
				driver.findElement(By.id("com.ubsidi:id/tvCollection")).click();
				System.out.println(" - Choose :- Collection "+"\r\n");
				logs.info(" - Choose :- Collection");
			}
			catch(StaleElementReferenceException e3)

			{
				//take Screenshot
				//DefaultMethods.getScreenShot( "UiBreaking333", driver);
				
				System.out.println("Error : Trying to 2nd time.... "+"\r\n"+"StaleElementReferenceException");	
				logs.info("Error : Trying to 2nd time.... "+"\r\n"+"StaleElementReferenceException");

				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.ubsidi:id/tvCollection")));
				//Click On Waiting 
				driver.findElement(By.id("com.ubsidi:id/tvCollection")).click();
				System.out.println(" - Choose :- Collection "+"\r\n");
				logs.info(" - Choose :- Collection");
			}	
		}


		
		
		

		// Collection Customer Details
		public static void CollectionCustomerDetails() throws Exception
		{
			try {
				
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.ubsidi:id/tvTitle")));
				//print title
				WebElement CollectionOrderTitle = driver.findElement(By.id("com.ubsidi:id/tvTitle"));
				System.out.println("\r\n"+"          >>>>>>>>> "+CollectionOrderTitle.getText()+" <<<<<<<<<<<<\r\n");
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
				Thread.sleep(800);
				
			
			}catch(TimeoutException e2)

			{

				//take Screenshot
				DefaultMethods.getScreenShot( "UiBreaking222", driver);
				
				System.out.println("Error : Trying to 2nd time.... "+"\r\n"+"TimeoutException");	
				logs.info("Error : Trying to 2nd time.... "+"\r\n"+"TimeoutException");

				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.ubsidi:id/tvTitle")));
				//print title
				WebElement CollectionOrderTitle = driver.findElement(By.id("com.ubsidi:id/tvTitle"));
				System.out.println("\r\n"+"          >>>>>>>>> "+CollectionOrderTitle.getText()+" <<<<<<<<<<<<\r\n");
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
				Thread.sleep(1300);

			}
		}
	
		
		
		
		
		
		// Collection Customer Details by FAke Data
				public static void CollectionCustomerDetailsWithFakeData() throws Exception
				{
					try {
						
						WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
						wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.ubsidi:id/tvTitle")));
						//print title
						WebElement CollectionOrderTitle = driver.findElement(By.id("com.ubsidi:id/tvTitle"));
						System.out.println("\r\n"+"          >>>>>>>>> "+CollectionOrderTitle.getText()+" <<<<<<<<<<<<\r\n");
						//Customer Details 
						System.out.println(" - Collection Customer Details\r\n");
						
						
						Faker faker = new Faker();

						String fakeName = faker.name().fullName();
						//String FakefirstName = faker.name().firstName();
						//String FakelastName = faker.name().lastName();

						//String FakeStreetAddress = faker.address().streetAddress();
						
						String FakeMobileNo = "07" + faker.number().digits(8);
						
						
						
						//send name 
						driver.findElement(By.id("com.ubsidi:id/etName")).sendKeys(fakeName);
						System.out.println("   Name       : "+fakeName);
						//send mobile number
						driver.findElement(By.id("com.ubsidi:id/etPhone")).sendKeys(FakeMobileNo);
						System.out.println("   Mobile No. : "+FakeMobileNo+"\r\n");

						//click on signUp for NewsLetter
						WebElement newsLetterTick = driver.findElement(By.id("com.ubsidi:id/signupForNewsletter"));
						System.out.println("   "+newsLetterTick.getText()+" : ✔️\r\n");
						newsLetterTick.click();
						//Click on Confirm Button
						driver.findElement(By.id("com.ubsidi:id/btnConfirm")).click();
						Thread.sleep(300);
						
					
					}catch(TimeoutException e2)

					{

						//take Screenshot
						DefaultMethods.getScreenShot( "UiBreaking222", driver);
						
						System.out.println("Error : Trying to 2nd time.... "+"\r\n"+"TimeoutException");	
						logs.info("Error : Trying to 2nd time.... "+"\r\n"+"TimeoutException");

						WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
						wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.ubsidi:id/tvTitle")));
						//print title
						WebElement CollectionOrderTitle = driver.findElement(By.id("com.ubsidi:id/tvTitle"));
						System.out.println("\r\n"+"          >>>>>>>>> "+CollectionOrderTitle.getText()+" <<<<<<<<<<<<\r\n");
						//Customer Details 
						System.out.println(" - Collection Customer Details\r\n");
						
						
						Faker faker = new Faker();

						String fakeName = faker.name().fullName();
						//String FakefirstName = faker.name().firstName();
						//String FakelastName = faker.name().lastName();

						//String FakeStreetAddress = faker.address().streetAddress();
						
						String FakeMobileNo = "07" + faker.number().digits(8);
						
						
						
						//send name 
						driver.findElement(By.id("com.ubsidi:id/etName")).sendKeys(fakeName);
						System.out.println("   Name       : "+appdata.getProperty("collectionUserName"));
						//send mobile number
						driver.findElement(By.id("com.ubsidi:id/etPhone")).sendKeys(FakeMobileNo);
						System.out.println("   Mobile No. : "+appdata.getProperty("collectionMobileNo")+"\r\n");

						//click on signUp for NewsLetter
						WebElement newsLetterTick = driver.findElement(By.id("com.ubsidi:id/signupForNewsletter"));
						System.out.println("   "+newsLetterTick.getText()+" : ✔️\r\n");
						newsLetterTick.click();
						//Click on Confirm Button
						driver.findElement(By.id("com.ubsidi:id/btnConfirm")).click();
						Thread.sleep(300);

					}
				}
			
				
		
		
		
		
		
	//Food Items
	public static void selectStanwixFoodItems() throws Exception
	{
		try {

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

			//locate element everytime before use it.  warna kam nhi karega.
			System.out.println(" - Selected food Items ");
			logs.info(" - Selected food Items ");

			List<WebElement> tableFoodItemsList1 = driver.findElements(By.id("com.ubsidi:id/tvProduct"));

			wait.until(ExpectedConditions.visibilityOfAllElements(tableFoodItemsList1));

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
			/*
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
			 */
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


	//Select food items by calling method
	public static void selectFoodItemsByCallMehtod(int SNo ,int foodItemIndex) throws Exception    //pass SNo and Index Number during calling this method
	{
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			//locate element everytime before use it.  warna kam nhi karega.
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("com.ubsidi:id/tvProduct")));
			List<WebElement> tableFoodItemsList1 = driver.findElements(By.id("com.ubsidi:id/tvProduct"));
			System.out.println("     " + SNo +".  " +tableFoodItemsList1.get(foodItemIndex).getText());
			logs.info("     " + SNo +".  " +tableFoodItemsList1.get(foodItemIndex).getText());
			tableFoodItemsList1.get(foodItemIndex).click();
			tableFoodItemsList1.clear();
			Thread.sleep(1000);
		}catch(NoSuchElementException e1) 

		{

			//take Screenshot
			DefaultMethods.getScreenShot( "UiBreaking111", driver);
			System.out.println("Error : Trying to 2nd time.... "+""+"NoSuchElementException");
			logs.info("Error : Trying to 2nd time.... "+""+"NoSuchElementException");

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			//locate element everytime before use it.  warna kam nhi karega.
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("com.ubsidi:id/tvProduct")));
			List<WebElement> tableFoodItemsList1 = driver.findElements(By.id("com.ubsidi:id/tvProduct"));
			System.out.println("     " + SNo +".  " +tableFoodItemsList1.get(foodItemIndex).getText());
			logs.info("     " + SNo +".  " +tableFoodItemsList1.get(foodItemIndex).getText());
			tableFoodItemsList1.get(foodItemIndex).click();
			tableFoodItemsList1.clear();
			Thread.sleep(1000);
		}
		catch(TimeoutException e2)

		{

			//take Screenshot
			DefaultMethods.getScreenShot( "UiBreaking222", driver);
			System.out.println("Error : Trying to 2nd time.... "+"\r\n"+"TimeoutException");	
			logs.info("Error : Trying to 2nd time.... "+"\r\n"+"TimeoutException");

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			//locate element everytime before use it.  warna kam nhi karega.
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("com.ubsidi:id/tvProduct")));
			List<WebElement> tableFoodItemsList1 = driver.findElements(By.id("com.ubsidi:id/tvProduct"));
			System.out.println("     " + SNo +".  " +tableFoodItemsList1.get(foodItemIndex).getText());
			logs.info("     " + SNo +".  " +tableFoodItemsList1.get(foodItemIndex).getText());
			tableFoodItemsList1.get(foodItemIndex).click();
			tableFoodItemsList1.clear();
			Thread.sleep(1000);
		}
		catch(StaleElementReferenceException e3)

		{
			//take Screenshot
			DefaultMethods.getScreenShot( "UiBreaking333", driver);
			System.out.println("Error : Trying to 2nd time.... "+"\r\n"+"StaleElementReferenceException");	
			logs.info("Error : Trying to 2nd time.... "+"\r\n"+"StaleElementReferenceException");

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			//locate element everytime before use it.  warna kam nhi karega.
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("com.ubsidi:id/tvProduct")));
			List<WebElement> tableFoodItemsList1 = driver.findElements(By.id("com.ubsidi:id/tvProduct"));
			System.out.println("     " + SNo +".  " +tableFoodItemsList1.get(foodItemIndex).getText());
			logs.info("     " + SNo +".  " +tableFoodItemsList1.get(foodItemIndex).getText());
			tableFoodItemsList1.get(foodItemIndex).click();
			tableFoodItemsList1.clear();
			Thread.sleep(1000);
		}



	}

	//Only order history Button Click
	public static void onlyOrderHistoryButtonClick() throws Exception
	{
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.ubsidi:id/tvOrderHistory")));
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text='Order History']")));

			driver.findElement(By.id("com.ubsidi:id/tvOrderHistory")).click();
			//driver.findElement(By.xpath("//android.widget.TextView[@text='Order History']")).click();
			
			System.out.println(" - Order History Opening Now... ");
			logs.info(" - Order History Opening Now... ");	
		}catch(NoSuchElementException e1) 

		{

			//take Screenshot
			DefaultMethods.getScreenShot( "UiBreaking11", driver);
			System.out.println("Error : Trying to 2nd time.... "+""+"NoSuchElementException");
			logs.info("Error : Trying to 2nd time.... "+""+"NoSuchElementException");

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.ubsidi:id/tvOrderHistory")));

			driver.findElement(By.id("com.ubsidi:id/tvOrderHistory")).click();

			System.out.println(" - Order History Opening Now... ");
			logs.info(" - Order History Opening Now... ");
		}
		catch(TimeoutException e2)

		{

			//take Screenshot
			DefaultMethods.getScreenShot( "UiBreaking22", driver);
			System.out.println("Error : Trying to 2nd time.... "+"\r\n"+"TimeoutException");	
			logs.info("Error : Trying to 2nd time.... "+"\r\n"+"TimeoutException");

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.ubsidi:id/tvOrderHistory")));

			driver.findElement(By.id("com.ubsidi:id/tvOrderHistory")).click();

			System.out.println(" - Order History Opening Now... ");
			logs.info(" - Order History Opening Now... ");
		}
		catch(StaleElementReferenceException e3)

		{
			//take Screenshot
			DefaultMethods.getScreenShot( "UiBreaking33", driver);
			System.out.println("Error : Trying to 2nd time.... "+"\r\n"+"StaleElementReferenceException");	
			logs.info("Error : Trying to 2nd time.... "+"\r\n"+"StaleElementReferenceException");

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.ubsidi:id/tvOrderHistory")));

			driver.findElement(By.id("com.ubsidi:id/tvOrderHistory")).click();

			System.out.println(" - Order History Opening Now... ");
			logs.info(" - Order History Opening Now... ");

		}

	}


	//only History Order Number print 
	public static void onlyHistoryOrderNumberprint() throws Exception
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		List<WebElement> historyOrderNumberList = driver.findElements(By.id("com.ubsidi:id/tvOrderNumber"));
		//`System.out.println(historyOrderNumberList.size());

		wait.until(ExpectedConditions.visibilityOfAllElements(historyOrderNumberList));

		//print Order details
		System.out.println("        - Order Number is : "+historyOrderNumberList.get(0).getText()+"\r\n");
		logs.info("        - Order Number is : "+historyOrderNumberList.get(0).getText());

		historyOrderNumberList.clear();


	}

	//only History Order type/tableName print 
	public static void onlyHistoryOrderTypeORtableNameprint() throws Exception
	{	
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		//print order Type/table name
		List<WebElement> historyOrderTypeList = driver.findElements(By.id("com.ubsidi:id/tvTableNumber"));
		//print Order 

		wait.until(ExpectedConditions.visibilityOfAllElements(historyOrderTypeList));

		System.out.println("        - Order type/Table is : "+historyOrderTypeList.get(0).getText());
		logs.info("        - Order type/Table is : "+historyOrderTypeList.get(0).getText());
		historyOrderTypeList.clear();


	}


	//only Click on Order History order 
	public static void onlyClickOnOrderHistoryOrder() throws Exception

	{	
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			//click on Latest firstOne order
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("com.ubsidi:id/tvOrderNumber")));
			List<WebElement> historyOrderNumberList = driver.findElements(By.id("com.ubsidi:id/tvOrderNumber"));
			//wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("com.ubsidi:id/tvOrderNumberIOrder")));
			//List<WebElement> historyOrderNumberList = driver.findElements(By.id("com.ubsidi:id/tvOrderNumberIOrder"));

			String orderWhichIsGoingToBeClicked = historyOrderNumberList.get(0).getText();       

			//Open Order
			historyOrderNumberList.get(0).click();

			System.out.println(" - "+ orderWhichIsGoingToBeClicked +" is Opening Now..."+"\r\n");
			logs.info(" - "+ orderWhichIsGoingToBeClicked +" is Opening Now...");

			historyOrderNumberList.clear();	

		}catch(NoSuchElementException e1) 

		{

			//take Screenshot
			DefaultMethods.getScreenShot( "UiBreaking11", driver);
			System.out.println("Error : Trying to 2nd time.... "+""+"NoSuchElementException");
			logs.info("Error : Trying to 2nd time.... "+""+"NoSuchElementException");

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			//click on Latest firstOne order
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("com.ubsidi:id/tvOrderNumber")));
			List<WebElement> historyOrderNumberList = driver.findElements(By.id("com.ubsidi:id/tvOrderNumber"));
			//wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("com.ubsidi:id/tvOrderNumberIOrder")));
			//List<WebElement> historyOrderNumberList = driver.findElements(By.id("com.ubsidi:id/tvOrderNumberIOrder"));

			String orderWhichIsGoingToBeClicked = historyOrderNumberList.get(0).getText();       

			//Open Order
			historyOrderNumberList.get(0).click();

			System.out.println(" - "+ orderWhichIsGoingToBeClicked +" is Opening Now..."+"\r\n");
			logs.info(" - "+ orderWhichIsGoingToBeClicked +" is Opening Now...");

			historyOrderNumberList.clear();	

		}
		catch(TimeoutException e2)

		{

			//take Screenshot
			DefaultMethods.getScreenShot( "UiBreaking22", driver);
			System.out.println("Error : Trying to 2nd time.... "+"\r\n"+"TimeoutException");	
			logs.info("Error : Trying to 2nd time.... "+"\r\n"+"TimeoutException");

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			//click on Latest firstOne order
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("com.ubsidi:id/tvOrderNumber")));
			List<WebElement> historyOrderNumberList = driver.findElements(By.id("com.ubsidi:id/tvOrderNumber"));
			//wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("com.ubsidi:id/tvOrderNumberIOrder")));
			//List<WebElement> historyOrderNumberList = driver.findElements(By.id("com.ubsidi:id/tvOrderNumberIOrder"));

			String orderWhichIsGoingToBeClicked = historyOrderNumberList.get(0).getText();       

			//Open Order
			historyOrderNumberList.get(0).click();

			System.out.println(" - "+ orderWhichIsGoingToBeClicked +" is Opening Now..."+"\r\n");
			logs.info(" - "+ orderWhichIsGoingToBeClicked +" is Opening Now...");

			historyOrderNumberList.clear();	

		}
		catch(StaleElementReferenceException e3)

		{
			//take Screenshot
			DefaultMethods.getScreenShot( "UiBreaking33", driver);
			System.out.println("Error : Trying to 2nd time.... "+"\r\n"+"StaleElementReferenceException");	
			logs.info("Error : Trying to 2nd time.... "+"\r\n"+"StaleElementReferenceException");

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			//click on Latest firstOne order
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("com.ubsidi:id/tvOrderNumber")));
			List<WebElement> historyOrderNumberList = driver.findElements(By.id("com.ubsidi:id/tvOrderNumber"));
			//wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("com.ubsidi:id/tvOrderNumberIOrder")));
			//List<WebElement> historyOrderNumberList = driver.findElements(By.id("com.ubsidi:id/tvOrderNumberIOrder"));

			String orderWhichIsGoingToBeClicked = historyOrderNumberList.get(0).getText();       

			//Open Order
			historyOrderNumberList.get(0).click();

			System.out.println(" - "+ orderWhichIsGoingToBeClicked +" is Opening Now..."+"\r\n");
			logs.info(" - "+ orderWhichIsGoingToBeClicked +" is Opening Now...");

			historyOrderNumberList.clear();		

		}

	}	

	
	
	 
	//only Click On Waiting For Order Reopen
		public static void onlyClickOnWaitingForOrderReopen()
		{

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("com.ubsidi:id/tvOrderType")));	
			List<WebElement> waitingForOrderReopen = driver.findElements(By.id("com.ubsidi:id/tvOrderType"));
			System.out.println(waitingForOrderReopen.size());
			waitingForOrderReopen.get(3).click();
			waitingForOrderReopen.clear();
			
			System.out.println("      - Clicked on Waiting to reOpen latest waiting order"+"\r\n");
			logs.info("      - Clicked on Waiting to reOpen latest waiting order");
			
			
		}
	
	
	
		//only Click on Order History order  Alternate
		public static void onlyClickOnOrderHistoryOrderAlternate() throws Exception

		{	
			try {
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
				//click on Latest firstOne order
				wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("com.ubsidi:id/tvOrderNumberHOrder")));
				List<WebElement> historyOrderNumberListAlternate = driver.findElements(By.id("com.ubsidi:id/tvOrderNumberHOrder"));
				String orderWhichIsGoingToBeClicked = historyOrderNumberListAlternate.get(0).getText();       
				//Open Order
				historyOrderNumberListAlternate.get(0).click();

				System.out.println(" - "+ orderWhichIsGoingToBeClicked +" is Opening Now..."+"\r\n");
				logs.info(" - "+ orderWhichIsGoingToBeClicked +" is Opening Now...");

				historyOrderNumberListAlternate.clear();	

			}catch(NoSuchElementException e1) 

			{

				//take Screenshot
				DefaultMethods.getScreenShot( "UiBreaking11", driver);
				System.out.println("Error : Trying to 2nd time.... "+""+"NoSuchElementException");
				logs.info("Error : Trying to 2nd time.... "+""+"NoSuchElementException");

				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
				//click on Latest firstOne order
				List<WebElement> historyOrderNumberListAlternate = driver.findElements(By.id("com.ubsidi:id/tvOrderNumberHOrder"));

				wait.until(ExpectedConditions.visibilityOfAllElements(historyOrderNumberListAlternate));

				String orderWhichIsGoingToBeClicked = historyOrderNumberListAlternate.get(0).getText();       
				//Open Order
				historyOrderNumberListAlternate.get(0).click();

				System.out.println(" - "+ orderWhichIsGoingToBeClicked +" is Opening Now..."+"\r\n");
				logs.info(" - "+ orderWhichIsGoingToBeClicked +" is Opening Now...");

				historyOrderNumberListAlternate.clear();	
			}
			catch(TimeoutException e2)

			{

				//take Screenshot
				DefaultMethods.getScreenShot( "UiBreaking22", driver);
				System.out.println("Error : Trying to 2nd time.... "+"\r\n"+"TimeoutException");	
				logs.info("Error : Trying to 2nd time.... "+"\r\n"+"TimeoutException");



				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
				//click on Latest firstOne order
				List<WebElement> historyOrderNumberListAlternate = driver.findElements(By.id("com.ubsidi:id/tvOrderNumberHOrder"));

				wait.until(ExpectedConditions.visibilityOfAllElements(historyOrderNumberListAlternate));

				String orderWhichIsGoingToBeClicked = historyOrderNumberListAlternate.get(0).getText();       
				//Open Order
				historyOrderNumberListAlternate.get(0).click();

				System.out.println(" - "+ orderWhichIsGoingToBeClicked +" is Opening Now..."+"\r\n");
				logs.info(" - "+ orderWhichIsGoingToBeClicked +" is Opening Now...");

				historyOrderNumberListAlternate.clear();	
			}
			catch(StaleElementReferenceException e3)

			{
				//take Screenshot
				DefaultMethods.getScreenShot( "UiBreaking33", driver);
				System.out.println("Error : Trying to 2nd time.... "+"\r\n"+"StaleElementReferenceException");	
				logs.info("Error : Trying to 2nd time.... "+"\r\n"+"StaleElementReferenceException");

				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
				//click on Latest firstOne order
				List<WebElement> historyOrderNumberListAlternate = driver.findElements(By.id("com.ubsidi:id/tvOrderNumberHOrder"));

				wait.until(ExpectedConditions.visibilityOfAllElements(historyOrderNumberListAlternate));

				String orderWhichIsGoingToBeClicked = historyOrderNumberListAlternate.get(0).getText();       
				//Open Order
				historyOrderNumberListAlternate.get(0).click();

				System.out.println(" - "+ orderWhichIsGoingToBeClicked +" is Opening Now..."+"\r\n");
				logs.info(" - "+ orderWhichIsGoingToBeClicked +" is Opening Now...");

				historyOrderNumberListAlternate.clear();	
			}

		}	

		
		
		
		
		
		
	
	//Only pay By Cash btn Click
	public static void onlyPayByCashBtnClick() throws InterruptedException
	{
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.ubsidi:id/btnCash")));

			//click on pay by cash button
			String payByCashBtnText = driver.findElement(By.id("com.ubsidi:id/btnCash")).getText();

			driver.findElement(By.id("com.ubsidi:id/btnCash")).click();

			System.out.println(" - "+ payByCashBtnText +" is Clicked..."+"\r\n");
			logs.info(" - "+ payByCashBtnText +" is Clicked...");

			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		}catch(NoSuchElementException e1) 

		{

			//take Screenshot
			DefaultMethods.getScreenShot( "UiBreaking11", driver);
			System.out.println("Error : Trying to 2nd time.... "+""+"NoSuchElementException");
			logs.info("Error : Trying to 2nd time.... "+""+"NoSuchElementException");

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.ubsidi:id/btnCash")));

			//click on pay by cash button
			String payByCashBtnText = driver.findElement(By.id("com.ubsidi:id/btnCash")).getText();

			driver.findElement(By.id("com.ubsidi:id/btnCash")).click();

			System.out.println(" - "+ payByCashBtnText +" is Clicked..."+"\r\n");
			logs.info(" - "+ payByCashBtnText +" is Clicked...");
		}
		catch(TimeoutException e2)

		{

			//take Screenshot
			DefaultMethods.getScreenShot( "UiBreaking22", driver);
			System.out.println("Error : Trying to 2nd time.... "+"\r\n"+"TimeoutException");	
			logs.info("Error : Trying to 2nd time.... "+"\r\n"+"TimeoutException");

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.ubsidi:id/btnCash")));

			//click on pay by cash button
			String payByCashBtnText = driver.findElement(By.id("com.ubsidi:id/btnCash")).getText();

			driver.findElement(By.id("com.ubsidi:id/btnCash")).click();

			System.out.println(" - "+ payByCashBtnText +" is Clicked..."+"\r\n");
			logs.info(" - "+ payByCashBtnText +" is Clicked...");
		}
		catch(StaleElementReferenceException e3)

		{
			//take Screenshot
			DefaultMethods.getScreenShot( "UiBreaking33", driver);
			System.out.println("Error : Trying to 2nd time.... "+"\r\n"+"StaleElementReferenceException");	
			logs.info("Error : Trying to 2nd time.... "+"\r\n"+"StaleElementReferenceException");

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.ubsidi:id/btnCash")));

			//click on pay by cash button
			String payByCashBtnText = driver.findElement(By.id("com.ubsidi:id/btnCash")).getText();

			driver.findElement(By.id("com.ubsidi:id/btnCash")).click();

			System.out.println(" - "+ payByCashBtnText +" is Clicked..."+"\r\n");
			logs.info(" - "+ payByCashBtnText +" is Clicked...");

		}



	}

	//back History ToHome
	public static void backHistoryToHome() throws InterruptedException, TimeoutException 
	{	
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(18));

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.ubsidi:id/chipBack")));


			driver.findElement(By.id("com.ubsidi:id/chipBack")).click();
			System.out.println(" - Aerrow Back Button is Clicked..."+"\r\n");
		}catch(NoSuchElementException e1) 

		{

			//take Screenshot
			DefaultMethods.getScreenShot( "UiBreaking1", driver);

			System.out.println("Error : Application Ui Breaks. Directly nevigate to home page"+"\r\n"+"NoSuchElementException");		
		}
		catch(TimeoutException e2)

		{

			//take Screenshot
			DefaultMethods.getScreenShot( "UiBreaking2", driver);

			System.out.println("Error : Application Ui Breaks. Directly nevigate to home page"+"\r\n"+"TimeoutException");		
		}
		catch(StaleElementReferenceException e3)

		{

			//take Screenshot
			DefaultMethods.getScreenShot( "UiBreaking3", driver);

			System.out.println("Error : Application Ui Breaks. Directly nevigate to home page"+"\r\n"+"StaleElementReferenceException");		
		}



	}



	// When Application Ui breaks , it will directly land on Home

	//back Payment  To directly Home
	public static void backPaymentToHome() throws InterruptedException 

	{

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.ubsidi:id/chipBack")));

		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		boolean aerrowBackBtn = driver.findElement(By.id("com.ubsidi:id/chipBack")).isDisplayed();

		if(aerrowBackBtn)
		{
			driver.findElement(By.id("com.ubsidi:id/chipBack")).click();
			System.out.println(" - Aerrow Back Button is Clicked..."+"\r\n");

		}
		else {
			//take Screenshot
			DefaultMethods.getScreenShot( "UiBreaking", driver);

			System.out.println("Error : Application Ui Breaks. Directly nevigate to home page");

		}


	}

}
