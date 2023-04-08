package com.ddt.pages;import org.openqa.selenium.WebElement;import org.openqa.selenium.support.FindBy;import org.openqa.selenium.support.PageFactory;import com.ddt.base.TestBase;

public class AboutUsPage extends TestBase {			@FindBy(linkText =  "About Us")	WebElement aboutUsLink;			// Initializing the Page Objects:	public AboutUsPage() {		PageFactory.initElements(driver, this);	}		public String verifyAboutUsPageTitle() {		return driver.getTitle();	}		
}
