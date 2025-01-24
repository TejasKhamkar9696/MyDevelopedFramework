package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.SearchRestaurantFoodPage;
import TestBase.BaseClass;

public class Tc_002SearchRestaurantFoodPageTest extends BaseClass{
	
	@Test
	public void isProuctAddedFromSearchPage() throws InterruptedException
	{
		
		//homepage
		HomePage hp= new HomePage(driver);
		hp.addLocation(p.getProperty("location"));
		hp.clickSearchForFood();
		
		//serachpage
		SearchRestaurantFoodPage srf= new SearchRestaurantFoodPage(driver);
		boolean islogoDisplayed=srf.isSwiggyTitleDisplayed();
		srf.enterSearchItem(p.getProperty("food"));
		Thread.sleep(2000);
		srf.selectFirstVisibleItem();
		srf.clickContinueBtn();
		srf.clickAddItemToCartBtn();
		Thread.sleep(2000);
		boolean isProductAdded= srf.isProductAddedToCart();
		
		Assert.assertEquals(isProductAdded, true);
		Assert.assertEquals(islogoDisplayed, true);
		
		Thread.sleep(30000);
		
	}

}
