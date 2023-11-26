package org.StepDefinition;

import java.awt.AWTException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.utilities.BaseClass;
import org.utilities.IconPojo;

import io.cucumber.java.en.*;

public class IconStep  extends BaseClass{

@Given("user should open chrome and loaD urL")
public void userShouldOpenChromeAndLoaDUrL() throws AWTException {
	launchchrome();
    loadurl("https://www.chemistdirect.co.uk");
    winMax();
}

@When("user should click search box passing values")
public void userShouldClickSearchBoxPassingValues() throws InterruptedException {
    IconPojo i = new IconPojo();
    clkadd(i.getAccept());
    dynwait(10, TimeUnit.SECONDS);
    clkadd(i.getContinues());
    stawait(2000);
    clkadd(i.getCancel());
}

@When("user should click the search button")
public void userShouldClickTheSearchButton() {
	IconPojo i = new IconPojo();
	clkadd(i.getSearchicon());
}

@Then("user should navigate to correct credential page Are Not")
public void userShouldNavigateToCorrectCredentialPageAreNot() {
	String tit = driver.getTitle();
   Assert.assertTrue("chk the condition", tit.contains("Results"));
}
@When("user should input detailS of the pagE")
public void userShouldInputDetailSOfThePagE(io.cucumber.datatable.DataTable d) {
   List<String> a = d.asList();
   String s1 = a.get(3);
   IconPojo i = new IconPojo();
   fill(i.getSearch(), s1);
   
}
}
