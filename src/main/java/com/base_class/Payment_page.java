package com.base_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Payment_page {
	public WebDriver driver;
	@FindBy(xpath="//a[@title='Pay by bank wire']")
	private WebElement payment;
	public Payment_page(WebDriver d) {
		this.driver=d;
	}
	public WebElement getPayment() {
		return payment;
	}
}