package org.StepDefinition;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.utilities.BaseClass;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends BaseClass{
  @Before(order=1)
  public void configu() throws AWTException {
	  System.out.println("Before Hooks Exceuted");
	    launchchrome();
	    loadurl("https://www.chemistdirect.co.uk");
	    winMax();

}
  @Before(order=2)
  public void starttime() {
	System.out.println(new Date());

}
  @After(order=3)
  public void aftereachscenario(Scenario s) throws IOException {
	  if (s.isFailed()) {
		TakesScreenshot tk= (TakesScreenshot)driver;
		byte[] screen = tk.getScreenshotAs(OutputType.BYTES);
		s.embed(screen, "image/png");
		
	}
	 closechrome();
	 System.out.println("After Hooks Exceuted");
}
  @After(order=1)
  public void endtime() {
	  System.out.println(new Date());

}
}
