package org.newgen.testrunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.newgen.test.repots.GtmJvmReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\resources\\legal.feature",
		glue = "org.newgen.test.automation",
		dryRun = false,
		tags= {"@login,@legal"},
		monochrome = true,
		
				 plugin = {"pretty",
                         "html:target/htmlreports",
                         "json:target/jsonreport1.json",
                         "junit:target/junitreport.html","rerun:target/Failed.txt"}
				 
		)
public class GTM_LegalRnunner {
@AfterClass
	
	public static void report() {
	GtmJvmReport.generateReport("C:\\Users\\ranjith.p\\eclipse-workspace\\NewgenTestAutomation2\\target\\jsonreport1.json");
	}

}
