package org.StepDefinition;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.utilities.BaseClass;
import org.utilities.LoginPojo;
import org.utilities.RegisterPojo;

import io.cucumber.java.en.*;

public class CreateAccStep extends BaseClass{

@Given("user should open chrome and load urL")
public void userShouldOpenChromeAndLoadUrL() throws AWTException {
	    launchchrome();
	    loadurl("https://www.chemistdirect.co.uk");
	    winMax();
}
@When("user should accept details")
public void userShouldAcceptDetails() throws InterruptedException {
	 LoginPojo l= new LoginPojo();
	    clkadd(l.getAccept());
	    dynwait(10, TimeUnit.SECONDS);
	    clkadd(l.getContinues());
	    stawait(2000);
	    clkadd(l.getCancel());
	    clkadd(l.getAccout());
}


@When("user should input details of the page")
public void userShouldInputDetailsOfThePage()  {
	RegisterPojo r= new RegisterPojo();
	clkadd(r.getCreateacc());
	selein(r.getSelectoption(), 1);
	send(r.getFirstname(), "amar");
	send(r.getLastname(), "k");
	send(r.getEmail(), "amarkolanchi22@gmail.com");
	send(r.getPassword(), "amarnath22@");
	send(r.getConfirmpassword(), "amarnath22@");
	selein(r.getDay(),22);
	selein(r.getMonth(), 1);
	selein(r.getYear(), 15);
	clkadd(r.getFrststchkbox());
	 dynwait(10, TimeUnit.SECONDS);
	clkadd(r.getAgree());
	
	    
}

@When("user should click the register button")
public void userShouldClickTheRegisterButton() {
	RegisterPojo r= new RegisterPojo();
	clkadd(r.getRegister());
}

@Then("user should navigate to correct credential page Are not")
public void userShouldNavigateToCorrectCredentialPageAreNot() {
    System.out.println("our test is passed");
}
}
