package com.base_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Proceedtocheckout1 {
	public WebDriver driver;
	@FindBy(xpath="//a[@title='Proceed to checkout']")
	private WebElement proceed;
	public Proceedtocheckout1(WebDriver d) {
		this.driver=d;
		PageFactory.initElements(driver, this);
	}
	public WebElement getProceed() {
		return proceed;
	}
}