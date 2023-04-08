package com.ddt.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ddt.base.TestBase;

public class HomePage extends TestBase {
	
	
	@FindBy(xpath = "//p[contains(text(),'Ravi Kumar')]")
	WebElement userName;
	
	@FindBy(xpath = "/html/body/div[1]/div[2]/ul[1]/li[2]/a")
	WebElement aboutUsLink;

	@FindBy(xpath = "/html/body/div[1]/div[2]/ul[1]/li[3]/a")
	WebElement servicesLink;

	@FindBy(xpath = "/html/body/div[1]/div[2]/ul[1]/li[4]/a")
	WebElement productsLink;
	
	@FindBy(xpath = "/html/body/div[1]/div[2]/ul[1]/li[5]/a")
	WebElement locationsLink;

	@FindBy(xpath = "/html/body/div[1]/div[2]/ul[1]/li[6]/a")
	WebElement adminPageLink;

	// Initializing the Page Objects:
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle(){
		return driver.getTitle();
	}
	
	
//	public void verifyCorrectUserName(){
//		userName.isDisplayed();
//	}
	
	
	public AboutUsPage clickOnAboutUsLink(){
		aboutUsLink.click();
		return new AboutUsPage();
	}
	
	public ServicesPage clickOnServicesLink(){
		servicesLink.click();
		return new ServicesPage();
	}
	
	public ProductsPage clickOnProductsLink(){
		productsLink.click();
		return new ProductsPage();
	}
	
	public LocationsPage clickOnLocationsLink(){
		locationsLink.click();
		return new LocationsPage();
	}
	
	public AdminPage clickOnAdminLink(){
		adminPageLink.click();
		return new AdminPage();
	}
	
//	public void clickOnNewContactLink(){
//		Actions action = new Actions(driver);
//		action.moveToElement(contactsLink).build().perform();
//		newContactLink.click();
//		
//	}
	
	
	
	
	
	
	

}
