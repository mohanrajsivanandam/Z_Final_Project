package com.base_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Process_Address {
	public WebDriver driver;
	@FindBy(name="message")
	private WebElement message;
	public Process_Address(WebDriver d) {
		this.driver=d;
		PageFactory.initElements(driver, this);
	}
	public WebElement getMessage() {
		return message;
	}	
	@FindBy(name="processAddress']")
	private WebElement pa;
	public WebElement getPa() {
		return pa;
	}
}