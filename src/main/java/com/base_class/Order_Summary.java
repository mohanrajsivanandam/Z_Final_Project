package com.base_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order_Summary {
	public WebDriver driver;
	@FindBy(xpath="//button[@class='button btn btn-default button-medium']")
	private WebElement iconfirmmyorder;
	public Order_Summary(WebDriver d) {
	this.driver=d;
	PageFactory.initElements(driver, this);
	}
	public WebElement getIconfirmmyorder() {
		return iconfirmmyorder;
	}
}