package com.base_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dressselect_page {
	public WebDriver driver;
	@FindBy(xpath="//img[@title='Faded Short Sleeve T-shirts']")
	private WebElement dress;
	public Dressselect_page(WebDriver d) {
		this.driver=d;
		PageFactory.initElements(driver, this);
	}
	public WebElement getDress() {
		return dress;
	}	
}