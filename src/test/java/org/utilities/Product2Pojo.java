package org.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product2Pojo extends BaseClass{
public Product2Pojo() {
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//a[@title='Toiletries']")
private WebElement toiletries;
@FindBy(xpath="//a[@title='Skincare']")
private WebElement skincare;
@FindBy(xpath="//a[@title='Baby & Child']")
private WebElement babychild;
@FindBy(xpath="//span[text()='Dental']")
private WebElement dental;
@FindBy(xpath="//a[@title='Mouthwashes']")
private WebElement mouthwash;
@FindBy(xpath="//a[contains(text(),'Aquafresh Co')]")
private WebElement mouthwashprice;
@FindBy(xpath="//span[text()='Baby & Child Food']")
private WebElement babyfood;
@FindBy(xpath="//a[@title='Vegetarian & Organic	']")
private WebElement vegorganic;
@FindBy(xpath="//a[contains(text(),'HiPP Organic Vegetables With Rice & Chicken Jar 6+ Months')]")
private WebElement vegorganicprice;
@FindBy(xpath="//span[text()='Face & Body']")
private WebElement faceskin;
@FindBy(xpath="(//a[@title='Body Moisturisers'])[2]")
private WebElement moisture;
@FindBy(xpath="(//a[contains(text(),'Palm')])[5]")
private WebElement moistureprice;
@FindBy(xpath="//span[text()='Hands, Feet & Lips']")
private WebElement lips;
@FindBy(xpath="//a[@title='Organic Lip Care']")
private WebElement lipcare;
@FindBy(xpath="//a[text()='Weleda Skin Food Lip Balm ']")
private WebElement lipcareprice;
public WebElement getToiletries() {
	return toiletries;
}
public WebElement getSkincare() {
	return skincare;
}
public WebElement getBabychild() {
	return babychild;
}
public WebElement getDental() {
	return dental;
}
public WebElement getMouthwash() {
	return mouthwash;
}
public WebElement getMouthwashprice() {
	return mouthwashprice;
}
public WebElement getBabyfood() {
	return babyfood;
}
public WebElement getVegorganic() {
	return vegorganic;
}
public WebElement getVegorganicprice() {
	return vegorganicprice;
}
public WebElement getFaceskin() {
	return faceskin;
}
public WebElement getMoisture() {
	return moisture;
}
public WebElement getMoistureprice() {
	return moistureprice;
}
public WebElement getLips() {
	return lips;
}
public WebElement getLipcare() {
	return lipcare;
}
public WebElement getLipcareprice() {
	return lipcareprice;
}
}
