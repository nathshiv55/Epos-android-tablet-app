package com.Ubsidi.Analyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import com.Ubsidi.BasePackage.BaseInit1;

public class MyRetry extends BaseInit1 implements IRetryAnalyzer {

	private int retryCount = 0;
	private static final int maxRetryCount = 3;    //give max retry count here.

	@Override
	public boolean retry(ITestResult result) {
		if (retryCount < maxRetryCount) {
			retryCount++;
			return true;
		}
		return false;
	}
}

//jab bhi isko kisi test me dena ho to aise de 
//    @Test(retryAnalyzer = MyRetry.class)




