package org.newgen.testrunner;

import org.newgen.test.repots.GtmJvmReport;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.newgen.test.repots.GtmJvmReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\resources\\gtmInitiate.feature",
		glue = "org.newgen.test.automation",
		dryRun = false,
		tags= {"@login,@workitemno"},
		monochrome = true,
		
				 plugin = {"pretty",
                         "html:target/htmlreports",
                         "json:target/jsonreport1.json",
                         "junit:target/junitreport.html","rerun:target/Failed.txt"}
				 
		)
public class GtmTestRunner {
@AfterClass
	
	public static void report() {
	GtmJvmReport.generateReport("C:\\Users\\ranjith.p\\eclipse-workspace\\NewgenTestAutomation2\\target\\jsonreport1.json");
	}

}
