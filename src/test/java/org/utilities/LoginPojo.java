package org.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass{
public LoginPojo() {
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="(//a[text()='Accept all'])[1]")
private WebElement accept;
@FindBy(xpath="//input[@type='button']")
private WebElement continues;
@FindBy(xpath="(//button[@class='sailthru-overlay-close'])[1]")
private WebElement cancel;
@FindBy(xpath="//div[@class='cd-header-account']")
private WebElement accout;
@FindBy(id="signin_email")
private WebElement user;
@FindBy(id="signin_password")
private WebElement pass;
@FindBy(xpath="//button[text()='Sign In']")
private WebElement signin;
public WebElement getAccept() {
	return accept;
}
public WebElement getContinues() {
	return continues;
}
public WebElement getCancel() {
	return cancel;
}
public WebElement getAccout() {
	return accout;
}
public WebElement getUser() {
	return user;
}
public WebElement getPass() {
	return pass;
}
public WebElement getSignin() {
	return signin;
}

}
