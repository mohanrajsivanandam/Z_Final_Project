package com.base_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProceedtoCheckout2 {
	public WebDriver driver;
	@FindBy(xpath="(//a[@title='Proceed to checkout'])[2]")
	private WebElement proceed2;
	public ProceedtoCheckout2(WebDriver d) {
		this.driver=d;
		PageFactory.initElements(driver, this);	
	}
	public WebElement getProceed2() {
		return proceed2;
	}
}