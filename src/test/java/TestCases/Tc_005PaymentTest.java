package TestCases;

import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.PaymentPage;
import PageObjects.SearchRestaurantFoodPage;
import PageObjects.SecureCheckoutPage;
import TestBase.BaseClass;

public class Tc_005PaymentTest extends BaseClass {
	
	@Test
	public void end_to_end_Test() throws InterruptedException
	{
		//homepage
		HomePage hp= new HomePage(driver);
		hp.addLocation(p.getProperty("location"));
		hp.clickSearchForFood();
		
		//serachpage
		SearchRestaurantFoodPage srf= new SearchRestaurantFoodPage(driver);
		srf.enterSearchItem(p.getProperty("food"));
		Thread.sleep(2000);
		srf.selectFirstVisibleItem();
		srf.clickContinueBtn();
		srf.clickAddItemToCartBtn();
		Thread.sleep(2000);
		srf.clickCartBtn();
		
		
		Thread.sleep(5000);
		
		//SECURECHECKOUTPAGE
		SecureCheckoutPage scp= new SecureCheckoutPage(driver);
		scp.fillCheckoutInfo();
		Thread.sleep(60000);
		
		//Pyament page
		PaymentPage pp= new PaymentPage(driver);
		pp.fillPyamentInfo();
		Thread.sleep(5000);
		
	}

}
