package com.ddt.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ddt.base.TestBase;
import com.ddt.pages.AboutUsPage;
import com.ddt.pages.AdminPage;
import com.ddt.pages.HomePage;
import com.ddt.pages.LocationsPage;
import com.ddt.pages.LoginPage;
import com.ddt.pages.ProductsPage;
import com.ddt.pages.ServicesPage;
import com.ddt.utilities.TestUtil;

public class HomePageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	AboutUsPage aboutUsPage;
	ServicesPage servicesPage;
	ProductsPage productsPage;
	LocationsPage locationsPage;
	AdminPage adminPage;
	public HomePageTest(){
		super();
	}
	

	@BeforeMethod
	public void setUp() {
		initialization();
		testUtil = new TestUtil();
		loginPage = new LoginPage();
		aboutUsPage = new AboutUsPage();
		servicesPage = new ServicesPage();
		productsPage = new ProductsPage();
		locationsPage = new LocationsPage();
		adminPage = new AdminPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority=1)
	public void verifyHomePageTitle() {
		String homePageTitle = homePage.verifyHomePageTitle();
		Assert.assertEquals(homePageTitle, "ParaBank | Accounts Overview");
		System.out.println(homePageTitle);
	}
	
	
	@Test(priority=2)
	public void verifyAbousUsLinkTest(){
		aboutUsPage = homePage.clickOnAboutUsLink();
		String aboutUsPage = driver.getTitle();
		System.out.println(aboutUsPage);
	}
	
	@Test(priority=3)
	public void verifyServicesLinkTest(){
		servicesPage = homePage.clickOnServicesLink();
		String servicesPage = driver.getTitle();
		System.out.println(servicesPage);
	}
	
	
	@Test(priority=4)
	public void verifyProductsLinkTest(){
		productsPage = homePage.clickOnProductsLink();
		String productsPage = driver.getTitle();
		System.out.println(productsPage);
	}
	
	@Test(priority=5)
	public void verifyLocationsLinkTest(){
		locationsPage = homePage.clickOnLocationsLink();
		String locationsPage = driver.getTitle();
		System.out.println(locationsPage);
	}
	
	@Test(priority=6)
	public void verifyAdminLinkTest(){
		adminPage = homePage.clickOnAdminLink();
		String adminPage = driver.getTitle();
		System.out.println(adminPage);
	}
	

	

	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	
	
	

}
