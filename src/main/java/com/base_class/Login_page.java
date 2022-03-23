package com.base_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {
	public WebDriver driver;	
	public Login_page(WebDriver d) {
		this.driver = d;
		PageFactory.initElements(driver, this);
	}	
	@FindBy(id="email")
	private WebElement email;
	public WebElement getEmail() {
		return email;
	}
	@FindBy(id="passwd")
	private WebElement pass;
	public WebElement getPass() {
		return pass;
	}
	@FindBy(name="SubmitLogin")
	private WebElement submitlogin;
	public WebElement getSubmitlogin() {
		return submitlogin;
	}
}