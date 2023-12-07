package resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterNG {
	
	static ExtentReports extent;

	public static ExtentReports getReporterObject() {
		// ExtentReports, ExtentSparkReporter
		
		String path = System.getProperty("user.dir")+"/reports/index.html";
		//String path = "/home/pp-8/Desktop/vishakha/Selenium_Training/Selenium/Projects/ExtentReports/reports/index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Web Automation Results");
		reporter.config().setDocumentTitle("Test Results");
		
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Vishakha Patariya");
		
		return extent;
	}

}
