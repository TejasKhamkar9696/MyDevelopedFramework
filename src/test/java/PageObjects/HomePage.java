package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	By locationInputbox= By.id("location");
	By searchForFoodORItem= By.xpath("//div[contains(text(),'Search for restaurant, item or more')]");
	By swiggyLogo= By.xpath("(//img[@loading='lazy'])[1]");
	
	
	
	public void addLocation(String location)
	{
		driver.findElement(locationInputbox).clear();
		driver.findElement(locationInputbox).sendKeys(location);
	}
	
	public void clickSearchForFood()
	{
		driver.findElement(searchForFoodORItem).click();
	}
	
	public boolean isLogoDisplayed()
	{
		return driver.findElement(swiggyLogo).isDisplayed();
	}
	

}
