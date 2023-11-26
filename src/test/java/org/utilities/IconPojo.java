package org.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IconPojo extends BaseClass{
	public IconPojo() {
		PageFactory.initElements(driver, this);
}
	@FindBy(xpath="(//a[text()='Accept all'])[1]")
	private WebElement accept;
	@FindBy(xpath="//input[@type='button']")
	private WebElement continues;
	@FindBy(xpath="(//button[@class='sailthru-overlay-close'])[1]")
	private WebElement cancel;
	@FindBy(xpath="//input[@id='sli_search_1']")
	private WebElement search;
	@FindBy(xpath="//input[@id='search_magnifier']")
	private WebElement searchicon;
	@FindBy(xpath="//div[@id='ge_shipping_switcher']")
	private WebElement countries;
	@FindBy(xpath="//div[@class='cd-header-account']")
	private WebElement headacc;
	@FindBy(xpath="//a[@class='cd-basket-button']")
	private WebElement basket;
	@FindBy(xpath="//select[@id='gle_selectedCountry']")
	private WebElement countrylist;
	@FindBy(xpath="//select[@id='gle_selectedCurrency']")
	private WebElement countryrupee;
	@FindBy(xpath="//input[@class='glCancelBtn']")
	private WebElement savecountry;
	@FindBy(xpath="//input[@class='Backtoshop']")
	private WebElement cancelcountry;
	public WebElement getAccept() {
		return accept;
	}
	public WebElement getContinues() {
		return continues;
	}
	public WebElement getCancel() {
		return cancel;
	}
	public WebElement getSearch() {
		return search;
	}
	public WebElement getSearchicon() {
		return searchicon;
	}
	public WebElement getCountries() {
		return countries;
	}
	public WebElement getHeadacc() {
		return headacc;
	}
	public WebElement getBasket() {
		return basket;
	}
	public WebElement getCountrylist() {
		return countrylist;
	}
	public WebElement getCountryrupee() {
		return countryrupee;
	}
	public WebElement getSavecountry() {
		return savecountry;
	}
	public WebElement getCancelcountry() {
		return cancelcountry;
	}
	
	
}
