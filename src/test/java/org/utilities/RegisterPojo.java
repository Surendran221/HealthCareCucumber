package org.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPojo extends BaseClass{
public RegisterPojo() {
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
@FindBy(xpath="//button[text()='Create an Account']")
private WebElement createacc;
@FindBy(xpath="//select[@name='reg_title']")
private WebElement selectoption;
@FindBy(xpath="//input[@id='reg_first_name']")
private WebElement firstname;
@FindBy(xpath="//input[@id='reg_last_name']")
private WebElement lastname;
@FindBy(xpath="//input[@id='reg_email']")
private WebElement email;
@FindBy(xpath="//input[@id='reg_pass']")
private WebElement password;
@FindBy(xpath="//input[@id='reg_passConf']")
private WebElement confirmpassword;
@FindBy(xpath="//select[@id='reg_dobDay']")
private WebElement day;
@FindBy(xpath="//select[@id='reg_dobMonth']")
private WebElement month;
@FindBy(xpath="//select[@id='reg_dobYear']")
private WebElement year;
@FindBy(xpath="(//ins[@class='iCheck-helper'])[1]")
private WebElement frststchkbox;
@FindBy(xpath="(//ins[@class='iCheck-helper'])[3]")
private WebElement agree;
@FindBy(xpath="//button[text()='Register']")
private WebElement register;
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
public WebElement getCreateacc() {
	return createacc;
}
public WebElement getSelectoption() {
	return selectoption;
}
public WebElement getFirstname() {
	return firstname;
}
public WebElement getLastname() {
	return lastname;
}
public WebElement getEmail() {
	return email;
}
public WebElement getPassword() {
	return password;
}
public WebElement getConfirmpassword() {
	return confirmpassword;
}
public WebElement getDay() {
	return day;
}
public WebElement getMonth() {
	return month;
}
public WebElement getYear() {
	return year;
}
public WebElement getFrststchkbox() {
	return frststchkbox;
}
public WebElement getAgree() {
	return agree;
}
public WebElement getRegister() {
	return register;
}
}
