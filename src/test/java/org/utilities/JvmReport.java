package org.utilities;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
public static void generatejvmreport(String jsonpath) {
	File f = new File(System.getProperty("user.dir")+"\\target\\Report\\JVMReport");
	
	Configuration con= new Configuration(f, "HEALTHCARE");
	con.addClassifications("Domain", "HEALTHCARE");
	con.addClassifications("Browser", "Chrome");
	con.addClassifications("Browser version", "119");
	con.addClassifications("OS", "Windows");
	con.addClassifications("Windows Version", "Windows 10");
	
	List<String>li= new ArrayList<String>();
	li.add(jsonpath);
	
	ReportBuilder r=  new ReportBuilder(li, con);
	r.generateReports();
    
}
}
