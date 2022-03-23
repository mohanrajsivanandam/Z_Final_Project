package com.base_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addtocart_page {
	public WebDriver driver;
	public Addtocart_page(WebDriver d) {
	this.driver=d;
	PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//i[@class='icon-plus']")
	private WebElement qty;
	public WebElement getQty() {
		return qty;
	}
	@FindBy(id="group_1")
	private WebElement dropdown;
	public WebElement getDropdown() {
		return dropdown;
	}
	@FindBy(name="Blue")
	private WebElement color;
	public WebElement getColor() {
		return color;
	}
	@FindBy(name="Submit")
	private WebElement addtocart;
	public WebElement getAddtocart() {
		return addtocart;
	}	
}