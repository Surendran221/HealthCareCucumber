package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\FeatureFiles\\CreateAcc.feature",glue="org.StepDefinition",dryRun=false,snippets=SnippetType.CAMELCASE)
public class TestRunner2 {
   
}
