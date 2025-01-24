package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import TestBase.BaseClass;

public class Tc_001HomePageTest extends BaseClass{
	
	@Test
	public void addlocation() throws InterruptedException
	{
		try {
			HomePage hp= new HomePage(driver);
			hp.addLocation(p.getProperty("location"));
			hp.clickSearchForFood();
			//System.out.println(hp.isLogoDisplayed());
			Assert.assertTrue(hp.isLogoDisplayed());
		}
		catch(Exception e)
		{
			System.out.println("Caught Exception ------->"+ e);
		}
		Thread.sleep(2000);
	}

}
