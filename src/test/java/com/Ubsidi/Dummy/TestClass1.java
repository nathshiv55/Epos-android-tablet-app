package com.Ubsidi.Dummy;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.Ubsidi.BasePackage.BaseInit;
import com.github.javafaker.Faker;

public class TestClass1 extends BaseInit {
	
@Test
	public void startUp1()
	{
/*		
		//Click on Allow
		driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button")).click();
		Thread.sleep(4000);
		//LoginBusines
		driver.findElement(By.id("com.ubsidi:id/input_username")).sendKeys(appdata.getProperty("email1"));
		driver.findElement(By.id("com.ubsidi:id/input_password")).sendKeys(appdata.getProperty("password1"));
		driver.findElement(By.id("com.ubsidi:id/btn_login")).click();
		Thread.sleep(4000);
		//select Tiffin tom Limited
		driver.findElement(By.id("com.ubsidi:id/tvBusiness")).click();
		driver.findElement(By.id("com.ubsidi:id/btnConfirm")).click();
		//fetching Data
		Thread.sleep(60000);

		//Select auto sync mode
		//Click on Setting
		driver.findElement(By.id("com.ubsidi:id/btnConfirm")).click();
		//Click on OrderSync Mode
		driver.findElement(By.id("com.ubsidi:id/tvOrderSyncMode")).click();
		//Click on Auto
		driver.findElement(By.xpath("//android.widget.TextView[text@='Auto']")).click();
		//Click on Confirm
		driver.findElement(By.id("com.ubsidi:id/btnConfirm")).click();
		//Enter password
		driver.findElement(By.id("com.ubsidi:id/etPassword")).sendKeys(appdata.getProperty("pwd1"));
		//Click on Confirm
		driver.findElement(By.id("com.ubsidi:id/btnConfirm")).click();

		//Select user name
		String wtName = appdata.getProperty("waiterName2");
		// Construct the XPath expression
		String xpathExpression1 = "//android.widget.TextView[@text='" + wtName + "']";
		driver.findElement(By.xpath(xpathExpression1)).click();
		//Enter Password
		driver.findElement(By.id("com.ubsidi:id/input_password")).sendKeys(appdata.getProperty("pd1"));
		//Click on login
		driver.findElement(By.id("com.ubsidi:id/btn_login")).click();
		Thread.sleep(5000);


		
		
		//Generate random UserName
		@Test
		public void generateRandomUserName()
		{
			Faker faker = new Faker();

			String name = faker.name().fullName();
			String firstName = faker.name().firstName();
			String lastName = faker.name().lastName();

			String streetAddress = faker.address().streetAddress();
			
			String mobileNo = "07" + faker.number().digits(8);

			int dads =  faker.number().numberBetween(-1, 10);
			System.out.println(dads);

			System.out.println(name);
			System.out.println(firstName);

			System.out.println(lastName);

			System.out.println(streetAddress);
			
			System.out.println(mobileNo);
			
			
			*/
	
	
	 Map<String, Integer> variableMap = new HashMap<>();

     // Generate random variable names and associate them with values
     for (int i = 0; i < 5; i++) {
         String variableName = generateRandomVariableName();
         int variableValue = i * 10; // You can use any value you want

         // Store the variable name and value in the map
         variableMap.put(variableName, variableValue);
     }

     // Access and print the values associated with variable names
     for (String variableName : variableMap.keySet()) {
         int variableValue = variableMap.get(variableName);
         System.out.println(variableName + " = " + variableValue);
     }
 }

 // Generate a random variable-like name (e.g., var0, var1, var2, ...)
 private static String generateRandomVariableName() {
     return "var" + (int) (Math.random() * 100);
	/*
	In this code:

	We create a HashMap called variableMap to associate randomly generated variable names with integer values.

	Inside a loop, we generate random variable-like names using the generateRandomVariableName() method and associate them with integer values (in this case, we use i * 10 as the value for demonstration purposes).

	We store the variable names and values in the variableMap.

	After storing all the values, we iterate over the map and print the variable names and their corresponding values.

	The generateRandomVariableName() method generates variable names like "var0," "var1," "var2," and so on. You can adjust the range of random variable names as needed by modifying the method.



*/



	}
 }

