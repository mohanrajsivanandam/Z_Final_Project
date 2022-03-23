package com.base_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Women_page {
	public WebDriver driver;
	@FindBy(xpath="//a[@title='Women']")
		private WebElement dress1;
		public Women_page(WebDriver d) {
			this.driver=d;
			PageFactory.initElements(driver, this);
	}
		public WebElement getWomen() {
			return dress1;
		}
}