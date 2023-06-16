package week8.day2;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnExtentreport {

	public static void main(String[] args) throws IOException {
		//step1:setup the report file to capture the status
		ExtentHtmlReporter reporter =new ExtentHtmlReporter("./reports/result.html");
		//to keep the report history
		reporter.setAppendExisting(true);
		//Create object for Extent Reports
		ExtentReports extent =new ExtentReports();
		//attach the data with physical path
		extent.attachReporter(reporter);
		//Create a test case and test detail
		                 //test name    test description
		ExtentTest test = extent.createTest("LoginTest","Login test for leaftap application");
	
		test.assignCategory("smoke");
		
		test.assignAuthor("vijay");
	
	    //step level status
	    test.pass("Enter User Name");//if status is pass the test will be treated as a pass
	    test.fail("Enter Password");//the status is fail
	    //attach the screenshot ../control still stay in report folder to come out 
	    test.fail("click login button",MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/Login.png").build());
	
	    //Mandatory step
	    extent.flush();
	
	
	}

}