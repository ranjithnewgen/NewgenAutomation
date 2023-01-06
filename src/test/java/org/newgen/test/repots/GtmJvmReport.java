package org.newgen.test.repots;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class GtmJvmReport {
	public static void generateReport(String path) {
		File f=new File("C:\\Users\\ranjith.p\\eclipse-workspace\\NewgenTestAutomation2\\target\\JvmReport");
		Configuration c = new Configuration(f, "omniapp");
		c.addClassifications("OS", "Windows");
		c.addClassifications("Version", "10");
		List<String> l=new ArrayList<String>();
		l.add(path);
		ReportBuilder r= new ReportBuilder(l, c);
		r.generateReports();
		
	
	}

}
