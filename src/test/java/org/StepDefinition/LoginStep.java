package org.StepDefinition;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.utilities.BaseClass;
import org.utilities.LoginPojo;

import io.cucumber.java.en.*;

public class LoginStep extends BaseClass {
	@Given("user should open chrome and load url")
	public void userShouldOpenChromeAndLoadUrl() throws AWTException {
	    launchchrome();
	    loadurl("https://www.chemistdirect.co.uk");
	    winMax();
	}

	@When("user should input valid username and valid password")
	public void userShouldInputValidUsernameAndValidPassword() throws InterruptedException {
	    LoginPojo l= new LoginPojo();
	    clkadd(l.getAccept());
	    dynwait(10, TimeUnit.SECONDS);
	    clkadd(l.getContinues());
	    stawait(2000);
	    clkadd(l.getCancel());
	    clkadd(l.getAccout());
	    send(l.getUser(), "ksurendran23@gmail.com");
	    send(l.getPass(), "Surendran22@");
	}

	@When("user should click the login button")
	public void userShouldClickTheLoginButton() {
		 LoginPojo l= new LoginPojo();
		 clkadd(l.getSignin());
	}

	@Then("user should navigate to correct credential page are not")
	public void userShouldNavigateToCorrectCredentialPageAreNot() {
	   String c = driver.getCurrentUrl();
	   Assert.assertTrue("check the conditions", c.contains("home"));
	   System.out.println("our test will be passed");
	   closechrome();
	}
}
