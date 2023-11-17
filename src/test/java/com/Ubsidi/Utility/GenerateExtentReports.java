package com.Ubsidi.Utility;

import com.Ubsidi.BasePackage.BaseInit1;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class GenerateExtentReports extends BaseInit1 {
	
	public static void testGenerateReports() throws Exception
	{
		
	    reporter = new ExtentSparkReporter("./src/main/java/reports/TestResults.html");
		reporter.config().setDocumentTitle("Test Reports");
		reporter.config().setReportName("Unsidi_Epos-Test Results");
		reporter.config().setTheme(Theme.STANDARD);
		
		report = new ExtentReports();
		report.attachReporter(reporter);	
		report.setSystemInfo("Environment", "QA");
		report.setSystemInfo("TeamName", "Team A");
		report.setSystemInfo("Tester Name ", "Shiv");
		
	}
		
	    /*    
	
		 test = report.createTest("TestCase 1");		
        test.log(Status.INFO, "Statement 1");
        
        Thread.sleep(2000);

        test.log(Status.INFO, "Statement 2");

        Thread.sleep(1000);
        
       
        test.log(Status.PASS, "TestCase is executed successfully");
        
        

	    test = report.createTest("TestCase 2");		
        test.log(Status.INFO, "Statement 2.1");
        
        Thread.sleep(2000);

        test.log(Status.INFO, "Statement 2.2");

        Thread.sleep(1000);
            
        test.log(Status.FAIL, "There is something wrong in actual result");
        
        

	    test = report.createTest("TestCase 3");		
        test.log(Status.INFO, "Statement 3.1");
        
        Thread.sleep(2000);

        test.log(Status.INFO, "Statement 3.2");

        Thread.sleep(1000);
           
        test.log(Status.SKIP, "Skipping TestCase");

        */
        
	public static void testGenerateReportsEnd() throws Exception   
	{
		 
        report.flush();
	}
        

}


