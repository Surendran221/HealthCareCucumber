package org.StepDefinition;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.utilities.BaseClass;
import org.utilities.IconPojo;
import org.utilities.Product2Pojo;

import io.cucumber.java.en.*;

public class ProductStep2 extends BaseClass{

	@Given("User should open Chrome And loaD urL")
	public void userShouldOpenChromeAndLoaDUrL() throws AWTException {
		launchchrome();
	    loadurl("https://www.chemistdirect.co.uk");
	    winMax();
	}

	@When("user should ClicK search box passinG values")
	public void userShouldClicKSearchBoxPassinGValues() throws InterruptedException {
		IconPojo i = new IconPojo();
	    clkadd(i.getAccept());
	    dynwait(10, TimeUnit.SECONDS);
	    clkadd(i.getContinues());
	    stawait(2000);
	    clkadd(i.getCancel());
	}

	@When("user Should Input detailS of the PagE")
	public void userShouldInputDetailSOfThePagE() {
		Product2Pojo p =new Product2Pojo();
		   move(p.getToiletries());
		   move(p.getDental());
		   move2(p.getMouthwash());
	}

	@When("user shoulD click the searcH buttoN")
	public void userShoulDClickTheSearcHButtoN() {
		Product2Pojo p =new Product2Pojo();
		WebElement m = p.getMouthwashprice();
		
	}

	@Then("user shouLd navigate to Correct credential page Are NoT")
	public void userShouLdNavigateToCorrectCredentialPageAreNoT() {
		String c = driver.getCurrentUrl();
	    Assert.assertTrue("chk the con", c.contains("care"));
	    //closechrome();
	    System.out.println("Test 1 is Passed");
	}

	@When("user ShOuld Click Search box passinG values")
	public void userShOuldClickSearchBoxPassinGValues() throws InterruptedException {
		IconPojo i = new IconPojo();
	    clkadd(i.getAccept());
	    dynwait(10, TimeUnit.SECONDS);
	    clkadd(i.getContinues());
	    stawait(2000);
	    clkadd(i.getCancel());
	}

	@When("user Should input DetailS oF the PagE")
	public void userShouldInputDetailSOFThePagE() {
		Product2Pojo p =new Product2Pojo();
		 move(p.getSkincare());
		 move(p.getLips());
		 move2(p.getLipcare());
	}

	@When("user shouLd click thE searcH bUtton")
	public void userShouLdClickThESearcHBUtton() {
		Product2Pojo p =new Product2Pojo();
		p.getLipcareprice();
		
	}

	@Then("user should NavigAte to Correct credential page Are NoT")
	public void userShouldNavigAteToCorrectCredentialPageAreNoT() {
	   String tit = driver.getTitle();
	   Assert.assertTrue("chk con", tit.contains("lip"));
	  // closechrome();
	   System.out.println("Test 2 is Passed");
	}



}
