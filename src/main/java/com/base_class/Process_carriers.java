package com.base_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Process_carriers {
	public WebDriver driver;
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement checkbox;
	public Process_carriers(WebDriver d) {
		this.driver=d;
		PageFactory.initElements(driver, this);
	}
	public WebElement getCheckbox() {
		return checkbox;
	}
	@FindBy(name="processCarrier")
	private WebElement processCarrier;
	public WebElement getProcessCarrier() {
		return processCarrier;
	}
}