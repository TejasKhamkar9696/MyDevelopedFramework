package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaymentPage extends BasePage{

	public PaymentPage(WebDriver driver) {
		super(driver);
		
	}
	
	By upiId= By.xpath("//div[text()='Add New UPI ID']");
	
	By enterUpiId= By.id("upi-input");
	
	By verifyAndPayButton= By.xpath("//button[text()='Verify and Pay']");
	
	public void fillPyamentInfo() throws InterruptedException
	{
		driver.findElement(upiId).click();
		driver.findElement(enterUpiId).sendKeys("9939@ybl");
		driver.findElement(verifyAndPayButton);
		Thread.sleep(5000);
	}

}
