package org.utilities;

import java.awt.AWTException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class BrowserLaunch extends BaseClass {
	@BeforeClass
	public static void browser() throws AWTException {
		launchchrome();
		winMax();

	}
	@Before
	public  void starttime() {
		loadurl("https://www.chemistdirect.co.uk");
		Date  d = new Date();
		System.out.println("Start time:"+d);
	}
	@After
	public void Endtime() {   
		Date d = new Date();     
		System.out.println("End time:"+d);

	}
	@Test
	public void tc1() throws InterruptedException {
		LoginPojo l= new LoginPojo();
		clkadd(l.getAccept());
		dynwait(10, TimeUnit.SECONDS);
	    clkadd(l.getContinues());
	    stawait(1000);
	    clkadd(l.getCancel());
	    ProductPojo p= new ProductPojo();
	    move(p.getHealthmed());
	    move(p.getColdflu());
	    move2(p.getColdflu2());
      
	}
	

}
