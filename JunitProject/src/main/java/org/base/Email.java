package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Email extends BaseCls{
		
		public Email() {
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath="//input[@class='whsOnd zHQkBf']")
		private WebElement email;

		public WebElement getEmail() {
			return email;
		}
}
