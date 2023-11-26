package org.StepDefinition;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.utilities.BaseClass;
import org.utilities.IconPojo;
import org.utilities.ProductPojo;

import io.cucumber.java.en.*;

public class ProductStep extends BaseClass{
	@Given("User should open chrome and loaD urL")
	public void userShouldOpenChromeAndLoaDUrL() throws AWTException {
		launchchrome();
	    loadurl("https://www.chemistdirect.co.uk");
	    winMax();
	}

	@When("user should Click search box passing values")
	public void userShouldClickSearchBoxPassingValues() throws InterruptedException {
		IconPojo i = new IconPojo();
	    clkadd(i.getAccept());
	    dynwait(10, TimeUnit.SECONDS);
	    clkadd(i.getContinues());
	    stawait(2000);
	    clkadd(i.getCancel());
	}

	@When("user Should input detailS of the pagE")
	public void userShouldInputDetailSOfThePagE() {
	    ProductPojo p= new ProductPojo();
	    move(p.getHealthmed());
	    move(p.getColdflu());
	    move2(p.getDryeyes());
	}

	@When("user should click the searcH button")
	public void userShouldClickTheSearcHButton() throws IOException {
	   TakesScreenshot tk = (TakesScreenshot)driver;
	   File src = tk.getScreenshotAs(OutputType.FILE);
	   File dsc= new File("C:\\Users\\SURENDRAN\\eclipse-workspace\\MyProjectCucumber\\target\\dryeyesscreen\\dry.jpg");
	   FileUtils.copyFile(src, dsc);
	}

	@Then("user should navigate to Correct credential page Are Not")
	public void userShouldNavigateToCorrectCredentialPageAreNot() {
		String tit = driver.getTitle();
	    Assert.assertTrue("chk the cond", tit.contains("Dry Eyes"));
	    System.out.println("test is passed");
	}


}
