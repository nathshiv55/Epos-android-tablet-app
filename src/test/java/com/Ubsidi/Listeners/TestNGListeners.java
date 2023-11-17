package com.Ubsidi.Listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestListener {
	
	public void onTestStart(ITestResult result)
	{
		
		System.out.println("TestCase is starting");
		
	}
	
	
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("TestCase executed successfully");

		
	}
	
	public void onTestFailure(ITestResult result)
	{
		System.out.println("TestCase is failed- "+result.getName());  //it will print the name of failed method also

		
	}
	
	
	public void onTestSkipped(ITestResult result)
	{
		
		
		System.out.println("TestCase is Skipped- "+result.getName());   //it will print the name of skipped method also	
		
	}

}
