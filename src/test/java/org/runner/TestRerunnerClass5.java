package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.utilities.JvmReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features="@src\\test\\resources\\ReRun\\failed.txt",glue="org.StepDefinition",dryRun=false,snippets=SnippetType.CAMELCASE,
plugin= {"html:target\\Report",
		"junit:target\\Report\\health.xml",
		"json:target\\Report\\product.json",
		"rerun:src\\test\\resources\\ReRun\\failed.txt"})
public class TestRerunnerClass5 extends JvmReport{
	@AfterClass
	public static void Medicines() {
		generatejvmreport(System.getProperty("user.dir")+"\\target\\Report\\product.json");
                                               
}         
}