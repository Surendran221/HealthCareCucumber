package org.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPojo extends BaseClass{
public ProductPojo() {
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="(//a[text()='Accept all'])[1]")
private WebElement accept;
@FindBy(xpath="//input[@type='button']")
private WebElement continues;
@FindBy(xpath="(//button[@class='sailthru-overlay-close'])[1]")
private WebElement cancel;
@FindBy(xpath="//a[@title='Star Buys']")
private WebElement starbuys;
@FindBy(xpath="//a[@title='Health & Medicine']")
private WebElement healthmed;
@FindBy(xpath="//span[text()='Cold & Flu']")
private WebElement coldflu;
@FindBy(xpath="//a[@title='Cold & Flu']")
private WebElement coldflu2;
@FindBy(xpath="//a[@title='Congestion Relief']")
private WebElement conrelief;
@FindBy(xpath="//a[@title='Cough Remedies']")
private WebElement coughremedis;
@FindBy(xpath="//a[@title='Dry Eyes']")
private WebElement dryeyes;
@FindBy(xpath="//a[@title='Electricals']")
private WebElement electricals;
@FindBy(xpath="//a[@title='Vitamins']")
private WebElement vitamins;
@FindBy(xpath="//span[text()='Vitamins & Supplements']")
private WebElement vitaminssupp;
@FindBy(xpath="//span[text()='Childrens Vitamins']")
private WebElement vitaminschil;
@FindBy(xpath="//span[text()='Mens Vitamins']")
private WebElement vitaminsmens;
@FindBy(xpath="//span[text()='Womens Vitamins']")
private WebElement vitaminswomens;
@FindBy(xpath="//a[@title='Nutritional Vitamin Drinks']")
private WebElement childnutition;
@FindBy(xpath="(//a[@title='Hair, Skin and Nails'])[2]")
private WebElement mensskin;
@FindBy(xpath="(//a[@title='Pregnancy Supplements'])[2]")
private WebElement womenspregnancy;
@FindBy(xpath="//a[contains(text(),'Sudafed Congestion & Headache Relief M')]")
private WebElement congestiontablet;
@FindBy(xpath="//a[text()='Hycosan Extra']")
private WebElement dryeyestablet;
@FindBy(xpath="(//a[contains(text(),'PaediaSure Shake Powder Chocola')])[1]")
private WebElement childnutitiontablet;
@FindBy(xpath="//a[contains(text(),'Numark Vita')]")
private WebElement mensthairtablet;
@FindBy(xpath="(//a[text()='Ferrous Sulphate 200mg'])[1]")
private WebElement womenpreganacytablet;
public WebElement getAccept() {
	return accept;
}
public WebElement getContinues() {
	return continues;
}
public WebElement getCancel() {
	return cancel;
}
public WebElement getStarbuys() {
	return starbuys;
}
public WebElement getHealthmed() {
	return healthmed;
}
public WebElement getColdflu() {
	return coldflu;
}
public WebElement getColdflu2() {
	return coldflu2;
}
public WebElement getConrelief() {
	return conrelief;
}
public WebElement getCoughremedis() {
	return coughremedis;
}
public WebElement getDryeyes() {
	return dryeyes;
}
public WebElement getElectricals() {
	return electricals;
}
public WebElement getVitamins() {
	return vitamins;
}
public WebElement getVitaminssupp() {
	return vitaminssupp;
}
public WebElement getVitaminschil() {
	return vitaminschil;
}
public WebElement getVitaminsmens() {
	return vitaminsmens;
}
public WebElement getVitaminswomens() {
	return vitaminswomens;
}
public WebElement getChildnutition() {
	return childnutition;
}
public WebElement getMensskin() {
	return mensskin;
}
public WebElement getWomenspregnancy() {
	return womenspregnancy;
}
public WebElement getCongestiontablet() {
	return congestiontablet;
}
public WebElement getDryeyestablet() {
	return dryeyestablet;
}
public WebElement getChildnutitiontablet() {
	return childnutitiontablet;
}
public WebElement getMensthairtablet() {
	return mensthairtablet;
}
public WebElement getWomenpreganacytablet() {
	return womenpreganacytablet;
}


}
