package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SearchRestaurantFoodPage extends BasePage {

	public SearchRestaurantFoodPage(WebDriver driver) {
		super(driver);
	}

	
	By inputSerchRestuarantFood = By.xpath("//input[@type='text']");
	By swiggyTitle= By.xpath("//a[@title='Swiggy']");
	
	By firstItemVisible= By.xpath("(((//div[@data-testid='normal-dish-item'])[1]//child::div[@aria-hidden='true'])[4]//button)[4]");
	By addItemToCart  = By.xpath("//span[text()='Add Item to cart']");
	By addedProuct = By.xpath("//span[text()='1']");
	By continueBtn= By.xpath("//span[text()='Continue']");
	
	By cartBtn= By.xpath("(//span[text()='Cart']//..)[1]");
	
	public boolean isSwiggyTitleDisplayed()
	{
		return driver.findElement(swiggyTitle).isDisplayed();
	}
	
	public void enterSearchItem(String item)
	{
		driver.findElement(inputSerchRestuarantFood).sendKeys(item + Keys.ENTER);
	}
	
	public void selectFirstVisibleItem() throws InterruptedException
	{
		driver.findElement(firstItemVisible).click();
		Thread.sleep(2000);
	}
	
	public void clickContinueBtn()
	{
		driver.findElement(continueBtn).click();
	}

	public void clickAddItemToCartBtn()
	{
		driver.findElement(addItemToCart).click();
	}
	
	public boolean isProductAddedToCart()
	{
		return driver.findElement(addedProuct).isDisplayed();
	}
	
	public void clickCartBtn()
	{
		driver.findElement(cartBtn).click();
	}
	
	
	
	
	
	
}
