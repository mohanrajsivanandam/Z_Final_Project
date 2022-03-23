package com.base_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProceedtoCheckout3 {
	public WebDriver driver;
	@FindBy(name="processAddress")
	private WebElement proceed3;
	public ProceedtoCheckout3(WebDriver d) {
		this.driver=d;
	}
	public WebElement getProceed3() {
		return proceed3;
	}
}