package com.Ubsidi.Dummy;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Ubsidi.BasePackage.BaseInit1;
import com.Ubsidi.Utility.MyLibrary;

public class TestClass2 extends BaseInit1{
/*
	@BeforeClass
	public void setUp() throws Exception
	{
		startUp1();
		//Thread.sleep(2000);
	}
	@Test
	public void factoeyReset() throws Exception
	{
		MyLibrary.factoryDataReset();
	}
	*/
	@Test
	public void setUp() throws Exception
	{
		try
		{
			try
			{
				try
				{
					 int[] myNumbers = {1, 2, 3};
				      System.out.println(myNumbers[5]);
				}
				catch(Exception e)
				{
					 int[] myNumbers = {1, 2, 3};
				      System.out.println(myNumbers[4]);
				}

			}
			catch(Exception e1)
			{
				 int[] myNumbers = {1, 2, 3};
			      System.out.println(myNumbers[21]);
			}

		}
		catch(Exception e2)
		{
			 int[] myNumbers = {1, 2, 3};
		      System.out.println(myNumbers[2]);
		}	

		
}
}